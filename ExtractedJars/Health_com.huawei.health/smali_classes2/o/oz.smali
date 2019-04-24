.class public final Lo/oz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/oz$d;
    }
.end annotation


# static fields
.field private static final k:[I


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private final d:Lo/qr;

.field private e:Z

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 149
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/oz;->k:[I

    return-void

    nop

    :array_0
    .array-data 4
        0xee0
        0x1dc
        0x83b
        0x707
    .end array-data
.end method

.method public constructor <init>(Lo/qr;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lo/oz;->d:Lo/qr;

    .line 49
    return-void
.end method

.method private a(Lo/ou;Lo/ou;I)I
    .locals 11

    .line 401
    const/4 v3, 0x0

    .line 403
    invoke-static {p1, p2}, Lo/oz;->c(Lo/ou;Lo/ou;)F

    move-result v4

    .line 404
    int-to-float v0, p3

    div-float v5, v4, v0

    .line 405
    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v6

    .line 406
    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v7

    .line 407
    invoke-virtual {p2}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v1

    sub-float/2addr v0, v1

    mul-float/2addr v0, v5

    div-float v8, v0, v4

    .line 408
    invoke-virtual {p2}, Lo/ou;->e()F

    move-result v0

    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v1

    sub-float/2addr v0, v1

    mul-float/2addr v0, v5

    div-float v9, v0, v4

    .line 409
    const/4 v10, 0x0

    :goto_0
    if-ge v10, p3, :cond_1

    .line 410
    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    int-to-float v1, v10

    mul-float/2addr v1, v8

    add-float/2addr v1, v6

    invoke-static {v1}, Lo/rb;->c(F)I

    move-result v1

    int-to-float v2, v10

    mul-float/2addr v2, v9

    add-float/2addr v2, v7

    invoke-static {v2}, Lo/rb;->c(F)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 411
    sub-int v0, p3, v10

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x1

    shl-int v0, v1, v0

    or-int/2addr v3, v0

    .line 409
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 414
    :cond_1
    return v3
.end method

.method private a(Lo/oz$d;Lo/oz$d;)I
    .locals 11

    .line 463
    invoke-static {p1, p2}, Lo/oz;->d(Lo/oz$d;Lo/oz$d;)F

    move-result v3

    .line 464
    invoke-virtual {p2}, Lo/oz$d;->a()I

    move-result v0

    invoke-virtual {p1}, Lo/oz$d;->a()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    div-float v4, v0, v3

    .line 465
    invoke-virtual {p2}, Lo/oz$d;->c()I

    move-result v0

    invoke-virtual {p1}, Lo/oz$d;->c()I

    move-result v1

    sub-int/2addr v0, v1

    int-to-float v0, v0

    div-float v5, v0, v3

    .line 466
    const/4 v6, 0x0

    .line 468
    invoke-virtual {p1}, Lo/oz$d;->a()I

    move-result v0

    int-to-float v7, v0

    .line 469
    invoke-virtual {p1}, Lo/oz$d;->c()I

    move-result v0

    int-to-float v8, v0

    .line 471
    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {p1}, Lo/oz$d;->a()I

    move-result v1

    invoke-virtual {p1}, Lo/oz$d;->c()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v9

    .line 473
    const/4 v10, 0x0

    :goto_0
    int-to-float v0, v10

    cmpg-float v0, v0, v3

    if-gez v0, :cond_1

    .line 474
    add-float/2addr v7, v4

    .line 475
    add-float/2addr v8, v5

    .line 476
    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-static {v7}, Lo/rb;->c(F)I

    move-result v1

    invoke-static {v8}, Lo/rb;->c(F)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-eq v0, v9, :cond_0

    .line 477
    add-int/lit8 v6, v6, 0x1

    .line 473
    :cond_0
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 481
    :cond_1
    int-to-float v0, v6

    div-float v10, v0, v3

    .line 483
    const v0, 0x3dcccccd    # 0.1f

    cmpl-float v0, v10, v0

    if-lez v0, :cond_2

    const v0, 0x3f666666    # 0.9f

    cmpg-float v0, v10, v0

    if-gez v0, :cond_2

    .line 484
    const/4 v0, 0x0

    return v0

    .line 487
    :cond_2
    const v0, 0x3dcccccd    # 0.1f

    cmpg-float v0, v10, v0

    if-gtz v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-ne v0, v9, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, -0x1

    :goto_2
    return v0
.end method

.method private a(Lo/oz$d;)[Lo/ou;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 237
    move-object v4, p1

    .line 238
    move-object v5, p1

    .line 239
    move-object v6, p1

    .line 240
    move-object v7, p1

    .line 242
    const/4 v8, 0x1

    .line 244
    const/4 v0, 0x1

    iput v0, p0, Lo/oz;->a:I

    :goto_0
    iget v0, p0, Lo/oz;->a:I

    const/16 v1, 0x9

    if-ge v0, v1, :cond_2

    .line 245
    const/4 v0, 0x1

    const/4 v1, -0x1

    invoke-direct {p0, v4, v8, v0, v1}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v9

    .line 246
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-direct {p0, v5, v8, v0, v1}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v10

    .line 247
    const/4 v0, -0x1

    const/4 v1, 0x1

    invoke-direct {p0, v6, v8, v0, v1}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v11

    .line 248
    const/4 v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v7, v8, v0, v1}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v12

    .line 254
    iget v0, p0, Lo/oz;->a:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 255
    invoke-static {v12, v9}, Lo/oz;->d(Lo/oz$d;Lo/oz$d;)F

    move-result v0

    iget v1, p0, Lo/oz;->a:I

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v7, v4}, Lo/oz;->d(Lo/oz$d;Lo/oz$d;)F

    move-result v1

    iget v2, p0, Lo/oz;->a:I

    add-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    mul-float/2addr v1, v2

    div-float v13, v0, v1

    .line 256
    float-to-double v0, v13

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    cmpg-double v0, v0, v2

    if-ltz v0, :cond_2

    float-to-double v0, v13

    const-wide/high16 v2, 0x3ff4000000000000L    # 1.25

    cmpl-double v0, v0, v2

    if-gtz v0, :cond_2

    invoke-direct {p0, v9, v10, v11, v12}, Lo/oz;->d(Lo/oz$d;Lo/oz$d;Lo/oz$d;Lo/oz$d;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 257
    goto :goto_2

    .line 261
    :cond_0
    move-object v4, v9

    .line 262
    move-object v5, v10

    .line 263
    move-object v6, v11

    .line 264
    move-object v7, v12

    .line 266
    if-nez v8, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    .line 244
    :goto_1
    iget v0, p0, Lo/oz;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/oz;->a:I

    goto/16 :goto_0

    .line 269
    :cond_2
    :goto_2
    iget v0, p0, Lo/oz;->a:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    iget v0, p0, Lo/oz;->a:I

    const/4 v1, 0x7

    if-eq v0, v1, :cond_3

    .line 270
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 273
    :cond_3
    iget v0, p0, Lo/oz;->a:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    iput-boolean v0, p0, Lo/oz;->e:Z

    .line 277
    new-instance v9, Lo/ou;

    invoke-virtual {v4}, Lo/oz$d;->a()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    invoke-virtual {v4}, Lo/oz$d;->c()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    sub-float/2addr v1, v2

    invoke-direct {v9, v0, v1}, Lo/ou;-><init>(FF)V

    .line 278
    new-instance v10, Lo/ou;

    invoke-virtual {v5}, Lo/oz$d;->a()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    invoke-virtual {v5}, Lo/oz$d;->c()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    invoke-direct {v10, v0, v1}, Lo/ou;-><init>(FF)V

    .line 279
    new-instance v11, Lo/ou;

    invoke-virtual {v6}, Lo/oz$d;->a()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    sub-float/2addr v0, v1

    invoke-virtual {v6}, Lo/oz$d;->c()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v1, v2

    invoke-direct {v11, v0, v1}, Lo/ou;-><init>(FF)V

    .line 280
    new-instance v12, Lo/ou;

    invoke-virtual {v7}, Lo/oz$d;->a()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    sub-float/2addr v0, v1

    invoke-virtual {v7}, Lo/oz$d;->c()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3f000000    # 0.5f

    sub-float/2addr v1, v2

    invoke-direct {v12, v0, v1}, Lo/ou;-><init>(FF)V

    .line 284
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ou;

    const/4 v1, 0x0

    aput-object v9, v0, v1

    const/4 v1, 0x1

    aput-object v10, v0, v1

    const/4 v1, 0x2

    aput-object v11, v0, v1

    const/4 v1, 0x3

    aput-object v12, v0, v1

    iget v1, p0, Lo/oz;->a:I

    mul-int/lit8 v1, v1, 0x2

    add-int/lit8 v1, v1, -0x3

    int-to-float v1, v1

    iget v2, p0, Lo/oz;->a:I

    mul-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    invoke-static {v0, v1, v2}, Lo/oz;->a([Lo/ou;FF)[Lo/ou;

    move-result-object v0

    return-object v0
.end method

.method private static a([Lo/ou;FF)[Lo/ou;
    .locals 11

    .line 527
    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr v0, p1

    div-float v2, p2, v0

    .line 528
    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    const/4 v1, 0x2

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->b()F

    move-result v1

    sub-float v3, v0, v1

    .line 529
    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    const/4 v1, 0x2

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    sub-float v4, v0, v1

    .line 530
    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    const/4 v1, 0x2

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 531
    const/4 v0, 0x0

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    const/4 v1, 0x2

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v0, v1

    .line 533
    new-instance v7, Lo/ou;

    mul-float v0, v2, v3

    add-float/2addr v0, v5

    mul-float v1, v2, v4

    add-float/2addr v1, v6

    invoke-direct {v7, v0, v1}, Lo/ou;-><init>(FF)V

    .line 534
    new-instance v8, Lo/ou;

    mul-float v0, v2, v3

    sub-float v0, v5, v0

    mul-float v1, v2, v4

    sub-float v1, v6, v1

    invoke-direct {v8, v0, v1}, Lo/ou;-><init>(FF)V

    .line 536
    const/4 v0, 0x1

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    const/4 v1, 0x3

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->b()F

    move-result v1

    sub-float v3, v0, v1

    .line 537
    const/4 v0, 0x1

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    const/4 v1, 0x3

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    sub-float v4, v0, v1

    .line 538
    const/4 v0, 0x1

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->b()F

    move-result v0

    const/4 v1, 0x3

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v5, v0, v1

    .line 539
    const/4 v0, 0x1

    aget-object v0, p0, v0

    invoke-virtual {v0}, Lo/ou;->e()F

    move-result v0

    const/4 v1, 0x3

    aget-object v1, p0, v1

    invoke-virtual {v1}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v6, v0, v1

    .line 540
    new-instance v9, Lo/ou;

    mul-float v0, v2, v3

    add-float/2addr v0, v5

    mul-float v1, v2, v4

    add-float/2addr v1, v6

    invoke-direct {v9, v0, v1}, Lo/ou;-><init>(FF)V

    .line 541
    new-instance v10, Lo/ou;

    mul-float v0, v2, v3

    sub-float v0, v5, v0

    mul-float v1, v2, v4

    sub-float v1, v6, v1

    invoke-direct {v10, v0, v1}, Lo/ou;-><init>(FF)V

    .line 543
    const/4 v0, 0x4

    new-array v0, v0, [Lo/ou;

    const/4 v1, 0x0

    aput-object v7, v0, v1

    const/4 v1, 0x1

    aput-object v9, v0, v1

    const/4 v1, 0x2

    aput-object v8, v0, v1

    const/4 v1, 0x3

    aput-object v10, v0, v1

    return-object v0
.end method

.method private b()I
    .locals 3

    .line 565
    iget-boolean v0, p0, Lo/oz;->e:Z

    if-eqz v0, :cond_0

    .line 566
    iget v0, p0, Lo/oz;->b:I

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0xb

    return v0

    .line 568
    :cond_0
    iget v0, p0, Lo/oz;->b:I

    const/4 v1, 0x4

    if-gt v0, v1, :cond_1

    .line 569
    iget v0, p0, Lo/oz;->b:I

    mul-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, 0xf

    return v0

    .line 571
    :cond_1
    iget v0, p0, Lo/oz;->b:I

    mul-int/lit8 v0, v0, 0x4

    iget v1, p0, Lo/oz;->b:I

    add-int/lit8 v1, v1, -0x4

    div-int/lit8 v1, v1, 0x8

    add-int/lit8 v1, v1, 0x1

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0xf

    return v0
.end method

.method private b([Lo/ou;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 100
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-direct {p0, v0}, Lo/oz;->c(Lo/ou;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    aget-object v0, p1, v0

    invoke-direct {p0, v0}, Lo/oz;->c(Lo/ou;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    aget-object v0, p1, v0

    .line 101
    invoke-direct {p0, v0}, Lo/oz;->c(Lo/ou;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    aget-object v0, p1, v0

    invoke-direct {p0, v0}, Lo/oz;->c(Lo/ou;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 102
    :cond_0
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 104
    :cond_1
    iget v0, p0, Lo/oz;->a:I

    mul-int/lit8 v3, v0, 0x2

    .line 106
    const/4 v0, 0x4

    new-array v4, v0, [I

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object v1, p1, v1

    .line 107
    invoke-direct {p0, v0, v1, v3}, Lo/oz;->a(Lo/ou;Lo/ou;I)I

    move-result v0

    const/4 v1, 0x0

    aput v0, v4, v1

    const/4 v0, 0x1

    aget-object v0, p1, v0

    const/4 v1, 0x2

    aget-object v1, p1, v1

    .line 108
    invoke-direct {p0, v0, v1, v3}, Lo/oz;->a(Lo/ou;Lo/ou;I)I

    move-result v0

    const/4 v1, 0x1

    aput v0, v4, v1

    const/4 v0, 0x2

    aget-object v0, p1, v0

    const/4 v1, 0x3

    aget-object v1, p1, v1

    .line 109
    invoke-direct {p0, v0, v1, v3}, Lo/oz;->a(Lo/ou;Lo/ou;I)I

    move-result v0

    const/4 v1, 0x2

    aput v0, v4, v1

    const/4 v0, 0x3

    aget-object v0, p1, v0

    const/4 v1, 0x0

    aget-object v1, p1, v1

    .line 110
    invoke-direct {p0, v0, v1, v3}, Lo/oz;->a(Lo/ou;Lo/ou;I)I

    move-result v0

    const/4 v1, 0x3

    aput v0, v4, v1

    .line 117
    invoke-static {v4, v3}, Lo/oz;->c([II)I

    move-result v0

    iput v0, p0, Lo/oz;->g:I

    .line 120
    const-wide/16 v5, 0x0

    .line 121
    const/4 v7, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v7, v0, :cond_3

    .line 122
    iget v0, p0, Lo/oz;->g:I

    add-int/2addr v0, v7

    rem-int/lit8 v0, v0, 0x4

    aget v8, v4, v0

    .line 123
    iget-boolean v0, p0, Lo/oz;->e:Z

    if-eqz v0, :cond_2

    .line 125
    const/4 v0, 0x7

    shl-long/2addr v5, v0

    .line 126
    shr-int/lit8 v0, v8, 0x1

    and-int/lit8 v0, v0, 0x7f

    int-to-long v0, v0

    add-long/2addr v5, v0

    goto :goto_1

    .line 129
    :cond_2
    const/16 v0, 0xa

    shl-long/2addr v5, v0

    .line 130
    shr-int/lit8 v0, v8, 0x2

    and-int/lit16 v0, v0, 0x3e0

    shr-int/lit8 v1, v8, 0x1

    and-int/lit8 v1, v1, 0x1f

    add-int/2addr v0, v1

    int-to-long v0, v0

    add-long/2addr v5, v0

    .line 121
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 136
    :cond_3
    iget-boolean v0, p0, Lo/oz;->e:Z

    invoke-static {v5, v6, v0}, Lo/oz;->e(JZ)I

    move-result v7

    .line 138
    iget-boolean v0, p0, Lo/oz;->e:Z

    if-eqz v0, :cond_4

    .line 140
    shr-int/lit8 v0, v7, 0x6

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/oz;->b:I

    .line 141
    and-int/lit8 v0, v7, 0x3f

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/oz;->c:I

    goto :goto_2

    .line 144
    :cond_4
    shr-int/lit8 v0, v7, 0xb

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/oz;->b:I

    .line 145
    and-int/lit16 v0, v7, 0x7ff

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/oz;->c:I

    .line 147
    :goto_2
    return-void
.end method

.method private static c(Lo/ou;Lo/ou;)F
    .locals 4

    .line 561
    invoke-virtual {p0}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {p0}, Lo/ou;->e()F

    move-result v1

    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v2

    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/rb;->e(FFFF)F

    move-result v0

    return v0
.end method

.method private static c([II)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 166
    const/4 v2, 0x0

    .line 167
    move-object v3, p0

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget v6, v3, v5

    .line 169
    add-int/lit8 v0, p1, -0x2

    shr-int v0, v6, v0

    shl-int/lit8 v0, v0, 0x1

    and-int/lit8 v1, v6, 0x1

    add-int v7, v0, v1

    .line 170
    shl-int/lit8 v0, v2, 0x3

    add-int v2, v0, v7

    .line 167
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 175
    :cond_0
    and-int/lit8 v0, v2, 0x1

    shl-int/lit8 v0, v0, 0xb

    shr-int/lit8 v1, v2, 0x1

    add-int v2, v0, v1

    .line 179
    const/4 v3, 0x0

    :goto_1
    const/4 v0, 0x4

    if-ge v3, v0, :cond_2

    .line 180
    sget-object v0, Lo/oz;->k:[I

    aget v0, v0, v3

    xor-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    const/4 v1, 0x2

    if-gt v0, v1, :cond_1

    .line 181
    return v3

    .line 179
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 184
    :cond_2
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0
.end method

.method private c(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)Lo/qr;
    .locals 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 373
    invoke-static {}, Lo/qu;->b()Lo/qu;

    move-result-object v20

    .line 374
    invoke-direct/range {p0 .. p0}, Lo/oz;->b()I

    move-result v21

    .line 376
    move/from16 v0, v21

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/oz;->a:I

    int-to-float v1, v1

    sub-float v22, v0, v1

    .line 377
    move/from16 v0, v21

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    move-object/from16 v1, p0

    iget v1, v1, Lo/oz;->a:I

    int-to-float v1, v1

    add-float v23, v0, v1

    .line 379
    move-object/from16 v0, v20

    move-object/from16 v1, p1

    move/from16 v2, v21

    move/from16 v3, v21

    move/from16 v4, v22

    move/from16 v5, v22

    move/from16 v6, v23

    move/from16 v7, v22

    move/from16 v8, v23

    move/from16 v9, v23

    move/from16 v10, v22

    move/from16 v11, v23

    .line 386
    invoke-virtual/range {p2 .. p2}, Lo/ou;->b()F

    move-result v12

    invoke-virtual/range {p2 .. p2}, Lo/ou;->e()F

    move-result v13

    .line 387
    invoke-virtual/range {p3 .. p3}, Lo/ou;->b()F

    move-result v14

    invoke-virtual/range {p3 .. p3}, Lo/ou;->e()F

    move-result v15

    .line 388
    invoke-virtual/range {p4 .. p4}, Lo/ou;->b()F

    move-result v16

    invoke-virtual/range {p4 .. p4}, Lo/ou;->e()F

    move-result v17

    .line 389
    invoke-virtual/range {p5 .. p5}, Lo/ou;->b()F

    move-result v18

    invoke-virtual/range {p5 .. p5}, Lo/ou;->e()F

    move-result v19

    .line 379
    invoke-virtual/range {v0 .. v19}, Lo/qu;->d(Lo/qr;IIFFFFFFFFFFFFFFFF)Lo/qr;

    move-result-object v0

    return-object v0
.end method

.method private c(Lo/ou;)Z
    .locals 3

    .line 551
    invoke-virtual {p1}, Lo/ou;->b()F

    move-result v0

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v1

    .line 552
    invoke-virtual {p1}, Lo/ou;->e()F

    move-result v0

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v2

    .line 553
    invoke-direct {p0, v1, v2}, Lo/oz;->d(II)Z

    move-result v0

    return v0
.end method

.method private c([Lo/ou;)[Lo/ou;
    .locals 2

    .line 359
    iget v0, p0, Lo/oz;->a:I

    mul-int/lit8 v0, v0, 0x2

    int-to-float v0, v0

    invoke-direct {p0}, Lo/oz;->b()I

    move-result v1

    int-to-float v1, v1

    invoke-static {p1, v0, v1}, Lo/oz;->a([Lo/ou;FF)[Lo/ou;

    move-result-object v0

    return-object v0
.end method

.method private static d(Lo/oz$d;Lo/oz$d;)F
    .locals 4

    .line 557
    invoke-virtual {p0}, Lo/oz$d;->a()I

    move-result v0

    invoke-virtual {p0}, Lo/oz$d;->c()I

    move-result v1

    invoke-virtual {p1}, Lo/oz$d;->a()I

    move-result v2

    invoke-virtual {p1}, Lo/oz$d;->c()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, Lo/rb;->c(IIII)F

    move-result v0

    return v0
.end method

.method private d()Lo/oz$d;
    .locals 11

    .line 304
    :try_start_0
    new-instance v0, Lo/ra;

    iget-object v1, p0, Lo/oz;->d:Lo/qr;

    invoke-direct {v0, v1}, Lo/ra;-><init>(Lo/qr;)V

    invoke-virtual {v0}, Lo/ra;->c()[Lo/ou;

    move-result-object v8

    .line 305
    const/4 v0, 0x0

    aget-object v4, v8, v0

    .line 306
    const/4 v0, 0x1

    aget-object v5, v8, v0

    .line 307
    const/4 v0, 0x2

    aget-object v6, v8, v0

    .line 308
    const/4 v0, 0x3

    aget-object v7, v8, v0
    :try_end_0
    .catch Lo/oo; {:try_start_0 .. :try_end_0} :catch_0

    .line 321
    goto/16 :goto_0

    .line 310
    :catch_0
    move-exception v8

    .line 314
    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v0

    div-int/lit8 v9, v0, 0x2

    .line 315
    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    div-int/lit8 v10, v0, 0x2

    .line 316
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v9, 0x7

    add-int/lit8 v2, v10, -0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v4

    .line 317
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v9, 0x7

    add-int/lit8 v2, v10, 0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v5

    .line 318
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v9, -0x7

    add-int/lit8 v2, v10, 0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v6

    .line 319
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v9, -0x7

    add-int/lit8 v2, v10, -0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v7

    .line 324
    :goto_0
    invoke-virtual {v4}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {v7}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v5}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v6}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v8

    .line 325
    invoke-virtual {v4}, Lo/ou;->e()F

    move-result v0

    invoke-virtual {v7}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v5}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v6}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v9

    .line 331
    :try_start_1
    new-instance v0, Lo/ra;

    iget-object v1, p0, Lo/oz;->d:Lo/qr;

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2, v8, v9}, Lo/ra;-><init>(Lo/qr;III)V

    invoke-virtual {v0}, Lo/ra;->c()[Lo/ou;

    move-result-object v10

    .line 332
    const/4 v0, 0x0

    aget-object v4, v10, v0

    .line 333
    const/4 v0, 0x1

    aget-object v5, v10, v0

    .line 334
    const/4 v0, 0x2

    aget-object v6, v10, v0

    .line 335
    const/4 v0, 0x3

    aget-object v7, v10, v0
    :try_end_1
    .catch Lo/oo; {:try_start_1 .. :try_end_1} :catch_1

    .line 343
    goto :goto_1

    .line 336
    :catch_1
    move-exception v10

    .line 339
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v8, 0x7

    add-int/lit8 v2, v9, -0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v4

    .line 340
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v8, 0x7

    add-int/lit8 v2, v9, 0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v5

    .line 341
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v8, -0x7

    add-int/lit8 v2, v9, 0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v6

    .line 342
    new-instance v0, Lo/oz$d;

    add-int/lit8 v1, v8, -0x7

    add-int/lit8 v2, v9, -0x7

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, -0x1

    invoke-direct {p0, v0, v1, v2, v3}, Lo/oz;->d(Lo/oz$d;ZII)Lo/oz$d;

    move-result-object v0

    invoke-virtual {v0}, Lo/oz$d;->d()Lo/ou;

    move-result-object v7

    .line 346
    :goto_1
    invoke-virtual {v4}, Lo/ou;->b()F

    move-result v0

    invoke-virtual {v7}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v5}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v6}, Lo/ou;->b()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v8

    .line 347
    invoke-virtual {v4}, Lo/ou;->e()F

    move-result v0

    invoke-virtual {v7}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v5}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    invoke-virtual {v6}, Lo/ou;->e()F

    move-result v1

    add-float/2addr v0, v1

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    invoke-static {v0}, Lo/rb;->c(F)I

    move-result v9

    .line 349
    new-instance v0, Lo/oz$d;

    invoke-direct {v0, v8, v9}, Lo/oz$d;-><init>(II)V

    return-object v0
.end method

.method private d(Lo/oz$d;ZII)Lo/oz$d;
    .locals 3

    .line 494
    invoke-virtual {p1}, Lo/oz$d;->a()I

    move-result v0

    add-int v1, v0, p3

    .line 495
    invoke-virtual {p1}, Lo/oz$d;->c()I

    move-result v0

    add-int v2, v0, p4

    .line 497
    :goto_0
    invoke-direct {p0, v1, v2}, Lo/oz;->d(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-ne v0, p2, :cond_0

    .line 498
    add-int/2addr v1, p3

    .line 499
    add-int/2addr v2, p4

    goto :goto_0

    .line 502
    :cond_0
    sub-int/2addr v1, p3

    .line 503
    sub-int/2addr v2, p4

    .line 505
    :goto_1
    invoke-direct {p0, v1, v2}, Lo/oz;->d(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-ne v0, p2, :cond_1

    .line 506
    add-int/2addr v1, p3

    goto :goto_1

    .line 508
    :cond_1
    sub-int/2addr v1, p3

    .line 510
    :goto_2
    invoke-direct {p0, v1, v2}, Lo/oz;->d(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {v0, v1, v2}, Lo/qr;->e(II)Z

    move-result v0

    if-ne v0, p2, :cond_2

    .line 511
    add-int/2addr v2, p4

    goto :goto_2

    .line 513
    :cond_2
    sub-int/2addr v2, p4

    .line 515
    new-instance v0, Lo/oz$d;

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    return-object v0
.end method

.method private d(II)Z
    .locals 1

    .line 547
    if-ltz p1, :cond_0

    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->a()I

    move-result v0

    if-ge p1, v0, :cond_0

    if-lez p2, :cond_0

    iget-object v0, p0, Lo/oz;->d:Lo/qr;

    invoke-virtual {v0}, Lo/qr;->h()I

    move-result v0

    if-ge p2, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private d(Lo/oz$d;Lo/oz$d;Lo/oz$d;Lo/oz$d;)Z
    .locals 6

    .line 426
    const/4 v3, 0x3

    .line 428
    new-instance v0, Lo/oz$d;

    invoke-virtual {p1}, Lo/oz$d;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {p1}, Lo/oz$d;->c()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    move-object p1, v0

    .line 429
    new-instance v0, Lo/oz$d;

    invoke-virtual {p2}, Lo/oz$d;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    invoke-virtual {p2}, Lo/oz$d;->c()I

    move-result v2

    add-int/lit8 v2, v2, -0x3

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    move-object p2, v0

    .line 430
    new-instance v0, Lo/oz$d;

    invoke-virtual {p3}, Lo/oz$d;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p3}, Lo/oz$d;->c()I

    move-result v2

    add-int/lit8 v2, v2, -0x3

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    move-object p3, v0

    .line 431
    new-instance v0, Lo/oz$d;

    invoke-virtual {p4}, Lo/oz$d;->a()I

    move-result v1

    add-int/lit8 v1, v1, 0x3

    invoke-virtual {p4}, Lo/oz$d;->c()I

    move-result v2

    add-int/lit8 v2, v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/oz$d;-><init>(II)V

    move-object p4, v0

    .line 433
    invoke-direct {p0, p4, p1}, Lo/oz;->a(Lo/oz$d;Lo/oz$d;)I

    move-result v4

    .line 435
    if-nez v4, :cond_0

    .line 436
    const/4 v0, 0x0

    return v0

    .line 439
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/oz;->a(Lo/oz$d;Lo/oz$d;)I

    move-result v5

    .line 441
    if-eq v5, v4, :cond_1

    .line 442
    const/4 v0, 0x0

    return v0

    .line 445
    :cond_1
    invoke-direct {p0, p2, p3}, Lo/oz;->a(Lo/oz$d;Lo/oz$d;)I

    move-result v5

    .line 447
    if-eq v5, v4, :cond_2

    .line 448
    const/4 v0, 0x0

    return v0

    .line 451
    :cond_2
    invoke-direct {p0, p3, p4}, Lo/oz;->a(Lo/oz$d;Lo/oz$d;)I

    move-result v5

    .line 453
    if-ne v5, v4, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static e(JZ)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 198
    if-eqz p2, :cond_0

    .line 199
    const/4 v2, 0x7

    .line 200
    const/4 v3, 0x2

    goto :goto_0

    .line 202
    :cond_0
    const/16 v2, 0xa

    .line 203
    const/4 v3, 0x4

    .line 206
    :goto_0
    sub-int v4, v2, v3

    .line 207
    new-array v5, v2, [I

    .line 208
    add-int/lit8 v6, v2, -0x1

    :goto_1
    if-ltz v6, :cond_1

    .line 209
    long-to-int v0, p0

    and-int/lit8 v0, v0, 0xf

    aput v0, v5, v6

    .line 210
    const/4 v0, 0x4

    shr-long/2addr p0, v0

    .line 208
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 213
    :cond_1
    :try_start_0
    new-instance v6, Lo/re;

    sget-object v0, Lo/qx;->a:Lo/qx;

    invoke-direct {v6, v0}, Lo/re;-><init>(Lo/qx;)V

    .line 214
    invoke-virtual {v6, v5, v4}, Lo/re;->c([II)V
    :try_end_0
    .catch Lo/rf; {:try_start_0 .. :try_end_0} :catch_0

    .line 217
    goto :goto_2

    .line 215
    :catch_0
    move-exception v6

    .line 216
    invoke-static {}, Lo/oo;->a()Lo/oo;

    move-result-object v0

    throw v0

    .line 219
    :goto_2
    const/4 v6, 0x0

    .line 220
    const/4 v7, 0x0

    :goto_3
    if-ge v7, v3, :cond_2

    .line 221
    shl-int/lit8 v0, v6, 0x4

    aget v1, v5, v7

    add-int v6, v0, v1

    .line 220
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    .line 223
    :cond_2
    return v6
.end method


# virtual methods
.method public d(Z)Lo/ov;
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 65
    invoke-direct {p0}, Lo/oz;->d()Lo/oz$d;

    move-result-object v7

    .line 69
    invoke-direct {p0, v7}, Lo/oz;->a(Lo/oz$d;)[Lo/ou;

    move-result-object v8

    .line 71
    if-eqz p1, :cond_0

    .line 72
    const/4 v0, 0x0

    aget-object v9, v8, v0

    .line 73
    const/4 v0, 0x2

    aget-object v0, v8, v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 74
    const/4 v0, 0x2

    aput-object v9, v8, v0

    .line 78
    :cond_0
    invoke-direct {p0, v8}, Lo/oz;->b([Lo/ou;)V

    .line 81
    move-object v0, p0

    iget-object v1, p0, Lo/oz;->d:Lo/qr;

    iget v2, p0, Lo/oz;->g:I

    rem-int/lit8 v2, v2, 0x4

    aget-object v2, v8, v2

    iget v3, p0, Lo/oz;->g:I

    add-int/lit8 v3, v3, 0x1

    rem-int/lit8 v3, v3, 0x4

    aget-object v3, v8, v3

    iget v4, p0, Lo/oz;->g:I

    add-int/lit8 v4, v4, 0x2

    rem-int/lit8 v4, v4, 0x4

    aget-object v4, v8, v4

    iget v5, p0, Lo/oz;->g:I

    add-int/lit8 v5, v5, 0x3

    rem-int/lit8 v5, v5, 0x4

    aget-object v5, v8, v5

    invoke-direct/range {v0 .. v5}, Lo/oz;->c(Lo/qr;Lo/ou;Lo/ou;Lo/ou;Lo/ou;)Lo/qr;

    move-result-object v9

    .line 88
    invoke-direct {p0, v8}, Lo/oz;->c([Lo/ou;)[Lo/ou;

    move-result-object v10

    .line 90
    new-instance v0, Lo/ov;

    iget-boolean v3, p0, Lo/oz;->e:Z

    iget v4, p0, Lo/oz;->c:I

    iget v5, p0, Lo/oz;->b:I

    move-object v1, v9

    move-object v2, v10

    invoke-direct/range {v0 .. v5}, Lo/ov;-><init>(Lo/qr;[Lo/ou;ZII)V

    return-object v0
.end method
