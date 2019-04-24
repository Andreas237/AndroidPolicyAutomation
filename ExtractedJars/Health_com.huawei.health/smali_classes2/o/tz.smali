.class public final Lo/tz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[I

.field private static final b:[I

.field private static final c:[I

.field private static final e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/tz;->c:[I

    .line 41
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/tz;->b:[I

    .line 47
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lo/tz;->a:[I

    .line 49
    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_3

    sput-object v0, Lo/tz;->e:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x4
        0x1
        0x5
    .end array-data

    :array_1
    .array-data 4
        0x6
        0x2
        0x7
        0x3
    .end array-data

    :array_2
    .array-data 4
        0x8
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
        0x3
    .end array-data

    :array_3
    .array-data 4
        0x7
        0x1
        0x1
        0x3
        0x1
        0x1
        0x1
        0x2
        0x1
    .end array-data
.end method

.method private static a(Lo/qr;IIII[I)[Lo/ou;
    .locals 14

    .line 187
    const/4 v0, 0x4

    new-array v7, v0, [Lo/ou;

    .line 188
    const/4 v8, 0x0

    .line 189
    move-object/from16 v0, p5

    array-length v0, v0

    new-array v9, v0, [I

    .line 190
    :goto_0
    move/from16 v0, p3

    if-ge v0, p1, :cond_3

    .line 191
    move-object v0, p0

    move/from16 v1, p4

    move/from16 v2, p3

    move/from16 v3, p2

    move-object/from16 v5, p5

    move-object v6, v9

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo/tz;->d(Lo/qr;IIIZ[I[I)[I

    move-result-object v10

    .line 192
    if-eqz v10, :cond_2

    .line 193
    :goto_1
    if-lez p3, :cond_1

    .line 194
    move-object v0, p0

    move/from16 v1, p4

    add-int/lit8 p3, p3, -0x1

    move/from16 v2, p3

    move/from16 v3, p2

    move-object/from16 v5, p5

    move-object v6, v9

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo/tz;->d(Lo/qr;IIIZ[I[I)[I

    move-result-object v11

    .line 195
    if-eqz v11, :cond_0

    .line 196
    move-object v10, v11

    goto :goto_2

    .line 198
    :cond_0
    add-int/lit8 p3, p3, 0x1

    .line 199
    goto :goto_3

    .line 201
    :goto_2
    goto :goto_1

    .line 202
    :cond_1
    :goto_3
    new-instance v0, Lo/ou;

    const/4 v1, 0x0

    aget v1, v10, v1

    int-to-float v1, v1

    move/from16 v2, p3

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 203
    new-instance v0, Lo/ou;

    const/4 v1, 0x1

    aget v1, v10, v1

    int-to-float v1, v1

    move/from16 v2, p3

    int-to-float v2, v2

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 204
    const/4 v8, 0x1

    .line 205
    goto :goto_4

    .line 190
    :cond_2
    add-int/lit8 p3, p3, 0x5

    goto :goto_0

    .line 208
    :cond_3
    :goto_4
    add-int/lit8 v10, p3, 0x1

    .line 210
    if-eqz v8, :cond_7

    .line 211
    const/4 v11, 0x0

    .line 212
    const/4 v0, 0x2

    new-array v12, v0, [I

    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    float-to-int v0, v0

    const/4 v1, 0x0

    aput v0, v12, v1

    const/4 v0, 0x1

    aget-object v0, v7, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    float-to-int v0, v0

    const/4 v1, 0x1

    aput v0, v12, v1

    .line 213
    :goto_5
    if-ge v10, p1, :cond_6

    .line 214
    move-object v0, p0

    const/4 v1, 0x0

    aget v1, v12, v1

    move v2, v10

    move/from16 v3, p2

    move-object/from16 v5, p5

    move-object v6, v9

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lo/tz;->d(Lo/qr;IIIZ[I[I)[I

    move-result-object v13

    .line 219
    if-eqz v13, :cond_4

    const/4 v0, 0x0

    aget v0, v12, v0

    const/4 v1, 0x0

    aget v1, v13, v1

    sub-int/2addr v0, v1

    .line 220
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_4

    const/4 v0, 0x1

    aget v0, v12, v0

    const/4 v1, 0x1

    aget v1, v13, v1

    sub-int/2addr v0, v1

    .line 221
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_4

    .line 222
    move-object v12, v13

    .line 223
    const/4 v11, 0x0

    goto :goto_6

    .line 225
    :cond_4
    const/16 v0, 0x19

    if-le v11, v0, :cond_5

    .line 226
    goto :goto_7

    .line 228
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 213
    :goto_6
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 232
    :cond_6
    :goto_7
    add-int/lit8 v0, v11, 0x1

    sub-int/2addr v10, v0

    .line 233
    new-instance v0, Lo/ou;

    const/4 v1, 0x0

    aget v1, v12, v1

    int-to-float v1, v1

    int-to-float v2, v10

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    const/4 v1, 0x2

    aput-object v0, v7, v1

    .line 234
    new-instance v0, Lo/ou;

    const/4 v1, 0x1

    aget v1, v12, v1

    int-to-float v1, v1

    int-to-float v2, v10

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    const/4 v1, 0x3

    aput-object v0, v7, v1

    .line 236
    :cond_7
    sub-int v0, v10, p3

    const/16 v1, 0xa

    if-ge v0, v1, :cond_8

    .line 237
    const/4 v11, 0x0

    :goto_8
    array-length v0, v7

    const/4 v0, 0x4

    if-ge v11, v0, :cond_8

    .line 238
    const/4 v0, 0x0

    aput-object v0, v7, v11

    .line 237
    add-int/lit8 v11, v11, 0x1

    goto :goto_8

    .line 241
    :cond_8
    return-object v7
.end method

.method public static c(Lo/oj;Ljava/util/Map;Z)Lo/ub;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/oj;Ljava/util/Map<Lo/og;*>;Z)Lo/ub;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 79
    invoke-virtual {p0}, Lo/oj;->d()Lo/qr;

    move-result-object v1

    .line 81
    invoke-static {p2, v1}, Lo/tz;->e(ZLo/qr;)Ljava/util/List;

    move-result-object v2

    .line 82
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {v1}, Lo/qr;->g()Lo/qr;

    move-result-object v1

    .line 84
    invoke-virtual {v1}, Lo/qr;->e()V

    .line 85
    invoke-static {p2, v1}, Lo/tz;->e(ZLo/qr;)Ljava/util/List;

    move-result-object v2

    .line 87
    :cond_0
    new-instance v0, Lo/ub;

    invoke-direct {v0, v1, v2}, Lo/ub;-><init>(Lo/qr;Ljava/util/List;)V

    return-object v0
.end method

.method private static c(Lo/qr;II)[Lo/ou;
    .locals 9

    .line 159
    invoke-virtual {p0}, Lo/qr;->h()I

    move-result v6

    .line 160
    invoke-virtual {p0}, Lo/qr;->a()I

    move-result v7

    .line 162
    const/16 v0, 0x8

    new-array v8, v0, [Lo/ou;

    .line 163
    move-object v0, p0

    move v1, v6

    move v2, v7

    move v3, p1

    move v4, p2

    sget-object v5, Lo/tz;->a:[I

    invoke-static/range {v0 .. v5}, Lo/tz;->a(Lo/qr;IIII[I)[Lo/ou;

    move-result-object v0

    sget-object v1, Lo/tz;->c:[I

    invoke-static {v8, v0, v1}, Lo/tz;->e([Lo/ou;[Lo/ou;[I)V

    .line 166
    const/4 v0, 0x4

    aget-object v0, v8, v0

    if-eqz v0, :cond_0

    .line 167
    const/4 v0, 0x4

    aget-object v0, v8, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    float-to-int p2, v0

    .line 168
    const/4 v0, 0x4

    aget-object v0, v8, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    float-to-int p1, v0

    .line 170
    :cond_0
    move-object v0, p0

    move v1, v6

    move v2, v7

    move v3, p1

    move v4, p2

    sget-object v5, Lo/tz;->e:[I

    invoke-static/range {v0 .. v5}, Lo/tz;->a(Lo/qr;IIII[I)[Lo/ou;

    move-result-object v0

    sget-object v1, Lo/tz;->b:[I

    invoke-static {v8, v0, v1}, Lo/tz;->e([Lo/ou;[Lo/ou;[I)V

    .line 172
    return-object v8
.end method

.method private static d([I[IF)F
    .locals 11

    .line 314
    array-length v2, p0

    .line 315
    const/4 v3, 0x0

    .line 316
    const/4 v4, 0x0

    .line 317
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v2, :cond_0

    .line 318
    aget v0, p0, v5

    add-int/2addr v3, v0

    .line 319
    aget v0, p1, v5

    add-int/2addr v4, v0

    .line 317
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 321
    :cond_0
    if-ge v3, v4, :cond_1

    .line 324
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    return v0

    .line 329
    :cond_1
    int-to-float v0, v3

    int-to-float v1, v4

    div-float v5, v0, v1

    .line 330
    mul-float/2addr p2, v5

    .line 332
    const/4 v6, 0x0

    .line 333
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v2, :cond_4

    .line 334
    aget v8, p0, v7

    .line 335
    aget v0, p1, v7

    int-to-float v0, v0

    mul-float v9, v0, v5

    .line 336
    int-to-float v0, v8

    cmpl-float v0, v0, v9

    if-lez v0, :cond_2

    int-to-float v0, v8

    sub-float v10, v0, v9

    goto :goto_2

    :cond_2
    int-to-float v0, v8

    sub-float v10, v9, v0

    .line 337
    :goto_2
    cmpl-float v0, v10, p2

    if-lez v0, :cond_3

    .line 338
    const/high16 v0, 0x7f800000    # Float.POSITIVE_INFINITY

    return v0

    .line 340
    :cond_3
    add-float/2addr v6, v10

    .line 333
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 342
    :cond_4
    int-to-float v0, v3

    div-float v0, v6, v0

    return v0
.end method

.method private static d(Lo/qr;IIIZ[I[I)[I
    .locals 12

    .line 261
    move-object/from16 v0, p6

    array-length v0, v0

    move-object/from16 v1, p6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Ljava/util/Arrays;->fill([IIII)V

    .line 262
    move-object/from16 v0, p5

    array-length v5, v0

    .line 263
    move/from16 v6, p4

    .line 264
    move v7, p1

    .line 265
    const/4 v8, 0x0

    .line 268
    :goto_0
    invoke-virtual {p0, v7, p2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    if-lez v7, :cond_0

    move v0, v8

    add-int/lit8 v8, v8, 0x1

    const/4 v1, 0x3

    if-ge v0, v1, :cond_0

    .line 269
    add-int/lit8 v7, v7, -0x1

    goto :goto_0

    .line 271
    :cond_0
    move v9, v7

    .line 272
    const/4 v10, 0x0

    .line 273
    :goto_1
    if-ge v9, p3, :cond_5

    .line 274
    invoke-virtual {p0, v9, p2}, Lo/qr;->e(II)Z

    move-result v11

    .line 275
    xor-int v0, v11, v6

    if-eqz v0, :cond_1

    .line 276
    aget v0, p6, v10

    add-int/lit8 v0, v0, 0x1

    aput v0, p6, v10

    goto :goto_3

    .line 278
    :cond_1
    add-int/lit8 v0, v5, -0x1

    if-ne v10, v0, :cond_3

    .line 279
    move-object/from16 v0, p6

    move-object/from16 v1, p5

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v0, v1, v2}, Lo/tz;->d([I[IF)F

    move-result v0

    const v1, 0x3ed70a3d    # 0.42f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 280
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v7, v0, v1

    const/4 v1, 0x1

    aput v9, v0, v1

    return-object v0

    .line 282
    :cond_2
    const/4 v0, 0x0

    aget v0, p6, v0

    const/4 v1, 0x1

    aget v1, p6, v1

    add-int/2addr v0, v1

    add-int/2addr v7, v0

    .line 283
    add-int/lit8 v0, v5, -0x2

    move-object/from16 v1, p6

    const/4 v2, 0x2

    move-object/from16 v3, p6

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 284
    add-int/lit8 v0, v5, -0x2

    const/4 v1, 0x0

    aput v1, p6, v0

    .line 285
    add-int/lit8 v0, v5, -0x1

    const/4 v1, 0x0

    aput v1, p6, v0

    .line 286
    add-int/lit8 v10, v10, -0x1

    goto :goto_2

    .line 288
    :cond_3
    add-int/lit8 v10, v10, 0x1

    .line 290
    :goto_2
    const/4 v0, 0x1

    aput v0, p6, v10

    .line 291
    if-nez v6, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    .line 273
    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 294
    :cond_5
    add-int/lit8 v0, v5, -0x1

    if-ne v10, v0, :cond_6

    .line 295
    move-object/from16 v0, p6

    move-object/from16 v1, p5

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v0, v1, v2}, Lo/tz;->d([I[IF)F

    move-result v0

    const v1, 0x3ed70a3d    # 0.42f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_6

    .line 296
    const/4 v0, 0x2

    new-array v0, v0, [I

    const/4 v1, 0x0

    aput v7, v0, v1

    add-int/lit8 v1, v9, -0x1

    const/4 v2, 0x1

    aput v1, v0, v2

    return-object v0

    .line 299
    :cond_6
    const/4 v0, 0x0

    return-object v0
.end method

.method private static e(ZLo/qr;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZLo/qr;)Ljava/util/List<[Lo/ou;>;"
        }
    .end annotation

    .line 98
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 99
    const/4 v3, 0x0

    .line 100
    const/4 v4, 0x0

    .line 101
    const/4 v5, 0x0

    .line 102
    :goto_0
    invoke-virtual {p1}, Lo/qr;->h()I

    move-result v0

    if-ge v3, v0, :cond_7

    .line 103
    invoke-static {p1, v3, v4}, Lo/tz;->c(Lo/qr;II)[Lo/ou;

    move-result-object v6

    .line 105
    const/4 v0, 0x0

    aget-object v0, v6, v0

    if-nez v0, :cond_4

    const/4 v0, 0x3

    aget-object v0, v6, v0

    if-nez v0, :cond_4

    .line 106
    if-nez v5, :cond_0

    .line 108
    goto/16 :goto_3

    .line 112
    :cond_0
    const/4 v5, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, [Lo/ou;

    .line 115
    const/4 v0, 0x1

    aget-object v0, v8, v0

    if-eqz v0, :cond_1

    .line 116
    int-to-float v0, v3

    const/4 v1, 0x1

    aget-object v1, v8, v1

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    float-to-int v3, v0

    .line 118
    :cond_1
    const/4 v0, 0x3

    aget-object v0, v8, v0

    if-eqz v0, :cond_2

    .line 119
    const/4 v0, 0x3

    aget-object v0, v8, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 121
    :cond_2
    goto :goto_1

    .line 122
    :cond_3
    add-int/lit8 v3, v3, 0x5

    .line 123
    goto :goto_0

    .line 125
    :cond_4
    const/4 v5, 0x1

    .line 126
    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    if-nez p0, :cond_5

    .line 128
    goto :goto_3

    .line 132
    :cond_5
    const/4 v0, 0x2

    aget-object v0, v6, v0

    if-eqz v0, :cond_6

    .line 133
    const/4 v0, 0x2

    aget-object v0, v6, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    float-to-int v4, v0

    .line 134
    const/4 v0, 0x2

    aget-object v0, v6, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    float-to-int v3, v0

    goto :goto_2

    .line 136
    :cond_6
    const/4 v0, 0x4

    aget-object v0, v6, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    float-to-int v4, v0

    .line 137
    const/4 v0, 0x4

    aget-object v0, v6, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    float-to-int v3, v0

    .line 139
    :goto_2
    goto/16 :goto_0

    .line 140
    :cond_7
    :goto_3
    return-object v2
.end method

.method private static e([Lo/ou;[Lo/ou;[I)V
    .locals 3

    .line 176
    const/4 v2, 0x0

    :goto_0
    array-length v0, p2

    if-ge v2, v0, :cond_0

    .line 177
    aget v0, p2, v2

    aget-object v1, p1, v2

    aput-object v1, p0, v0

    .line 176
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 179
    :cond_0
    return-void
.end method
