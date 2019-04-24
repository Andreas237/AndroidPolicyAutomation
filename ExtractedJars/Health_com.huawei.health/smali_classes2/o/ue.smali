.class final Lo/ue;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 45
    const/16 v0, 0x2d

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lo/ue;->d:[C

    return-void

    :array_0
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
        0x20s
        0x24s
        0x25s
        0x2as
        0x2bs
        0x2ds
        0x2es
        0x2fs
        0x3as
    .end array-data
.end method

.method private static a(Lo/qp;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 336
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v2

    .line 337
    and-int/lit16 v0, v2, 0x80

    if-nez v0, :cond_0

    .line 339
    and-int/lit8 v0, v2, 0x7f

    return v0

    .line 341
    :cond_0
    and-int/lit16 v0, v2, 0xc0

    const/16 v1, 0x80

    if-ne v0, v1, :cond_1

    .line 343
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v3

    .line 344
    and-int/lit8 v0, v2, 0x3f

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v3

    return v0

    .line 346
    :cond_1
    and-int/lit16 v0, v2, 0xe0

    const/16 v1, 0xc0

    if-ne v0, v1, :cond_2

    .line 348
    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v3

    .line 349
    and-int/lit8 v0, v2, 0x1f

    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v3

    return v0

    .line 351
    :cond_2
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0
.end method

.method private static a(Lo/qp;Ljava/lang/StringBuilder;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 145
    mul-int/lit8 v0, p2, 0xd

    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 146
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 151
    :cond_0
    mul-int/lit8 v0, p2, 0x2

    new-array v2, v0, [B

    .line 152
    const/4 v3, 0x0

    .line 153
    :goto_0
    if-lez p2, :cond_2

    .line 155
    const/16 v0, 0xd

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v4

    .line 156
    div-int/lit8 v0, v4, 0x60

    shl-int/lit8 v0, v0, 0x8

    rem-int/lit8 v1, v4, 0x60

    or-int v5, v0, v1

    .line 157
    const/16 v0, 0x3bf

    if-ge v5, v0, :cond_1

    .line 159
    const v0, 0xa1a1

    add-int/2addr v5, v0

    goto :goto_1

    .line 162
    :cond_1
    const v0, 0xa6a1

    add-int/2addr v5, v0

    .line 164
    :goto_1
    shr-int/lit8 v0, v5, 0x8

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v2, v3

    .line 165
    add-int/lit8 v0, v3, 0x1

    and-int/lit16 v1, v5, 0xff

    int-to-byte v1, v1

    aput-byte v1, v2, v0

    .line 166
    add-int/lit8 v3, v3, 0x2

    .line 167
    add-int/lit8 p2, p2, -0x1

    .line 168
    goto :goto_0

    .line 171
    :cond_2
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "GB2312"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    goto :goto_2

    .line 172
    :catch_0
    move-exception v4

    .line 173
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 175
    :goto_2
    return-void
.end method

.method private static b(Lo/qp;Ljava/lang/StringBuilder;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 181
    mul-int/lit8 v0, p2, 0xd

    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 182
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 187
    :cond_0
    mul-int/lit8 v0, p2, 0x2

    new-array v2, v0, [B

    .line 188
    const/4 v3, 0x0

    .line 189
    :goto_0
    if-lez p2, :cond_2

    .line 191
    const/16 v0, 0xd

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v4

    .line 192
    div-int/lit16 v0, v4, 0xc0

    shl-int/lit8 v0, v0, 0x8

    rem-int/lit16 v1, v4, 0xc0

    or-int v5, v0, v1

    .line 193
    const/16 v0, 0x1f00

    if-ge v5, v0, :cond_1

    .line 195
    const v0, 0x8140

    add-int/2addr v5, v0

    goto :goto_1

    .line 198
    :cond_1
    const v0, 0xc140

    add-int/2addr v5, v0

    .line 200
    :goto_1
    shr-int/lit8 v0, v5, 0x8

    int-to-byte v0, v0

    aput-byte v0, v2, v3

    .line 201
    add-int/lit8 v0, v3, 0x1

    int-to-byte v1, v5

    aput-byte v1, v2, v0

    .line 202
    add-int/lit8 v3, v3, 0x2

    .line 203
    add-int/lit8 p2, p2, -0x1

    .line 204
    goto :goto_0

    .line 207
    :cond_2
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "SJIS"

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 210
    goto :goto_2

    .line 208
    :catch_0
    move-exception v4

    .line 209
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 211
    :goto_2
    return-void
.end method

.method private static c(I)C
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 248
    sget-object v0, Lo/ue;->d:[C

    array-length v0, v0

    if-lt p0, v0, :cond_0

    .line 249
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 251
    :cond_0
    sget-object v0, Lo/ue;->d:[C

    aget-char v0, v0, p0

    return v0
.end method

.method static d([BLo/un;Lo/ul;Ljava/util/Map;)Lo/qn;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BLo/un;Lo/ul;Ljava/util/Map<Lo/og;*>;)Lo/qn;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 60
    new-instance v7, Lo/qp;

    move-object/from16 v0, p0

    invoke-direct {v7, v0}, Lo/qp;-><init>([B)V

    .line 61
    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v0, 0x32

    invoke-direct {v8, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 62
    new-instance v9, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {v9, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    const/4 v10, -0x1

    .line 64
    const/4 v11, -0x1

    .line 67
    const/4 v12, 0x0

    .line 68
    const/4 v13, 0x0

    .line 72
    :cond_0
    :try_start_0
    invoke-virtual {v7}, Lo/qp;->c()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_1

    .line 74
    sget-object v14, Lo/uk;->b:Lo/uk;

    goto :goto_0

    .line 76
    :cond_1
    const/4 v0, 0x4

    invoke-virtual {v7, v0}, Lo/qp;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/uk;->d(I)Lo/uk;

    move-result-object v14

    .line 78
    :goto_0
    sget-object v0, Lo/uk;->b:Lo/uk;

    if-eq v14, v0, :cond_e

    .line 79
    sget-object v0, Lo/uk;->k:Lo/uk;

    if-eq v14, v0, :cond_2

    sget-object v0, Lo/uk;->g:Lo/uk;

    if-ne v14, v0, :cond_3

    .line 81
    :cond_2
    const/4 v13, 0x1

    goto/16 :goto_1

    .line 82
    :cond_3
    sget-object v0, Lo/uk;->e:Lo/uk;

    if-ne v14, v0, :cond_5

    .line 83
    invoke-virtual {v7}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_4

    .line 84
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 88
    :cond_4
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Lo/qp;->b(I)I

    move-result v10

    .line 89
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Lo/qp;->b(I)I

    move-result v11

    goto/16 :goto_1

    .line 90
    :cond_5
    sget-object v0, Lo/uk;->f:Lo/uk;

    if-ne v14, v0, :cond_7

    .line 92
    invoke-static {v7}, Lo/ue;->a(Lo/qp;)I

    move-result v15

    .line 93
    invoke-static {v15}, Lo/qo;->e(I)Lo/qo;

    move-result-object v12

    .line 94
    if-nez v12, :cond_6

    .line 95
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 97
    :cond_6
    goto/16 :goto_1

    .line 99
    :cond_7
    sget-object v0, Lo/uk;->h:Lo/uk;

    if-ne v14, v0, :cond_9

    .line 101
    const/4 v0, 0x4

    invoke-virtual {v7, v0}, Lo/qp;->b(I)I

    move-result v15

    .line 102
    move-object/from16 v0, p1

    invoke-virtual {v14, v0}, Lo/uk;->b(Lo/un;)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/qp;->b(I)I

    move-result v16

    .line 103
    const/4 v0, 0x1

    if-ne v15, v0, :cond_8

    .line 104
    move/from16 v0, v16

    invoke-static {v7, v8, v0}, Lo/ue;->a(Lo/qp;Ljava/lang/StringBuilder;I)V

    .line 106
    :cond_8
    goto :goto_1

    .line 109
    :cond_9
    move-object/from16 v0, p1

    invoke-virtual {v14, v0}, Lo/uk;->b(Lo/un;)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/qp;->b(I)I

    move-result v15

    .line 110
    sget-object v0, Lo/uk;->a:Lo/uk;

    if-ne v14, v0, :cond_a

    .line 111
    invoke-static {v7, v8, v15}, Lo/ue;->e(Lo/qp;Ljava/lang/StringBuilder;I)V

    goto :goto_1

    .line 112
    :cond_a
    sget-object v0, Lo/uk;->d:Lo/uk;

    if-ne v14, v0, :cond_b

    .line 113
    invoke-static {v7, v8, v15, v13}, Lo/ue;->e(Lo/qp;Ljava/lang/StringBuilder;IZ)V

    goto :goto_1

    .line 114
    :cond_b
    sget-object v0, Lo/uk;->c:Lo/uk;

    if-ne v14, v0, :cond_c

    .line 115
    move-object v0, v7

    move-object v1, v8

    move v2, v15

    move-object v3, v12

    move-object v4, v9

    move-object/from16 v5, p3

    invoke-static/range {v0 .. v5}, Lo/ue;->e(Lo/qp;Ljava/lang/StringBuilder;ILo/qo;Ljava/util/Collection;Ljava/util/Map;)V

    goto :goto_1

    .line 116
    :cond_c
    sget-object v0, Lo/uk;->i:Lo/uk;

    if-ne v14, v0, :cond_d

    .line 117
    invoke-static {v7, v8, v15}, Lo/ue;->b(Lo/qp;Ljava/lang/StringBuilder;I)V

    goto :goto_1

    .line 119
    :cond_d
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 124
    :cond_e
    :goto_1
    sget-object v0, Lo/uk;->b:Lo/uk;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v14, v0, :cond_0

    .line 128
    goto :goto_2

    .line 125
    :catch_0
    move-exception v12

    .line 127
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 130
    :goto_2
    new-instance v0, Lo/qn;

    .line 131
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 132
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    const/4 v3, 0x0

    goto :goto_3

    :cond_f
    move-object v3, v9

    :goto_3
    if-nez p2, :cond_10

    const/4 v4, 0x0

    goto :goto_4

    .line 133
    :cond_10
    invoke-virtual/range {p2 .. p2}, Lo/ul;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_4
    move-object/from16 v1, p0

    move v5, v10

    move v6, v11

    invoke-direct/range {v0 .. v6}, Lo/qn;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;II)V

    return-object v0
.end method

.method private static e(Lo/qp;Ljava/lang/StringBuilder;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 297
    :goto_0
    const/4 v0, 0x3

    if-lt p2, v0, :cond_2

    .line 299
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    .line 300
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 302
    :cond_0
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v2

    .line 303
    const/16 v0, 0x3e8

    if-lt v2, v0, :cond_1

    .line 304
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 306
    :cond_1
    div-int/lit8 v0, v2, 0x64

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 307
    div-int/lit8 v0, v2, 0xa

    rem-int/lit8 v0, v0, 0xa

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 308
    rem-int/lit8 v0, v2, 0xa

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 309
    add-int/lit8 p2, p2, -0x3

    .line 310
    goto :goto_0

    .line 311
    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_5

    .line 313
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/4 v1, 0x7

    if-ge v0, v1, :cond_3

    .line 314
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 316
    :cond_3
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v2

    .line 317
    const/16 v0, 0x64

    if-lt v2, v0, :cond_4

    .line 318
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 320
    :cond_4
    div-int/lit8 v0, v2, 0xa

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 321
    rem-int/lit8 v0, v2, 0xa

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 322
    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_8

    .line 324
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_6

    .line 325
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 327
    :cond_6
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v2

    .line 328
    const/16 v0, 0xa

    if-lt v2, v0, :cond_7

    .line 329
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 331
    :cond_7
    invoke-static {v2}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 333
    :cond_8
    :goto_1
    return-void
.end method

.method private static e(Lo/qp;Ljava/lang/StringBuilder;ILo/qo;Ljava/util/Collection;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/qp;Ljava/lang/StringBuilder;ILo/qo;Ljava/util/Collection<[B>;Ljava/util/Map<Lo/og;*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 220
    mul-int/lit8 v0, p2, 0x8

    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v1

    if-le v0, v1, :cond_0

    .line 221
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 224
    :cond_0
    new-array v2, p2, [B

    .line 225
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_1

    .line 226
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v2, v3

    .line 225
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 229
    :cond_1
    if-nez p3, :cond_2

    .line 235
    invoke-static {v2, p5}, Lo/qy;->e([BLjava/util/Map;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    .line 237
    :cond_2
    invoke-virtual {p3}, Lo/qo;->name()Ljava/lang/String;

    move-result-object v3

    .line 240
    :goto_1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 243
    goto :goto_2

    .line 241
    :catch_0
    move-exception v4

    .line 242
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 244
    :goto_2
    invoke-interface {p4, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 245
    return-void
.end method

.method private static e(Lo/qp;Ljava/lang/StringBuilder;IZ)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/of;
        }
    .end annotation

    .line 259
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    .line 260
    :goto_0
    const/4 v0, 0x1

    if-le p2, v0, :cond_1

    .line 261
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    .line 262
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 264
    :cond_0
    const/16 v0, 0xb

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v3

    .line 265
    div-int/lit8 v0, v3, 0x2d

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 266
    rem-int/lit8 v0, v3, 0x2d

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 267
    add-int/lit8 p2, p2, -0x2

    .line 268
    goto :goto_0

    .line 269
    :cond_1
    const/4 v0, 0x1

    if-ne p2, v0, :cond_3

    .line 271
    invoke-virtual {p0}, Lo/qp;->c()I

    move-result v0

    const/4 v1, 0x6

    if-ge v0, v1, :cond_2

    .line 272
    invoke-static {}, Lo/of;->b()Lo/of;

    move-result-object v0

    throw v0

    .line 274
    :cond_2
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lo/qp;->b(I)I

    move-result v0

    invoke-static {v0}, Lo/ue;->c(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 277
    :cond_3
    if-eqz p3, :cond_6

    .line 279
    move v3, v2

    :goto_1
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-ge v3, v0, :cond_6

    .line 280
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    const/16 v1, 0x25

    if-ne v0, v1, :cond_5

    .line 281
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ge v3, v0, :cond_4

    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v0

    const/16 v1, 0x25

    if-ne v0, v1, :cond_4

    .line 283
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 286
    :cond_4
    const/16 v0, 0x1d

    invoke-virtual {p1, v3, v0}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    .line 279
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 291
    :cond_6
    return-void
.end method
