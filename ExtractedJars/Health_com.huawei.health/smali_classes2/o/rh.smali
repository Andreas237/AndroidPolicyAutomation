.class final Lo/rh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/rh$e;
    }
.end annotation


# static fields
.field private static final a:[C

.field private static final b:[C

.field private static final c:[C

.field private static final d:[C

.field private static final e:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 53
    const/16 v0, 0x28

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/rh;->d:[C

    .line 59
    const/16 v0, 0x1b

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lo/rh;->e:[C

    .line 68
    const/16 v0, 0x28

    new-array v0, v0, [C

    fill-array-data v0, :array_2

    sput-object v0, Lo/rh;->b:[C

    .line 75
    sget-object v0, Lo/rh;->e:[C

    sput-object v0, Lo/rh;->a:[C

    .line 77
    const/16 v0, 0x20

    new-array v0, v0, [C

    fill-array-data v0, :array_3

    sput-object v0, Lo/rh;->c:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x2as
        0x2as
        0x2as
        0x20s
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
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
    .end array-data

    :array_1
    .array-data 2
        0x21s
        0x22s
        0x23s
        0x24s
        0x25s
        0x26s
        0x27s
        0x28s
        0x29s
        0x2as
        0x2bs
        0x2cs
        0x2ds
        0x2es
        0x2fs
        0x3as
        0x3bs
        0x3cs
        0x3ds
        0x3es
        0x3fs
        0x40s
        0x5bs
        0x5cs
        0x5ds
        0x5es
        0x5fs
    .end array-data

    nop

    :array_2
    .array-data 2
        0x2as
        0x2as
        0x2as
        0x20s
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
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
    .end array-data

    :array_3
    .array-data 2
        0x60s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x7bs
        0x7cs
        0x7ds
        0x7es
        0x7fs
    .end array-data
.end method

.method private static a(II)I
    .locals 4

    .line 492
    mul-int/lit16 v0, p1, 0x95

    rem-int/lit16 v0, v0, 0xff

    add-int/lit8 v2, v0, 0x1

    .line 493
    sub-int v3, p0, v2

    .line 494
    if-ltz v3, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    add-int/lit16 v0, v3, 0x100

    :goto_0
    return v0
.end method

.method static a([B)Lo/qn;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 86
    new-instance v4, Lo/qp;

    invoke-direct {v4, p0}, Lo/qp;-><init>([B)V

    .line 87
    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v0, 0x64

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 88
    new-instance v6, Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 89
    new-instance v7, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 90
    sget-object v8, Lo/rh$e;->c:Lo/rh$e;

    .line 92
    :cond_0
    sget-object v0, Lo/rh$e;->c:Lo/rh$e;

    if-ne v8, v0, :cond_1

    .line 93
    invoke-static {v4, v5, v6}, Lo/rh;->a(Lo/qp;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)Lo/rh$e;

    move-result-object v8

    goto :goto_2

    .line 95
    :cond_1
    sget-object v0, Lo/rh$3;->c:[I

    invoke-virtual {v8}, Lo/rh$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 97
    :pswitch_0
    invoke-static {v4, v5}, Lo/rh;->e(Lo/qp;Ljava/lang/StringBuilder;)V

    .line 98
    goto :goto_1

    .line 100
    :pswitch_1
    invoke-static {v4, v5}, Lo/rh;->b(Lo/qp;Ljava/lang/StringBuilder;)V

    .line 101
    goto :goto_1

    .line 103
    :pswitch_2
    invoke-static {v4, v5}, Lo/rh;->a(Lo/qp;Ljava/lang/StringBuilder;)V

    .line 104
    goto :goto_1

    .line 106
    :pswitch_3
    invoke-static {v4, v5}, Lo/rh;->c(Lo/qp;Ljava/lang/StringBuilder;)V

    .line 107
    goto :goto_1

    .line 109
    :pswitch_4
    invoke-static {v4, v5, v7}, Lo/rh;->a(Lo/qp;Ljava/lang/StringBuilder;Ljava/util/Collection;)V

    .line 110
    goto :goto_1

    .line 112
    :goto_0
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 114
    :goto_1
    sget-object v8, Lo/rh$e;->c:Lo/rh$e;

    .line 116
    :goto_2
    sget-object v0, Lo/rh$e;->e:Lo/rh$e;

    if-eq v8, v0, :cond_2

    invoke-virtual {v4}, Lo/qp;->c()I

    move-result v0

    if-gtz v0, :cond_0

    .line 117
    :cond_2
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    .line 118
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 120
    :cond_3
    new-instance v0, Lo/qn;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    goto :goto_3

    :cond_4
    move-object v2, v7

    :goto_3
    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, Lo/qn;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static a(Lo/qp;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;)Lo/rh$e;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 129
    const/4 v2, 0x0

    .line 131
    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v3

    .line 132
    if-nez v3, :cond_1

    .line 133
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 134
    :cond_1
    const/16 v0, 0x80

    if-gt v3, v0, :cond_3

    .line 135
    if-eqz v2, :cond_2

    .line 136
    add-int/lit16 v3, v3, 0x80

    .line 139
    :cond_2
    add-int/lit8 v0, v3, -0x1

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 140
    sget-object v0, Lo/rh$e;->c:Lo/rh$e;

    return-object v0

    .line 141
    :cond_3
    const/16 v0, 0x81

    if-ne v3, v0, :cond_4

    .line 142
    sget-object v0, Lo/rh$e;->e:Lo/rh$e;

    return-object v0

    .line 143
    :cond_4
    const/16 v0, 0xe5

    if-gt v3, v0, :cond_6

    .line 144
    add-int/lit16 v4, v3, -0x82

    .line 145
    const/16 v0, 0xa

    if-ge v4, v0, :cond_5

    .line 146
    const/16 v0, 0x30

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    :cond_5
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    goto/16 :goto_0

    :cond_6
    const/16 v0, 0xe6

    if-ne v3, v0, :cond_7

    .line 150
    sget-object v0, Lo/rh$e;->d:Lo/rh$e;

    return-object v0

    .line 151
    :cond_7
    const/16 v0, 0xe7

    if-ne v3, v0, :cond_8

    .line 152
    sget-object v0, Lo/rh$e;->i:Lo/rh$e;

    return-object v0

    .line 153
    :cond_8
    const/16 v0, 0xe8

    if-ne v3, v0, :cond_9

    .line 155
    const/16 v0, 0x1d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    .line 156
    :cond_9
    const/16 v0, 0xe9

    if-eq v3, v0, :cond_13

    const/16 v0, 0xea

    if-ne v3, v0, :cond_a

    goto/16 :goto_0

    .line 160
    :cond_a
    const/16 v0, 0xeb

    if-ne v3, v0, :cond_b

    .line 161
    const/4 v2, 0x1

    goto/16 :goto_0

    .line 162
    :cond_b
    const/16 v0, 0xec

    if-ne v3, v0, :cond_c

    .line 163
    const-string v0, "[)>\u001e05\u001d"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    const-string v0, "\u001e\u0004"

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 165
    :cond_c
    const/16 v0, 0xed

    if-ne v3, v0, :cond_d

    .line 166
    const-string v0, "[)>\u001e06\u001d"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    const-string v0, "\u001e\u0004"

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 168
    :cond_d
    const/16 v0, 0xee

    if-ne v3, v0, :cond_e

    .line 169
    sget-object v0, Lo/rh$e;->a:Lo/rh$e;

    return-object v0

    .line 170
    :cond_e
    const/16 v0, 0xef

    if-ne v3, v0, :cond_f

    .line 171
    sget-object v0, Lo/rh$e;->b:Lo/rh$e;

    return-object v0

    .line 172
    :cond_f
    const/16 v0, 0xf0

    if-ne v3, v0, :cond_10

    .line 173
    sget-object v0, Lo/rh$e;->k:Lo/rh$e;

    return-object v0

    .line 174
    :cond_10
    const/16 v0, 0xf1

    if-ne v3, v0, :cond_11

    goto :goto_0

    .line 178
    :cond_11
    const/16 v0, 0xf2

    if-lt v3, v0, :cond_13

    .line 180
    const/16 v0, 0xfe

    if-ne v3, v0, :cond_12

    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    if-eqz v0, :cond_13

    .line 181
    :cond_12
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 184
    :cond_13
    :goto_0
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    if-gtz v0, :cond_0

    .line 185
    sget-object v0, Lo/rh$e;->c:Lo/rh$e;

    return-object v0
.end method

.method private static a(Lo/qp;Ljava/lang/StringBuilder;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 371
    const/4 v0, 0x3

    new-array v2, v0, [I

    .line 374
    :cond_0
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 375
    return-void

    .line 377
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v3

    .line 378
    const/16 v0, 0xfe

    if-ne v3, v0, :cond_2

    .line 379
    return-void

    .line 382
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v0

    invoke-static {v3, v0, v2}, Lo/rh;->c(II[I)V

    .line 384
    const/4 v4, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v4, v0, :cond_9

    .line 385
    aget v5, v2, v4

    .line 386
    if-nez v5, :cond_3

    .line 387
    const/16 v0, 0xd

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 388
    :cond_3
    const/4 v0, 0x1

    if-ne v5, v0, :cond_4

    .line 389
    const/16 v0, 0x2a

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 390
    :cond_4
    const/4 v0, 0x2

    if-ne v5, v0, :cond_5

    .line 391
    const/16 v0, 0x3e

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 392
    :cond_5
    const/4 v0, 0x3

    if-ne v5, v0, :cond_6

    .line 393
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 394
    :cond_6
    const/16 v0, 0xe

    if-ge v5, v0, :cond_7

    .line 395
    add-int/lit8 v0, v5, 0x2c

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 396
    :cond_7
    const/16 v0, 0x28

    if-ge v5, v0, :cond_8

    .line 397
    add-int/lit8 v0, v5, 0x33

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 399
    :cond_8
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 384
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 402
    :cond_9
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    if-gtz v0, :cond_0

    .line 403
    return-void
.end method

.method private static a(Lo/qp;Ljava/lang/StringBuilder;Ljava/util/Collection;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/qp;Ljava/lang/StringBuilder;Ljava/util/Collection<[B>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 454
    invoke-virtual {p0}, Lo/qp;->a()I

    move-result v0

    add-int/lit8 v3, v0, 0x1

    .line 455
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v0

    move v1, v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v0, v1}, Lo/rh;->a(II)I

    move-result v4

    .line 457
    if-nez v4, :cond_0

    .line 458
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    div-int/lit8 v5, v0, 0x8

    goto :goto_0

    .line 459
    :cond_0
    const/16 v0, 0xfa

    if-ge v4, v0, :cond_1

    .line 460
    move v5, v4

    goto :goto_0

    .line 462
    :cond_1
    add-int/lit16 v0, v4, -0xf9

    mul-int/lit16 v0, v0, 0xfa

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lo/qp;->b(I)I

    move-result v1

    move v2, v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v1, v2}, Lo/rh;->a(II)I

    move-result v1

    add-int v5, v0, v1

    .line 466
    :goto_0
    if-gez v5, :cond_2

    .line 467
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 470
    :cond_2
    new-array v6, v5, [B

    .line 471
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v5, :cond_4

    .line 474
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0x8

    if-ge v0, v1, :cond_3

    .line 475
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 477
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v0

    move v1, v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v0, v1}, Lo/rh;->a(II)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v6, v7

    .line 471
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 479
    :cond_4
    invoke-interface {p2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 481
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "ISO8859_1"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 484
    goto :goto_2

    .line 482
    :catch_0
    move-exception v7

    .line 483
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Platform does not support required encoding: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 485
    :goto_2
    return-void
.end method

.method private static b(Lo/qp;Ljava/lang/StringBuilder;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 280
    const/4 v2, 0x0

    .line 282
    const/4 v0, 0x3

    new-array v3, v0, [I

    .line 283
    const/4 v4, 0x0

    .line 286
    :cond_0
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 287
    return-void

    .line 289
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v5

    .line 290
    const/16 v0, 0xfe

    if-ne v5, v0, :cond_2

    .line 291
    return-void

    .line 294
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v0

    invoke-static {v5, v0, v3}, Lo/rh;->c(II[I)V

    .line 296
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v6, v0, :cond_d

    .line 297
    aget v7, v3, v6

    .line 298
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_6

    .line 300
    :pswitch_0
    const/4 v0, 0x3

    if-ge v7, v0, :cond_3

    .line 301
    add-int/lit8 v4, v7, 0x1

    goto/16 :goto_7

    .line 302
    :cond_3
    sget-object v0, Lo/rh;->b:[C

    array-length v0, v0

    if-ge v7, v0, :cond_5

    .line 303
    sget-object v0, Lo/rh;->b:[C

    aget-char v8, v0, v7

    .line 304
    if-eqz v2, :cond_4

    .line 305
    add-int/lit16 v0, v8, 0x80

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 306
    const/4 v2, 0x0

    goto :goto_1

    .line 308
    :cond_4
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 310
    :goto_1
    goto/16 :goto_7

    .line 311
    :cond_5
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 315
    :pswitch_1
    if-eqz v2, :cond_6

    .line 316
    add-int/lit16 v0, v7, 0x80

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 317
    const/4 v2, 0x0

    goto :goto_2

    .line 319
    :cond_6
    int-to-char v0, v7

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 321
    :goto_2
    const/4 v4, 0x0

    .line 322
    goto/16 :goto_7

    .line 325
    :pswitch_2
    sget-object v0, Lo/rh;->a:[C

    array-length v0, v0

    if-ge v7, v0, :cond_8

    .line 326
    sget-object v0, Lo/rh;->a:[C

    aget-char v8, v0, v7

    .line 327
    if-eqz v2, :cond_7

    .line 328
    add-int/lit16 v0, v8, 0x80

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 329
    const/4 v2, 0x0

    goto :goto_3

    .line 331
    :cond_7
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 333
    :goto_3
    goto :goto_4

    :cond_8
    const/16 v0, 0x1b

    if-ne v7, v0, :cond_9

    .line 334
    const/16 v0, 0x1d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 335
    :cond_9
    const/16 v0, 0x1e

    if-ne v7, v0, :cond_a

    .line 336
    const/4 v2, 0x1

    goto :goto_4

    .line 338
    :cond_a
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 340
    :goto_4
    const/4 v4, 0x0

    .line 341
    goto :goto_7

    .line 343
    :pswitch_3
    sget-object v0, Lo/rh;->c:[C

    array-length v0, v0

    if-ge v7, v0, :cond_c

    .line 344
    sget-object v0, Lo/rh;->c:[C

    aget-char v8, v0, v7

    .line 345
    if-eqz v2, :cond_b

    .line 346
    add-int/lit16 v0, v8, 0x80

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 347
    const/4 v2, 0x0

    goto :goto_5

    .line 349
    :cond_b
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 351
    :goto_5
    const/4 v4, 0x0

    .line 352
    goto :goto_7

    .line 353
    :cond_c
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 357
    :goto_6
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 296
    :goto_7
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 360
    :cond_d
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    if-gtz v0, :cond_0

    .line 361
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static c(II[I)V
    .locals 4

    .line 406
    shl-int/lit8 v0, p0, 0x8

    add-int/2addr v0, p1

    add-int/lit8 v2, v0, -0x1

    .line 407
    div-int/lit16 v3, v2, 0x640

    .line 408
    const/4 v0, 0x0

    aput v3, p2, v0

    .line 409
    mul-int/lit16 v0, v3, 0x640

    sub-int/2addr v2, v0

    .line 410
    div-int/lit8 v3, v2, 0x28

    .line 411
    const/4 v0, 0x1

    aput v3, p2, v0

    .line 412
    mul-int/lit8 v0, v3, 0x28

    sub-int v0, v2, v0

    const/4 v1, 0x2

    aput v0, p2, v1

    .line 413
    return-void
.end method

.method private static c(Lo/qp;Ljava/lang/StringBuilder;)V
    .locals 5

    .line 421
    :cond_0
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0x10

    if-gt v0, v1, :cond_1

    .line 422
    return-void

    .line 425
    :cond_1
    const/4 v2, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v2, v0, :cond_5

    .line 426
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v3

    .line 429
    const/16 v0, 0x1f

    if-ne v3, v0, :cond_3

    .line 431
    invoke-virtual {p0}, Lo/qp;->e()I

    move-result v0

    rsub-int/lit8 v4, v0, 0x8

    .line 432
    const/16 v0, 0x8

    if-eq v4, v0, :cond_2

    .line 433
    invoke-virtual {p0, v4}, Lo/qp;->b(I)I

    .line 435
    :cond_2
    return-void

    .line 438
    :cond_3
    and-int/lit8 v0, v3, 0x20

    if-nez v0, :cond_4

    .line 439
    or-int/lit8 v3, v3, 0x40

    .line 441
    :cond_4
    int-to-char v0, v3

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 425
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 443
    :cond_5
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    if-gtz v0, :cond_0

    .line 444
    return-void
.end method

.method private static e(Lo/qp;Ljava/lang/StringBuilder;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 195
    const/4 v2, 0x0

    .line 197
    const/4 v0, 0x3

    new-array v3, v0, [I

    .line 198
    const/4 v4, 0x0

    .line 202
    :cond_0
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 203
    return-void

    .line 205
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v5

    .line 206
    const/16 v0, 0xfe

    if-ne v5, v0, :cond_2

    .line 207
    return-void

    .line 210
    :cond_2
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v0

    invoke-static {v5, v0, v3}, Lo/rh;->c(II[I)V

    .line 212
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v6, v0, :cond_c

    .line 213
    aget v7, v3, v6

    .line 214
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_6

    .line 216
    :pswitch_0
    const/4 v0, 0x3

    if-ge v7, v0, :cond_3

    .line 217
    add-int/lit8 v4, v7, 0x1

    goto/16 :goto_7

    .line 218
    :cond_3
    sget-object v0, Lo/rh;->d:[C

    array-length v0, v0

    if-ge v7, v0, :cond_5

    .line 219
    sget-object v0, Lo/rh;->d:[C

    aget-char v8, v0, v7

    .line 220
    if-eqz v2, :cond_4

    .line 221
    add-int/lit16 v0, v8, 0x80

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    const/4 v2, 0x0

    goto :goto_1

    .line 224
    :cond_4
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 226
    :goto_1
    goto/16 :goto_7

    .line 227
    :cond_5
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 231
    :pswitch_1
    if-eqz v2, :cond_6

    .line 232
    add-int/lit16 v0, v7, 0x80

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 233
    const/4 v2, 0x0

    goto :goto_2

    .line 235
    :cond_6
    int-to-char v0, v7

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 237
    :goto_2
    const/4 v4, 0x0

    .line 238
    goto/16 :goto_7

    .line 240
    :pswitch_2
    sget-object v0, Lo/rh;->e:[C

    array-length v0, v0

    if-ge v7, v0, :cond_8

    .line 241
    sget-object v0, Lo/rh;->e:[C

    aget-char v8, v0, v7

    .line 242
    if-eqz v2, :cond_7

    .line 243
    add-int/lit16 v0, v8, 0x80

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 244
    const/4 v2, 0x0

    goto :goto_3

    .line 246
    :cond_7
    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 248
    :goto_3
    goto :goto_4

    :cond_8
    const/16 v0, 0x1b

    if-ne v7, v0, :cond_9

    .line 249
    const/16 v0, 0x1d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_4

    .line 250
    :cond_9
    const/16 v0, 0x1e

    if-ne v7, v0, :cond_a

    .line 251
    const/4 v2, 0x1

    goto :goto_4

    .line 253
    :cond_a
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 255
    :goto_4
    const/4 v4, 0x0

    .line 256
    goto :goto_7

    .line 258
    :pswitch_3
    if-eqz v2, :cond_b

    .line 259
    add-int/lit16 v0, v7, 0xe0

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 260
    const/4 v2, 0x0

    goto :goto_5

    .line 262
    :cond_b
    add-int/lit8 v0, v7, 0x60

    int-to-char v0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 264
    :goto_5
    const/4 v4, 0x0

    .line 265
    goto :goto_7

    .line 267
    :goto_6
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 212
    :goto_7
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 270
    :cond_c
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    if-gtz v0, :cond_0

    .line 271
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
