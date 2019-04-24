.class public Lo/up;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/up$d;,
        Lo/up$e;
    }
.end annotation


# instance fields
.field private final a:Lo/oy;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/uo;>;"
        }
    .end annotation
.end field

.field private final c:[I

.field private d:Z

.field private final e:Lo/qr;


# direct methods
.method public constructor <init>(Lo/qr;Lo/oy;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lo/up;->e:Lo/qr;

    .line 63
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/up;->b:Ljava/util/List;

    .line 64
    const/4 v0, 0x5

    new-array v0, v0, [I

    iput-object v0, p0, Lo/up;->c:[I

    .line 65
    iput-object p2, p0, Lo/up;->a:Lo/oy;

    .line 66
    return-void
.end method

.method protected static a([I)Z
    .locals 5

    .line 200
    const/4 v2, 0x0

    .line 201
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v3, v0, :cond_1

    .line 202
    aget v4, p0, v3

    .line 203
    if-nez v4, :cond_0

    .line 204
    const/4 v0, 0x0

    return v0

    .line 206
    :cond_0
    add-int/2addr v2, v4

    .line 201
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 208
    :cond_1
    const/4 v0, 0x7

    if-ge v2, v0, :cond_2

    .line 209
    const/4 v0, 0x0

    return v0

    .line 211
    :cond_2
    int-to-float v0, v2

    const/high16 v1, 0x40e00000    # 7.0f

    div-float v3, v0, v1

    .line 212
    const/high16 v0, 0x40000000    # 2.0f

    div-float v4, v3, v0

    .line 214
    const/4 v0, 0x0

    aget v0, p0, v0

    int-to-float v0, v0

    sub-float v0, v3, v0

    .line 215
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_3

    const/4 v0, 0x1

    aget v0, p0, v0

    int-to-float v0, v0

    sub-float v0, v3, v0

    .line 216
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_3

    const/high16 v0, 0x40400000    # 3.0f

    mul-float/2addr v0, v3

    const/4 v1, 0x2

    aget v1, p0, v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    .line 217
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const/high16 v1, 0x40400000    # 3.0f

    mul-float/2addr v1, v4

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    const/4 v0, 0x3

    aget v0, p0, v0

    int-to-float v0, v0

    sub-float v0, v3, v0

    .line 218
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_3

    const/4 v0, 0x4

    aget v0, p0, v0

    int-to-float v0, v0

    sub-float v0, v3, v0

    .line 219
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v4

    if-gez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private static b([II)F
    .locals 3

    .line 191
    const/4 v0, 0x4

    aget v0, p0, v0

    sub-int v0, p1, v0

    const/4 v1, 0x3

    aget v1, p0, v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    const/4 v1, 0x2

    aget v1, p0, v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    return v0
.end method

.method private b()Z
    .locals 9

    .line 558
    const/4 v2, 0x0

    .line 559
    const/4 v3, 0x0

    .line 560
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    .line 561
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/uo;

    .line 562
    invoke-virtual {v6}, Lo/uo;->a()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    .line 563
    add-int/lit8 v2, v2, 0x1

    .line 564
    invoke-virtual {v6}, Lo/uo;->d()F

    move-result v0

    add-float/2addr v3, v0

    .line 566
    :cond_0
    goto :goto_0

    .line 567
    :cond_1
    const/4 v0, 0x3

    if-ge v2, v0, :cond_2

    .line 568
    const/4 v0, 0x0

    return v0

    .line 574
    :cond_2
    int-to-float v0, v4

    div-float v5, v3, v0

    .line 575
    const/4 v6, 0x0

    .line 576
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/uo;

    .line 577
    invoke-virtual {v8}, Lo/uo;->d()F

    move-result v0

    sub-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    add-float/2addr v6, v0

    .line 578
    goto :goto_1

    .line 579
    :cond_3
    const v0, 0x3d4ccccd    # 0.05f

    mul-float/2addr v0, v3

    cmpg-float v0, v6, v0

    if-gtz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0
.end method

.method private b(IIII)Z
    .locals 8

    .line 244
    invoke-direct {p0}, Lo/up;->e()[I

    move-result-object v3

    .line 247
    const/4 v4, 0x0

    .line 248
    :goto_0
    if-lt p1, v4, :cond_0

    if-lt p2, v4, :cond_0

    iget-object v0, p0, Lo/up;->e:Lo/qr;

    sub-int v1, p2, v4

    sub-int v2, p1, v4

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    const/4 v0, 0x2

    aget v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v3, v1

    .line 250
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 253
    :cond_0
    if-lt p1, v4, :cond_1

    if-ge p2, v4, :cond_2

    .line 254
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 258
    :cond_2
    :goto_1
    if-lt p1, v4, :cond_3

    if-lt p2, v4, :cond_3

    iget-object v0, p0, Lo/up;->e:Lo/qr;

    sub-int v1, p2, v4

    sub-int v2, p1, v4

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    aget v0, v3, v0

    if-gt v0, p3, :cond_3

    .line 260
    const/4 v0, 0x1

    aget v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput v0, v3, v1

    .line 261
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 265
    :cond_3
    if-lt p1, v4, :cond_4

    if-lt p2, v4, :cond_4

    const/4 v0, 0x1

    aget v0, v3, v0

    if-le v0, p3, :cond_5

    .line 266
    :cond_4
    const/4 v0, 0x0

    return v0

    .line 270
    :cond_5
    :goto_2
    if-lt p1, v4, :cond_6

    if-lt p2, v4, :cond_6

    iget-object v0, p0, Lo/up;->e:Lo/qr;

    sub-int v1, p2, v4

    sub-int v2, p1, v4

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    aget v0, v3, v0

    if-gt v0, p3, :cond_6

    .line 272
    const/4 v0, 0x0

    aget v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    aput v0, v3, v1

    .line 273
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 275
    :cond_6
    const/4 v0, 0x0

    aget v0, v3, v0

    if-le v0, p3, :cond_7

    .line 276
    const/4 v0, 0x0

    return v0

    .line 279
    :cond_7
    iget-object v0, p0, Lo/up;->e:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v5

    .line 280
    iget-object v0, p0, Lo/up;->e:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v6

    .line 283
    const/4 v4, 0x1

    .line 284
    :goto_3
    add-int v0, p1, v4

    if-ge v0, v5, :cond_8

    add-int v0, p2, v4

    if-ge v0, v6, :cond_8

    iget-object v0, p0, Lo/up;->e:Lo/qr;

    add-int v1, p2, v4

    add-int v2, p1, v4

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 285
    const/4 v0, 0x2

    aget v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v3, v1

    .line 286
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 290
    :cond_8
    add-int v0, p1, v4

    if-ge v0, v5, :cond_9

    add-int v0, p2, v4

    if-lt v0, v6, :cond_a

    .line 291
    :cond_9
    const/4 v0, 0x0

    return v0

    .line 294
    :cond_a
    :goto_4
    add-int v0, p1, v4

    if-ge v0, v5, :cond_b

    add-int v0, p2, v4

    if-ge v0, v6, :cond_b

    iget-object v0, p0, Lo/up;->e:Lo/qr;

    add-int v1, p2, v4

    add-int v2, p1, v4

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_b

    const/4 v0, 0x3

    aget v0, v3, v0

    if-ge v0, p3, :cond_b

    .line 296
    const/4 v0, 0x3

    aget v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    aput v0, v3, v1

    .line 297
    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    .line 300
    :cond_b
    add-int v0, p1, v4

    if-ge v0, v5, :cond_c

    add-int v0, p2, v4

    if-ge v0, v6, :cond_c

    const/4 v0, 0x3

    aget v0, v3, v0

    if-lt v0, p3, :cond_d

    .line 301
    :cond_c
    const/4 v0, 0x0

    return v0

    .line 304
    :cond_d
    :goto_5
    add-int v0, p1, v4

    if-ge v0, v5, :cond_e

    add-int v0, p2, v4

    if-ge v0, v6, :cond_e

    iget-object v0, p0, Lo/up;->e:Lo/qr;

    add-int v1, p2, v4

    add-int v2, p1, v4

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 v0, 0x4

    aget v0, v3, v0

    if-ge v0, p3, :cond_e

    .line 306
    const/4 v0, 0x4

    aget v0, v3, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x4

    aput v0, v3, v1

    .line 307
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 310
    :cond_e
    const/4 v0, 0x4

    aget v0, v3, v0

    if-lt v0, p3, :cond_f

    .line 311
    const/4 v0, 0x0

    return v0

    .line 316
    :cond_f
    const/4 v0, 0x0

    aget v0, v3, v0

    const/4 v1, 0x1

    aget v1, v3, v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, v3, v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    aget v1, v3, v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    aget v1, v3, v1

    add-int v7, v0, v1

    .line 317
    sub-int v0, v7, p4

    .line 318
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v1, p4, 0x2

    if-ge v0, v1, :cond_10

    .line 319
    invoke-static {v3}, Lo/up;->a([I)Z

    move-result v0

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    goto :goto_6

    :cond_10
    const/4 v0, 0x0

    :goto_6
    return v0
.end method

.method private c(IIII)F
    .locals 7

    .line 407
    iget-object v2, p0, Lo/up;->e:Lo/qr;

    .line 409
    invoke-virtual {v2}, Lo/qr;->a()I

    move-result v3

    .line 410
    invoke-direct {p0}, Lo/up;->e()[I

    move-result-object v4

    .line 412
    move v5, p1

    .line 413
    :goto_0
    if-ltz v5, :cond_0

    invoke-virtual {v2, v5, p2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 414
    const/4 v0, 0x2

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 415
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 417
    :cond_0
    if-gez v5, :cond_1

    .line 418
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 420
    :cond_1
    :goto_1
    if-ltz v5, :cond_2

    invoke-virtual {v2, v5, p2}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    aget v0, v4, v0

    if-gt v0, p3, :cond_2

    .line 421
    const/4 v0, 0x1

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 422
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 424
    :cond_2
    if-ltz v5, :cond_3

    const/4 v0, 0x1

    aget v0, v4, v0

    if-le v0, p3, :cond_4

    .line 425
    :cond_3
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 427
    :cond_4
    :goto_2
    if-ltz v5, :cond_5

    invoke-virtual {v2, v5, p2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    aget v0, v4, v0

    if-gt v0, p3, :cond_5

    .line 428
    const/4 v0, 0x0

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 429
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    .line 431
    :cond_5
    const/4 v0, 0x0

    aget v0, v4, v0

    if-le v0, p3, :cond_6

    .line 432
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 435
    :cond_6
    add-int/lit8 v5, p1, 0x1

    .line 436
    :goto_3
    if-ge v5, v3, :cond_7

    invoke-virtual {v2, v5, p2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 437
    const/4 v0, 0x2

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 438
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 440
    :cond_7
    if-ne v5, v3, :cond_8

    .line 441
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 443
    :cond_8
    :goto_4
    if-ge v5, v3, :cond_9

    invoke-virtual {v2, v5, p2}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_9

    const/4 v0, 0x3

    aget v0, v4, v0

    if-ge v0, p3, :cond_9

    .line 444
    const/4 v0, 0x3

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    aput v0, v4, v1

    .line 445
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 447
    :cond_9
    if-eq v5, v3, :cond_a

    const/4 v0, 0x3

    aget v0, v4, v0

    if-lt v0, p3, :cond_b

    .line 448
    :cond_a
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 450
    :cond_b
    :goto_5
    if-ge v5, v3, :cond_c

    invoke-virtual {v2, v5, p2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x4

    aget v0, v4, v0

    if-ge v0, p3, :cond_c

    .line 451
    const/4 v0, 0x4

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x4

    aput v0, v4, v1

    .line 452
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 454
    :cond_c
    const/4 v0, 0x4

    aget v0, v4, v0

    if-lt v0, p3, :cond_d

    .line 455
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 460
    :cond_d
    const/4 v0, 0x0

    aget v0, v4, v0

    const/4 v1, 0x1

    aget v1, v4, v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, v4, v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    aget v1, v4, v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    aget v1, v4, v1

    add-int v6, v0, v1

    .line 462
    sub-int v0, v6, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    if-lt v0, p4, :cond_e

    .line 463
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 466
    :cond_e
    invoke-static {v4}, Lo/up;->a([I)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v4, v5}, Lo/up;->b([II)F

    move-result v0

    goto :goto_6

    :cond_f
    const/high16 v0, 0x7fc00000    # Float.NaN

    :goto_6
    return v0
.end method

.method private c()[Lo/uo;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 590
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 591
    const/4 v0, 0x3

    if-ge v3, v0, :cond_0

    .line 593
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 597
    :cond_0
    const/4 v0, 0x3

    if-le v3, v0, :cond_3

    .line 599
    const/4 v4, 0x0

    .line 600
    const/4 v5, 0x0

    .line 601
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/uo;

    .line 602
    invoke-virtual {v7}, Lo/uo;->d()F

    move-result v8

    .line 603
    add-float/2addr v4, v8

    .line 604
    mul-float v0, v8, v8

    add-float/2addr v5, v0

    .line 605
    goto :goto_0

    .line 606
    :cond_1
    int-to-float v0, v3

    div-float v6, v4, v0

    .line 607
    int-to-float v0, v3

    div-float v0, v5, v0

    mul-float v1, v6, v6

    sub-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v7, v0

    .line 609
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    new-instance v1, Lo/up$e;

    const/4 v2, 0x0

    invoke-direct {v1, v6, v2}, Lo/up$e;-><init>(FLo/up$1;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 611
    const v0, 0x3e4ccccd    # 0.2f

    mul-float/2addr v0, v6

    invoke-static {v0, v7}, Ljava/lang/Math;->max(FF)F

    move-result v8

    .line 613
    const/4 v9, 0x0

    :goto_1
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v9, v0, :cond_3

    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_3

    .line 614
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/uo;

    .line 615
    invoke-virtual {v10}, Lo/uo;->d()F

    move-result v0

    sub-float/2addr v0, v6

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_2

    .line 616
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 617
    add-int/lit8 v9, v9, -0x1

    .line 613
    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 622
    :cond_3
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_5

    .line 625
    const/4 v4, 0x0

    .line 626
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/uo;

    .line 627
    invoke-virtual {v6}, Lo/uo;->d()F

    move-result v0

    add-float/2addr v4, v0

    .line 628
    goto :goto_2

    .line 630
    :cond_4
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-float v0, v0

    div-float v5, v4, v0

    .line 632
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    new-instance v1, Lo/up$d;

    const/4 v2, 0x0

    invoke-direct {v1, v5, v2}, Lo/up$d;-><init>(FLo/up$1;)V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 634
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    iget-object v1, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x3

    invoke-interface {v0, v2, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 637
    :cond_5
    const/4 v0, 0x3

    new-array v0, v0, [Lo/uo;

    iget-object v1, p0, Lo/up;->b:Ljava/util/List;

    .line 638
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/uo;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/up;->b:Ljava/util/List;

    .line 639
    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/uo;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/up;->b:Ljava/util/List;

    .line 640
    const/4 v2, 0x2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/uo;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method private d(IIII)F
    .locals 7

    .line 335
    iget-object v2, p0, Lo/up;->e:Lo/qr;

    .line 337
    invoke-virtual {v2}, Lo/qr;->h()I

    move-result v3

    .line 338
    invoke-direct {p0}, Lo/up;->e()[I

    move-result-object v4

    .line 341
    move v5, p1

    .line 342
    :goto_0
    if-ltz v5, :cond_0

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 343
    const/4 v0, 0x2

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 344
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    .line 346
    :cond_0
    if-gez v5, :cond_1

    .line 347
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 349
    :cond_1
    :goto_1
    if-ltz v5, :cond_2

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    aget v0, v4, v0

    if-gt v0, p3, :cond_2

    .line 350
    const/4 v0, 0x1

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput v0, v4, v1

    .line 351
    add-int/lit8 v5, v5, -0x1

    goto :goto_1

    .line 354
    :cond_2
    if-ltz v5, :cond_3

    const/4 v0, 0x1

    aget v0, v4, v0

    if-le v0, p3, :cond_4

    .line 355
    :cond_3
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 357
    :cond_4
    :goto_2
    if-ltz v5, :cond_5

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    aget v0, v4, v0

    if-gt v0, p3, :cond_5

    .line 358
    const/4 v0, 0x0

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    aput v0, v4, v1

    .line 359
    add-int/lit8 v5, v5, -0x1

    goto :goto_2

    .line 361
    :cond_5
    const/4 v0, 0x0

    aget v0, v4, v0

    if-le v0, p3, :cond_6

    .line 362
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 366
    :cond_6
    add-int/lit8 v5, p1, 0x1

    .line 367
    :goto_3
    if-ge v5, v3, :cond_7

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 368
    const/4 v0, 0x2

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x2

    aput v0, v4, v1

    .line 369
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 371
    :cond_7
    if-ne v5, v3, :cond_8

    .line 372
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 374
    :cond_8
    :goto_4
    if-ge v5, v3, :cond_9

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-nez v0, :cond_9

    const/4 v0, 0x3

    aget v0, v4, v0

    if-ge v0, p3, :cond_9

    .line 375
    const/4 v0, 0x3

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x3

    aput v0, v4, v1

    .line 376
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 378
    :cond_9
    if-eq v5, v3, :cond_a

    const/4 v0, 0x3

    aget v0, v4, v0

    if-lt v0, p3, :cond_b

    .line 379
    :cond_a
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 381
    :cond_b
    :goto_5
    if-ge v5, v3, :cond_c

    invoke-virtual {v2, p2, v5}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_c

    const/4 v0, 0x4

    aget v0, v4, v0

    if-ge v0, p3, :cond_c

    .line 382
    const/4 v0, 0x4

    aget v0, v4, v0

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x4

    aput v0, v4, v1

    .line 383
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 385
    :cond_c
    const/4 v0, 0x4

    aget v0, v4, v0

    if-lt v0, p3, :cond_d

    .line 386
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 391
    :cond_d
    const/4 v0, 0x0

    aget v0, v4, v0

    const/4 v1, 0x1

    aget v1, v4, v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, v4, v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    aget v1, v4, v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    aget v1, v4, v1

    add-int v6, v0, v1

    .line 393
    sub-int v0, v6, p4

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x5

    mul-int/lit8 v1, p4, 0x2

    if-lt v0, v1, :cond_e

    .line 394
    const/high16 v0, 0x7fc00000    # Float.NaN

    return v0

    .line 397
    :cond_e
    invoke-static {v4}, Lo/up;->a([I)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {v4, v5}, Lo/up;->b([II)F

    move-result v0

    goto :goto_6

    :cond_f
    const/high16 v0, 0x7fc00000    # Float.NaN

    :goto_6
    return v0
.end method

.method private d()I
    .locals 7

    .line 528
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    .line 529
    const/4 v0, 0x1

    if-gt v3, v0, :cond_0

    .line 530
    const/4 v0, 0x0

    return v0

    .line 532
    :cond_0
    const/4 v4, 0x0

    .line 533
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/uo;

    .line 534
    invoke-virtual {v6}, Lo/uo;->a()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    .line 535
    if-nez v4, :cond_1

    .line 536
    move-object v4, v6

    goto :goto_1

    .line 543
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/up;->d:Z

    .line 544
    invoke-virtual {v4}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {v6}, Lo/uo;->b()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 545
    invoke-virtual {v4}, Lo/ou;->e()F

    move-result v1

    invoke-virtual {v6}, Lo/uo;->e()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    sub-float/2addr v0, v1

    float-to-int v0, v0

    div-int/lit8 v0, v0, 0x2

    return v0

    .line 548
    :cond_2
    :goto_1
    goto :goto_0

    .line 549
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private e()[I
    .locals 3

    .line 223
    iget-object v0, p0, Lo/up;->c:[I

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 224
    iget-object v0, p0, Lo/up;->c:[I

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 225
    iget-object v0, p0, Lo/up;->c:[I

    const/4 v1, 0x0

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 226
    iget-object v0, p0, Lo/up;->c:[I

    const/4 v1, 0x0

    const/4 v2, 0x3

    aput v1, v0, v2

    .line 227
    iget-object v0, p0, Lo/up;->c:[I

    const/4 v1, 0x0

    const/4 v2, 0x4

    aput v1, v0, v2

    .line 228
    iget-object v0, p0, Lo/up;->c:[I

    return-object v0
.end method


# virtual methods
.method protected final c([IIIZ)Z
    .locals 10

    .line 488
    const/4 v0, 0x0

    aget v0, p1, v0

    const/4 v1, 0x1

    aget v1, p1, v1

    add-int/2addr v0, v1

    const/4 v1, 0x2

    aget v1, p1, v1

    add-int/2addr v0, v1

    const/4 v1, 0x3

    aget v1, p1, v1

    add-int/2addr v0, v1

    const/4 v1, 0x4

    aget v1, p1, v1

    add-int v3, v0, v1

    .line 490
    invoke-static {p1, p3}, Lo/up;->b([II)F

    move-result v4

    .line 491
    float-to-int v0, v4

    const/4 v1, 0x2

    aget v1, p1, v1

    invoke-direct {p0, p2, v0, v1, v3}, Lo/up;->d(IIII)F

    move-result v5

    .line 492
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    .line 494
    float-to-int v0, v4

    float-to-int v1, v5

    const/4 v2, 0x2

    aget v2, p1, v2

    invoke-direct {p0, v0, v1, v2, v3}, Lo/up;->c(IIII)F

    move-result v4

    .line 495
    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    if-eqz p4, :cond_0

    float-to-int v0, v5

    float-to-int v1, v4

    const/4 v2, 0x2

    aget v2, p1, v2

    .line 496
    invoke-direct {p0, v0, v1, v2, v3}, Lo/up;->b(IIII)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 497
    :cond_0
    int-to-float v0, v3

    const/high16 v1, 0x40e00000    # 7.0f

    div-float v6, v0, v1

    .line 498
    const/4 v7, 0x0

    .line 499
    const/4 v8, 0x0

    :goto_0
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 500
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/uo;

    .line 502
    invoke-virtual {v9, v6, v5, v4}, Lo/uo;->b(FFF)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 503
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-virtual {v9, v5, v4, v6}, Lo/uo;->d(FFF)Lo/uo;

    move-result-object v1

    invoke-interface {v0, v8, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 504
    const/4 v7, 0x1

    .line 505
    goto :goto_1

    .line 499
    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 508
    :cond_2
    :goto_1
    if-nez v7, :cond_3

    .line 509
    new-instance v8, Lo/uo;

    invoke-direct {v8, v4, v5, v6}, Lo/uo;-><init>(FFF)V

    .line 510
    iget-object v0, p0, Lo/up;->b:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 511
    iget-object v0, p0, Lo/up;->a:Lo/oy;

    if-eqz v0, :cond_3

    .line 512
    iget-object v0, p0, Lo/up;->a:Lo/oy;

    invoke-interface {v0, v8}, Lo/oy;->foundPossibleResultPoint(Lo/ou;)V

    .line 515
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 518
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method final e(Ljava/util/Map;)Lo/ut;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Lo/og;*>;)Lo/ut;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 77
    if-eqz p1, :cond_0

    sget-object v0, Lo/og;->b:Lo/og;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 78
    :goto_0
    if-eqz p1, :cond_1

    sget-object v0, Lo/og;->a:Lo/og;

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    .line 79
    :goto_1
    iget-object v0, p0, Lo/up;->e:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v4

    .line 80
    iget-object v0, p0, Lo/up;->e:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v5

    .line 88
    mul-int/lit8 v0, v4, 0x3

    div-int/lit16 v6, v0, 0xe4

    .line 89
    const/4 v0, 0x3

    if-lt v6, v0, :cond_2

    if-eqz v2, :cond_3

    .line 90
    :cond_2
    const/4 v6, 0x3

    .line 93
    :cond_3
    const/4 v7, 0x0

    .line 94
    const/4 v0, 0x5

    new-array v8, v0, [I

    .line 95
    add-int/lit8 v9, v6, -0x1

    :goto_2
    if-ge v9, v4, :cond_e

    if-nez v7, :cond_e

    .line 97
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 98
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 99
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v8, v1

    .line 100
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v8, v1

    .line 101
    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v8, v1

    .line 102
    const/4 v10, 0x0

    .line 103
    const/4 v11, 0x0

    :goto_3
    if-ge v11, v5, :cond_c

    .line 104
    iget-object v0, p0, Lo/up;->e:Lo/qr;

    invoke-virtual {v0, v11, v9}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 106
    and-int/lit8 v0, v10, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 107
    add-int/lit8 v10, v10, 0x1

    .line 109
    :cond_4
    aget v0, v8, v10

    add-int/lit8 v0, v0, 0x1

    aput v0, v8, v10

    goto/16 :goto_5

    .line 111
    :cond_5
    and-int/lit8 v0, v10, 0x1

    if-nez v0, :cond_b

    .line 112
    const/4 v0, 0x4

    if-ne v10, v0, :cond_a

    .line 113
    invoke-static {v8}, Lo/up;->a([I)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 114
    invoke-virtual {p0, v8, v9, v11, v3}, Lo/up;->c([IIIZ)Z

    move-result v12

    .line 115
    if-eqz v12, :cond_8

    .line 118
    const/4 v6, 0x2

    .line 119
    iget-boolean v0, p0, Lo/up;->d:Z

    if-eqz v0, :cond_6

    .line 120
    invoke-direct {p0}, Lo/up;->b()Z

    move-result v7

    goto :goto_4

    .line 122
    :cond_6
    invoke-direct {p0}, Lo/up;->d()I

    move-result v13

    .line 123
    const/4 v0, 0x2

    aget v0, v8, v0

    if-le v13, v0, :cond_7

    .line 132
    const/4 v0, 0x2

    aget v0, v8, v0

    sub-int v0, v13, v0

    add-int/lit8 v0, v0, -0x2

    add-int/2addr v9, v0

    .line 133
    add-int/lit8 v11, v5, -0x1

    .line 135
    :cond_7
    goto :goto_4

    .line 137
    :cond_8
    const/4 v0, 0x2

    aget v0, v8, v0

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 138
    const/4 v0, 0x3

    aget v0, v8, v0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 139
    const/4 v0, 0x4

    aget v0, v8, v0

    const/4 v1, 0x2

    aput v0, v8, v1

    .line 140
    const/4 v0, 0x1

    const/4 v1, 0x3

    aput v0, v8, v1

    .line 141
    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v8, v1

    .line 142
    const/4 v10, 0x3

    .line 143
    goto :goto_5

    .line 146
    :goto_4
    const/4 v10, 0x0

    .line 147
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 148
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 149
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v8, v1

    .line 150
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v8, v1

    .line 151
    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v8, v1

    .line 152
    goto :goto_5

    .line 153
    :cond_9
    const/4 v0, 0x2

    aget v0, v8, v0

    const/4 v1, 0x0

    aput v0, v8, v1

    .line 154
    const/4 v0, 0x3

    aget v0, v8, v0

    const/4 v1, 0x1

    aput v0, v8, v1

    .line 155
    const/4 v0, 0x4

    aget v0, v8, v0

    const/4 v1, 0x2

    aput v0, v8, v1

    .line 156
    const/4 v0, 0x1

    const/4 v1, 0x3

    aput v0, v8, v1

    .line 157
    const/4 v0, 0x0

    const/4 v1, 0x4

    aput v0, v8, v1

    .line 158
    const/4 v10, 0x3

    goto :goto_5

    .line 161
    :cond_a
    add-int/lit8 v10, v10, 0x1

    aget v0, v8, v10

    add-int/lit8 v0, v0, 0x1

    aput v0, v8, v10

    goto :goto_5

    .line 164
    :cond_b
    aget v0, v8, v10

    add-int/lit8 v0, v0, 0x1

    aput v0, v8, v10

    .line 103
    :goto_5
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_3

    .line 168
    :cond_c
    invoke-static {v8}, Lo/up;->a([I)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 169
    invoke-virtual {p0, v8, v9, v5, v3}, Lo/up;->c([IIIZ)Z

    move-result v11

    .line 170
    if-eqz v11, :cond_d

    .line 171
    const/4 v0, 0x0

    aget v6, v8, v0

    .line 172
    iget-boolean v0, p0, Lo/up;->d:Z

    if-eqz v0, :cond_d

    .line 174
    invoke-direct {p0}, Lo/up;->b()Z

    move-result v7

    .line 95
    :cond_d
    add-int/2addr v9, v6

    goto/16 :goto_2

    .line 180
    :cond_e
    invoke-direct {p0}, Lo/up;->c()[Lo/uo;

    move-result-object v9

    .line 181
    invoke-static {v9}, Lo/ou;->d([Lo/ou;)V

    .line 183
    new-instance v0, Lo/ut;

    invoke-direct {v0, v9}, Lo/ut;-><init>([Lo/uo;)V

    return-object v0
.end method
