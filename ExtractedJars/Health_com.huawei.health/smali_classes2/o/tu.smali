.class public final Lo/tu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lo/tv;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lo/tv;

    invoke-direct {v0}, Lo/tv;-><init>()V

    sput-object v0, Lo/tu;->c:Lo/tv;

    return-void
.end method

.method private static a(I)I
    .locals 1

    .line 488
    const/4 v0, 0x2

    shl-int/2addr v0, p0

    return v0
.end method

.method private static a(Lo/tt;)Lo/qn;
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;,
            Lo/oh;,
            Lo/oo;
        }
    .end annotation

    .line 252
    invoke-static {p0}, Lo/tu;->e(Lo/tt;)[[Lo/tn;

    move-result-object v3

    .line 253
    invoke-static {p0, v3}, Lo/tu;->d(Lo/tt;[[Lo/tn;)V

    .line 254
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 255
    invoke-virtual {p0}, Lo/tt;->a()I

    move-result v0

    invoke-virtual {p0}, Lo/tt;->d()I

    move-result v1

    mul-int/2addr v0, v1

    new-array v5, v0, [I

    .line 256
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 257
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 258
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {p0}, Lo/tt;->a()I

    move-result v0

    if-ge v8, v0, :cond_3

    .line 259
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {p0}, Lo/tt;->d()I

    move-result v0

    if-ge v9, v0, :cond_2

    .line 260
    aget-object v0, v3, v8

    add-int/lit8 v1, v9, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tn;->a()[I

    move-result-object v10

    .line 261
    invoke-virtual {p0}, Lo/tt;->d()I

    move-result v0

    mul-int/2addr v0, v8

    add-int v11, v0, v9

    .line 262
    array-length v0, v10

    if-nez v0, :cond_0

    .line 263
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 264
    :cond_0
    array-length v0, v10

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 265
    const/4 v0, 0x0

    aget v0, v10, v0

    aput v0, v5, v11

    goto :goto_2

    .line 267
    :cond_1
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 268
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 259
    :goto_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 258
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 272
    :cond_3
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    new-array v8, v0, [[I

    .line 273
    const/4 v9, 0x0

    :goto_3
    array-length v0, v8

    if-ge v9, v0, :cond_4

    .line 274
    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    aput-object v0, v8, v9

    .line 273
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 276
    :cond_4
    invoke-virtual {p0}, Lo/tt;->c()I

    move-result v0

    .line 277
    invoke-static {v4}, Lo/to;->d(Ljava/util/Collection;)[I

    move-result-object v1

    invoke-static {v7}, Lo/to;->d(Ljava/util/Collection;)[I

    move-result-object v2

    .line 276
    invoke-static {v0, v5, v1, v2, v8}, Lo/tu;->e(I[I[I[I[[I)Lo/qn;

    move-result-object v0

    return-object v0
.end method

.method private static a(III)Z
    .locals 1

    .line 515
    add-int/lit8 v0, p1, -0x2

    if-gt v0, p0, :cond_0

    add-int/lit8 v0, p2, 0x2

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static a(Lo/tt;I)Z
    .locals 2

    .line 359
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lo/tt;->d()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static b([I)I
    .locals 6

    .line 177
    const/4 v1, -0x1

    .line 178
    move-object v2, p0

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    .line 179
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 178
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 181
    :cond_0
    return v1
.end method

.method private static b(Lo/ty;Lo/ty;)Lo/tm;
    .locals 4

    .line 187
    if-eqz p0, :cond_0

    .line 188
    invoke-virtual {p0}, Lo/ty;->c()Lo/tm;

    move-result-object v2

    if-nez v2, :cond_2

    .line 189
    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lo/ty;->c()Lo/tm;

    move-result-object v0

    :goto_0
    return-object v0

    .line 192
    :cond_2
    if-eqz p1, :cond_3

    .line 193
    invoke-virtual {p1}, Lo/ty;->c()Lo/tm;

    move-result-object v3

    if-nez v3, :cond_4

    .line 194
    :cond_3
    return-object v2

    .line 197
    :cond_4
    invoke-virtual {v2}, Lo/tm;->e()I

    move-result v0

    invoke-virtual {v3}, Lo/tm;->e()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 198
    invoke-virtual {v2}, Lo/tm;->c()I

    move-result v0

    invoke-virtual {v3}, Lo/tm;->c()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 199
    invoke-virtual {v2}, Lo/tm;->a()I

    move-result v0

    invoke-virtual {v3}, Lo/tm;->a()I

    move-result v1

    if-eq v0, v1, :cond_5

    .line 200
    const/4 v0, 0x0

    return-object v0

    .line 202
    :cond_5
    return-object v2
.end method

.method private static b([II)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 560
    array-length v0, p0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    .line 563
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 568
    :cond_0
    const/4 v0, 0x0

    aget v2, p0, v0

    .line 569
    array-length v0, p0

    if-le v2, v0, :cond_1

    .line 570
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 572
    :cond_1
    if-nez v2, :cond_3

    .line 574
    array-length v0, p0

    if-ge p1, v0, :cond_2

    .line 575
    array-length v0, p0

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    aput v0, p0, v1

    goto :goto_0

    .line 577
    :cond_2
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 580
    :cond_3
    :goto_0
    return-void
.end method

.method private static b(I)[I
    .locals 5

    .line 583
    const/16 v0, 0x8

    new-array v2, v0, [I

    .line 584
    const/4 v3, 0x0

    .line 585
    array-length v0, v2

    const/4 v4, 0x7

    .line 587
    :goto_0
    and-int/lit8 v0, p0, 0x1

    if-eq v0, v3, :cond_0

    .line 588
    and-int/lit8 v3, p0, 0x1

    .line 589
    add-int/lit8 v4, v4, -0x1

    .line 590
    if-gez v4, :cond_0

    .line 591
    goto :goto_1

    .line 594
    :cond_0
    aget v0, v2, v4

    add-int/lit8 v0, v0, 0x1

    aput v0, v2, v4

    .line 595
    shr-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 597
    :goto_1
    return-object v2
.end method

.method private static c(Lo/tt;IIZ)I
    .locals 11

    .line 366
    if-eqz p3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, -0x1

    .line 367
    :goto_0
    const/4 v5, 0x0

    .line 368
    sub-int v0, p1, v4

    invoke-static {p0, v0}, Lo/tu;->a(Lo/tt;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 369
    sub-int v0, p1, v4

    invoke-virtual {p0, v0}, Lo/tt;->a(I)Lo/tr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/tr;->e(I)Lo/tp;

    move-result-object v5

    .line 371
    :cond_1
    if-eqz v5, :cond_3

    .line 372
    if-eqz p3, :cond_2

    invoke-virtual {v5}, Lo/tp;->d()I

    move-result v0

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Lo/tp;->a()I

    move-result v0

    :goto_1
    return v0

    .line 374
    :cond_3
    invoke-virtual {p0, p1}, Lo/tt;->a(I)Lo/tr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/tr;->a(I)Lo/tp;

    move-result-object v5

    .line 375
    if-eqz v5, :cond_5

    .line 376
    if-eqz p3, :cond_4

    invoke-virtual {v5}, Lo/tp;->a()I

    move-result v0

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Lo/tp;->d()I

    move-result v0

    :goto_2
    return v0

    .line 378
    :cond_5
    sub-int v0, p1, v4

    invoke-static {p0, v0}, Lo/tu;->a(Lo/tt;I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 379
    sub-int v0, p1, v4

    invoke-virtual {p0, v0}, Lo/tt;->a(I)Lo/tr;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/tr;->a(I)Lo/tp;

    move-result-object v5

    .line 381
    :cond_6
    if-eqz v5, :cond_8

    .line 382
    if-eqz p3, :cond_7

    invoke-virtual {v5}, Lo/tp;->d()I

    move-result v0

    goto :goto_3

    :cond_7
    invoke-virtual {v5}, Lo/tp;->a()I

    move-result v0

    :goto_3
    return v0

    .line 384
    :cond_8
    const/4 v6, 0x0

    .line 386
    :goto_4
    sub-int v0, p1, v4

    invoke-static {p0, v0}, Lo/tu;->a(Lo/tt;I)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 387
    sub-int/2addr p1, v4

    .line 388
    invoke-virtual {p0, p1}, Lo/tt;->a(I)Lo/tr;

    move-result-object v0

    invoke-virtual {v0}, Lo/tr;->e()[Lo/tp;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_5
    if-ge v9, v8, :cond_b

    aget-object v10, v7, v9

    .line 389
    if-eqz v10, :cond_a

    .line 390
    if-eqz p3, :cond_9

    invoke-virtual {v10}, Lo/tp;->d()I

    move-result v0

    goto :goto_6

    :cond_9
    invoke-virtual {v10}, Lo/tp;->a()I

    move-result v0

    :goto_6
    mul-int v1, v4, v6

    .line 393
    invoke-virtual {v10}, Lo/tp;->d()I

    move-result v2

    invoke-virtual {v10}, Lo/tp;->a()I

    move-result v3

    sub-int/2addr v2, v3

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    return v0

    .line 388
    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    .line 396
    :cond_b
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    .line 398
    :cond_c
    if-eqz p3, :cond_d

    invoke-virtual {p0}, Lo/tt;->e()Lo/tq;

    move-result-object v0

    invoke-virtual {v0}, Lo/tq;->a()I

    move-result v0

    goto :goto_7

    :cond_d
    invoke-virtual {p0}, Lo/tt;->e()Lo/tq;

    move-result-object v0

    invoke-virtual {v0}, Lo/tq;->e()I

    move-result v0

    :goto_7
    return v0
.end method

.method private static c([I)I
    .locals 2

    .line 605
    const/4 v0, 0x0

    aget v0, p0, v0

    const/4 v1, 0x2

    aget v1, p0, v1

    sub-int/2addr v0, v1

    const/4 v1, 0x4

    aget v1, p0, v1

    add-int/2addr v0, v1

    const/4 v1, 0x6

    aget v1, p0, v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x9

    rem-int/lit8 v0, v0, 0x9

    return v0
.end method

.method private static c(Lo/qr;IIZIIII)Lo/tp;
    .locals 7

    .line 409
    invoke-static/range {p0 .. p5}, Lo/tu;->d(Lo/qr;IIZII)I

    move-result p4

    .line 414
    invoke-static/range {p0 .. p5}, Lo/tu;->e(Lo/qr;IIZII)[I

    move-result-object v2

    .line 415
    if-nez v2, :cond_0

    .line 416
    const/4 v0, 0x0

    return-object v0

    .line 419
    :cond_0
    invoke-static {v2}, Lo/to;->c([I)I

    move-result v4

    .line 420
    if-eqz p3, :cond_1

    .line 421
    add-int v3, p4, v4

    goto :goto_1

    .line 423
    :cond_1
    const/4 v5, 0x0

    :goto_0
    array-length v0, v2

    div-int/lit8 v0, v0, 0x2

    if-ge v5, v0, :cond_2

    .line 424
    aget v6, v2, v5

    .line 425
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v5

    aget v0, v2, v0

    aput v0, v2, v5

    .line 426
    array-length v0, v2

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v5

    aput v6, v2, v0

    .line 423
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 428
    :cond_2
    move v3, p4

    .line 429
    sub-int p4, v3, v4

    .line 445
    :goto_1
    invoke-static {v4, p6, p7}, Lo/tu;->a(III)Z

    move-result v0

    if-nez v0, :cond_3

    .line 448
    const/4 v0, 0x0

    return-object v0

    .line 451
    :cond_3
    invoke-static {v2}, Lo/tw;->c([I)I

    move-result v5

    .line 452
    invoke-static {v5}, Lo/to;->e(I)I

    move-result v6

    .line 453
    const/4 v0, -0x1

    if-ne v6, v0, :cond_4

    .line 454
    const/4 v0, 0x0

    return-object v0

    .line 456
    :cond_4
    new-instance v0, Lo/tp;

    invoke-static {v5}, Lo/tu;->e(I)I

    move-result v1

    invoke-direct {v0, p4, v3, v1, v6}, Lo/tp;-><init>(IIII)V

    return-object v0
.end method

.method private static c(Lo/qr;Lo/tq;Lo/ou;ZII)Lo/ty;
    .locals 14

    .line 211
    new-instance v8, Lo/ty;

    move/from16 v0, p3

    invoke-direct {v8, p1, v0}, Lo/ty;-><init>(Lo/tq;Z)V

    .line 213
    const/4 v9, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v9, v0, :cond_4

    .line 214
    if-nez v9, :cond_0

    const/4 v10, 0x1

    goto :goto_1

    :cond_0
    const/4 v10, -0x1

    .line 215
    :goto_1
    invoke-virtual/range {p2 .. p2}, Lo/ou;->b()F

    move-result v0

    float-to-int v11, v0

    .line 216
    invoke-virtual/range {p2 .. p2}, Lo/ou;->e()F

    move-result v0

    float-to-int v12, v0

    :goto_2
    invoke-virtual {p1}, Lo/tq;->c()I

    move-result v0

    if-gt v12, v0, :cond_3

    .line 217
    invoke-virtual {p1}, Lo/tq;->b()I

    move-result v0

    if-lt v12, v0, :cond_3

    .line 218
    move-object v0, p0

    invoke-virtual {p0}, Lo/qr;->a()I

    move-result v2

    move/from16 v3, p3

    move v4, v11

    move v5, v12

    move/from16 v6, p4

    move/from16 v7, p5

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Lo/tu;->c(Lo/qr;IIZIIII)Lo/tp;

    move-result-object v13

    .line 220
    if-eqz v13, :cond_2

    .line 221
    invoke-virtual {v8, v12, v13}, Lo/ty;->c(ILo/tp;)V

    .line 222
    if-eqz p3, :cond_1

    .line 223
    invoke-virtual {v13}, Lo/tp;->a()I

    move-result v11

    goto :goto_3

    .line 225
    :cond_1
    invoke-virtual {v13}, Lo/tp;->d()I

    move-result v11

    .line 217
    :cond_2
    :goto_3
    add-int/2addr v12, v10

    goto :goto_2

    .line 213
    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 230
    :cond_4
    return-object v8
.end method

.method private static d(Lo/qr;IIZII)I
    .locals 5

    .line 497
    move v2, p4

    .line 498
    if-eqz p3, :cond_0

    const/4 v3, -0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    .line 500
    :goto_0
    const/4 v4, 0x0

    :goto_1
    const/4 v0, 0x2

    if-ge v4, v0, :cond_6

    .line 501
    :goto_2
    if-eqz p3, :cond_1

    if-ge v2, p1, :cond_2

    :cond_1
    if-nez p3, :cond_4

    if-ge v2, p2, :cond_4

    .line 502
    :cond_2
    invoke-virtual {p0, v2, p5}, Lo/qr;->e(II)Z

    move-result v0

    if-ne p3, v0, :cond_4

    .line 503
    sub-int v0, p4, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_3

    .line 504
    return p4

    .line 506
    :cond_3
    add-int/2addr v2, v3

    goto :goto_2

    .line 508
    :cond_4
    neg-int v3, v3

    .line 509
    if-nez p3, :cond_5

    const/4 p3, 0x1

    goto :goto_3

    :cond_5
    const/4 p3, 0x0

    .line 500
    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 511
    :cond_6
    return v2
.end method

.method private static d([II[I)Lo/qn;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 521
    array-length v0, p0

    if-nez v0, :cond_0

    .line 522
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 525
    :cond_0
    add-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    shl-int v2, v1, v0

    .line 526
    invoke-static {p0, p2, v2}, Lo/tu;->e([I[II)I

    move-result v3

    .line 527
    invoke-static {p0, v2}, Lo/tu;->b([II)V

    .line 530
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lo/ts;->a([ILjava/lang/String;)Lo/qn;

    move-result-object v4

    .line 531
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/qn;->a(Ljava/lang/Integer;)V

    .line 532
    array-length v0, p2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lo/qn;->d(Ljava/lang/Integer;)V

    .line 533
    return-object v4
.end method

.method private static d(Lo/ty;Lo/ty;)Lo/tt;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 129
    if-nez p0, :cond_0

    if-nez p1, :cond_0

    .line 130
    const/4 v0, 0x0

    return-object v0

    .line 132
    :cond_0
    invoke-static {p0, p1}, Lo/tu;->b(Lo/ty;Lo/ty;)Lo/tm;

    move-result-object v2

    .line 133
    if-nez v2, :cond_1

    .line 134
    const/4 v0, 0x0

    return-object v0

    .line 136
    :cond_1
    invoke-static {p0}, Lo/tu;->e(Lo/ty;)Lo/tq;

    move-result-object v0

    .line 137
    invoke-static {p1}, Lo/tu;->e(Lo/ty;)Lo/tq;

    move-result-object v1

    .line 136
    invoke-static {v0, v1}, Lo/tq;->c(Lo/tq;Lo/tq;)Lo/tq;

    move-result-object v3

    .line 138
    new-instance v0, Lo/tt;

    invoke-direct {v0, v2, v3}, Lo/tt;-><init>(Lo/tm;Lo/tq;)V

    return-object v0
.end method

.method private static d(Lo/tt;[[Lo/tn;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 235
    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Lo/tn;->a()[I

    move-result-object v2

    .line 236
    invoke-virtual {p0}, Lo/tt;->d()I

    move-result v0

    .line 237
    invoke-virtual {p0}, Lo/tt;->a()I

    move-result v1

    mul-int/2addr v0, v1

    .line 238
    invoke-virtual {p0}, Lo/tt;->c()I

    move-result v1

    invoke-static {v1}, Lo/tu;->a(I)I

    move-result v1

    sub-int v3, v0, v1

    .line 239
    array-length v0, v2

    if-nez v0, :cond_2

    .line 240
    const/4 v0, 0x1

    if-lt v3, v0, :cond_0

    const/16 v0, 0x3a0

    if-le v3, v0, :cond_1

    .line 241
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 243
    :cond_1
    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0, v3}, Lo/tn;->d(I)V

    goto :goto_0

    .line 244
    :cond_2
    const/4 v0, 0x0

    aget v0, v2, v0

    if-eq v0, v3, :cond_3

    .line 246
    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0, v3}, Lo/tn;->d(I)V

    .line 248
    :cond_3
    :goto_0
    return-void
.end method

.method private static e(I)I
    .locals 1

    .line 601
    invoke-static {p0}, Lo/tu;->b(I)[I

    move-result-object v0

    invoke-static {v0}, Lo/tu;->c([I)I

    move-result v0

    return v0
.end method

.method private static e([I[II)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oh;
        }
    .end annotation

    .line 546
    if-eqz p1, :cond_0

    array-length v0, p1

    div-int/lit8 v1, p2, 0x2

    add-int/lit8 v1, v1, 0x3

    if-gt v0, v1, :cond_1

    :cond_0
    if-ltz p2, :cond_1

    const/16 v0, 0x200

    if-le p2, v0, :cond_2

    .line 551
    :cond_1
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 553
    :cond_2
    sget-object v0, Lo/tu;->c:Lo/tv;

    invoke-virtual {v0, p0, p2, p1}, Lo/tv;->d([II[I)I

    move-result v0

    return v0
.end method

.method private static e(I[I[I[I[[I)Lo/qn;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 299
    array-length v0, p3

    new-array v3, v0, [I

    .line 301
    const/16 v4, 0x64

    .line 302
    :goto_0
    move v0, v4

    add-int/lit8 v4, v4, -0x1

    if-lez v0, :cond_5

    .line 303
    const/4 v5, 0x0

    :goto_1
    array-length v0, v3

    if-ge v5, v0, :cond_0

    .line 304
    aget v0, p3, v5

    aget-object v1, p4, v5

    aget v2, v3, v5

    aget v1, v1, v2

    aput v1, p1, v0

    .line 303
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 307
    :cond_0
    :try_start_0
    invoke-static {p1, p0, p2}, Lo/tu;->d([II[I)Lo/qn;
    :try_end_0
    .catch Lo/oh; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 308
    :catch_0
    move-exception v5

    .line 311
    array-length v0, v3

    if-nez v0, :cond_1

    .line 312
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 314
    :cond_1
    const/4 v5, 0x0

    :goto_2
    array-length v0, v3

    if-ge v5, v0, :cond_4

    .line 315
    aget v0, v3, v5

    aget-object v1, p4, v5

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_2

    .line 316
    aget v0, v3, v5

    add-int/lit8 v0, v0, 0x1

    aput v0, v3, v5

    .line 317
    goto :goto_3

    .line 319
    :cond_2
    const/4 v0, 0x0

    aput v0, v3, v5

    .line 320
    array-length v0, v3

    add-int/lit8 v0, v0, -0x1

    if-ne v5, v0, :cond_3

    .line 321
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0

    .line 314
    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    :goto_3
    goto :goto_0

    .line 326
    :cond_5
    invoke-static {}, Lo/oh;->d()Lo/oh;

    move-result-object v0

    throw v0
.end method

.method public static e(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;II)Lo/qn;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;,
            Lo/oh;
        }
    .end annotation

    .line 58
    new-instance v0, Lo/tq;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v5}, Lo/tq;-><init>(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)V

    move-object v8, v0

    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v12, v0, :cond_5

    .line 63
    if-eqz p1, :cond_0

    .line 64
    move-object/from16 v0, p0

    move-object v1, v8

    move-object/from16 v2, p1

    move/from16 v4, p5

    move/from16 v5, p6

    const/4 v3, 0x1

    invoke-static/range {v0 .. v5}, Lo/tu;->c(Lo/qr;Lo/tq;Lo/ou;ZII)Lo/ty;

    move-result-object v9

    .line 67
    :cond_0
    if-eqz p3, :cond_1

    .line 68
    move-object/from16 v0, p0

    move-object v1, v8

    move-object/from16 v2, p3

    move/from16 v4, p5

    move/from16 v5, p6

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lo/tu;->c(Lo/qr;Lo/tq;Lo/ou;ZII)Lo/ty;

    move-result-object v10

    .line 71
    :cond_1
    invoke-static {v9, v10}, Lo/tu;->d(Lo/ty;Lo/ty;)Lo/tt;

    move-result-object v11

    .line 72
    if-nez v11, :cond_2

    .line 73
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 75
    :cond_2
    if-nez v12, :cond_4

    invoke-virtual {v11}, Lo/tt;->e()Lo/tq;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 76
    invoke-virtual {v11}, Lo/tt;->e()Lo/tq;

    move-result-object v0

    invoke-virtual {v0}, Lo/tq;->b()I

    move-result v0

    invoke-virtual {v8}, Lo/tq;->b()I

    move-result v1

    if-lt v0, v1, :cond_3

    invoke-virtual {v11}, Lo/tt;->e()Lo/tq;

    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lo/tq;->c()I

    move-result v0

    invoke-virtual {v8}, Lo/tq;->c()I

    move-result v1

    if-le v0, v1, :cond_4

    .line 78
    :cond_3
    invoke-virtual {v11}, Lo/tt;->e()Lo/tq;

    move-result-object v8

    goto :goto_1

    .line 80
    :cond_4
    invoke-virtual {v11, v8}, Lo/tt;->a(Lo/tq;)V

    .line 81
    goto :goto_2

    .line 62
    :goto_1
    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    .line 84
    :cond_5
    :goto_2
    invoke-virtual {v11}, Lo/tt;->d()I

    move-result v0

    add-int/lit8 v12, v0, 0x1

    .line 85
    const/4 v0, 0x0

    invoke-virtual {v11, v0, v9}, Lo/tt;->e(ILo/tr;)V

    .line 86
    invoke-virtual {v11, v12, v10}, Lo/tt;->e(ILo/tr;)V

    .line 88
    if-eqz v9, :cond_6

    const/4 v13, 0x1

    goto :goto_3

    :cond_6
    const/4 v13, 0x0

    .line 89
    :goto_3
    const/4 v14, 0x1

    :goto_4
    if-gt v14, v12, :cond_11

    .line 90
    if-eqz v13, :cond_7

    move v15, v14

    goto :goto_5

    :cond_7
    sub-int v15, v12, v14

    .line 91
    :goto_5
    invoke-virtual {v11, v15}, Lo/tt;->a(I)Lo/tr;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 93
    goto/16 :goto_a

    .line 96
    :cond_8
    if-eqz v15, :cond_9

    if-ne v15, v12, :cond_b

    .line 97
    :cond_9
    new-instance v0, Lo/ty;

    move-object v1, v8

    if-nez v15, :cond_a

    const/4 v2, 0x1

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    :goto_6
    invoke-direct {v0, v1, v2}, Lo/ty;-><init>(Lo/tq;Z)V

    move-object/from16 v16, v0

    goto :goto_7

    .line 99
    :cond_b
    new-instance v0, Lo/tr;

    move-object v1, v8

    invoke-direct {v0, v1}, Lo/tr;-><init>(Lo/tq;)V

    move-object/from16 v16, v0

    .line 101
    :goto_7
    move-object/from16 v0, v16

    invoke-virtual {v11, v15, v0}, Lo/tt;->e(ILo/tr;)V

    .line 102
    const/16 v17, -0x1

    .line 103
    const/16 v18, -0x1

    .line 105
    invoke-virtual {v8}, Lo/tq;->b()I

    move-result v19

    :goto_8
    invoke-virtual {v8}, Lo/tq;->c()I

    move-result v0

    move/from16 v1, v19

    if-gt v1, v0, :cond_10

    .line 106
    move/from16 v0, v19

    invoke-static {v11, v15, v0, v13}, Lo/tu;->c(Lo/tt;IIZ)I

    move-result v17

    .line 107
    if-ltz v17, :cond_c

    invoke-virtual {v8}, Lo/tq;->e()I

    move-result v0

    move/from16 v1, v17

    if-le v1, v0, :cond_e

    .line 108
    :cond_c
    move/from16 v0, v18

    const/4 v1, -0x1

    if-ne v0, v1, :cond_d

    .line 109
    goto :goto_9

    .line 111
    :cond_d
    move/from16 v17, v18

    .line 113
    :cond_e
    move-object/from16 v0, p0

    invoke-virtual {v8}, Lo/tq;->a()I

    move-result v1

    invoke-virtual {v8}, Lo/tq;->e()I

    move-result v2

    move v3, v13

    move/from16 v4, v17

    move/from16 v5, v19

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-static/range {v0 .. v7}, Lo/tu;->c(Lo/qr;IIZIIII)Lo/tp;

    move-result-object v20

    .line 115
    if-eqz v20, :cond_f

    .line 116
    move-object/from16 v0, v16

    move/from16 v1, v19

    move-object/from16 v2, v20

    invoke-virtual {v0, v1, v2}, Lo/tr;->c(ILo/tp;)V

    .line 117
    move/from16 v18, v17

    .line 118
    invoke-virtual/range {v20 .. v20}, Lo/tp;->b()I

    move-result v0

    move/from16 v1, p5

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result p5

    .line 119
    invoke-virtual/range {v20 .. v20}, Lo/tp;->b()I

    move-result v0

    move/from16 v1, p6

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result p6

    .line 105
    :cond_f
    :goto_9
    add-int/lit8 v19, v19, 0x1

    goto :goto_8

    .line 89
    :cond_10
    :goto_a
    add-int/lit8 v14, v14, 0x1

    goto/16 :goto_4

    .line 123
    :cond_11
    invoke-static {v11}, Lo/tu;->a(Lo/tt;)Lo/qn;

    move-result-object v0

    return-object v0
.end method

.method private static e(Lo/ty;)Lo/tq;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation

    .line 143
    if-nez p0, :cond_0

    .line 144
    const/4 v0, 0x0

    return-object v0

    .line 146
    :cond_0
    invoke-virtual {p0}, Lo/ty;->d()[I

    move-result-object v2

    .line 147
    if-nez v2, :cond_1

    .line 148
    const/4 v0, 0x0

    return-object v0

    .line 150
    :cond_1
    invoke-static {v2}, Lo/tu;->b([I)I

    move-result v3

    .line 151
    const/4 v4, 0x0

    .line 152
    move-object v5, v2

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_3

    aget v8, v5, v7

    .line 153
    sub-int v0, v3, v8

    add-int/2addr v4, v0

    .line 154
    if-lez v8, :cond_2

    .line 155
    goto :goto_1

    .line 152
    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 158
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lo/ty;->e()[Lo/tp;

    move-result-object v5

    .line 159
    const/4 v6, 0x0

    :goto_2
    if-lez v4, :cond_4

    aget-object v0, v5, v6

    if-nez v0, :cond_4

    .line 160
    add-int/lit8 v4, v4, -0x1

    .line 159
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 162
    :cond_4
    const/4 v6, 0x0

    .line 163
    array-length v0, v2

    add-int/lit8 v7, v0, -0x1

    :goto_3
    if-ltz v7, :cond_6

    .line 164
    aget v0, v2, v7

    sub-int v0, v3, v0

    add-int/2addr v6, v0

    .line 165
    aget v0, v2, v7

    if-lez v0, :cond_5

    .line 166
    goto :goto_4

    .line 163
    :cond_5
    add-int/lit8 v7, v7, -0x1

    goto :goto_3

    .line 169
    :cond_6
    :goto_4
    array-length v0, v5

    add-int/lit8 v7, v0, -0x1

    :goto_5
    if-lez v6, :cond_7

    aget-object v0, v5, v7

    if-nez v0, :cond_7

    .line 170
    add-int/lit8 v6, v6, -0x1

    .line 169
    add-int/lit8 v7, v7, -0x1

    goto :goto_5

    .line 172
    :cond_7
    invoke-virtual {p0}, Lo/ty;->a()Lo/tq;

    move-result-object v0

    .line 173
    invoke-virtual {p0}, Lo/ty;->i()Z

    move-result v1

    .line 172
    invoke-virtual {v0, v4, v6, v1}, Lo/tq;->e(IIZ)Lo/tq;

    move-result-object v0

    return-object v0
.end method

.method private static e(Lo/qr;IIZII)[I
    .locals 7

    .line 465
    move v2, p4

    .line 466
    const/16 v0, 0x8

    new-array v3, v0, [I

    .line 467
    const/4 v4, 0x0

    .line 468
    if-eqz p3, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, -0x1

    .line 469
    :goto_0
    move v6, p3

    .line 470
    :goto_1
    if-eqz p3, :cond_1

    if-lt v2, p2, :cond_2

    :cond_1
    if-nez p3, :cond_5

    if-lt v2, p1, :cond_5

    :cond_2
    array-length v0, v3

    const/16 v0, 0x8

    if-ge v4, v0, :cond_5

    .line 472
    invoke-virtual {p0, v2, p5}, Lo/qr;->e(II)Z

    move-result v0

    if-ne v0, v6, :cond_3

    .line 473
    aget v0, v3, v4

    add-int/lit8 v0, v0, 0x1

    aput v0, v3, v4

    .line 474
    add-int/2addr v2, v5

    goto :goto_1

    .line 476
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 477
    if-nez v6, :cond_4

    const/4 v6, 0x1

    goto :goto_2

    :cond_4
    const/4 v6, 0x0

    :goto_2
    goto :goto_1

    .line 480
    :cond_5
    array-length v0, v3

    const/16 v0, 0x8

    if-eq v4, v0, :cond_8

    if-eqz p3, :cond_6

    if-eq v2, p2, :cond_7

    :cond_6
    if-nez p3, :cond_9

    if-ne v2, p1, :cond_9

    :cond_7
    array-length v0, v3

    const/4 v0, 0x7

    if-ne v4, v0, :cond_9

    .line 482
    :cond_8
    return-object v3

    .line 484
    :cond_9
    const/4 v0, 0x0

    return-object v0
.end method

.method private static e(Lo/tt;)[[Lo/tn;
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 330
    .line 331
    invoke-virtual {p0}, Lo/tt;->a()I

    move-result v0

    invoke-virtual {p0}, Lo/tt;->d()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    filled-new-array {v0, v1}, [I

    move-result-object v2

    const-class v3, Lo/tn;

    invoke-static {v3, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [[Lo/tn;

    .line 332
    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_1

    .line 333
    const/4 v6, 0x0

    :goto_1
    aget-object v0, v4, v5

    array-length v0, v0

    if-ge v6, v0, :cond_0

    .line 334
    aget-object v0, v4, v5

    new-instance v1, Lo/tn;

    invoke-direct {v1}, Lo/tn;-><init>()V

    aput-object v1, v0, v6

    .line 333
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 332
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 338
    :cond_1
    const/4 v5, 0x0

    .line 339
    invoke-virtual {p0}, Lo/tt;->b()[Lo/tr;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_2
    if-ge v8, v7, :cond_5

    aget-object v9, v6, v8

    .line 340
    if-eqz v9, :cond_4

    .line 341
    invoke-virtual {v9}, Lo/tr;->e()[Lo/tp;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x0

    :goto_3
    if-ge v12, v11, :cond_4

    aget-object v13, v10, v12

    .line 342
    if-eqz v13, :cond_3

    .line 343
    invoke-virtual {v13}, Lo/tp;->g()I

    move-result v14

    .line 344
    if-ltz v14, :cond_3

    .line 345
    array-length v0, v4

    if-lt v14, v0, :cond_2

    .line 346
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 348
    :cond_2
    aget-object v0, v4, v14

    aget-object v0, v0, v5

    invoke-virtual {v13}, Lo/tp;->h()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/tn;->d(I)V

    .line 341
    :cond_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 353
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 339
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 355
    :cond_5
    return-object v4
.end method
