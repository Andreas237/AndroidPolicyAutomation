.class final Lo/ts;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ts$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/nio/charset/Charset;

.field private static final b:[Ljava/math/BigInteger;

.field private static final c:[C

.field private static final d:[C


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 67
    const/16 v0, 0x1d

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/ts;->c:[C

    .line 72
    const/16 v0, 0x19

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lo/ts;->d:[C

    .line 77
    const-string v0, "ISO-8859-1"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lo/ts;->a:Ljava/nio/charset/Charset;

    .line 85
    const/16 v0, 0x10

    new-array v0, v0, [Ljava/math/BigInteger;

    sput-object v0, Lo/ts;->b:[Ljava/math/BigInteger;

    .line 86
    sget-object v0, Lo/ts;->b:[Ljava/math/BigInteger;

    sget-object v1, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 87
    const-wide/16 v0, 0x384

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    .line 88
    sget-object v0, Lo/ts;->b:[Ljava/math/BigInteger;

    const/4 v1, 0x1

    aput-object v3, v0, v1

    .line 89
    const/4 v4, 0x2

    :goto_0
    sget-object v0, Lo/ts;->b:[Ljava/math/BigInteger;

    array-length v0, v0

    if-ge v4, v0, :cond_0

    .line 90
    sget-object v0, Lo/ts;->b:[Ljava/math/BigInteger;

    sget-object v1, Lo/ts;->b:[Ljava/math/BigInteger;

    add-int/lit8 v2, v4, -0x1

    aget-object v1, v1, v2

    invoke-virtual {v1, v3}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    aput-object v1, v0, v4

    .line 89
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 92
    :cond_0
    return-void

    :array_0
    .array-data 2
        0x3bs
        0x3cs
        0x3es
        0x40s
        0x5bs
        0x5cs
        0x5ds
        0x5fs
        0x60s
        0x7es
        0x21s
        0xds
        0x9s
        0x2cs
        0x3as
        0xas
        0x2ds
        0x2es
        0x24s
        0x2fs
        0x22s
        0x7cs
        0x2as
        0x28s
        0x29s
        0x3fs
        0x7bs
        0x7ds
        0x27s
    .end array-data

    nop

    :array_1
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x26s
        0xds
        0x9s
        0x2cs
        0x3as
        0x23s
        0x2ds
        0x2es
        0x24s
        0x2fs
        0x2bs
        0x25s
        0x2as
        0x3ds
        0x5es
    .end array-data
.end method

.method static a([ILjava/lang/String;)Lo/qn;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 100
    new-instance v3, Ljava/lang/StringBuilder;

    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 101
    sget-object v4, Lo/ts;->a:Ljava/nio/charset/Charset;

    .line 103
    const/4 v5, 0x1

    .line 104
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x1

    aget v6, p0, v0

    .line 105
    new-instance v7, Lo/tl;

    invoke-direct {v7}, Lo/tl;-><init>()V

    .line 106
    :goto_0
    const/4 v0, 0x0

    aget v0, p0, v0

    if-ge v5, v0, :cond_1

    .line 107
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 109
    :pswitch_0
    invoke-static {p0, v5, v3}, Lo/ts;->e([IILjava/lang/StringBuilder;)I

    move-result v5

    .line 110
    goto :goto_2

    .line 113
    :pswitch_1
    invoke-static {v6, p0, v4, v5, v3}, Lo/ts;->d(I[ILjava/nio/charset/Charset;ILjava/lang/StringBuilder;)I

    move-result v5

    .line 114
    goto :goto_2

    .line 116
    :pswitch_2
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget v0, p0, v0

    int-to-char v0, v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 117
    goto :goto_2

    .line 119
    :pswitch_3
    invoke-static {p0, v5, v3}, Lo/ts;->b([IILjava/lang/StringBuilder;)I

    move-result v5

    .line 120
    goto :goto_2

    .line 122
    :pswitch_4
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget v0, p0, v0

    .line 123
    invoke-static {v0}, Lo/qo;->e(I)Lo/qo;

    move-result-object v8

    .line 124
    invoke-virtual {v8}, Lo/qo;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v4

    .line 125
    goto :goto_2

    .line 128
    :pswitch_5
    add-int/lit8 v5, v5, 0x2

    .line 129
    goto :goto_2

    .line 132
    :pswitch_6
    add-int/lit8 v5, v5, 0x1

    .line 133
    goto :goto_2

    .line 135
    :pswitch_7
    invoke-static {p0, v5, v7}, Lo/ts;->e([IILo/tl;)I

    move-result v5

    .line 136
    goto :goto_2

    .line 140
    :pswitch_8
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 145
    :goto_1
    :pswitch_9
    add-int/lit8 v5, v5, -0x1

    .line 146
    invoke-static {p0, v5, v3}, Lo/ts;->e([IILjava/lang/StringBuilder;)I

    move-result v5

    .line 149
    :goto_2
    array-length v0, p0

    if-ge v5, v0, :cond_0

    .line 150
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget v6, p0, v0

    goto/16 :goto_0

    .line 152
    :cond_0
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 155
    :cond_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_2

    .line 156
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 158
    :cond_2
    new-instance v8, Lo/qn;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v8, v1, v0, v2, p1}, Lo/qn;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 159
    invoke-virtual {v8, v7}, Lo/qn;->a(Ljava/lang/Object;)V

    .line 160
    return-object v8

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_2
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_9
        :pswitch_8
        :pswitch_8
        :pswitch_1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_7
    .end packed-switch
.end method

.method private static b([IILjava/lang/StringBuilder;)I
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 545
    const/4 v1, 0x0

    .line 546
    const/4 v2, 0x0

    .line 548
    const/16 v0, 0xf

    new-array v3, v0, [I

    .line 550
    :goto_0
    const/4 v0, 0x0

    aget v0, p0, v0

    if-ge p1, v0, :cond_6

    if-nez v2, :cond_6

    .line 551
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget v4, p0, v0

    .line 552
    const/4 v0, 0x0

    aget v0, p0, v0

    if-ne p1, v0, :cond_0

    .line 553
    const/4 v2, 0x1

    .line 555
    :cond_0
    const/16 v0, 0x384

    if-ge v4, v0, :cond_1

    .line 556
    aput v4, v3, v1

    .line 557
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 559
    :cond_1
    const/16 v0, 0x384

    if-eq v4, v0, :cond_2

    const/16 v0, 0x385

    if-eq v4, v0, :cond_2

    const/16 v0, 0x39c

    if-eq v4, v0, :cond_2

    const/16 v0, 0x3a0

    if-eq v4, v0, :cond_2

    const/16 v0, 0x39b

    if-eq v4, v0, :cond_2

    const/16 v0, 0x39a

    if-ne v4, v0, :cond_3

    .line 565
    :cond_2
    add-int/lit8 p1, p1, -0x1

    .line 566
    const/4 v2, 0x1

    .line 569
    :cond_3
    :goto_1
    rem-int/lit8 v0, v1, 0xf

    if-eqz v0, :cond_4

    const/16 v0, 0x386

    if-eq v4, v0, :cond_4

    if-eqz v2, :cond_5

    .line 576
    :cond_4
    if-lez v1, :cond_5

    .line 577
    invoke-static {v3, v1}, Lo/ts;->b([II)Ljava/lang/String;

    move-result-object v5

    .line 578
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 579
    const/4 v1, 0x0

    .line 582
    :cond_5
    goto/16 :goto_0

    .line 583
    :cond_6
    return p1
.end method

.method private static b([II)Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 630
    sget-object v3, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 631
    const/4 v4, 0x0

    :goto_0
    if-ge v4, p1, :cond_0

    .line 632
    sget-object v0, Lo/ts;->b:[Ljava/math/BigInteger;

    sub-int v1, p1, v4

    add-int/lit8 v1, v1, -0x1

    aget-object v0, v0, v1

    aget v1, p0, v4

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    .line 631
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 634
    :cond_0
    invoke-virtual {v3}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object v4

    .line 635
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x31

    if-eq v0, v1, :cond_1

    .line 636
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 638
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static b([I[IILjava/lang/StringBuilder;)V
    .locals 7

    .line 294
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    .line 295
    sget-object v3, Lo/ts$a;->e:Lo/ts$a;

    .line 296
    const/4 v4, 0x0

    .line 297
    :goto_0
    if-ge v4, p2, :cond_1d

    .line 298
    aget v5, p0, v4

    .line 299
    const/4 v6, 0x0

    .line 300
    sget-object v0, Lo/ts$3;->e:[I

    invoke-virtual {v2}, Lo/ts$a;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 303
    :pswitch_0
    const/16 v0, 0x1a

    if-ge v5, v0, :cond_0

    .line 305
    add-int/lit8 v0, v5, 0x41

    int-to-char v6, v0

    goto/16 :goto_1

    .line 307
    :cond_0
    const/16 v0, 0x1a

    if-ne v5, v0, :cond_1

    .line 308
    const/16 v6, 0x20

    goto/16 :goto_1

    .line 309
    :cond_1
    const/16 v0, 0x1b

    if-ne v5, v0, :cond_2

    .line 310
    sget-object v2, Lo/ts$a;->b:Lo/ts$a;

    goto/16 :goto_1

    .line 311
    :cond_2
    const/16 v0, 0x1c

    if-ne v5, v0, :cond_3

    .line 312
    sget-object v2, Lo/ts$a;->d:Lo/ts$a;

    goto/16 :goto_1

    .line 313
    :cond_3
    const/16 v0, 0x1d

    if-ne v5, v0, :cond_4

    .line 315
    move-object v3, v2

    .line 316
    sget-object v2, Lo/ts$a;->f:Lo/ts$a;

    goto/16 :goto_1

    .line 317
    :cond_4
    const/16 v0, 0x391

    if-ne v5, v0, :cond_5

    .line 318
    aget v0, p1, v4

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 319
    :cond_5
    const/16 v0, 0x384

    if-ne v5, v0, :cond_1b

    .line 320
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto/16 :goto_1

    .line 327
    :pswitch_1
    const/16 v0, 0x1a

    if-ge v5, v0, :cond_6

    .line 328
    add-int/lit8 v0, v5, 0x61

    int-to-char v6, v0

    goto/16 :goto_1

    .line 330
    :cond_6
    const/16 v0, 0x1a

    if-ne v5, v0, :cond_7

    .line 331
    const/16 v6, 0x20

    goto/16 :goto_1

    .line 332
    :cond_7
    const/16 v0, 0x1b

    if-ne v5, v0, :cond_8

    .line 334
    move-object v3, v2

    .line 335
    sget-object v2, Lo/ts$a;->a:Lo/ts$a;

    goto/16 :goto_1

    .line 336
    :cond_8
    const/16 v0, 0x1c

    if-ne v5, v0, :cond_9

    .line 337
    sget-object v2, Lo/ts$a;->d:Lo/ts$a;

    goto/16 :goto_1

    .line 338
    :cond_9
    const/16 v0, 0x1d

    if-ne v5, v0, :cond_a

    .line 340
    move-object v3, v2

    .line 341
    sget-object v2, Lo/ts$a;->f:Lo/ts$a;

    goto/16 :goto_1

    .line 342
    :cond_a
    const/16 v0, 0x391

    if-ne v5, v0, :cond_b

    .line 344
    aget v0, p1, v4

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 345
    :cond_b
    const/16 v0, 0x384

    if-ne v5, v0, :cond_1b

    .line 346
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto/16 :goto_1

    .line 353
    :pswitch_2
    const/16 v0, 0x19

    if-ge v5, v0, :cond_c

    .line 354
    sget-object v0, Lo/ts;->d:[C

    aget-char v6, v0, v5

    goto/16 :goto_1

    .line 356
    :cond_c
    const/16 v0, 0x19

    if-ne v5, v0, :cond_d

    .line 357
    sget-object v2, Lo/ts$a;->c:Lo/ts$a;

    goto/16 :goto_1

    .line 358
    :cond_d
    const/16 v0, 0x1a

    if-ne v5, v0, :cond_e

    .line 359
    const/16 v6, 0x20

    goto/16 :goto_1

    .line 360
    :cond_e
    const/16 v0, 0x1b

    if-ne v5, v0, :cond_f

    .line 361
    sget-object v2, Lo/ts$a;->b:Lo/ts$a;

    goto/16 :goto_1

    .line 362
    :cond_f
    const/16 v0, 0x1c

    if-ne v5, v0, :cond_10

    .line 363
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto/16 :goto_1

    .line 364
    :cond_10
    const/16 v0, 0x1d

    if-ne v5, v0, :cond_11

    .line 366
    move-object v3, v2

    .line 367
    sget-object v2, Lo/ts$a;->f:Lo/ts$a;

    goto/16 :goto_1

    .line 368
    :cond_11
    const/16 v0, 0x391

    if-ne v5, v0, :cond_12

    .line 369
    aget v0, p1, v4

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 370
    :cond_12
    const/16 v0, 0x384

    if-ne v5, v0, :cond_1b

    .line 371
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto/16 :goto_1

    .line 378
    :pswitch_3
    const/16 v0, 0x1d

    if-ge v5, v0, :cond_13

    .line 379
    sget-object v0, Lo/ts;->c:[C

    aget-char v6, v0, v5

    goto/16 :goto_1

    .line 381
    :cond_13
    const/16 v0, 0x1d

    if-ne v5, v0, :cond_14

    .line 382
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto/16 :goto_1

    .line 383
    :cond_14
    const/16 v0, 0x391

    if-ne v5, v0, :cond_15

    .line 384
    aget v0, p1, v4

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_1

    .line 385
    :cond_15
    const/16 v0, 0x384

    if-ne v5, v0, :cond_1b

    .line 386
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto :goto_1

    .line 393
    :pswitch_4
    move-object v2, v3

    .line 394
    const/16 v0, 0x1a

    if-ge v5, v0, :cond_16

    .line 395
    add-int/lit8 v0, v5, 0x41

    int-to-char v6, v0

    goto :goto_1

    .line 397
    :cond_16
    const/16 v0, 0x1a

    if-ne v5, v0, :cond_17

    .line 398
    const/16 v6, 0x20

    goto :goto_1

    .line 399
    :cond_17
    const/16 v0, 0x384

    if-ne v5, v0, :cond_1b

    .line 400
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto :goto_1

    .line 407
    :pswitch_5
    move-object v2, v3

    .line 408
    const/16 v0, 0x1d

    if-ge v5, v0, :cond_18

    .line 409
    sget-object v0, Lo/ts;->c:[C

    aget-char v6, v0, v5

    goto :goto_1

    .line 411
    :cond_18
    const/16 v0, 0x1d

    if-ne v5, v0, :cond_19

    .line 412
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    goto :goto_1

    .line 413
    :cond_19
    const/16 v0, 0x391

    if-ne v5, v0, :cond_1a

    .line 416
    aget v0, p1, v4

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 417
    :cond_1a
    const/16 v0, 0x384

    if-ne v5, v0, :cond_1b

    .line 418
    sget-object v2, Lo/ts$a;->e:Lo/ts$a;

    .line 423
    :cond_1b
    :goto_1
    if-eqz v6, :cond_1c

    .line 425
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 427
    :cond_1c
    add-int/lit8 v4, v4, 0x1

    .line 428
    goto/16 :goto_0

    .line 429
    :cond_1d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static d(I[ILjava/nio/charset/Charset;ILjava/lang/StringBuilder;)I
    .locals 12

    .line 448
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 449
    const/16 v0, 0x385

    if-ne p0, v0, :cond_7

    .line 452
    const/4 v5, 0x0

    .line 453
    const-wide/16 v6, 0x0

    .line 454
    const/4 v0, 0x6

    new-array v8, v0, [I

    .line 455
    const/4 v9, 0x0

    .line 456
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget v10, p1, v0

    .line 457
    :cond_0
    :goto_0
    const/4 v0, 0x0

    aget v0, p1, v0

    if-ge p3, v0, :cond_4

    if-nez v9, :cond_4

    .line 458
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aput v10, v8, v0

    .line 460
    const-wide/16 v0, 0x384

    mul-long/2addr v0, v6

    int-to-long v2, v10

    add-long v6, v0, v2

    .line 461
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget v10, p1, v0

    .line 463
    const/16 v0, 0x384

    if-eq v10, v0, :cond_1

    const/16 v0, 0x385

    if-eq v10, v0, :cond_1

    const/16 v0, 0x386

    if-eq v10, v0, :cond_1

    const/16 v0, 0x39c

    if-eq v10, v0, :cond_1

    const/16 v0, 0x3a0

    if-eq v10, v0, :cond_1

    const/16 v0, 0x39b

    if-eq v10, v0, :cond_1

    const/16 v0, 0x39a

    if-ne v10, v0, :cond_2

    .line 470
    :cond_1
    add-int/lit8 p3, p3, -0x1

    .line 471
    const/4 v9, 0x1

    goto :goto_0

    .line 473
    :cond_2
    rem-int/lit8 v0, v5, 0x5

    if-nez v0, :cond_0

    if-lez v5, :cond_0

    .line 476
    const/4 v11, 0x0

    :goto_1
    const/4 v0, 0x6

    if-ge v11, v0, :cond_3

    .line 477
    rsub-int/lit8 v0, v11, 0x5

    mul-int/lit8 v0, v0, 0x8

    shr-long v0, v6, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 476
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 479
    :cond_3
    const-wide/16 v6, 0x0

    .line 480
    const/4 v5, 0x0

    goto/16 :goto_0

    .line 486
    :cond_4
    const/4 v0, 0x0

    aget v0, p1, v0

    if-ne p3, v0, :cond_5

    const/16 v0, 0x384

    if-ge v10, v0, :cond_5

    .line 487
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aput v10, v8, v0

    .line 493
    :cond_5
    const/4 v11, 0x0

    :goto_2
    if-ge v11, v5, :cond_6

    .line 494
    aget v0, v8, v11

    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 493
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 497
    :cond_6
    goto/16 :goto_6

    :cond_7
    const/16 v0, 0x39c

    if-ne p0, v0, :cond_d

    .line 500
    const/4 v5, 0x0

    .line 501
    const-wide/16 v6, 0x0

    .line 502
    const/4 v8, 0x0

    .line 503
    :goto_3
    const/4 v0, 0x0

    aget v0, p1, v0

    if-ge p3, v0, :cond_d

    if-nez v8, :cond_d

    .line 504
    move v0, p3

    add-int/lit8 p3, p3, 0x1

    aget v9, p1, v0

    .line 505
    const/16 v0, 0x384

    if-ge v9, v0, :cond_8

    .line 506
    add-int/lit8 v5, v5, 0x1

    .line 508
    const-wide/16 v0, 0x384

    mul-long/2addr v0, v6

    int-to-long v2, v9

    add-long v6, v0, v2

    goto :goto_4

    .line 510
    :cond_8
    const/16 v0, 0x384

    if-eq v9, v0, :cond_9

    const/16 v0, 0x385

    if-eq v9, v0, :cond_9

    const/16 v0, 0x386

    if-eq v9, v0, :cond_9

    const/16 v0, 0x39c

    if-eq v9, v0, :cond_9

    const/16 v0, 0x3a0

    if-eq v9, v0, :cond_9

    const/16 v0, 0x39b

    if-eq v9, v0, :cond_9

    const/16 v0, 0x39a

    if-ne v9, v0, :cond_a

    .line 517
    :cond_9
    add-int/lit8 p3, p3, -0x1

    .line 518
    const/4 v8, 0x1

    .line 521
    :cond_a
    :goto_4
    rem-int/lit8 v0, v5, 0x5

    if-nez v0, :cond_c

    if-lez v5, :cond_c

    .line 524
    const/4 v10, 0x0

    :goto_5
    const/4 v0, 0x6

    if-ge v10, v0, :cond_b

    .line 525
    rsub-int/lit8 v0, v10, 0x5

    mul-int/lit8 v0, v0, 0x8

    shr-long v0, v6, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    invoke-virtual {v4, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 524
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 527
    :cond_b
    const-wide/16 v6, 0x0

    .line 528
    const/4 v5, 0x0

    .line 530
    :cond_c
    goto/16 :goto_3

    .line 532
    :cond_d
    :goto_6
    new-instance v0, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    invoke-direct {v0, v1, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    move-object/from16 v1, p4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    return p3
.end method

.method private static e([IILjava/lang/StringBuilder;)I
    .locals 7

    .line 224
    const/4 v0, 0x0

    aget v0, p0, v0

    sub-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0x2

    new-array v2, v0, [I

    .line 226
    const/4 v0, 0x0

    aget v0, p0, v0

    sub-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0x2

    new-array v3, v0, [I

    .line 228
    const/4 v4, 0x0

    .line 229
    const/4 v5, 0x0

    .line 230
    :goto_0
    const/4 v0, 0x0

    aget v0, p0, v0

    if-ge p1, v0, :cond_1

    if-nez v5, :cond_1

    .line 231
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget v6, p0, v0

    .line 232
    const/16 v0, 0x384

    if-ge v6, v0, :cond_0

    .line 233
    div-int/lit8 v0, v6, 0x1e

    aput v0, v2, v4

    .line 234
    add-int/lit8 v0, v4, 0x1

    rem-int/lit8 v1, v6, 0x1e

    aput v1, v2, v0

    .line 235
    add-int/lit8 v4, v4, 0x2

    goto/16 :goto_1

    .line 237
    :cond_0
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_1

    .line 240
    :pswitch_0
    move v0, v4

    add-int/lit8 v4, v4, 0x1

    const/16 v1, 0x384

    aput v1, v2, v0

    .line 241
    goto :goto_1

    .line 248
    :pswitch_1
    add-int/lit8 p1, p1, -0x1

    .line 249
    const/4 v5, 0x1

    .line 250
    goto :goto_1

    .line 258
    :pswitch_2
    const/16 v0, 0x391

    aput v0, v2, v4

    .line 259
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget v6, p0, v0

    .line 260
    aput v6, v3, v4

    .line 261
    add-int/lit8 v4, v4, 0x1

    .line 265
    :goto_1
    :pswitch_3
    goto/16 :goto_0

    .line 266
    :cond_1
    invoke-static {v2, v3, v4, p2}, Lo/ts;->b([I[IILjava/lang/StringBuilder;)V

    .line 267
    return p1

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_1
    .end packed-switch
.end method

.method private static e([IILo/tl;)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 165
    add-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    aget v1, p0, v1

    if-le v0, v1, :cond_0

    .line 167
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 169
    :cond_0
    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 170
    const/4 v3, 0x0

    :goto_0
    const/4 v0, 0x2

    if-ge v3, v0, :cond_1

    .line 171
    aget v0, p0, p1

    aput v0, v2, v3

    .line 170
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 173
    :cond_1
    const/4 v0, 0x2

    invoke-static {v2, v0}, Lo/ts;->b([II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lo/tl;->c(I)V

    .line 176
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 177
    invoke-static {p0, p1, v3}, Lo/ts;->e([IILjava/lang/StringBuilder;)I

    move-result p1

    .line 178
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/tl;->d(Ljava/lang/String;)V

    .line 180
    aget v0, p0, p1

    const/16 v1, 0x39b

    if-ne v0, v1, :cond_4

    .line 181
    add-int/lit8 p1, p1, 0x1

    .line 182
    const/4 v0, 0x0

    aget v0, p0, v0

    sub-int/2addr v0, p1

    new-array v4, v0, [I

    .line 183
    const/4 v5, 0x0

    .line 185
    const/4 v6, 0x0

    .line 186
    :goto_1
    const/4 v0, 0x0

    aget v0, p0, v0

    if-ge p1, v0, :cond_3

    if-nez v6, :cond_3

    .line 187
    move v0, p1

    add-int/lit8 p1, p1, 0x1

    aget v7, p0, v0

    .line 188
    const/16 v0, 0x384

    if-ge v7, v0, :cond_2

    .line 189
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aput v7, v4, v0

    goto :goto_3

    .line 191
    :cond_2
    sparse-switch v7, :sswitch_data_0

    goto :goto_2

    .line 193
    :sswitch_0
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/tl;->e(Z)V

    .line 194
    add-int/lit8 p1, p1, 0x1

    .line 195
    const/4 v6, 0x1

    .line 196
    goto :goto_3

    .line 198
    :goto_2
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 201
    :goto_3
    goto :goto_1

    .line 203
    :cond_3
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/tl;->a([I)V

    .line 204
    goto :goto_4

    :cond_4
    aget v0, p0, p1

    const/16 v1, 0x39a

    if-ne v0, v1, :cond_5

    .line 205
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lo/tl;->e(Z)V

    .line 206
    add-int/lit8 p1, p1, 0x1

    .line 209
    :cond_5
    :goto_4
    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x39a -> :sswitch_0
    .end sparse-switch
.end method
