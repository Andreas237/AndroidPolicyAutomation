.class public Lo/uq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final c:Lo/qr;

.field private e:Lo/oy;


# direct methods
.method public constructor <init>(Lo/qr;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lo/uq;->c:Lo/qr;

    .line 46
    return-void
.end method

.method private static a(Lo/ou;Lo/ou;Lo/ou;F)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 202
    invoke-static {p0, p1}, Lo/ou;->a(Lo/ou;Lo/ou;)F

    move-result v0

    div-float/2addr v0, p3

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v2

    .line 203
    invoke-static {p0, p2}, Lo/ou;->a(Lo/ou;Lo/ou;)F

    move-result v0

    div-float/2addr v0, p3

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v3

    .line 204
    add-int v0, v2, v3

    div-int/lit8 v0, v0, 0x2

    add-int/lit8 v4, v0, 0x7

    .line 205
    and-int/lit8 v0, v4, 0x3

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 207
    :pswitch_0
    add-int/lit8 v4, v4, 0x1

    .line 208
    goto :goto_0

    .line 211
    :pswitch_1
    add-int/lit8 v4, v4, -0x1

    .line 212
    goto :goto_0

    .line 214
    :pswitch_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 216
    :goto_0
    :pswitch_3
    return v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private b(IIII)F
    .locals 6

    .line 268
    invoke-direct {p0, p1, p2, p3, p4}, Lo/uq;->c(IIII)F

    move-result v2

    .line 271
    const/high16 v3, 0x3f800000    # 1.0f

    .line 272
    sub-int v0, p3, p1

    sub-int v4, p1, v0

    .line 273
    if-gez v4, :cond_0

    .line 274
    int-to-float v0, p1

    sub-int v1, p1, v4

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 275
    const/4 v4, 0x0

    goto :goto_0

    .line 276
    :cond_0
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v0

    if-lt v4, v0, :cond_1

    .line 277
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p1

    int-to-float v0, v0

    sub-int v1, v4, p1

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 278
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v0

    add-int/lit8 v4, v0, -0x1

    .line 280
    :cond_1
    :goto_0
    int-to-float v0, p2

    sub-int v1, p4, p2

    int-to-float v1, v1

    mul-float/2addr v1, v3

    sub-float/2addr v0, v1

    float-to-int v5, v0

    .line 282
    const/high16 v3, 0x3f800000    # 1.0f

    .line 283
    if-gez v5, :cond_2

    .line 284
    int-to-float v0, p2

    sub-int v1, p2, v5

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 285
    const/4 v5, 0x0

    goto :goto_1

    .line 286
    :cond_2
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    if-lt v5, v0, :cond_3

    .line 287
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, p2

    int-to-float v0, v0

    sub-int v1, v5, p2

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 288
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 290
    :cond_3
    :goto_1
    int-to-float v0, p1

    sub-int v1, v4, p1

    int-to-float v1, v1

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    float-to-int v4, v0

    .line 292
    invoke-direct {p0, p1, p2, v4, v5}, Lo/uq;->c(IIII)F

    move-result v0

    add-float/2addr v2, v0

    .line 295
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float v0, v2, v0

    return v0
.end method

.method private c(IIII)F
    .locals 16

    .line 309
    sub-int v0, p4, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int v1, p3, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 310
    :goto_0
    if-eqz v4, :cond_1

    .line 311
    move/from16 v5, p1

    .line 312
    move/from16 p1, p2

    .line 313
    move/from16 p2, v5

    .line 314
    move/from16 v5, p3

    .line 315
    move/from16 p3, p4

    .line 316
    move/from16 p4, v5

    .line 319
    :cond_1
    sub-int v0, p3, p1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 320
    sub-int v0, p4, p2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v6

    .line 321
    neg-int v0, v5

    div-int/lit8 v7, v0, 0x2

    .line 322
    move/from16 v0, p1

    move/from16 v1, p3

    if-ge v0, v1, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, -0x1

    .line 323
    :goto_1
    move/from16 v0, p2

    move/from16 v1, p4

    if-ge v0, v1, :cond_3

    const/4 v9, 0x1

    goto :goto_2

    :cond_3
    const/4 v9, -0x1

    .line 326
    :goto_2
    const/4 v10, 0x0

    .line 328
    add-int v11, p3, v8

    .line 329
    move/from16 v12, p1

    move/from16 v13, p2

    :goto_3
    if-eq v12, v11, :cond_b

    .line 330
    if-eqz v4, :cond_4

    move v14, v13

    goto :goto_4

    :cond_4
    move v14, v12

    .line 331
    :goto_4
    if-eqz v4, :cond_5

    move v15, v12

    goto :goto_5

    :cond_5
    move v15, v13

    .line 336
    :goto_5
    const/4 v0, 0x1

    if-ne v10, v0, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    move-object/from16 v1, p0

    iget-object v1, v1, Lo/uq;->c:Lo/qr;

    invoke-virtual {v1, v14, v15}, Lo/qr;->e(II)Z

    move-result v1

    if-ne v0, v1, :cond_8

    .line 337
    const/4 v0, 0x2

    if-ne v10, v0, :cond_7

    .line 338
    move/from16 v0, p1

    move/from16 v1, p2

    invoke-static {v12, v13, v0, v1}, Lo/rb;->c(IIII)F

    move-result v0

    return v0

    .line 340
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 343
    :cond_8
    add-int/2addr v7, v6

    .line 344
    if-lez v7, :cond_a

    .line 345
    move/from16 v0, p4

    if-ne v13, v0, :cond_9

    .line 346
    goto :goto_7

    .line 348
    :cond_9
    add-int/2addr v13, v9

    .line 349
    sub-int/2addr v7, v5

    .line 329
    :cond_a
    add-int/2addr v12, v8

    goto :goto_3

    .line 355
    :cond_b
    :goto_7
    const/4 v0, 0x2

    if-ne v10, v0, :cond_c

    .line 356
    add-int v0, p3, v8

    move/from16 v1, p4

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-static {v0, v1, v2, v3}, Lo/rb;->c(IIII)F

    move-result v0

    return v0

    .line 359
    :cond_c
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0
.end method

.method private static c(Lo/qr;Lo/qv;I)Lo/qr;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 190
    invoke-static {}, Lo/qu;->b()Lo/qu;

    move-result-object v1

    .line 191
    invoke-virtual {v1, p0, p2, p2, p1}, Lo/qu;->d(Lo/qr;IILo/qv;)Lo/qr;

    move-result-object v0

    return-object v0
.end method

.method private e(Lo/ou;Lo/ou;)F
    .locals 6

    .line 242
    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v0

    float-to-int v0, v0

    .line 243
    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v1

    float-to-int v1, v1

    .line 244
    invoke-virtual {p2}, Lo/ou;->b()F

    move-result v2

    float-to-int v2, v2

    .line 245
    invoke-virtual {p2}, Lo/ou;->e()F

    move-result v3

    float-to-int v3, v3

    .line 242
    invoke-direct {p0, v0, v1, v2, v3}, Lo/uq;->b(IIII)F

    move-result v4

    .line 246
    invoke-virtual {p2}, Lo/ou;->b()F

    move-result v0

    float-to-int v0, v0

    .line 247
    invoke-virtual {p2}, Lo/ou;->e()F

    move-result v1

    float-to-int v1, v1

    .line 248
    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v2

    float-to-int v2, v2

    .line 249
    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v3

    float-to-int v3, v3

    .line 246
    invoke-direct {p0, v0, v1, v2, v3}, Lo/uq;->b(IIII)F

    move-result v5

    .line 250
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 251
    const/high16 v0, 0x40e00000    # 7.0f

    div-float v0, v5, v0

    return v0

    .line 253
    :cond_0
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 254
    const/high16 v0, 0x40e00000    # 7.0f

    div-float v0, v4, v0

    return v0

    .line 258
    :cond_1
    add-float v0, v4, v5

    const/high16 v1, 0x41600000    # 14.0f

    div-float/2addr v0, v1

    return v0
.end method

.method private static e(Lo/ou;Lo/ou;Lo/ou;Lo/ou;I)Lo/qv;
    .locals 21

    .line 149
    move/from16 v0, p4

    int-to-float v0, v0

    const/high16 v1, 0x40600000    # 3.5f

    sub-float v16, v0, v1

    .line 154
    if-eqz p3, :cond_0

    .line 155
    invoke-virtual/range {p3 .. p3}, Lo/ou;->b()F

    move-result v17

    .line 156
    invoke-virtual/range {p3 .. p3}, Lo/ou;->e()F

    move-result v18

    .line 157
    const/high16 v0, 0x40400000    # 3.0f

    sub-float v19, v16, v0

    .line 158
    move/from16 v20, v19

    goto :goto_0

    .line 161
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lo/ou;->b()F

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Lo/ou;->b()F

    move-result v1

    add-float v17, v0, v1

    .line 162
    invoke-virtual/range {p1 .. p1}, Lo/ou;->e()F

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lo/ou;->e()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual/range {p2 .. p2}, Lo/ou;->e()F

    move-result v1

    add-float v18, v0, v1

    .line 163
    move/from16 v19, v16

    .line 164
    move/from16 v20, v16

    .line 167
    :goto_0
    move/from16 v2, v16

    move/from16 v4, v19

    move/from16 v5, v20

    move/from16 v7, v16

    .line 176
    invoke-virtual/range {p0 .. p0}, Lo/ou;->b()F

    move-result v8

    .line 177
    invoke-virtual/range {p0 .. p0}, Lo/ou;->e()F

    move-result v9

    .line 178
    invoke-virtual/range {p1 .. p1}, Lo/ou;->b()F

    move-result v10

    .line 179
    invoke-virtual/range {p1 .. p1}, Lo/ou;->e()F

    move-result v11

    move/from16 v12, v17

    move/from16 v13, v18

    .line 182
    invoke-virtual/range {p2 .. p2}, Lo/ou;->b()F

    move-result v14

    .line 183
    invoke-virtual/range {p2 .. p2}, Lo/ou;->e()F

    move-result v15

    .line 167
    const/high16 v0, 0x40600000    # 3.5f

    const/high16 v1, 0x40600000    # 3.5f

    const/high16 v3, 0x40600000    # 3.5f

    const/high16 v6, 0x40600000    # 3.5f

    invoke-static/range {v0 .. v15}, Lo/qv;->d(FFFFFFFFFFFFFFFF)Lo/qv;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected final a(FIIF)Lo/ur;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 380
    mul-float v0, p4, p1

    float-to-int v8, v0

    .line 381
    sub-int v0, p2, v8

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 382
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int v1, p2, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 383
    sub-int v0, v10, v9

    int-to-float v0, v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    .line 384
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 387
    :cond_0
    sub-int v0, p3, v8

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v11

    .line 388
    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    add-int v1, p3, v8

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v12

    .line 389
    sub-int v0, v12, v11

    int-to-float v0, v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, p1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 390
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 393
    :cond_1
    new-instance v0, Lo/us;

    iget-object v1, p0, Lo/uq;->c:Lo/qr;

    move v2, v9

    move v3, v11

    sub-int v4, v10, v9

    sub-int v5, v12, v11

    move v6, p1

    iget-object v7, p0, Lo/uq;->e:Lo/oy;

    invoke-direct/range {v0 .. v7}, Lo/us;-><init>(Lo/qr;IIIIFLo/oy;)V

    move-object v13, v0

    .line 402
    invoke-virtual {v13}, Lo/us;->d()Lo/ur;

    move-result-object v0

    return-object v0
.end method

.method protected final b(Lo/ou;Lo/ou;Lo/ou;)F
    .locals 2

    .line 232
    invoke-direct {p0, p1, p2}, Lo/uq;->e(Lo/ou;Lo/ou;)F

    move-result v0

    .line 233
    invoke-direct {p0, p1, p3}, Lo/uq;->e(Lo/ou;Lo/ou;)F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public final d(Ljava/util/Map;)Lo/qw;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lo/og;*>;)Lo/qw;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 77
    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/og;->h:Lo/og;

    .line 78
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/oy;

    :goto_0
    iput-object v0, p0, Lo/uq;->e:Lo/oy;

    .line 80
    new-instance v2, Lo/up;

    iget-object v0, p0, Lo/uq;->c:Lo/qr;

    iget-object v1, p0, Lo/uq;->e:Lo/oy;

    invoke-direct {v2, v0, v1}, Lo/up;-><init>(Lo/qr;Lo/oy;)V

    .line 81
    invoke-virtual {v2, p1}, Lo/up;->e(Ljava/util/Map;)Lo/ut;

    move-result-object v3

    .line 83
    invoke-virtual {p0, v3}, Lo/uq;->d(Lo/ut;)Lo/qw;

    move-result-object v0

    return-object v0
.end method

.method protected final d(Lo/ut;)Lo/qw;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 89
    invoke-virtual/range {p1 .. p1}, Lo/ut;->a()Lo/uo;

    move-result-object v2

    .line 90
    invoke-virtual/range {p1 .. p1}, Lo/ut;->e()Lo/uo;

    move-result-object v3

    .line 91
    invoke-virtual/range {p1 .. p1}, Lo/ut;->c()Lo/uo;

    move-result-object v4

    .line 93
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v4}, Lo/uq;->b(Lo/ou;Lo/ou;Lo/ou;)F

    move-result v5

    .line 94
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v5, v0

    if-gez v0, :cond_0

    .line 95
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 97
    :cond_0
    invoke-static {v2, v3, v4, v5}, Lo/uq;->a(Lo/ou;Lo/ou;Lo/ou;F)I

    move-result v6

    .line 98
    invoke-static {v6}, Lo/un;->a(I)Lo/un;

    move-result-object v7

    .line 99
    invoke-virtual {v7}, Lo/un;->d()I

    move-result v0

    add-int/lit8 v8, v0, -0x7

    .line 101
    const/4 v9, 0x0

    .line 103
    invoke-virtual {v7}, Lo/un;->e()[I

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_1

    .line 106
    invoke-virtual {v3}, Lo/uo;->b()F

    move-result v0

    invoke-virtual {v2}, Lo/uo;->b()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {v4}, Lo/uo;->b()F

    move-result v1

    add-float v10, v0, v1

    .line 107
    invoke-virtual {v3}, Lo/uo;->e()F

    move-result v0

    invoke-virtual {v2}, Lo/uo;->e()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-virtual {v4}, Lo/uo;->e()F

    move-result v1

    add-float v11, v0, v1

    .line 111
    int-to-float v0, v8

    const/high16 v1, 0x40400000    # 3.0f

    div-float v0, v1, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sub-float v12, v1, v0

    .line 112
    invoke-virtual {v2}, Lo/uo;->b()F

    move-result v0

    invoke-virtual {v2}, Lo/uo;->b()F

    move-result v1

    sub-float v1, v10, v1

    mul-float/2addr v1, v12

    add-float/2addr v0, v1

    float-to-int v13, v0

    .line 113
    invoke-virtual {v2}, Lo/uo;->e()F

    move-result v0

    invoke-virtual {v2}, Lo/uo;->e()F

    move-result v1

    sub-float v1, v11, v1

    mul-float/2addr v1, v12

    add-float/2addr v0, v1

    float-to-int v14, v0

    .line 116
    const/4 v15, 0x4

    :goto_0
    const/16 v0, 0x10

    if-gt v15, v0, :cond_1

    .line 118
    int-to-float v0, v15

    move-object/from16 v1, p0

    :try_start_0
    invoke-virtual {v1, v5, v13, v14, v0}, Lo/uq;->a(FIIF)Lo/ur;
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 122
    goto :goto_1

    .line 123
    :catch_0
    move-exception v16

    .line 116
    shl-int/lit8 v15, v15, 0x1

    goto :goto_0

    .line 130
    .line 131
    :cond_1
    :goto_1
    invoke-static {v2, v3, v4, v9, v6}, Lo/uq;->e(Lo/ou;Lo/ou;Lo/ou;Lo/ou;I)Lo/qv;

    move-result-object v10

    .line 133
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/uq;->c:Lo/qr;

    invoke-static {v0, v10, v6}, Lo/uq;->c(Lo/qr;Lo/qv;I)Lo/qr;

    move-result-object v11

    .line 136
    if-nez v9, :cond_2

    .line 137
    const/4 v0, 0x3

    new-array v12, v0, [Lo/ou;

    const/4 v0, 0x0

    aput-object v4, v12, v0

    const/4 v0, 0x1

    aput-object v2, v12, v0

    const/4 v0, 0x2

    aput-object v3, v12, v0

    goto :goto_2

    .line 139
    :cond_2
    const/4 v0, 0x4

    new-array v12, v0, [Lo/ou;

    const/4 v0, 0x0

    aput-object v4, v12, v0

    const/4 v0, 0x1

    aput-object v2, v12, v0

    const/4 v0, 0x2

    aput-object v3, v12, v0

    const/4 v0, 0x3

    aput-object v9, v12, v0

    .line 141
    :goto_2
    new-instance v0, Lo/qw;

    invoke-direct {v0, v11, v12}, Lo/qw;-><init>(Lo/qr;[Lo/ou;)V

    return-object v0
.end method
