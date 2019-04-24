.class public Lo/cyr;
.super Lo/cyv;
.source "SourceFile"


# instance fields
.field private c:I

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 63
    invoke-direct {p0}, Lo/cyv;-><init>()V

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyr;->d:Landroid/content/Context;

    .line 25
    const/4 v0, -0x1

    iput v0, p0, Lo/cyr;->c:I

    .line 64
    iput-object p1, p0, Lo/cyr;->d:Landroid/content/Context;

    .line 65
    iput p2, p0, Lo/cyr;->c:I

    .line 66
    return-void
.end method

.method private c(I[BLjava/util/ArrayList;)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BLjava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 169
    const/4 v2, 0x0

    .line 170
    move/from16 v0, p1

    const/16 v1, 0x7f

    if-gt v0, v1, :cond_0

    .line 171
    const/4 v2, 0x1

    goto :goto_0

    .line 172
    :cond_0
    move/from16 v0, p1

    const/16 v1, 0x3fff

    if-gt v0, v1, :cond_1

    .line 173
    const/4 v2, 0x2

    goto :goto_0

    .line 174
    :cond_1
    move/from16 v0, p1

    const v1, 0x1fbf81

    if-gt v0, v1, :cond_2

    .line 175
    const/4 v2, 0x3

    goto :goto_0

    .line 177
    :cond_2
    return-void

    .line 181
    :goto_0
    move-object/from16 v0, p0

    iget v0, v0, Lo/cyr;->c:I

    add-int/lit8 v0, v0, -0x1

    sub-int/2addr v0, v2

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v3, v0, -0x2

    .line 184
    rem-int v0, p1, v3

    if-lez v0, :cond_3

    div-int v0, p1, v3

    add-int/lit8 v4, v0, 0x1

    goto :goto_1

    :cond_3
    div-int v4, p1, v3

    .line 185
    :goto_1
    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_7

    .line 186
    move v6, v3

    .line 187
    add-int/lit8 v0, v4, -0x1

    if-ne v5, v0, :cond_4

    .line 189
    mul-int v0, v5, v3

    sub-int v6, p1, v0

    .line 193
    :cond_4
    mul-int v7, v5, v3

    .line 194
    add-int v8, v7, v6

    .line 195
    move-object/from16 v0, p2

    invoke-static {v0, v7, v8}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v9

    .line 198
    array-length v0, v9

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/cyr;->d(I)[B

    move-result-object v10

    .line 199
    array-length v11, v10

    .line 200
    array-length v12, v9

    .line 201
    add-int/lit8 v0, v11, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v12

    add-int/lit8 v13, v0, 0x2

    .line 205
    invoke-static {v13}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v14

    .line 207
    add-int/lit8 v0, v13, -0x2

    new-array v15, v0, [B

    .line 210
    const/16 v0, -0x56

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 211
    const/16 v0, -0x56

    const/4 v1, 0x0

    aput-byte v0, v15, v1

    .line 214
    invoke-virtual {v14, v10}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 215
    const/16 v16, 0x0

    :goto_3
    array-length v0, v10

    move/from16 v1, v16

    if-ge v1, v0, :cond_5

    .line 217
    add-int/lit8 v0, v16, 0x1

    aget-byte v1, v10, v16

    aput-byte v1, v15, v0

    .line 215
    add-int/lit8 v16, v16, 0x1

    goto :goto_3

    .line 221
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 222
    add-int/lit8 v0, v11, 0x1

    const/4 v1, 0x0

    aput-byte v1, v15, v0

    .line 225
    int-to-byte v0, v4

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 226
    add-int/lit8 v0, v11, 0x1

    add-int/lit8 v0, v0, 0x1

    int-to-byte v1, v4

    aput-byte v1, v15, v0

    .line 229
    add-int/lit8 v0, v5, 0x1

    int-to-byte v0, v0

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 230
    add-int/lit8 v0, v11, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v5, 0x1

    int-to-byte v1, v1

    aput-byte v1, v15, v0

    .line 233
    invoke-virtual {v14, v9}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 234
    add-int/lit8 v0, v11, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v16, v0, 0x1

    .line 236
    const/16 v17, 0x0

    :goto_4
    array-length v0, v9

    move/from16 v1, v17

    if-ge v1, v0, :cond_6

    .line 237
    aget-byte v0, v9, v17

    aput-byte v0, v15, v16

    .line 238
    add-int/lit8 v16, v16, 0x1

    .line 236
    add-int/lit8 v17, v17, 0x1

    goto :goto_4

    .line 242
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cyr;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-virtual {v0, v15}, Lo/cxq;->b([B)[B

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 244
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 247
    invoke-virtual {v14}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    .line 249
    :cond_7
    return-void
.end method

.method private d(I)[B
    .locals 7

    .line 74
    const-string v2, ""

    .line 76
    add-int/lit8 v3, p1, 0x3

    .line 78
    const/16 v0, 0x4000

    if-gt v0, v3, :cond_0

    .line 81
    shr-int/lit8 v0, v3, 0xe

    add-int/lit16 v4, v0, 0x80

    .line 83
    shr-int/lit8 v0, v3, 0x7

    add-int/lit16 v5, v0, 0x80

    .line 85
    and-int/lit8 v6, v3, 0x7f

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v6}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 88
    goto :goto_0

    :cond_0
    const/16 v0, 0x80

    if-gt v0, v3, :cond_1

    .line 91
    shr-int/lit8 v0, v3, 0x7

    add-int/lit16 v4, v0, 0x80

    .line 92
    and-int/lit8 v5, v3, 0x7f

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 95
    goto :goto_0

    .line 97
    :cond_1
    invoke-static {v3}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v2

    .line 100
    :goto_0
    invoke-static {v2}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method private e([B)I
    .locals 12

    .line 287
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 288
    const/4 v6, 0x0

    .line 289
    const/4 v7, 0x0

    .line 290
    const/4 v8, 0x0

    .line 291
    const/4 v9, 0x0

    .line 292
    const/4 v10, 0x2

    .line 293
    const/4 v11, 0x0

    .line 296
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    .line 297
    const-string v0, "01"

    const-string v1, "BTDeviceV1ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "start responseHex len is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 298
    const/4 v0, 0x0

    return v0

    .line 301
    :cond_0
    add-int/lit8 v0, v10, 0x2

    invoke-virtual {v5, v10, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    const/16 v1, 0x7f

    if-le v0, v1, :cond_1

    .line 304
    add-int/lit8 v0, v10, 0x2

    invoke-virtual {v5, v10, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 305
    sparse-switch v11, :sswitch_data_0

    goto :goto_0

    .line 307
    :sswitch_0
    add-int/lit8 v6, v9, -0x80

    .line 308
    goto :goto_0

    .line 310
    :sswitch_1
    add-int/lit8 v7, v9, -0x80

    .line 311
    .line 315
    :goto_0
    add-int/lit8 v10, v10, 0x2

    .line 316
    add-int/lit8 v11, v11, 0x1

    .line 318
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v10, 0x2

    if-ge v0, v1, :cond_0

    .line 319
    const-string v0, "01"

    const-string v1, "BTDeviceV1ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "parse responseHex len is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 320
    const/4 v0, 0x0

    return v0

    .line 326
    :cond_1
    add-int/lit8 v0, v10, 0x2

    invoke-virtual {v5, v10, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 328
    const/4 v0, 0x2

    if-ne v0, v11, :cond_2

    .line 330
    mul-int/lit16 v0, v6, 0x4000

    mul-int/lit16 v1, v7, 0x80

    add-int/2addr v0, v1

    add-int v8, v0, v9

    goto :goto_1

    .line 331
    :cond_2
    const/4 v0, 0x1

    if-ne v0, v11, :cond_3

    .line 333
    mul-int/lit16 v0, v6, 0x80

    add-int v8, v0, v9

    goto :goto_1

    .line 335
    :cond_3
    move v8, v9

    .line 338
    :goto_1
    return v8

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method private e(I[BLjava/util/ArrayList;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BLjava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 111
    invoke-direct {p0, p1}, Lo/cyr;->d(I)[B

    move-result-object v2

    .line 112
    array-length v3, v2

    .line 114
    add-int/lit8 v0, v3, 0x4

    add-int/2addr v0, p1

    add-int/lit8 v4, v0, 0x2

    .line 116
    invoke-static {v4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 118
    add-int/lit8 v0, v4, -0x2

    new-array v6, v0, [B

    .line 121
    const/16 v0, -0x56

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 122
    const/16 v0, -0x56

    const/4 v1, 0x0

    aput-byte v0, v6, v1

    .line 125
    invoke-virtual {v5, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 126
    const/4 v7, 0x0

    :goto_0
    array-length v0, v2

    if-ge v7, v0, :cond_0

    .line 128
    add-int/lit8 v0, v7, 0x1

    aget-byte v1, v2, v7

    aput-byte v1, v6, v0

    .line 126
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 132
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 133
    add-int/lit8 v0, v3, 0x1

    const/4 v1, 0x0

    aput-byte v1, v6, v0

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 137
    add-int/lit8 v0, v3, 0x1

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput-byte v1, v6, v0

    .line 140
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 141
    add-int/lit8 v0, v3, 0x1

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    aput-byte v1, v6, v0

    .line 144
    invoke-virtual {v5, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 145
    add-int/lit8 v7, v3, 0x4

    .line 147
    const/4 v8, 0x0

    :goto_1
    array-length v0, p2

    if-ge v8, v0, :cond_1

    .line 148
    aget-byte v0, p2, v8

    aput-byte v0, v6, v7

    .line 149
    add-int/lit8 v7, v7, 0x1

    .line 147
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 153
    :cond_1
    iget-object v0, p0, Lo/cyr;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cxq;->b([B)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 155
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 158
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    return-void
.end method


# virtual methods
.method public a(I[B)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)Ljava/util/List<Lo/cyh;>;"
        }
    .end annotation

    .line 349
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 351
    move-object/from16 v0, p2

    invoke-direct {p0, v0}, Lo/cyr;->e([B)I

    move-result v6

    .line 353
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 354
    const-string v0, "01"

    const-string v1, "BTDeviceV1ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "dataTotalLen = 0."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 355
    const/4 v0, 0x0

    return-object v0

    .line 359
    :cond_0
    const/4 v7, 0x0

    .line 360
    const/4 v8, 0x0

    .line 361
    const/4 v9, 0x0

    .line 363
    const/16 v0, 0x4000

    if-gt v0, v6, :cond_1

    .line 365
    const/4 v7, 0x5

    .line 367
    const/4 v8, 0x6

    .line 369
    const/4 v9, 0x3

    goto :goto_0

    .line 370
    :cond_1
    const/16 v0, 0x80

    if-gt v0, v6, :cond_2

    .line 372
    const/4 v7, 0x4

    .line 374
    const/4 v8, 0x5

    .line 376
    const/4 v9, 0x2

    goto :goto_0

    .line 379
    :cond_2
    const/4 v7, 0x3

    .line 381
    const/4 v8, 0x4

    .line 383
    const/4 v9, 0x1

    .line 386
    :goto_0
    const/4 v10, 0x0

    .line 387
    const/4 v0, 0x0

    aget-byte v0, p2, v0

    const/16 v1, -0x56

    if-ne v1, v0, :cond_4

    .line 389
    add-int/lit8 v11, v9, 0x4

    .line 390
    add-int/lit8 v12, p1, -0x2

    .line 392
    if-le v12, v11, :cond_3

    move-object/from16 v0, p2

    array-length v0, v0

    if-le v0, v12, :cond_3

    .line 393
    move-object/from16 v0, p2

    invoke-static {v0, v11, v12}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v10

    goto :goto_1

    .line 395
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceV1ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "dataTotalLen = 0."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 396
    const/4 v0, 0x0

    return-object v0

    .line 403
    :cond_4
    :goto_1
    move-object/from16 v0, p2

    array-length v0, v0

    if-gt v0, v7, :cond_5

    .line 404
    const-string v0, "01"

    const-string v1, "BTDeviceV1ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "dataContent.length less than pack_total_position so return null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 405
    const/4 v0, 0x0

    return-object v0

    .line 409
    :cond_5
    aget-byte v11, p2, v7

    .line 410
    new-instance v12, Lo/cyh;

    invoke-direct {v12}, Lo/cyh;-><init>()V

    .line 412
    const/4 v0, 0x1

    if-ne v0, v11, :cond_6

    .line 414
    const/4 v0, 0x0

    iput-boolean v0, v12, Lo/cyh;->d:Z

    .line 415
    iput-object v10, v12, Lo/cyh;->a:[B

    goto :goto_2

    .line 417
    :cond_6
    const/4 v0, 0x1

    iput-boolean v0, v12, Lo/cyh;->d:Z

    .line 420
    move-object/from16 v0, p2

    array-length v0, v0

    if-gt v0, v8, :cond_7

    .line 421
    const-string v0, "01"

    const-string v1, "BTDeviceV1ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "dataContent length less than pack_index_position."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 422
    const/4 v0, 0x0

    return-object v0

    .line 427
    :cond_7
    aget-byte v13, p2, v8

    .line 429
    iput v6, v12, Lo/cyh;->c:I

    .line 431
    iput-object v10, v12, Lo/cyh;->a:[B

    .line 433
    if-ne v11, v13, :cond_8

    .line 434
    const/4 v0, 0x1

    iput-boolean v0, v12, Lo/cyh;->e:Z

    goto :goto_2

    .line 437
    :cond_8
    const/4 v0, 0x0

    iput-boolean v0, v12, Lo/cyh;->e:Z

    .line 441
    :goto_2
    invoke-interface {v5, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 442
    return-object v5
.end method

.method public b(I[B)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)Ljava/util/ArrayList<[B>;"
        }
    .end annotation

    .line 258
    if-lez p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 259
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 263
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 265
    invoke-direct {p0, p1}, Lo/cyr;->d(I)[B

    move-result-object v3

    .line 266
    array-length v4, v3

    .line 268
    add-int/lit8 v0, v4, 0x4

    add-int/2addr v0, p1

    add-int/lit8 v5, v0, 0x2

    .line 270
    iget v0, p0, Lo/cyr;->c:I

    if-gt v5, v0, :cond_2

    .line 272
    invoke-direct {p0, p1, p2, v2}, Lo/cyr;->e(I[BLjava/util/ArrayList;)V

    goto :goto_0

    .line 275
    :cond_2
    invoke-direct {p0, p1, p2, v2}, Lo/cyr;->c(I[BLjava/util/ArrayList;)V

    .line 278
    :goto_0
    return-object v2
.end method
