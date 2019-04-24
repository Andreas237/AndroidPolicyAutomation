.class public final Lo/rj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/rj$c;,
        Lo/rj$a;
    }
.end annotation


# instance fields
.field private final d:Lo/ra;

.field private final e:Lo/qr;


# direct methods
.method public constructor <init>(Lo/qr;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Lo/rj;->e:Lo/qr;

    .line 48
    new-instance v0, Lo/ra;

    invoke-direct {v0, p1}, Lo/ra;-><init>(Lo/qr;)V

    iput-object v0, p0, Lo/rj;->d:Lo/ra;

    .line 49
    return-void
.end method

.method private static a(Lo/ou;Lo/ou;)I
    .locals 1

    .line 310
    invoke-static {p0, p1}, Lo/ou;->a(Lo/ou;Lo/ou;)F

    move-result v0

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v0

    return v0
.end method

.method private a(Lo/ou;Lo/ou;Lo/ou;Lo/ou;I)Lo/ou;
    .locals 11

    .line 273
    invoke-static {p1, p2}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v0

    int-to-float v0, v0

    move/from16 v1, p5

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 274
    invoke-static {p3, p4}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v4

    .line 275
    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p3}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v5, v0, v1

    .line 276
    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v0

    invoke-virtual {p3}, Lo/ou;->e()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v6, v0, v1

    .line 278
    new-instance v7, Lo/ou;

    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    mul-float v1, v3, v5

    add-float/2addr v0, v1

    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v1

    mul-float v2, v3, v6

    add-float/2addr v1, v2

    invoke-direct {v7, v0, v1}, Lo/ou;-><init>(FF)V

    .line 280
    invoke-static {p1, p3}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v0

    int-to-float v0, v0

    move/from16 v1, p5

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 281
    invoke-static {p2, p4}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v4

    .line 282
    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p2}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v5, v0, v1

    .line 283
    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v0

    invoke-virtual {p2}, Lo/ou;->e()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v6, v0, v1

    .line 285
    new-instance v8, Lo/ou;

    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    mul-float v1, v3, v5

    add-float/2addr v0, v1

    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v1

    mul-float v2, v3, v6

    add-float/2addr v1, v2

    invoke-direct {v8, v0, v1}, Lo/ou;-><init>(FF)V

    .line 287
    invoke-direct {p0, v7}, Lo/rj;->d(Lo/ou;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 288
    invoke-direct {p0, v8}, Lo/rj;->d(Lo/ou;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 289
    return-object v8

    .line 291
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 293
    :cond_1
    invoke-direct {p0, v8}, Lo/rj;->d(Lo/ou;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 294
    return-object v7

    .line 297
    :cond_2
    invoke-direct {p0, p3, v7}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v0

    .line 298
    invoke-direct {p0, p2, v7}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/rj$a;->a()I

    move-result v1

    sub-int/2addr v0, v1

    .line 297
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 299
    invoke-direct {p0, p3, v8}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v0

    .line 300
    invoke-direct {p0, p2, v8}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/rj$a;->a()I

    move-result v1

    sub-int/2addr v0, v1

    .line 299
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v10

    .line 302
    if-gt v9, v10, :cond_3

    move-object v0, v7

    goto :goto_0

    :cond_3
    move-object v0, v8

    :goto_0
    return-object v0
.end method

.method private static a(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;II)Lo/qr;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 329
    invoke-static {}, Lo/qu;->b()Lo/qu;

    move-result-object v20

    .line 331
    move-object/from16 v0, v20

    move-object/from16 v1, p0

    move/from16 v2, p5

    move/from16 v3, p6

    move/from16 v4, p5

    int-to-float v4, v4

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float v6, v4, v5

    move/from16 v4, p5

    int-to-float v4, v4

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float v8, v4, v5

    move/from16 v4, p6

    int-to-float v4, v4

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float v9, v4, v5

    move/from16 v4, p6

    int-to-float v4, v4

    const/high16 v5, 0x3f000000    # 0.5f

    sub-float v11, v4, v5

    .line 342
    invoke-virtual/range {p1 .. p1}, Lo/ou;->b()F

    move-result v12

    .line 343
    invoke-virtual/range {p1 .. p1}, Lo/ou;->e()F

    move-result v13

    .line 344
    invoke-virtual/range {p4 .. p4}, Lo/ou;->b()F

    move-result v14

    .line 345
    invoke-virtual/range {p4 .. p4}, Lo/ou;->e()F

    move-result v15

    .line 346
    invoke-virtual/range {p3 .. p3}, Lo/ou;->b()F

    move-result v16

    .line 347
    invoke-virtual/range {p3 .. p3}, Lo/ou;->e()F

    move-result v17

    .line 348
    invoke-virtual/range {p2 .. p2}, Lo/ou;->b()F

    move-result v18

    .line 349
    invoke-virtual/range {p2 .. p2}, Lo/ou;->e()F

    move-result v19

    .line 331
    const/high16 v4, 0x3f000000    # 0.5f

    const/high16 v5, 0x3f000000    # 0.5f

    const/high16 v7, 0x3f000000    # 0.5f

    const/high16 v10, 0x3f000000    # 0.5f

    invoke-virtual/range {v0 .. v19}, Lo/qu;->d(Lo/qr;IIFFFFFFFFFFFFFFFF)Lo/qr;

    move-result-object v0

    return-object v0
.end method

.method private b(Lo/ou;Lo/ou;)Lo/rj$a;
    .locals 19

    .line 357
    invoke-virtual/range {p1 .. p1}, Lo/ou;->b()F

    move-result v0

    float-to-int v4, v0

    .line 358
    invoke-virtual/range {p1 .. p1}, Lo/ou;->e()F

    move-result v0

    float-to-int v5, v0

    .line 359
    invoke-virtual/range {p2 .. p2}, Lo/ou;->b()F

    move-result v0

    float-to-int v6, v0

    .line 360
    invoke-virtual/range {p2 .. p2}, Lo/ou;->e()F

    move-result v0

    float-to-int v7, v0

    .line 361
    sub-int v0, v7, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    sub-int v1, v6, v4

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    .line 362
    :goto_0
    if-eqz v8, :cond_1

    .line 363
    move v9, v4

    .line 364
    move v4, v5

    .line 365
    move v5, v9

    .line 366
    move v9, v6

    .line 367
    move v6, v7

    .line 368
    move v7, v9

    .line 371
    :cond_1
    sub-int v0, v6, v4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v9

    .line 372
    sub-int v0, v7, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v10

    .line 373
    neg-int v0, v9

    div-int/lit8 v11, v0, 0x2

    .line 374
    if-ge v5, v7, :cond_2

    const/4 v12, 0x1

    goto :goto_1

    :cond_2
    const/4 v12, -0x1

    .line 375
    :goto_1
    if-ge v4, v6, :cond_3

    const/4 v13, 0x1

    goto :goto_2

    :cond_3
    const/4 v13, -0x1

    .line 376
    :goto_2
    const/4 v14, 0x0

    .line 377
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rj;->e:Lo/qr;

    if-eqz v8, :cond_4

    move v1, v5

    goto :goto_3

    :cond_4
    move v1, v4

    :goto_3
    if-eqz v8, :cond_5

    move v2, v4

    goto :goto_4

    :cond_5
    move v2, v5

    :goto_4
    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v15

    .line 378
    move/from16 v16, v4

    move/from16 v17, v5

    :goto_5
    move/from16 v0, v16

    if-eq v0, v6, :cond_b

    .line 379
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rj;->e:Lo/qr;

    if-eqz v8, :cond_6

    move/from16 v1, v17

    goto :goto_6

    :cond_6
    move/from16 v1, v16

    :goto_6
    if-eqz v8, :cond_7

    move/from16 v2, v16

    goto :goto_7

    :cond_7
    move/from16 v2, v17

    :goto_7
    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v18

    .line 380
    move/from16 v0, v18

    if-eq v0, v15, :cond_8

    .line 381
    add-int/lit8 v14, v14, 0x1

    .line 382
    move/from16 v15, v18

    .line 384
    :cond_8
    add-int/2addr v11, v10

    .line 385
    if-lez v11, :cond_a

    .line 386
    move/from16 v0, v17

    if-ne v0, v7, :cond_9

    .line 387
    goto :goto_8

    .line 389
    :cond_9
    add-int v17, v17, v12

    .line 390
    sub-int/2addr v11, v9

    .line 378
    :cond_a
    add-int v16, v16, v13

    goto :goto_5

    .line 393
    :cond_b
    :goto_8
    new-instance v0, Lo/rj$a;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v14, v3}, Lo/rj$a;-><init>(Lo/ou;Lo/ou;ILo/rj$3;)V

    return-object v0
.end method

.method private static b(Ljava/util/Map;Lo/ou;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lo/ou;Ljava/lang/Integer;>;Lo/ou;)V"
        }
    .end annotation

    .line 317
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    .line 318
    if-nez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    return-void
.end method

.method private d(Lo/ou;)Z
    .locals 2

    .line 306
    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v0

    iget-object v1, p0, Lo/rj;->e:Lo/qr;

    invoke-virtual {v1}, Lo/qr;->a()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v0

    iget-object v1, p0, Lo/rj;->e:Lo/qr;

    invoke-virtual {v1}, Lo/qr;->h()I

    move-result v1

    int-to-float v1, v1

    cmpg-float v0, v0, v1

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private e(Lo/ou;Lo/ou;Lo/ou;Lo/ou;II)Lo/ou;
    .locals 11

    .line 227
    invoke-static {p1, p2}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v0

    int-to-float v0, v0

    move/from16 v1, p5

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 228
    invoke-static {p3, p4}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v4

    .line 229
    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p3}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v5, v0, v1

    .line 230
    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v0

    invoke-virtual {p3}, Lo/ou;->e()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v6, v0, v1

    .line 232
    new-instance v7, Lo/ou;

    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    mul-float v1, v3, v5

    add-float/2addr v0, v1

    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v1

    mul-float v2, v3, v6

    add-float/2addr v1, v2

    invoke-direct {v7, v0, v1}, Lo/ou;-><init>(FF)V

    .line 234
    invoke-static {p1, p3}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v0

    int-to-float v0, v0

    move/from16 v1, p6

    int-to-float v1, v1

    div-float v3, v0, v1

    .line 235
    invoke-static {p2, p4}, Lo/rj;->a(Lo/ou;Lo/ou;)I

    move-result v4

    .line 236
    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p2}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v5, v0, v1

    .line 237
    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v0

    invoke-virtual {p2}, Lo/ou;->e()F

    move-result v1

    sub-float/2addr v0, v1

    int-to-float v1, v4

    div-float v6, v0, v1

    .line 239
    new-instance v8, Lo/ou;

    invoke-virtual {p4}, Lo/ou;->b()F

    move-result v0

    mul-float v1, v3, v5

    add-float/2addr v0, v1

    invoke-virtual {p4}, Lo/ou;->e()F

    move-result v1

    mul-float v2, v3, v6

    add-float/2addr v1, v2

    invoke-direct {v8, v0, v1}, Lo/ou;-><init>(FF)V

    .line 241
    invoke-direct {p0, v7}, Lo/rj;->d(Lo/ou;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 242
    invoke-direct {p0, v8}, Lo/rj;->d(Lo/ou;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 243
    return-object v8

    .line 245
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 247
    :cond_1
    invoke-direct {p0, v8}, Lo/rj;->d(Lo/ou;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 248
    return-object v7

    .line 251
    :cond_2
    invoke-direct {p0, p3, v7}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v0

    sub-int v0, p5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 252
    invoke-direct {p0, p2, v7}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/rj$a;->a()I

    move-result v1

    sub-int v1, p6, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int v9, v0, v1

    .line 253
    invoke-direct {p0, p3, v8}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v0

    sub-int v0, p5, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 254
    invoke-direct {p0, p2, v8}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/rj$a;->a()I

    move-result v1

    sub-int v1, p6, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    add-int v10, v0, v1

    .line 256
    if-gt v9, v10, :cond_3

    .line 257
    return-object v7

    .line 260
    :cond_3
    return-object v8
.end method


# virtual methods
.method public d()Lo/qw;
    .locals 29
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 59
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rj;->d:Lo/ra;

    invoke-virtual {v0}, Lo/ra;->c()[Lo/ou;

    move-result-object v7

    .line 60
    const/4 v0, 0x0

    aget-object v8, v7, v0

    .line 61
    const/4 v0, 0x1

    aget-object v9, v7, v0

    .line 62
    const/4 v0, 0x2

    aget-object v10, v7, v0

    .line 63
    const/4 v0, 0x3

    aget-object v11, v7, v0

    .line 68
    new-instance v12, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {v12, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v10}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    move-object/from16 v0, p0

    invoke-direct {v0, v9, v11}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v11}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-interface {v12, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    new-instance v0, Lo/rj$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/rj$c;-><init>(Lo/rj$3;)V

    invoke-static {v12, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 77
    const/4 v0, 0x0

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/rj$a;

    .line 78
    const/4 v0, 0x1

    invoke-interface {v12, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/rj$a;

    .line 82
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 83
    invoke-virtual {v13}, Lo/rj$a;->d()Lo/ou;

    move-result-object v0

    invoke-static {v15, v0}, Lo/rj;->b(Ljava/util/Map;Lo/ou;)V

    .line 84
    invoke-virtual {v13}, Lo/rj$a;->b()Lo/ou;

    move-result-object v0

    invoke-static {v15, v0}, Lo/rj;->b(Ljava/util/Map;Lo/ou;)V

    .line 85
    invoke-virtual {v14}, Lo/rj$a;->d()Lo/ou;

    move-result-object v0

    invoke-static {v15, v0}, Lo/rj;->b(Ljava/util/Map;Lo/ou;)V

    .line 86
    invoke-virtual {v14}, Lo/rj$a;->b()Lo/ou;

    move-result-object v0

    invoke-static {v15, v0}, Lo/rj;->b(Ljava/util/Map;Lo/ou;)V

    .line 88
    const/16 v16, 0x0

    .line 89
    const/16 v17, 0x0

    .line 90
    const/16 v18, 0x0

    .line 91
    invoke-interface {v15}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_0
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Ljava/util/Map$Entry;

    .line 92
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v21, v0

    check-cast v21, Lo/ou;

    .line 93
    invoke-interface/range {v20 .. v20}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Ljava/lang/Integer;

    .line 94
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 95
    move-object/from16 v17, v21

    goto :goto_1

    .line 98
    :cond_0
    if-nez v16, :cond_1

    .line 99
    move-object/from16 v16, v21

    goto :goto_1

    .line 101
    :cond_1
    move-object/from16 v18, v21

    .line 104
    :goto_1
    goto :goto_0

    .line 106
    :cond_2
    if-eqz v16, :cond_3

    if-eqz v17, :cond_3

    if-nez v18, :cond_4

    .line 107
    :cond_3
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 111
    :cond_4
    const/4 v0, 0x3

    new-array v0, v0, [Lo/ou;

    move-object/from16 v19, v0

    const/4 v0, 0x0

    aput-object v16, v19, v0

    const/4 v0, 0x1

    aput-object v17, v19, v0

    const/4 v0, 0x2

    aput-object v18, v19, v0

    .line 113
    invoke-static/range {v19 .. v19}, Lo/ou;->d([Lo/ou;)V

    .line 116
    const/4 v0, 0x0

    aget-object v20, v19, v0

    .line 117
    const/4 v0, 0x1

    aget-object v17, v19, v0

    .line 118
    const/4 v0, 0x2

    aget-object v21, v19, v0

    .line 122
    invoke-interface {v15, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 123
    move-object/from16 v22, v8

    goto :goto_2

    .line 124
    :cond_5
    invoke-interface {v15, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 125
    move-object/from16 v22, v9

    goto :goto_2

    .line 126
    :cond_6
    invoke-interface {v15, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 127
    move-object/from16 v22, v10

    goto :goto_2

    .line 129
    :cond_7
    move-object/from16 v22, v11

    .line 141
    :goto_2
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    invoke-direct {v0, v1, v2}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v23

    .line 142
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move-object/from16 v2, v22

    invoke-direct {v0, v1, v2}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v24

    .line 144
    and-int/lit8 v0, v23, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 146
    add-int/lit8 v23, v23, 0x1

    .line 148
    :cond_8
    add-int/lit8 v23, v23, 0x2

    .line 150
    and-int/lit8 v0, v24, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    .line 152
    add-int/lit8 v24, v24, 0x1

    .line 154
    :cond_9
    add-int/lit8 v24, v24, 0x2

    .line 162
    mul-int/lit8 v0, v23, 0x4

    mul-int/lit8 v1, v24, 0x7

    if-ge v0, v1, :cond_a

    mul-int/lit8 v0, v24, 0x4

    mul-int/lit8 v1, v23, 0x7

    if-lt v0, v1, :cond_e

    .line 165
    :cond_a
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    move/from16 v5, v23

    move/from16 v6, v24

    .line 166
    invoke-direct/range {v0 .. v6}, Lo/rj;->e(Lo/ou;Lo/ou;Lo/ou;Lo/ou;II)Lo/ou;

    move-result-object v26

    .line 167
    if-nez v26, :cond_b

    .line 168
    move-object/from16 v26, v22

    .line 171
    :cond_b
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v26

    invoke-direct {v0, v1, v2}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v23

    .line 172
    move-object/from16 v0, p0

    move-object/from16 v1, v20

    move-object/from16 v2, v26

    invoke-direct {v0, v1, v2}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v24

    .line 174
    and-int/lit8 v0, v23, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_c

    .line 176
    add-int/lit8 v23, v23, 0x1

    .line 179
    :cond_c
    and-int/lit8 v0, v24, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_d

    .line 181
    add-int/lit8 v24, v24, 0x1

    .line 184
    :cond_d
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rj;->e:Lo/qr;

    move-object/from16 v1, v21

    move-object/from16 v2, v17

    move-object/from16 v3, v20

    move-object/from16 v4, v26

    move/from16 v5, v23

    move/from16 v6, v24

    invoke-static/range {v0 .. v6}, Lo/rj;->a(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;II)Lo/qr;

    move-result-object v25

    goto :goto_3

    .line 189
    :cond_e
    move/from16 v0, v24

    move/from16 v1, v23

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v27

    .line 191
    move-object/from16 v0, p0

    move-object/from16 v1, v17

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    move/from16 v5, v27

    invoke-direct/range {v0 .. v5}, Lo/rj;->a(Lo/ou;Lo/ou;Lo/ou;Lo/ou;I)Lo/ou;

    move-result-object v26

    .line 192
    if-nez v26, :cond_f

    .line 193
    move-object/from16 v26, v22

    .line 197
    :cond_f
    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v26

    invoke-direct {v0, v1, v2}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/rj$a;->a()I

    move-result v0

    .line 198
    move-object/from16 v1, p0

    move-object/from16 v2, v20

    move-object/from16 v3, v26

    invoke-direct {v1, v2, v3}, Lo/rj;->b(Lo/ou;Lo/ou;)Lo/rj$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/rj$a;->a()I

    move-result v1

    .line 197
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v28

    .line 199
    add-int/lit8 v28, v28, 0x1

    .line 200
    and-int/lit8 v0, v28, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_10

    .line 201
    add-int/lit8 v28, v28, 0x1

    .line 204
    :cond_10
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/rj;->e:Lo/qr;

    move-object/from16 v1, v21

    move-object/from16 v2, v17

    move-object/from16 v3, v20

    move-object/from16 v4, v26

    move/from16 v5, v28

    move/from16 v6, v28

    invoke-static/range {v0 .. v6}, Lo/rj;->a(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;II)Lo/qr;

    move-result-object v25

    .line 213
    :goto_3
    new-instance v0, Lo/qw;

    const/4 v1, 0x4

    new-array v1, v1, [Lo/ou;

    const/4 v2, 0x0

    aput-object v21, v1, v2

    const/4 v2, 0x1

    aput-object v17, v1, v2

    const/4 v2, 0x2

    aput-object v20, v1, v2

    const/4 v2, 0x3

    aput-object v26, v1, v2

    move-object/from16 v2, v25

    invoke-direct {v0, v2, v1}, Lo/qw;-><init>(Lo/qr;[Lo/ou;)V

    return-object v0
.end method
