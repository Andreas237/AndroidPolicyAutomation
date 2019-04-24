.class public Lo/cch;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:[I

.field private static b:[F

.field private static c:[F

.field private static d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/cch;->a:[I

    .line 17
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/cch;->d:[I

    .line 35
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_2

    sput-object v0, Lo/cch;->c:[F

    .line 36
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_3

    sput-object v0, Lo/cch;->b:[F

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x0
        0x0
    .end array-data

    :array_2
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data

    :array_3
    .array-data 4
        0x0
        0x0
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(I)F
    .locals 1

    .line 298
    sget-object v0, Lo/cch;->c:[F

    aget v0, v0, p0

    return v0
.end method

.method private static c(I)F
    .locals 1

    .line 155
    if-gtz p0, :cond_0

    .line 156
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 157
    :cond_0
    const/16 v0, 0xdc

    if-le p0, v0, :cond_1

    .line 158
    const/high16 v0, 0x3f800000    # 1.0f

    return v0

    .line 159
    :cond_1
    const/16 v0, 0x60

    if-gt p0, v0, :cond_2

    .line 160
    const/high16 v0, 0x3f400000    # 0.75f

    return v0

    .line 161
    :cond_2
    const/16 v0, 0x84

    if-gt p0, v0, :cond_3

    .line 162
    const v0, 0x3f59999a    # 0.85f

    return v0

    .line 163
    :cond_3
    const/16 v0, 0xb4

    if-lt p0, v0, :cond_4

    .line 164
    const v0, 0x3f8ccccd    # 1.1f

    return v0

    .line 166
    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public static c(ILo/dao;IIZ)F
    .locals 2

    .line 84
    if-lez p2, :cond_0

    const/4 v0, 0x1

    if-le p3, v0, :cond_1

    .line 85
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 88
    :cond_1
    const/4 v1, 0x0

    .line 89
    if-nez p3, :cond_2

    .line 90
    invoke-static {p0, p1, p2, p4}, Lo/cch;->e(ILo/dao;IZ)F

    move-result v1

    goto :goto_0

    .line 92
    :cond_2
    invoke-static {p0, p1}, Lo/cch;->e(ILo/dao;)F

    move-result v1

    .line 95
    :goto_0
    return v1
.end method

.method public static c(Lo/dao;[I[I[FI)I
    .locals 8

    .line 245
    array-length v3, p1

    .line 246
    if-eqz v3, :cond_0

    array-length v0, p2

    if-ne v0, v3, :cond_0

    array-length v0, p3

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    if-le p4, v0, :cond_1

    .line 247
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 250
    :cond_1
    new-array v4, v3, [F

    .line 251
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_3

    .line 252
    aget v0, p1, v5

    if-nez v0, :cond_2

    .line 253
    const/4 v0, -0x2

    return v0

    .line 255
    :cond_2
    aget v0, p2, v5

    int-to-float v0, v0

    const/high16 v1, 0x42700000    # 60.0f

    mul-float/2addr v0, v1

    aget v1, p1, v5

    int-to-float v1, v1

    div-float/2addr v0, v1

    aput v0, v4, v5

    .line 251
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 258
    :cond_3
    new-array v5, v3, [F

    .line 259
    const/4 v6, 0x0

    :goto_1
    if-ge v6, v3, :cond_5

    .line 261
    aget v0, p2, v6

    aget v1, p1, v6

    const/4 v2, 0x1

    invoke-static {v0, p0, v1, p4, v2}, Lo/cch;->c(ILo/dao;IIZ)F

    move-result v7

    .line 262
    const/4 v0, 0x0

    cmpl-float v0, v7, v0

    if-nez v0, :cond_4

    .line 263
    const/4 v0, -0x3

    return v0

    .line 265
    :cond_4
    aget v0, p3, v6

    div-float/2addr v0, v7

    aput v0, v5, v6

    .line 259
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 274
    :cond_5
    sget-object v0, Lo/cch;->b:[F

    invoke-static {v4, v5}, Lo/cci;->e([F[F)F

    move-result v1

    aput v1, v0, p4

    .line 275
    sget-object v0, Lo/cch;->c:[F

    sget-object v1, Lo/cch;->b:[F

    aget v1, v1, p4

    invoke-static {v4, v5, v1}, Lo/cci;->a([F[FF)F

    move-result v1

    aput v1, v0, p4

    .line 276
    invoke-static {v4, p4}, Lo/cch;->e([FI)V

    .line 278
    const/4 v0, 0x0

    return v0
.end method

.method private static d(I)F
    .locals 4

    .line 134
    if-nez p0, :cond_0

    .line 135
    const/16 p0, 0xaa

    .line 137
    :cond_0
    const/16 v0, 0x95

    if-ge p0, v0, :cond_1

    .line 138
    int-to-float v0, p0

    const v1, 0x3ef5c28f    # 0.48f

    mul-float v3, v0, v1

    goto :goto_0

    .line 139
    :cond_1
    const/16 v0, 0xa6

    if-ge p0, v0, :cond_2

    .line 140
    int-to-float v0, p0

    int-to-float v1, p0

    const v2, 0x3b23d70a    # 0.0025f

    mul-float/2addr v1, v2

    const v2, 0x3e147ae1    # 0.145f

    add-float/2addr v1, v2

    mul-float v3, v0, v1

    goto :goto_0

    .line 141
    :cond_2
    const/16 v0, 0xb9

    if-ge p0, v0, :cond_3

    .line 142
    int-to-float v0, p0

    const v1, 0x3f0f5c29    # 0.56f

    mul-float v3, v0, v1

    goto :goto_0

    .line 144
    :cond_3
    const/high16 v3, 0x42dc0000    # 110.0f

    .line 146
    :goto_0
    const/high16 v0, 0x42c80000    # 100.0f

    div-float v0, v3, v0

    return v0
.end method

.method private static d(II)F
    .locals 4

    .line 212
    int-to-float v0, p0

    sget-object v1, Lo/cch;->a:[I

    aget v1, v1, p1

    int-to-float v1, v1

    const v2, 0x3f733333    # 0.95f

    mul-float/2addr v1, v2

    cmpg-float v0, v0, v1

    if-ltz v0, :cond_0

    int-to-float v0, p0

    sget-object v1, Lo/cch;->d:[I

    aget v1, v1, p1

    int-to-float v1, v1

    const v2, 0x3f866666    # 1.05f

    mul-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-lez v0, :cond_1

    .line 217
    :cond_0
    const/high16 v3, 0x3f800000    # 1.0f

    .line 218
    return v3

    .line 221
    :cond_1
    const/16 v0, 0x50

    if-ge p0, v0, :cond_2

    .line 222
    sget-object v0, Lo/cch;->c:[F

    aget v0, v0, p1

    sget-object v1, Lo/cch;->b:[F

    aget v1, v1, p1

    const/high16 v2, 0x42a00000    # 80.0f

    mul-float/2addr v1, v2

    add-float v3, v0, v1

    goto :goto_0

    .line 223
    :cond_2
    const/16 v0, 0xdc

    if-le p0, v0, :cond_3

    .line 224
    sget-object v0, Lo/cch;->c:[F

    aget v0, v0, p1

    sget-object v1, Lo/cch;->b:[F

    aget v1, v1, p1

    const/high16 v2, 0x435c0000    # 220.0f

    mul-float/2addr v1, v2

    add-float v3, v0, v1

    goto :goto_0

    .line 226
    :cond_3
    sget-object v0, Lo/cch;->c:[F

    aget v0, v0, p1

    sget-object v1, Lo/cch;->b:[F

    aget v1, v1, p1

    int-to-float v2, p0

    mul-float/2addr v1, v2

    add-float v3, v0, v1

    .line 228
    :goto_0
    return v3
.end method

.method public static e(I)F
    .locals 1

    .line 302
    sget-object v0, Lo/cch;->b:[F

    aget v0, v0, p0

    return v0
.end method

.method public static e(ILo/dao;)F
    .locals 4

    .line 60
    if-gtz p0, :cond_0

    .line 61
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_0
    if-nez p1, :cond_1

    .line 65
    const/16 v3, 0xaa

    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {p1}, Lo/dao;->e()I

    move-result v3

    .line 70
    :goto_0
    int-to-float v0, p0

    int-to-float v1, v3

    const v2, 0x3ed70a3d    # 0.42f

    mul-float/2addr v1, v2

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    mul-float/2addr v0, v1

    return v0
.end method

.method public static e(ILo/dao;II)F
    .locals 9

    .line 180
    if-lez p2, :cond_0

    const/4 v0, 0x1

    if-le p3, v0, :cond_1

    .line 181
    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 183
    :cond_1
    mul-int/lit8 v0, p0, 0x3c

    div-int v4, v0, p2

    .line 184
    const/high16 v5, 0x3f800000    # 1.0f

    .line 187
    invoke-static {v4, p3}, Lo/cch;->d(II)F

    move-result v5

    .line 190
    const v0, 0x3ecccccd    # 0.4f

    cmpg-float v0, v5, v0

    if-ltz v0, :cond_2

    const v0, 0x3fcccccd    # 1.6f

    cmpl-float v0, v5, v0

    if-lez v0, :cond_3

    .line 191
    :cond_2
    const/high16 v5, 0x3f800000    # 1.0f

    .line 195
    :cond_3
    int-to-float v0, v4

    const v1, 0x3ccccccd    # 0.025f

    const v2, 0x3e4ccccd    # 0.2f

    const/high16 v3, 0x43390000    # 185.0f

    invoke-static {v1, v2, v3, v0}, Lo/ccg;->e(FFFF)F

    move-result v6

    .line 199
    const/4 v7, 0x1

    .line 201
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, v5, v0

    if-nez v0, :cond_4

    .line 202
    const/4 v7, 0x0

    .line 204
    :cond_4
    const/high16 v0, 0x3f800000    # 1.0f

    add-float/2addr v0, v6

    mul-float/2addr v0, v5

    invoke-static {p0, p1, p2, p3, v7}, Lo/cch;->c(ILo/dao;IIZ)F

    move-result v1

    mul-float v8, v0, v1

    .line 205
    return v8
.end method

.method private static e(ILo/dao;IZ)F
    .locals 5

    .line 108
    if-gtz p2, :cond_0

    .line 109
    const/high16 v0, -0x40800000    # -1.0f

    return v0

    .line 112
    :cond_0
    if-nez p1, :cond_1

    .line 113
    const/16 v1, 0xaa

    goto :goto_0

    .line 115
    :cond_1
    invoke-virtual {p1}, Lo/dao;->e()I

    move-result v1

    .line 117
    :goto_0
    mul-int/lit8 v0, p0, 0x3c

    div-int v2, v0, p2

    .line 119
    invoke-static {v1}, Lo/cch;->d(I)F

    move-result v3

    .line 120
    if-eqz p3, :cond_2

    .line 121
    invoke-static {v2}, Lo/cch;->c(I)F

    move-result v0

    mul-float/2addr v3, v0

    .line 123
    :cond_2
    int-to-float v0, p0

    mul-float v4, v0, v3

    .line 125
    return v4
.end method

.method private static e([FI)V
    .locals 3

    .line 281
    invoke-static {p0}, Ljava/util/Arrays;->sort([F)V

    .line 282
    sget-object v0, Lo/cch;->a:[I

    const/4 v1, 0x0

    aget v1, p0, v1

    float-to-int v1, v1

    aput v1, v0, p1

    .line 283
    sget-object v0, Lo/cch;->d:[I

    array-length v1, p0

    add-int/lit8 v1, v1, -0x1

    aget v1, p0, v1

    float-to-int v1, v1

    aput v1, v0, p1

    .line 284
    return-void
.end method
