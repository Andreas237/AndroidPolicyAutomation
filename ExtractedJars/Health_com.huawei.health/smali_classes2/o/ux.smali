.class public final Lo/ux;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    const/16 v0, 0x60

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/ux;->d:[I

    return-void

    :array_0
    .array-data 4
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0x24
        -0x1
        -0x1
        -0x1
        0x25
        0x26
        -0x1
        -0x1
        -0x1
        -0x1
        0x27
        0x28
        -0x1
        0x29
        0x2a
        0x2b
        0x0
        0x1
        0x2
        0x3
        0x4
        0x5
        0x6
        0x7
        0x8
        0x9
        0x2c
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0xa
        0xb
        0xc
        0xd
        0xe
        0xf
        0x10
        0x11
        0x12
        0x13
        0x14
        0x15
        0x16
        0x17
        0x18
        0x19
        0x1a
        0x1b
        0x1c
        0x1d
        0x1e
        0x1f
        0x20
        0x21
        0x22
        0x23
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
    .end array-data
.end method

.method private static a(ILo/ul;)Lo/un;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 250
    const/4 v2, 0x1

    :goto_0
    const/16 v0, 0x28

    if-gt v2, v0, :cond_1

    .line 251
    invoke-static {v2}, Lo/un;->e(I)Lo/un;

    move-result-object v3

    .line 253
    invoke-virtual {v3}, Lo/un;->c()I

    move-result v4

    .line 255
    invoke-virtual {v3, p1}, Lo/un;->b(Lo/ul;)Lo/un$b;

    move-result-object v5

    .line 256
    invoke-virtual {v5}, Lo/un$b;->e()I

    move-result v6

    .line 258
    sub-int v7, v4, v6

    .line 259
    add-int/lit8 v0, p0, 0x7

    div-int/lit8 v8, v0, 0x8

    .line 260
    if-lt v7, v8, :cond_0

    .line 261
    return-object v3

    .line 250
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 264
    :cond_1
    new-instance v0, Lo/ox;

    const-string v1, "Data too big"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static a(IIII[I[I)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 308
    if-lt p3, p2, :cond_0

    .line 309
    new-instance v0, Lo/ox;

    const-string v1, "Block ID too large"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    :cond_0
    rem-int v2, p0, p2

    .line 314
    sub-int v3, p2, v2

    .line 316
    div-int v4, p0, p2

    .line 318
    add-int/lit8 v5, v4, 0x1

    .line 320
    div-int v6, p1, p2

    .line 322
    add-int/lit8 v7, v6, 0x1

    .line 324
    sub-int v8, v4, v6

    .line 326
    sub-int v9, v5, v7

    .line 329
    if-eq v8, v9, :cond_1

    .line 330
    new-instance v0, Lo/ox;

    const-string v1, "EC bytes mismatch"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_1
    add-int v0, v3, v2

    if-eq p2, v0, :cond_2

    .line 334
    new-instance v0, Lo/ox;

    const-string v1, "RS blocks mismatch"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 337
    :cond_2
    add-int v0, v6, v8

    mul-int/2addr v0, v3

    add-int v1, v7, v9

    mul-int/2addr v1, v2

    add-int/2addr v0, v1

    if-eq p0, v0, :cond_3

    .line 342
    new-instance v0, Lo/ox;

    const-string v1, "Total bytes mismatch"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 345
    :cond_3
    if-ge p3, v3, :cond_4

    .line 346
    const/4 v0, 0x0

    aput v6, p4, v0

    .line 347
    const/4 v0, 0x0

    aput v8, p5, v0

    goto :goto_0

    .line 349
    :cond_4
    const/4 v0, 0x0

    aput v7, p4, v0

    .line 350
    const/4 v0, 0x0

    aput v9, p5, v0

    .line 352
    :goto_0
    return-void
.end method

.method static a(Ljava/lang/String;Lo/qm;Ljava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 537
    :try_start_0
    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 540
    goto :goto_0

    .line 538
    :catch_0
    move-exception v2

    .line 539
    new-instance v0, Lo/ox;

    invoke-direct {v0, v2}, Lo/ox;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 541
    :goto_0
    move-object v2, v1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_0

    aget-byte v5, v2, v4

    .line 542
    const/16 v0, 0x8

    invoke-virtual {p1, v5, v0}, Lo/qm;->b(II)V

    .line 541
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 544
    :cond_0
    return-void
.end method

.method static a([BI)[B
    .locals 6

    .line 427
    array-length v2, p0

    .line 428
    add-int v0, v2, p1

    new-array v3, v0, [I

    .line 429
    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    .line 430
    aget-byte v0, p0, v4

    and-int/lit16 v0, v0, 0xff

    aput v0, v3, v4

    .line 429
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 432
    :cond_0
    new-instance v0, Lo/rd;

    sget-object v1, Lo/qx;->c:Lo/qx;

    invoke-direct {v0, v1}, Lo/rd;-><init>(Lo/qx;)V

    invoke-virtual {v0, v3, p1}, Lo/rd;->e([II)V

    .line 434
    new-array v4, p1, [B

    .line 435
    const/4 v5, 0x0

    :goto_1
    if-ge v5, p1, :cond_1

    .line 436
    add-int v0, v2, v5

    aget v0, v3, v0

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 435
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 438
    :cond_1
    return-object v4
.end method

.method static b(I)I
    .locals 1

    .line 169
    sget-object v0, Lo/ux;->d:[I

    array-length v0, v0

    if-ge p0, v0, :cond_0

    .line 170
    sget-object v0, Lo/ux;->d:[I

    aget v0, v0, p0

    return v0

    .line 172
    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method static b(ILo/un;Lo/uk;Lo/qm;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 453
    invoke-virtual {p2, p1}, Lo/uk;->b(Lo/un;)I

    move-result v4

    .line 454
    const/4 v0, 0x1

    shl-int/2addr v0, v4

    if-lt p0, v0, :cond_0

    .line 455
    new-instance v0, Lo/ox;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is bigger than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x1

    shl-int/2addr v2, v4

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 457
    :cond_0
    invoke-virtual {p3, p0, v4}, Lo/qm;->b(II)V

    .line 458
    return-void
.end method

.method private static b(Lo/qo;Lo/qm;)V
    .locals 2

    .line 573
    sget-object v0, Lo/uk;->f:Lo/uk;

    invoke-virtual {v0}, Lo/uk;->d()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/qm;->b(II)V

    .line 575
    invoke-virtual {p0}, Lo/qo;->b()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/qm;->b(II)V

    .line 576
    return-void
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 6

    .line 212
    const-string v0, "Shift_JIS"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 215
    goto :goto_0

    .line 213
    :catch_0
    move-exception v3

    .line 214
    const/4 v0, 0x0

    return v0

    .line 216
    :goto_0
    array-length v3, v2

    .line 217
    rem-int/lit8 v0, v3, 0x2

    if-eqz v0, :cond_0

    .line 218
    const/4 v0, 0x0

    return v0

    .line 220
    :cond_0
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_4

    .line 221
    aget-byte v0, v2, v4

    and-int/lit16 v5, v0, 0xff

    .line 222
    const/16 v0, 0x81

    if-lt v5, v0, :cond_1

    const/16 v0, 0x9f

    if-le v5, v0, :cond_3

    :cond_1
    const/16 v0, 0xe0

    if-lt v5, v0, :cond_2

    const/16 v0, 0xeb

    if-le v5, v0, :cond_3

    .line 223
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 220
    :cond_3
    add-int/lit8 v4, v4, 0x2

    goto :goto_1

    .line 226
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Lo/uk;
    .locals 6

    .line 184
    const-string v0, "Shift_JIS"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    invoke-static {p0}, Lo/ux;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lo/uk;->i:Lo/uk;

    goto :goto_0

    :cond_0
    sget-object v0, Lo/uk;->c:Lo/uk;

    :goto_0
    return-object v0

    .line 188
    :cond_1
    const/4 v2, 0x0

    .line 189
    const/4 v3, 0x0

    .line 190
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v4, v0, :cond_4

    .line 191
    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    .line 192
    const/16 v0, 0x30

    if-lt v5, v0, :cond_2

    const/16 v0, 0x39

    if-gt v5, v0, :cond_2

    .line 193
    const/4 v2, 0x1

    goto :goto_2

    .line 194
    :cond_2
    invoke-static {v5}, Lo/ux;->b(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 195
    const/4 v3, 0x1

    goto :goto_2

    .line 197
    :cond_3
    sget-object v0, Lo/uk;->c:Lo/uk;

    return-object v0

    .line 190
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 200
    :cond_4
    if-eqz v3, :cond_5

    .line 201
    sget-object v0, Lo/uk;->d:Lo/uk;

    return-object v0

    .line 203
    :cond_5
    if-eqz v2, :cond_6

    .line 204
    sget-object v0, Lo/uk;->a:Lo/uk;

    return-object v0

    .line 206
    :cond_6
    sget-object v0, Lo/uk;->c:Lo/uk;

    return-object v0
.end method

.method static c(Ljava/lang/CharSequence;Lo/qm;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 510
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 511
    const/4 v3, 0x0

    .line 512
    :goto_0
    if-ge v3, v2, :cond_3

    .line 513
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/ux;->b(I)I

    move-result v4

    .line 514
    const/4 v0, -0x1

    if-ne v4, v0, :cond_0

    .line 515
    new-instance v0, Lo/ox;

    invoke-direct {v0}, Lo/ox;-><init>()V

    throw v0

    .line 517
    :cond_0
    add-int/lit8 v0, v3, 0x1

    if-ge v0, v2, :cond_2

    .line 518
    add-int/lit8 v0, v3, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lo/ux;->b(I)I

    move-result v5

    .line 519
    const/4 v0, -0x1

    if-ne v5, v0, :cond_1

    .line 520
    new-instance v0, Lo/ox;

    invoke-direct {v0}, Lo/ox;-><init>()V

    throw v0

    .line 523
    :cond_1
    mul-int/lit8 v0, v4, 0x2d

    add-int/2addr v0, v5

    const/16 v1, 0xb

    invoke-virtual {p1, v0, v1}, Lo/qm;->b(II)V

    .line 524
    add-int/lit8 v3, v3, 0x2

    .line 525
    goto :goto_1

    .line 527
    :cond_2
    const/4 v0, 0x6

    invoke-virtual {p1, v4, v0}, Lo/qm;->b(II)V

    .line 528
    add-int/lit8 v3, v3, 0x1

    .line 530
    :goto_1
    goto :goto_0

    .line 531
    :cond_3
    return-void
.end method

.method static c(Ljava/lang/String;Lo/uk;Lo/qm;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 467
    sget-object v0, Lo/ux$3;->e:[I

    invoke-virtual {p1}, Lo/uk;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 469
    :pswitch_0
    invoke-static {p0, p2}, Lo/ux;->d(Ljava/lang/CharSequence;Lo/qm;)V

    .line 470
    goto :goto_1

    .line 472
    :pswitch_1
    invoke-static {p0, p2}, Lo/ux;->c(Ljava/lang/CharSequence;Lo/qm;)V

    .line 473
    goto :goto_1

    .line 475
    :pswitch_2
    invoke-static {p0, p2, p3}, Lo/ux;->a(Ljava/lang/String;Lo/qm;Ljava/lang/String;)V

    .line 476
    goto :goto_1

    .line 478
    :pswitch_3
    invoke-static {p0, p2}, Lo/ux;->e(Ljava/lang/String;Lo/qm;)V

    .line 479
    goto :goto_1

    .line 481
    :goto_0
    new-instance v0, Lo/ox;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid mode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 483
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method static d(Lo/qm;III)Lo/qm;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 364
    invoke-virtual/range {p0 .. p0}, Lo/qm;->b()I

    move-result v0

    move/from16 v1, p2

    if-eq v0, v1, :cond_0

    .line 365
    new-instance v0, Lo/ox;

    const-string v1, "Number of bits and data bytes does not match"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 370
    :cond_0
    const/4 v6, 0x0

    .line 371
    const/4 v7, 0x0

    .line 372
    const/4 v8, 0x0

    .line 375
    new-instance v9, Ljava/util/ArrayList;

    move/from16 v0, p3

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 377
    const/4 v10, 0x0

    :goto_0
    move/from16 v0, p3

    if-ge v10, v0, :cond_1

    .line 378
    const/4 v0, 0x1

    new-array v11, v0, [I

    .line 379
    const/4 v0, 0x1

    new-array v12, v0, [I

    .line 380
    move/from16 v0, p1

    move/from16 v1, p2

    move/from16 v2, p3

    move v3, v10

    move-object v4, v11

    move-object v5, v12

    invoke-static/range {v0 .. v5}, Lo/ux;->a(IIII[I[I)V

    .line 384
    const/4 v0, 0x0

    aget v13, v11, v0

    .line 385
    new-array v14, v13, [B

    .line 386
    mul-int/lit8 v0, v6, 0x8

    move-object/from16 v1, p0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v14, v2, v13}, Lo/qm;->c(I[BII)V

    .line 387
    const/4 v0, 0x0

    aget v0, v12, v0

    invoke-static {v14, v0}, Lo/ux;->a([BI)[B

    move-result-object v15

    .line 388
    new-instance v0, Lo/uw;

    invoke-direct {v0, v14, v15}, Lo/uw;-><init>([B[B)V

    invoke-interface {v9, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 390
    invoke-static {v7, v13}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 391
    array-length v0, v15

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v8

    .line 392
    const/4 v0, 0x0

    aget v0, v11, v0

    add-int/2addr v6, v0

    .line 377
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 394
    :cond_1
    move/from16 v0, p2

    if-eq v0, v6, :cond_2

    .line 395
    new-instance v0, Lo/ox;

    const-string v1, "Data bytes does not match offset"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 398
    :cond_2
    new-instance v10, Lo/qm;

    invoke-direct {v10}, Lo/qm;-><init>()V

    .line 401
    const/4 v11, 0x0

    :goto_1
    if-ge v11, v7, :cond_5

    .line 402
    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/uw;

    .line 403
    invoke-virtual {v13}, Lo/uw;->e()[B

    move-result-object v14

    .line 404
    array-length v0, v14

    if-ge v11, v0, :cond_3

    .line 405
    aget-byte v0, v14, v11

    const/16 v1, 0x8

    invoke-virtual {v10, v0, v1}, Lo/qm;->b(II)V

    .line 407
    :cond_3
    goto :goto_2

    .line 401
    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 410
    :cond_5
    const/4 v11, 0x0

    :goto_3
    if-ge v11, v8, :cond_8

    .line 411
    invoke-interface {v9}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/uw;

    .line 412
    invoke-virtual {v13}, Lo/uw;->d()[B

    move-result-object v14

    .line 413
    array-length v0, v14

    if-ge v11, v0, :cond_6

    .line 414
    aget-byte v0, v14, v11

    const/16 v1, 0x8

    invoke-virtual {v10, v0, v1}, Lo/qm;->b(II)V

    .line 416
    :cond_6
    goto :goto_4

    .line 410
    :cond_7
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .line 418
    :cond_8
    invoke-virtual {v10}, Lo/qm;->b()I

    move-result v0

    move/from16 v1, p1

    if-eq v1, v0, :cond_9

    .line 419
    new-instance v0, Lo/ox;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Interleaving error: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " and "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 420
    invoke-virtual {v10}, Lo/qm;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " differ."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 423
    :cond_9
    return-object v10
.end method

.method public static d(Ljava/lang/String;Lo/ul;Ljava/util/Map;)Lo/vc;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Lo/ul;Ljava/util/Map<Lo/oi;*>;)Lo/vc;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 80
    if-nez p2, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/oi;->d:Lo/oi;

    move-object/from16 v1, p2

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 81
    :goto_0
    if-nez v4, :cond_1

    .line 82
    const-string v4, "ISO-8859-1"

    .line 87
    :cond_1
    move-object/from16 v0, p0

    invoke-static {v0, v4}, Lo/ux;->c(Ljava/lang/String;Ljava/lang/String;)Lo/uk;

    move-result-object v5

    .line 91
    new-instance v6, Lo/qm;

    invoke-direct {v6}, Lo/qm;-><init>()V

    .line 94
    sget-object v0, Lo/uk;->c:Lo/uk;

    if-ne v5, v0, :cond_2

    const-string v0, "ISO-8859-1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 95
    invoke-static {v4}, Lo/qo;->d(Ljava/lang/String;)Lo/qo;

    move-result-object v7

    .line 96
    if-eqz v7, :cond_2

    .line 97
    invoke-static {v7, v6}, Lo/ux;->b(Lo/qo;Lo/qm;)V

    .line 102
    :cond_2
    invoke-static {v5, v6}, Lo/ux;->e(Lo/uk;Lo/qm;)V

    .line 106
    new-instance v7, Lo/qm;

    invoke-direct {v7}, Lo/qm;-><init>()V

    .line 107
    move-object/from16 v0, p0

    invoke-static {v0, v5, v7, v4}, Lo/ux;->c(Ljava/lang/String;Lo/uk;Lo/qm;Ljava/lang/String;)V

    .line 113
    invoke-virtual {v6}, Lo/qm;->d()I

    move-result v0

    .line 114
    const/4 v1, 0x1

    invoke-static {v1}, Lo/un;->e(I)Lo/un;

    move-result-object v1

    invoke-virtual {v5, v1}, Lo/uk;->b(Lo/un;)I

    move-result v1

    add-int/2addr v0, v1

    .line 115
    invoke-virtual {v7}, Lo/qm;->d()I

    move-result v1

    add-int v8, v0, v1

    .line 116
    move-object/from16 v0, p1

    invoke-static {v8, v0}, Lo/ux;->a(ILo/ul;)Lo/un;

    move-result-object v9

    .line 120
    invoke-virtual {v6}, Lo/qm;->d()I

    move-result v0

    .line 121
    invoke-virtual {v5, v9}, Lo/uk;->b(Lo/un;)I

    move-result v1

    add-int/2addr v0, v1

    .line 122
    invoke-virtual {v7}, Lo/qm;->d()I

    move-result v1

    add-int v10, v0, v1

    .line 123
    move-object/from16 v0, p1

    invoke-static {v10, v0}, Lo/ux;->a(ILo/ul;)Lo/un;

    move-result-object v11

    .line 125
    new-instance v12, Lo/qm;

    invoke-direct {v12}, Lo/qm;-><init>()V

    .line 126
    invoke-virtual {v12, v6}, Lo/qm;->b(Lo/qm;)V

    .line 128
    sget-object v0, Lo/uk;->c:Lo/uk;

    if-ne v5, v0, :cond_3

    invoke-virtual {v7}, Lo/qm;->b()I

    move-result v13

    goto :goto_1

    :cond_3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v13

    .line 129
    :goto_1
    invoke-static {v13, v11, v5, v12}, Lo/ux;->b(ILo/un;Lo/uk;Lo/qm;)V

    .line 131
    invoke-virtual {v12, v7}, Lo/qm;->b(Lo/qm;)V

    .line 133
    move-object/from16 v0, p1

    invoke-virtual {v11, v0}, Lo/un;->b(Lo/ul;)Lo/un$b;

    move-result-object v14

    .line 134
    invoke-virtual {v11}, Lo/un;->c()I

    move-result v0

    invoke-virtual {v14}, Lo/un$b;->e()I

    move-result v1

    sub-int v15, v0, v1

    .line 137
    invoke-static {v15, v12}, Lo/ux;->d(ILo/qm;)V

    .line 140
    .line 141
    invoke-virtual {v11}, Lo/un;->c()I

    move-result v0

    .line 143
    invoke-virtual {v14}, Lo/un$b;->c()I

    move-result v1

    .line 140
    invoke-static {v12, v0, v15, v1}, Lo/ux;->d(Lo/qm;III)Lo/qm;

    move-result-object v16

    .line 145
    new-instance v17, Lo/vc;

    invoke-direct/range {v17 .. v17}, Lo/vc;-><init>()V

    .line 147
    move-object/from16 v0, v17

    move-object/from16 v1, p1

    invoke-virtual {v0, v1}, Lo/vc;->e(Lo/ul;)V

    .line 148
    move-object/from16 v0, v17

    invoke-virtual {v0, v5}, Lo/vc;->b(Lo/uk;)V

    .line 149
    move-object/from16 v0, v17

    invoke-virtual {v0, v11}, Lo/vc;->b(Lo/un;)V

    .line 152
    invoke-virtual {v11}, Lo/un;->d()I

    move-result v18

    .line 153
    new-instance v0, Lo/uv;

    move/from16 v1, v18

    move/from16 v2, v18

    invoke-direct {v0, v1, v2}, Lo/uv;-><init>(II)V

    move-object/from16 v19, v0

    .line 154
    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move-object/from16 v2, v19

    invoke-static {v0, v1, v11, v2}, Lo/ux;->e(Lo/qm;Lo/ul;Lo/un;Lo/uv;)I

    move-result v20

    .line 155
    move-object/from16 v0, v17

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Lo/vc;->a(I)V

    .line 158
    move-object/from16 v0, v16

    move-object/from16 v1, p1

    move/from16 v2, v20

    move-object/from16 v3, v19

    invoke-static {v0, v1, v11, v2, v3}, Lo/va;->d(Lo/qm;Lo/ul;Lo/un;ILo/uv;)V

    .line 159
    move-object/from16 v0, v17

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Lo/vc;->b(Lo/uv;)V

    .line 161
    return-object v17
.end method

.method static d(ILo/qm;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 271
    mul-int/lit8 v3, p0, 0x8

    .line 272
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    if-le v0, v3, :cond_0

    .line 273
    new-instance v0, Lo/ox;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "data bits cannot fit in the QR Code"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 276
    :cond_0
    const/4 v4, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v4, v0, :cond_1

    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    if-ge v0, v3, :cond_1

    .line 277
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/qm;->a(Z)V

    .line 276
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 281
    :cond_1
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    and-int/lit8 v4, v0, 0x7

    .line 282
    if-lez v4, :cond_2

    .line 283
    move v5, v4

    :goto_1
    const/16 v0, 0x8

    if-ge v5, v0, :cond_2

    .line 284
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lo/qm;->a(Z)V

    .line 283
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 288
    :cond_2
    invoke-virtual {p1}, Lo/qm;->b()I

    move-result v0

    sub-int v5, p0, v0

    .line 289
    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_4

    .line 290
    and-int/lit8 v0, v6, 0x1

    if-nez v0, :cond_3

    const/16 v0, 0xec

    goto :goto_3

    :cond_3
    const/16 v0, 0x11

    :goto_3
    const/16 v1, 0x8

    invoke-virtual {p1, v0, v1}, Lo/qm;->b(II)V

    .line 289
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 292
    :cond_4
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v0

    if-eq v0, v3, :cond_5

    .line 293
    new-instance v0, Lo/ox;

    const-string v1, "Bits size does not equal capacity"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 295
    :cond_5
    return-void
.end method

.method static d(Ljava/lang/CharSequence;Lo/qm;)V
    .locals 7

    .line 486
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    .line 487
    const/4 v3, 0x0

    .line 488
    :goto_0
    if-ge v3, v2, :cond_2

    .line 489
    invoke-interface {p0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    add-int/lit8 v4, v0, -0x30

    .line 490
    add-int/lit8 v0, v3, 0x2

    if-ge v0, v2, :cond_0

    .line 492
    add-int/lit8 v0, v3, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    add-int/lit8 v5, v0, -0x30

    .line 493
    add-int/lit8 v0, v3, 0x2

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    add-int/lit8 v6, v0, -0x30

    .line 494
    mul-int/lit8 v0, v4, 0x64

    mul-int/lit8 v1, v5, 0xa

    add-int/2addr v0, v1

    add-int/2addr v0, v6

    const/16 v1, 0xa

    invoke-virtual {p1, v0, v1}, Lo/qm;->b(II)V

    .line 495
    add-int/lit8 v3, v3, 0x3

    .line 496
    goto :goto_1

    :cond_0
    add-int/lit8 v0, v3, 0x1

    if-ge v0, v2, :cond_1

    .line 498
    add-int/lit8 v0, v3, 0x1

    invoke-interface {p0, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    add-int/lit8 v5, v0, -0x30

    .line 499
    mul-int/lit8 v0, v4, 0xa

    add-int/2addr v0, v5

    const/4 v1, 0x7

    invoke-virtual {p1, v0, v1}, Lo/qm;->b(II)V

    .line 500
    add-int/lit8 v3, v3, 0x2

    .line 501
    goto :goto_1

    .line 503
    :cond_1
    const/4 v0, 0x4

    invoke-virtual {p1, v4, v0}, Lo/qm;->b(II)V

    .line 504
    add-int/lit8 v3, v3, 0x1

    .line 506
    :goto_1
    goto/16 :goto_0

    .line 507
    :cond_2
    return-void
.end method

.method private static e(Lo/qm;Lo/ul;Lo/un;Lo/uv;)I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 234
    const v1, 0x7fffffff

    .line 235
    const/4 v2, -0x1

    .line 237
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x8

    if-ge v3, v0, :cond_1

    .line 238
    invoke-static {p0, p1, p2, v3, p3}, Lo/va;->d(Lo/qm;Lo/ul;Lo/un;ILo/uv;)V

    .line 239
    invoke-static {p3}, Lo/ux;->e(Lo/uv;)I

    move-result v4

    .line 240
    if-ge v4, v1, :cond_0

    .line 241
    move v1, v4

    .line 242
    move v2, v3

    .line 237
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 245
    :cond_1
    return v2
.end method

.method private static e(Lo/uv;)I
    .locals 2

    .line 58
    invoke-static {p0}, Lo/uu;->e(Lo/uv;)I

    move-result v0

    .line 59
    invoke-static {p0}, Lo/uu;->d(Lo/uv;)I

    move-result v1

    add-int/2addr v0, v1

    .line 60
    invoke-static {p0}, Lo/uu;->b(Lo/uv;)I

    move-result v1

    add-int/2addr v0, v1

    .line 61
    invoke-static {p0}, Lo/uu;->a(Lo/uv;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method static e(Ljava/lang/String;Lo/qm;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/ox;
        }
    .end annotation

    .line 549
    const-string v0, "Shift_JIS"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 552
    goto :goto_0

    .line 550
    :catch_0
    move-exception v3

    .line 551
    new-instance v0, Lo/ox;

    invoke-direct {v0, v3}, Lo/ox;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 553
    :goto_0
    array-length v3, v2

    .line 554
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_3

    .line 555
    aget-byte v0, v2, v4

    and-int/lit16 v5, v0, 0xff

    .line 556
    add-int/lit8 v0, v4, 0x1

    aget-byte v0, v2, v0

    and-int/lit16 v6, v0, 0xff

    .line 557
    shl-int/lit8 v0, v5, 0x8

    or-int v7, v0, v6

    .line 558
    const/4 v8, -0x1

    .line 559
    const v0, 0x8140

    if-lt v7, v0, :cond_0

    const v0, 0x9ffc

    if-gt v7, v0, :cond_0

    .line 560
    const v0, 0x8140

    sub-int v8, v7, v0

    goto :goto_2

    .line 561
    :cond_0
    const v0, 0xe040

    if-lt v7, v0, :cond_1

    const v0, 0xebbf

    if-gt v7, v0, :cond_1

    .line 562
    const v0, 0xc140

    sub-int v8, v7, v0

    .line 564
    :cond_1
    :goto_2
    const/4 v0, -0x1

    if-ne v8, v0, :cond_2

    .line 565
    new-instance v0, Lo/ox;

    const-string v1, "Invalid byte sequence"

    invoke-direct {v0, v1}, Lo/ox;-><init>(Ljava/lang/String;)V

    throw v0

    .line 567
    :cond_2
    shr-int/lit8 v0, v8, 0x8

    mul-int/lit16 v0, v0, 0xc0

    and-int/lit16 v1, v8, 0xff

    add-int v9, v0, v1

    .line 568
    const/16 v0, 0xd

    invoke-virtual {p1, v9, v0}, Lo/qm;->b(II)V

    .line 554
    add-int/lit8 v4, v4, 0x2

    goto/16 :goto_1

    .line 570
    :cond_3
    return-void
.end method

.method static e(Lo/uk;Lo/qm;)V
    .locals 2

    .line 445
    invoke-virtual {p0}, Lo/uk;->d()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {p1, v0, v1}, Lo/qm;->b(II)V

    .line 446
    return-void
.end method
