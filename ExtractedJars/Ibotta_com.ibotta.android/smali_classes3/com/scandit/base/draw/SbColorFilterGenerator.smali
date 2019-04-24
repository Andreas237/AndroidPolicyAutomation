.class public Lcom/scandit/base/draw/SbColorFilterGenerator;
.super Ljava/lang/Object;
.source "SbColorFilterGenerator.java"


# static fields
.field private static DELTA_INDEX:[D


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x65

    .line 16
    new-array v0, v0, [D

    fill-array-data v0, :array_0

    sput-object v0, Lcom/scandit/base/draw/SbColorFilterGenerator;->DELTA_INDEX:[D

    return-void

    :array_0
    .array-data 8
        0x0
        0x3f847ae147ae147bL    # 0.01
        0x3f947ae147ae147bL    # 0.02
        0x3fa47ae147ae147bL    # 0.04
        0x3fa999999999999aL    # 0.05
        0x3faeb851eb851eb8L    # 0.06
        0x3fb1eb851eb851ecL    # 0.07
        0x3fb47ae147ae147bL    # 0.08
        0x3fb999999999999aL    # 0.1
        0x3fbc28f5c28f5c29L    # 0.11
        0x3fbeb851eb851eb8L    # 0.12
        0x3fc1eb851eb851ecL    # 0.14
        0x3fc3333333333333L    # 0.15
        0x3fc47ae147ae147bL    # 0.16
        0x3fc5c28f5c28f5c3L    # 0.17
        0x3fc70a3d70a3d70aL    # 0.18
        0x3fc999999999999aL    # 0.2
        0x3fcae147ae147ae1L    # 0.21
        0x3fcc28f5c28f5c29L    # 0.22
        0x3fceb851eb851eb8L    # 0.24
        0x3fd0000000000000L    # 0.25
        0x3fd147ae147ae148L    # 0.27
        0x3fd1eb851eb851ecL    # 0.28
        0x3fd3333333333333L    # 0.3
        0x3fd47ae147ae147bL    # 0.32
        0x3fd5c28f5c28f5c3L    # 0.34
        0x3fd70a3d70a3d70aL    # 0.36
        0x3fd851eb851eb852L    # 0.38
        0x3fd999999999999aL    # 0.4
        0x3fdae147ae147ae1L    # 0.42
        0x3fdc28f5c28f5c29L    # 0.44
        0x3fdd70a3d70a3d71L    # 0.46
        0x3fdeb851eb851eb8L    # 0.48
        0x3fe0000000000000L    # 0.5
        0x3fe0f5c28f5c28f6L    # 0.53
        0x3fe1eb851eb851ecL    # 0.56
        0x3fe2e147ae147ae1L    # 0.59
        0x3fe3d70a3d70a3d7L    # 0.62
        0x3fe4cccccccccccdL    # 0.65
        0x3fe5c28f5c28f5c3L    # 0.68
        0x3fe6b851eb851eb8L    # 0.71
        0x3fe7ae147ae147aeL    # 0.74
        0x3fe8a3d70a3d70a4L    # 0.77
        0x3fe999999999999aL    # 0.8
        0x3fea8f5c28f5c28fL    # 0.83
        0x3feb851eb851eb85L    # 0.86
        0x3fec7ae147ae147bL    # 0.89
        0x3fed70a3d70a3d71L    # 0.92
        0x3fee666666666666L    # 0.95
        0x3fef5c28f5c28f5cL    # 0.98
        0x3ff0000000000000L    # 1.0
        0x3ff0f5c28f5c28f6L    # 1.06
        0x3ff1eb851eb851ecL    # 1.12
        0x3ff2e147ae147ae1L    # 1.18
        0x3ff3d70a3d70a3d7L    # 1.24
        0x3ff4cccccccccccdL    # 1.3
        0x3ff5c28f5c28f5c3L    # 1.36
        0x3ff6b851eb851eb8L    # 1.42
        0x3ff7ae147ae147aeL    # 1.48
        0x3ff8a3d70a3d70a4L    # 1.54
        0x3ff999999999999aL    # 1.6
        0x3ffa8f5c28f5c28fL    # 1.66
        0x3ffb851eb851eb85L    # 1.72
        0x3ffc7ae147ae147bL    # 1.78
        0x3ffd70a3d70a3d71L    # 1.84
        0x3ffe666666666666L    # 1.9
        0x3fff5c28f5c28f5cL    # 1.96
        0x4000000000000000L    # 2.0
        0x4000f5c28f5c28f6L    # 2.12
        0x4002000000000000L    # 2.25
        0x4002f5c28f5c28f6L    # 2.37
        0x4004000000000000L    # 2.5
        0x4004f5c28f5c28f6L    # 2.62
        0x4006000000000000L    # 2.75
        0x4006f5c28f5c28f6L    # 2.87
        0x4008000000000000L    # 3.0
        0x400999999999999aL    # 3.2
        0x400b333333333333L    # 3.4
        0x400ccccccccccccdL    # 3.6
        0x400e666666666666L    # 3.8
        0x4010000000000000L    # 4.0
        0x4011333333333333L    # 4.3
        0x4012cccccccccccdL    # 4.7
        0x401399999999999aL    # 4.9
        0x4014000000000000L    # 5.0
        0x4016000000000000L    # 5.5
        0x4018000000000000L    # 6.0
        0x401a000000000000L    # 6.5
        0x401b333333333333L    # 6.8
        0x401c000000000000L    # 7.0
        0x401d333333333333L    # 7.3
        0x401e000000000000L    # 7.5
        0x401f333333333333L    # 7.8
        0x4020000000000000L    # 8.0
        0x4020cccccccccccdL    # 8.4
        0x4021666666666666L    # 8.7
        0x4022000000000000L    # 9.0
        0x4022cccccccccccdL    # 9.4
        0x4023333333333333L    # 9.6
        0x402399999999999aL    # 9.8
        0x4024000000000000L    # 10.0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static adjustBrightness(Landroid/graphics/ColorMatrix;F)V
    .locals 4

    const/high16 v0, 0x42c80000    # 100.0f

    .line 58
    invoke-static {p1, v0}, Lcom/scandit/base/draw/SbColorFilterGenerator;->cleanValue(FF)F

    move-result p1

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/16 v1, 0x19

    .line 63
    new-array v1, v1, [F

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v1, v2

    const/4 v2, 0x1

    aput v0, v1, v2

    const/4 v2, 0x2

    aput v0, v1, v2

    const/4 v2, 0x3

    aput v0, v1, v2

    const/4 v2, 0x4

    aput p1, v1, v2

    const/4 v2, 0x5

    aput v0, v1, v2

    const/4 v2, 0x6

    aput v3, v1, v2

    const/4 v2, 0x7

    aput v0, v1, v2

    const/16 v2, 0x8

    aput v0, v1, v2

    const/16 v2, 0x9

    aput p1, v1, v2

    const/16 v2, 0xa

    aput v0, v1, v2

    const/16 v2, 0xb

    aput v0, v1, v2

    const/16 v2, 0xc

    aput v3, v1, v2

    const/16 v2, 0xd

    aput v0, v1, v2

    const/16 v2, 0xe

    aput p1, v1, v2

    const/16 p1, 0xf

    aput v0, v1, p1

    const/16 p1, 0x10

    aput v0, v1, p1

    const/16 p1, 0x11

    aput v0, v1, p1

    const/16 p1, 0x12

    aput v3, v1, p1

    const/16 p1, 0x13

    aput v0, v1, p1

    const/16 p1, 0x14

    aput v0, v1, p1

    const/16 p1, 0x15

    aput v0, v1, p1

    const/16 p1, 0x16

    aput v0, v1, p1

    const/16 p1, 0x17

    aput v0, v1, p1

    const/16 p1, 0x18

    aput v3, v1, p1

    .line 71
    new-instance p1, Landroid/graphics/ColorMatrix;

    invoke-direct {p1, v1}, Landroid/graphics/ColorMatrix;-><init>([F)V

    invoke-virtual {p0, p1}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    return-void
.end method

.method public static adjustColor(IIII)Landroid/graphics/ColorFilter;
    .locals 1

    .line 133
    new-instance v0, Landroid/graphics/ColorMatrix;

    invoke-direct {v0}, Landroid/graphics/ColorMatrix;-><init>()V

    int-to-float p3, p3

    .line 134
    invoke-static {v0, p3}, Lcom/scandit/base/draw/SbColorFilterGenerator;->adjustHue(Landroid/graphics/ColorMatrix;F)V

    .line 135
    invoke-static {v0, p1}, Lcom/scandit/base/draw/SbColorFilterGenerator;->adjustContrast(Landroid/graphics/ColorMatrix;I)V

    int-to-float p0, p0

    .line 136
    invoke-static {v0, p0}, Lcom/scandit/base/draw/SbColorFilterGenerator;->adjustBrightness(Landroid/graphics/ColorMatrix;F)V

    int-to-float p0, p2

    .line 137
    invoke-static {v0, p0}, Lcom/scandit/base/draw/SbColorFilterGenerator;->adjustSaturation(Landroid/graphics/ColorMatrix;F)V

    .line 139
    new-instance p0, Landroid/graphics/ColorMatrixColorFilter;

    invoke-direct {p0, v0}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V

    return-object p0
.end method

.method public static adjustContrast(Landroid/graphics/ColorMatrix;I)V
    .locals 10

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    .line 75
    invoke-static {p1, v0}, Lcom/scandit/base/draw/SbColorFilterGenerator;->cleanValue(FF)F

    move-result p1

    float-to-int p1, p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x1

    const/high16 v3, 0x42fe0000    # 127.0f

    const/4 v4, 0x0

    if-gez p1, :cond_1

    .line 81
    div-int/lit8 p1, p1, 0x64

    mul-int/lit8 p1, p1, 0x7f

    add-int/lit8 p1, p1, 0x7f

    int-to-float p1, p1

    goto :goto_1

    .line 83
    :cond_1
    rem-int/lit8 v5, p1, 0x1

    int-to-float v5, v5

    cmpl-float v6, v5, v4

    if-nez v6, :cond_2

    .line 85
    sget-object v5, Lcom/scandit/base/draw/SbColorFilterGenerator;->DELTA_INDEX:[D

    aget-wide v6, v5, p1

    double-to-float p1, v6

    goto :goto_0

    .line 88
    :cond_2
    sget-object v6, Lcom/scandit/base/draw/SbColorFilterGenerator;->DELTA_INDEX:[D

    shl-int/2addr p1, v0

    aget-wide v7, v6, p1

    double-to-float v7, v7

    sub-float v8, v1, v5

    mul-float v7, v7, v8

    add-int/2addr p1, v2

    aget-wide v8, v6, p1

    double-to-float p1, v8

    mul-float p1, p1, v5

    add-float/2addr p1, v7

    :goto_0
    mul-float p1, p1, v3

    add-float/2addr p1, v3

    :goto_1
    const/16 v5, 0x19

    .line 93
    new-array v5, v5, [F

    div-float v6, p1, v3

    aput v6, v5, v0

    aput v4, v5, v2

    const/4 v0, 0x2

    aput v4, v5, v0

    const/4 v0, 0x3

    aput v4, v5, v0

    const/4 v0, 0x4

    const/high16 v2, 0x3f000000    # 0.5f

    sub-float/2addr v3, p1

    mul-float v3, v3, v2

    aput v3, v5, v0

    const/4 p1, 0x5

    aput v4, v5, p1

    const/4 p1, 0x6

    aput v6, v5, p1

    const/4 p1, 0x7

    aput v4, v5, p1

    const/16 p1, 0x8

    aput v4, v5, p1

    const/16 p1, 0x9

    aput v3, v5, p1

    const/16 p1, 0xa

    aput v4, v5, p1

    const/16 p1, 0xb

    aput v4, v5, p1

    const/16 p1, 0xc

    aput v6, v5, p1

    const/16 p1, 0xd

    aput v4, v5, p1

    const/16 p1, 0xe

    aput v3, v5, p1

    const/16 p1, 0xf

    aput v4, v5, p1

    const/16 p1, 0x10

    aput v4, v5, p1

    const/16 p1, 0x11

    aput v4, v5, p1

    const/16 p1, 0x12

    aput v1, v5, p1

    const/16 p1, 0x13

    aput v4, v5, p1

    const/16 p1, 0x14

    aput v4, v5, p1

    const/16 p1, 0x15

    aput v4, v5, p1

    const/16 p1, 0x16

    aput v4, v5, p1

    const/16 p1, 0x17

    aput v4, v5, p1

    const/16 p1, 0x18

    aput v1, v5, p1

    .line 101
    new-instance p1, Landroid/graphics/ColorMatrix;

    invoke-direct {p1, v5}, Landroid/graphics/ColorMatrix;-><init>([F)V

    invoke-virtual {p0, p1}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    return-void
.end method

.method public static adjustHue(Landroid/graphics/ColorMatrix;F)V
    .locals 12

    const/high16 v0, 0x43340000    # 180.0f

    .line 37
    invoke-static {p1, v0}, Lcom/scandit/base/draw/SbColorFilterGenerator;->cleanValue(FF)F

    move-result p1

    div-float/2addr p1, v0

    const v0, 0x40490fdb    # (float)Math.PI

    mul-float p1, p1, v0

    const/4 v0, 0x0

    cmpl-float v1, p1, v0

    if-nez v1, :cond_0

    return-void

    :cond_0
    float-to-double v1, p1

    .line 42
    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float p1, v3

    .line 43
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    const v2, 0x3e5a1cac    # 0.213f

    const v3, 0x3f370a3d    # 0.715f

    const v4, 0x3d9374bc    # 0.072f

    const/16 v5, 0x19

    .line 47
    new-array v5, v5, [F

    const/4 v6, 0x0

    const v7, 0x3f4978d5    # 0.787f

    mul-float v7, v7, p1

    add-float/2addr v7, v2

    const v8, -0x41a5e354    # -0.213f

    mul-float v9, v1, v8

    add-float/2addr v7, v9

    aput v7, v5, v6

    const/4 v6, 0x1

    const v7, -0x40c8f5c3    # -0.715f

    mul-float v9, p1, v7

    add-float/2addr v9, v3

    mul-float v7, v7, v1

    add-float/2addr v7, v9

    aput v7, v5, v6

    const/4 v6, 0x2

    const v7, -0x426c8b44    # -0.072f

    mul-float v7, v7, p1

    add-float/2addr v7, v4

    const v10, 0x3f6d9168    # 0.928f

    mul-float v11, v1, v10

    add-float/2addr v11, v7

    aput v11, v5, v6

    const/4 v6, 0x3

    aput v0, v5, v6

    const/4 v6, 0x4

    aput v0, v5, v6

    const/4 v6, 0x5

    mul-float v8, v8, p1

    add-float/2addr v8, v2

    const v2, 0x3e126e98    # 0.143f

    mul-float v2, v2, v1

    add-float/2addr v2, v8

    aput v2, v5, v6

    const/4 v2, 0x6

    const v6, 0x3e91eb86    # 0.28500003f

    mul-float v6, v6, p1

    add-float/2addr v6, v3

    const v11, 0x3e0f5c29    # 0.14f

    mul-float v11, v11, v1

    add-float/2addr v6, v11

    aput v6, v5, v2

    const/4 v2, 0x7

    const v6, -0x416f1aa0    # -0.283f

    mul-float v6, v6, v1

    add-float/2addr v7, v6

    aput v7, v5, v2

    const/16 v2, 0x8

    aput v0, v5, v2

    const/16 v2, 0x9

    aput v0, v5, v2

    const/16 v2, 0xa

    const v6, -0x40b6872b    # -0.787f

    mul-float v6, v6, v1

    add-float/2addr v8, v6

    aput v8, v5, v2

    const/16 v2, 0xb

    mul-float v3, v3, v1

    add-float/2addr v9, v3

    aput v9, v5, v2

    const/16 v2, 0xc

    mul-float p1, p1, v10

    add-float/2addr p1, v4

    mul-float v1, v1, v4

    add-float/2addr p1, v1

    aput p1, v5, v2

    const/16 p1, 0xd

    aput v0, v5, p1

    const/16 p1, 0xe

    aput v0, v5, p1

    const/16 p1, 0xf

    aput v0, v5, p1

    const/16 p1, 0x10

    aput v0, v5, p1

    const/16 p1, 0x11

    aput v0, v5, p1

    const/16 p1, 0x12

    const/high16 v1, 0x3f800000    # 1.0f

    aput v1, v5, p1

    const/16 p1, 0x13

    aput v0, v5, p1

    const/16 p1, 0x14

    aput v0, v5, p1

    const/16 p1, 0x15

    aput v0, v5, p1

    const/16 p1, 0x16

    aput v0, v5, p1

    const/16 p1, 0x17

    aput v0, v5, p1

    const/16 p1, 0x18

    aput v1, v5, p1

    .line 54
    new-instance p1, Landroid/graphics/ColorMatrix;

    invoke-direct {p1, v5}, Landroid/graphics/ColorMatrix;-><init>([F)V

    invoke-virtual {p0, p1}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    return-void
.end method

.method public static adjustSaturation(Landroid/graphics/ColorMatrix;F)V
    .locals 9

    const/high16 v0, 0x42c80000    # 100.0f

    .line 106
    invoke-static {p1, v0}, Lcom/scandit/base/draw/SbColorFilterGenerator;->cleanValue(FF)F

    move-result p1

    const/4 v1, 0x0

    cmpl-float v2, p1, v1

    if-nez v2, :cond_0

    return-void

    :cond_0
    if-lez v2, :cond_1

    const/high16 v2, 0x40400000    # 3.0f

    mul-float p1, p1, v2

    :cond_1
    div-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr p1, v0

    const v2, 0x3e9e00d2    # 0.3086f

    const v3, 0x3f1c01a3    # 0.6094f

    const v4, 0x3da7ef9e    # 0.082f

    const/16 v5, 0x19

    .line 116
    new-array v5, v5, [F

    const/4 v6, 0x0

    sub-float v7, v0, p1

    mul-float v2, v2, v7

    add-float v8, v2, p1

    aput v8, v5, v6

    const/4 v6, 0x1

    mul-float v3, v3, v7

    aput v3, v5, v6

    const/4 v6, 0x2

    mul-float v7, v7, v4

    aput v7, v5, v6

    const/4 v4, 0x3

    aput v1, v5, v4

    const/4 v4, 0x4

    aput v1, v5, v4

    const/4 v4, 0x5

    aput v2, v5, v4

    const/4 v4, 0x6

    add-float v6, v3, p1

    aput v6, v5, v4

    const/4 v4, 0x7

    aput v7, v5, v4

    const/16 v4, 0x8

    aput v1, v5, v4

    const/16 v4, 0x9

    aput v1, v5, v4

    const/16 v4, 0xa

    aput v2, v5, v4

    const/16 v2, 0xb

    aput v3, v5, v2

    const/16 v2, 0xc

    add-float/2addr v7, p1

    aput v7, v5, v2

    const/16 p1, 0xd

    aput v1, v5, p1

    const/16 p1, 0xe

    aput v1, v5, p1

    const/16 p1, 0xf

    aput v1, v5, p1

    const/16 p1, 0x10

    aput v1, v5, p1

    const/16 p1, 0x11

    aput v1, v5, p1

    const/16 p1, 0x12

    aput v0, v5, p1

    const/16 p1, 0x13

    aput v1, v5, p1

    const/16 p1, 0x14

    aput v1, v5, p1

    const/16 p1, 0x15

    aput v1, v5, p1

    const/16 p1, 0x16

    aput v1, v5, p1

    const/16 p1, 0x17

    aput v1, v5, p1

    const/16 p1, 0x18

    aput v0, v5, p1

    .line 124
    new-instance p1, Landroid/graphics/ColorMatrix;

    invoke-direct {p1, v5}, Landroid/graphics/ColorMatrix;-><init>([F)V

    invoke-virtual {p0, p1}, Landroid/graphics/ColorMatrix;->postConcat(Landroid/graphics/ColorMatrix;)V

    return-void
.end method

.method protected static cleanValue(FF)F
    .locals 1

    neg-float v0, p1

    .line 129
    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    move-result p0

    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method
