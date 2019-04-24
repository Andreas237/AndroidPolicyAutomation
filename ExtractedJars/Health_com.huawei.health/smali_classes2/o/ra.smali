.class public final Lo/ra;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lo/qr;

.field private final c:I

.field private final d:I

.field private final e:I

.field private final f:I

.field private final h:I


# direct methods
.method public constructor <init>(Lo/qr;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 47
    invoke-virtual {p1}, Lo/qr;->a()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p1}, Lo/qr;->h()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    const/16 v2, 0xa

    invoke-direct {p0, p1, v2, v0, v1}, Lo/ra;-><init>(Lo/qr;III)V

    .line 48
    return-void
.end method

.method public constructor <init>(Lo/qr;III)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, Lo/ra;->b:Lo/qr;

    .line 59
    invoke-virtual {p1}, Lo/qr;->h()I

    move-result v0

    iput v0, p0, Lo/ra;->c:I

    .line 60
    invoke-virtual {p1}, Lo/qr;->a()I

    move-result v0

    iput v0, p0, Lo/ra;->a:I

    .line 61
    div-int/lit8 v2, p2, 0x2

    .line 62
    sub-int v0, p3, v2

    iput v0, p0, Lo/ra;->d:I

    .line 63
    add-int v0, p3, v2

    iput v0, p0, Lo/ra;->e:I

    .line 64
    sub-int v0, p4, v2

    iput v0, p0, Lo/ra;->f:I

    .line 65
    add-int v0, p4, v2

    iput v0, p0, Lo/ra;->h:I

    .line 66
    iget v0, p0, Lo/ra;->f:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/ra;->d:I

    if-ltz v0, :cond_0

    iget v0, p0, Lo/ra;->h:I

    iget v1, p0, Lo/ra;->c:I

    if-ge v0, v1, :cond_0

    iget v0, p0, Lo/ra;->e:I

    iget v1, p0, Lo/ra;->a:I

    if-lt v0, v1, :cond_1

    .line 67
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 69
    :cond_1
    return-void
.end method

.method private c(FFFF)Lo/ou;
    .locals 9

    .line 253
    invoke-static {p1, p2, p3, p4}, Lo/rb;->e(FFFF)F

    move-result v0

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v3

    .line 254
    sub-float v0, p3, p1

    int-to-float v1, v3

    div-float v4, v0, v1

    .line 255
    sub-float v0, p4, p2

    int-to-float v1, v3

    div-float v5, v0, v1

    .line 257
    const/4 v6, 0x0

    :goto_0
    if-ge v6, v3, :cond_1

    .line 258
    int-to-float v0, v6

    mul-float/2addr v0, v4

    add-float/2addr v0, p1

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v7

    .line 259
    int-to-float v0, v6

    mul-float/2addr v0, v5

    add-float/2addr v0, p2

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v8

    .line 260
    iget-object v0, p0, Lo/ra;->b:Lo/qr;

    invoke-virtual {v0, v7, v8}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    new-instance v0, Lo/ou;

    int-to-float v1, v7

    int-to-float v2, v8

    invoke-direct {v0, v1, v2}, Lo/ou;-><init>(FF)V

    return-object v0

    .line 257
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 264
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private d(Lo/ou;Lo/ou;Lo/ou;Lo/ou;)[Lo/ou;
    .locals 12

    .line 290
    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v4

    .line 291
    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v5

    .line 292
    invoke-virtual {p2}, Lo/ou;->b()F

    move-result v6

    .line 293
    invoke-virtual {p2}, Lo/ou;->e()F

    move-result v7

    .line 294
    invoke-virtual {p3}, Lo/ou;->b()F

    move-result v8

    .line 295
    invoke-virtual {p3}, Lo/ou;->e()F

    move-result v9

    .line 296
    invoke-virtual/range {p4 .. p4}, Lo/ou;->b()F

    move-result v10

    .line 297
    invoke-virtual/range {p4 .. p4}, Lo/ou;->e()F

    move-result v11

    .line 299
    iget v0, p0, Lo/ra;->a:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    cmpg-float v0, v4, v0

    if-gez v0, :cond_0

    .line 300
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ou;

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v10, v2

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v3, v11

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v2, v6

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v3, v7

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v8, v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v3, v9, v3

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v2, v4

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v3, v5, v3

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0

    .line 306
    :cond_0
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ou;

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v2, v10

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v3, v11

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    add-float/2addr v2, v6

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v3, v7, v3

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v8, v2

    const/high16 v3, 0x3f800000    # 1.0f

    add-float/2addr v3, v9

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lo/ou;

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v4, v2

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float v3, v5, v3

    invoke-direct {v1, v2, v3}, Lo/ou;-><init>(FF)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method private e(IIIZ)Z
    .locals 2

    .line 325
    if-eqz p4, :cond_2

    .line 326
    move v1, p1

    :goto_0
    if-gt v1, p2, :cond_1

    .line 327
    iget-object v0, p0, Lo/ra;->b:Lo/qr;

    invoke-virtual {v0, v1, p3}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 328
    const/4 v0, 0x1

    return v0

    .line 326
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    goto :goto_2

    .line 332
    :cond_2
    move v1, p1

    :goto_1
    if-gt v1, p2, :cond_4

    .line 333
    iget-object v0, p0, Lo/ra;->b:Lo/qr;

    invoke-virtual {v0, p3, v1}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 334
    const/4 v0, 0x1

    return v0

    .line 332
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 339
    :cond_4
    :goto_2
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public c()[Lo/ou;
    .locals 22
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 87
    move-object/from16 v0, p0

    iget v5, v0, Lo/ra;->d:I

    .line 88
    move-object/from16 v0, p0

    iget v6, v0, Lo/ra;->e:I

    .line 89
    move-object/from16 v0, p0

    iget v7, v0, Lo/ra;->f:I

    .line 90
    move-object/from16 v0, p0

    iget v8, v0, Lo/ra;->h:I

    .line 91
    const/4 v9, 0x0

    .line 92
    const/4 v10, 0x1

    .line 93
    const/4 v11, 0x0

    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v13, 0x0

    .line 97
    const/4 v14, 0x0

    .line 98
    const/4 v15, 0x0

    .line 100
    :goto_0
    if-eqz v10, :cond_15

    .line 102
    const/4 v10, 0x0

    .line 107
    const/16 v16, 0x1

    .line 108
    :cond_0
    :goto_1
    if-nez v16, :cond_1

    if-nez v12, :cond_3

    :cond_1
    move-object/from16 v0, p0

    iget v0, v0, Lo/ra;->a:I

    if-ge v6, v0, :cond_3

    .line 109
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v7, v8, v6, v1}, Lo/ra;->e(IIIZ)Z

    move-result v16

    .line 110
    if-eqz v16, :cond_2

    .line 111
    add-int/lit8 v6, v6, 0x1

    .line 112
    const/4 v10, 0x1

    .line 113
    const/4 v12, 0x1

    goto :goto_1

    .line 114
    :cond_2
    if-nez v12, :cond_0

    .line 115
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 119
    :cond_3
    move-object/from16 v0, p0

    iget v0, v0, Lo/ra;->a:I

    if-lt v6, v0, :cond_4

    .line 120
    const/4 v9, 0x1

    .line 121
    goto/16 :goto_5

    .line 127
    :cond_4
    const/16 v17, 0x1

    .line 128
    :cond_5
    :goto_2
    if-nez v17, :cond_6

    if-nez v13, :cond_8

    :cond_6
    move-object/from16 v0, p0

    iget v0, v0, Lo/ra;->c:I

    if-ge v8, v0, :cond_8

    .line 129
    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-direct {v0, v5, v6, v8, v1}, Lo/ra;->e(IIIZ)Z

    move-result v17

    .line 130
    if-eqz v17, :cond_7

    .line 131
    add-int/lit8 v8, v8, 0x1

    .line 132
    const/4 v10, 0x1

    .line 133
    const/4 v13, 0x1

    goto :goto_2

    .line 134
    :cond_7
    if-nez v13, :cond_5

    .line 135
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 139
    :cond_8
    move-object/from16 v0, p0

    iget v0, v0, Lo/ra;->c:I

    if-lt v8, v0, :cond_9

    .line 140
    const/4 v9, 0x1

    .line 141
    goto/16 :goto_5

    .line 147
    :cond_9
    const/16 v18, 0x1

    .line 148
    :cond_a
    :goto_3
    if-nez v18, :cond_b

    if-nez v14, :cond_d

    :cond_b
    if-ltz v5, :cond_d

    .line 149
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v7, v8, v5, v1}, Lo/ra;->e(IIIZ)Z

    move-result v18

    .line 150
    if-eqz v18, :cond_c

    .line 151
    add-int/lit8 v5, v5, -0x1

    .line 152
    const/4 v10, 0x1

    .line 153
    const/4 v14, 0x1

    goto :goto_3

    .line 154
    :cond_c
    if-nez v14, :cond_a

    .line 155
    add-int/lit8 v5, v5, -0x1

    goto :goto_3

    .line 159
    :cond_d
    if-gez v5, :cond_e

    .line 160
    const/4 v9, 0x1

    .line 161
    goto :goto_5

    .line 167
    :cond_e
    const/16 v19, 0x1

    .line 168
    :cond_f
    :goto_4
    if-nez v19, :cond_10

    if-nez v15, :cond_12

    :cond_10
    if-ltz v7, :cond_12

    .line 169
    move-object/from16 v0, p0

    const/4 v1, 0x1

    invoke-direct {v0, v5, v6, v7, v1}, Lo/ra;->e(IIIZ)Z

    move-result v19

    .line 170
    if-eqz v19, :cond_11

    .line 171
    add-int/lit8 v7, v7, -0x1

    .line 172
    const/4 v10, 0x1

    .line 173
    const/4 v15, 0x1

    goto :goto_4

    .line 174
    :cond_11
    if-nez v15, :cond_f

    .line 175
    add-int/lit8 v7, v7, -0x1

    goto :goto_4

    .line 179
    :cond_12
    if-gez v7, :cond_13

    .line 180
    const/4 v9, 0x1

    .line 181
    goto :goto_5

    .line 184
    :cond_13
    if-eqz v10, :cond_14

    .line 185
    const/4 v11, 0x1

    .line 188
    :cond_14
    goto/16 :goto_0

    .line 190
    :cond_15
    :goto_5
    if-nez v9, :cond_22

    if-eqz v11, :cond_22

    .line 192
    sub-int v16, v6, v5

    .line 194
    const/16 v17, 0x0

    .line 195
    const/16 v18, 0x1

    :goto_6
    move/from16 v0, v18

    move/from16 v1, v16

    if-ge v0, v1, :cond_17

    .line 196
    int-to-float v0, v5

    sub-int v1, v8, v18

    int-to-float v1, v1

    add-int v2, v5, v18

    int-to-float v2, v2

    int-to-float v3, v8

    move-object/from16 v4, p0

    invoke-direct {v4, v0, v1, v2, v3}, Lo/ra;->c(FFFF)Lo/ou;

    move-result-object v17

    .line 197
    if-eqz v17, :cond_16

    .line 198
    goto :goto_7

    .line 195
    :cond_16
    add-int/lit8 v18, v18, 0x1

    goto :goto_6

    .line 202
    :cond_17
    :goto_7
    if-nez v17, :cond_18

    .line 203
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 206
    :cond_18
    const/16 v18, 0x0

    .line 208
    const/16 v19, 0x1

    :goto_8
    move/from16 v0, v19

    move/from16 v1, v16

    if-ge v0, v1, :cond_1a

    .line 209
    int-to-float v0, v5

    add-int v1, v7, v19

    int-to-float v1, v1

    add-int v2, v5, v19

    int-to-float v2, v2

    int-to-float v3, v7

    move-object/from16 v4, p0

    invoke-direct {v4, v0, v1, v2, v3}, Lo/ra;->c(FFFF)Lo/ou;

    move-result-object v18

    .line 210
    if-eqz v18, :cond_19

    .line 211
    goto :goto_9

    .line 208
    :cond_19
    add-int/lit8 v19, v19, 0x1

    goto :goto_8

    .line 215
    :cond_1a
    :goto_9
    if-nez v18, :cond_1b

    .line 216
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 219
    :cond_1b
    const/16 v19, 0x0

    .line 221
    const/16 v20, 0x1

    :goto_a
    move/from16 v0, v20

    move/from16 v1, v16

    if-ge v0, v1, :cond_1d

    .line 222
    int-to-float v0, v6

    add-int v1, v7, v20

    int-to-float v1, v1

    sub-int v2, v6, v20

    int-to-float v2, v2

    int-to-float v3, v7

    move-object/from16 v4, p0

    invoke-direct {v4, v0, v1, v2, v3}, Lo/ra;->c(FFFF)Lo/ou;

    move-result-object v19

    .line 223
    if-eqz v19, :cond_1c

    .line 224
    goto :goto_b

    .line 221
    :cond_1c
    add-int/lit8 v20, v20, 0x1

    goto :goto_a

    .line 228
    :cond_1d
    :goto_b
    if-nez v19, :cond_1e

    .line 229
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 232
    :cond_1e
    const/16 v20, 0x0

    .line 234
    const/16 v21, 0x1

    :goto_c
    move/from16 v0, v21

    move/from16 v1, v16

    if-ge v0, v1, :cond_20

    .line 235
    int-to-float v0, v6

    sub-int v1, v8, v21

    int-to-float v1, v1

    sub-int v2, v6, v21

    int-to-float v2, v2

    int-to-float v3, v8

    move-object/from16 v4, p0

    invoke-direct {v4, v0, v1, v2, v3}, Lo/ra;->c(FFFF)Lo/ou;

    move-result-object v20

    .line 236
    if-eqz v20, :cond_1f

    .line 237
    goto :goto_d

    .line 234
    :cond_1f
    add-int/lit8 v21, v21, 0x1

    goto :goto_c

    .line 241
    :cond_20
    :goto_d
    if-nez v20, :cond_21

    .line 242
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 245
    :cond_21
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move-object/from16 v2, v17

    move-object/from16 v3, v19

    move-object/from16 v4, v18

    invoke-direct {v0, v1, v2, v3, v4}, Lo/ra;->d(Lo/ou;Lo/ou;Lo/ou;Lo/ou;)[Lo/ou;

    move-result-object v0

    return-object v0

    .line 248
    :cond_22
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method
