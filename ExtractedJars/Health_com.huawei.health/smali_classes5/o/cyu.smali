.class public Lo/cyu;
.super Lo/cyv;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private d:I

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 61
    invoke-direct {p0}, Lo/cyv;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cyu;->e:Landroid/content/Context;

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Lo/cyu;->a:I

    .line 51
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->b:I

    .line 53
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->d:I

    .line 62
    iput-object p1, p0, Lo/cyu;->e:Landroid/content/Context;

    .line 63
    iput p2, p0, Lo/cyu;->a:I

    .line 64
    return-void
.end method

.method private a(I[BLjava/util/ArrayList;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BLjava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 125
    iget v0, p0, Lo/cyu;->a:I

    add-int/lit8 v0, v0, -0x4

    add-int/lit8 v0, v0, -0x1

    add-int/lit8 v2, v0, -0x2

    .line 127
    rem-int v0, p1, v2

    if-lez v0, :cond_0

    div-int v0, p1, v2

    add-int/lit8 v3, v0, 0x1

    goto :goto_0

    :cond_0
    div-int v3, p1, v2

    .line 128
    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_6

    .line 129
    move v5, v2

    .line 130
    add-int/lit8 v0, v3, -0x1

    if-ne v4, v0, :cond_1

    .line 132
    mul-int v0, v4, v2

    sub-int v5, p1, v0

    .line 136
    :cond_1
    mul-int v6, v4, v2

    .line 137
    add-int v7, v6, v5

    .line 138
    move-object/from16 v0, p2

    invoke-static {v0, v6, v7}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v8

    .line 141
    add-int/lit8 v0, v5, 0x1

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v9

    .line 143
    add-int/lit8 v0, v5, 0x5

    add-int/lit8 v10, v0, 0x2

    .line 145
    invoke-static {v10}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v11

    .line 147
    add-int/lit8 v0, v10, -0x2

    new-array v12, v0, [B

    .line 150
    const/16 v0, 0x5a

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 151
    const/16 v0, 0x5a

    const/4 v1, 0x0

    aput-byte v0, v12, v1

    .line 154
    invoke-virtual {v11, v9}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 155
    const/4 v13, 0x0

    :goto_2
    array-length v0, v9

    if-ge v13, v0, :cond_2

    .line 157
    add-int/lit8 v0, v13, 0x1

    aget-byte v1, v9, v13

    aput-byte v1, v12, v0

    .line 155
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    .line 161
    :cond_2
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 163
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 164
    const/4 v0, 0x1

    const/4 v1, 0x3

    aput-byte v0, v12, v1

    goto :goto_3

    .line 166
    :cond_3
    add-int/lit8 v0, v3, -0x1

    if-ne v4, v0, :cond_4

    .line 168
    const/4 v0, 0x3

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 169
    const/4 v0, 0x3

    const/4 v1, 0x3

    aput-byte v0, v12, v1

    goto :goto_3

    .line 173
    :cond_4
    const/4 v0, 0x2

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 174
    const/4 v0, 0x2

    const/4 v1, 0x3

    aput-byte v0, v12, v1

    .line 178
    :goto_3
    int-to-byte v0, v4

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 179
    int-to-byte v0, v4

    const/4 v1, 0x4

    aput-byte v0, v12, v1

    .line 182
    invoke-virtual {v11, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 183
    const/4 v13, 0x5

    .line 185
    const/4 v14, 0x0

    :goto_4
    array-length v0, v8

    if-ge v14, v0, :cond_5

    .line 186
    aget-byte v0, v8, v14

    aput-byte v0, v12, v13

    .line 187
    add-int/lit8 v13, v13, 0x1

    .line 185
    add-int/lit8 v14, v14, 0x1

    goto :goto_4

    .line 191
    :cond_5
    iget-object v0, p0, Lo/cyu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-virtual {v0, v12}, Lo/cxq;->b([B)[B

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 193
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 196
    invoke-virtual {v11}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_1

    .line 198
    :cond_6
    return-void
.end method

.method private e(I[BLjava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[BLjava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 76
    add-int/lit8 v0, p1, 0x1

    invoke-static {v0}, Lo/czx;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v2

    .line 78
    add-int/lit8 v0, p1, 0x4

    add-int/lit8 v3, v0, 0x2

    .line 80
    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 82
    add-int/lit8 v0, v3, -0x2

    new-array v5, v0, [B

    .line 85
    const/16 v0, 0x5a

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 86
    const/16 v0, 0x5a

    const/4 v1, 0x0

    aput-byte v0, v5, v1

    .line 89
    invoke-virtual {v4, v2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 90
    const/4 v6, 0x0

    :goto_0
    array-length v0, v2

    if-ge v6, v0, :cond_0

    .line 92
    add-int/lit8 v0, v6, 0x1

    aget-byte v1, v2, v6

    aput-byte v1, v5, v0

    .line 90
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 96
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 97
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput-byte v0, v5, v1

    .line 100
    invoke-virtual {v4, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 101
    const/4 v6, 0x4

    .line 103
    const/4 v7, 0x0

    :goto_1
    array-length v0, p2

    if-ge v7, v0, :cond_1

    .line 104
    aget-byte v0, p2, v7

    aput-byte v0, v5, v6

    .line 105
    add-int/lit8 v6, v6, 0x1

    .line 103
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 109
    :cond_1
    iget-object v0, p0, Lo/cyu;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cxq;->d(Landroid/content/Context;)Lo/cxq;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/cxq;->b([B)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 111
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 114
    invoke-virtual {v4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    return-void
.end method


# virtual methods
.method public a(I[B)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)Ljava/util/List<Lo/cyh;>;"
        }
    .end annotation

    .line 234
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter parseResponsePacket()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 237
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 239
    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v6

    .line 241
    const/4 v7, 0x2

    .line 242
    const/4 v8, 0x6

    .line 243
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v8, :cond_0

    .line 244
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDataContentHex length is invalid with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 245
    return-object v5

    .line 249
    :cond_0
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 251
    add-int/lit8 v0, v9, 0x3

    add-int/lit8 v0, v0, 0x2

    move/from16 v1, p1

    if-ne v0, v1, :cond_5

    .line 252
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Single package."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 254
    new-instance v10, Lo/cyh;

    invoke-direct {v10}, Lo/cyh;-><init>()V

    .line 256
    const/4 v0, 0x0

    aget-byte v0, p2, v0

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_4

    .line 257
    const/4 v11, 0x0

    .line 259
    const/4 v7, 0x6

    .line 260
    const/16 v8, 0x8

    .line 263
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v8, :cond_1

    .line 264
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDataContentHex length is invalid with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 265
    return-object v5

    .line 268
    :cond_1
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    and-int/lit8 v12, v0, 0x3

    .line 269
    const/4 v0, 0x0

    if-ne v0, v12, :cond_2

    .line 274
    const/4 v0, 0x0

    iput-boolean v0, v10, Lo/cyh;->d:Z

    .line 276
    const/4 v7, 0x4

    .line 277
    add-int/lit8 v8, p1, -0x2

    .line 278
    move-object/from16 v0, p2

    invoke-static {v0, v7, v8}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v11

    .line 279
    iput-object v11, v10, Lo/cyh;->a:[B

    .line 281
    const/4 v0, 0x1

    iput-boolean v0, v10, Lo/cyh;->b:Z

    .line 283
    add-int/lit8 v0, v9, -0x1

    iput v0, v10, Lo/cyh;->c:I

    .line 285
    const/4 v0, 0x1

    iput-boolean v0, v10, Lo/cyh;->e:Z

    goto :goto_0

    .line 291
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, v10, Lo/cyh;->d:Z

    .line 293
    const/4 v7, 0x5

    .line 294
    add-int/lit8 v8, p1, -0x2

    .line 295
    move-object/from16 v0, p2

    invoke-static {v0, v7, v8}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v11

    .line 296
    iput-object v11, v10, Lo/cyh;->a:[B

    .line 298
    const/4 v0, 0x1

    iput-boolean v0, v10, Lo/cyh;->b:Z

    .line 300
    add-int/lit8 v0, v9, -0x1

    add-int/lit8 v0, v0, -0x1

    iput v0, v10, Lo/cyh;->c:I

    .line 304
    const/4 v0, 0x3

    if-ne v0, v12, :cond_3

    .line 305
    const/4 v0, 0x1

    iput-boolean v0, v10, Lo/cyh;->e:Z

    goto :goto_0

    .line 307
    :cond_3
    const/4 v0, 0x0

    iput-boolean v0, v10, Lo/cyh;->e:Z

    .line 311
    :goto_0
    invoke-interface {v5, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 312
    return-object v5

    .line 314
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, v10, Lo/cyh;->b:Z

    .line 316
    const/4 v0, 0x0

    return-object v0

    .line 319
    :cond_5
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Multi package."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 321
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 323
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v11

    .line 325
    const/4 v12, 0x0

    .line 327
    const/4 v13, 0x0

    .line 331
    :goto_1
    if-ge v12, v11, :cond_12

    .line 333
    add-int/lit8 v7, v12, 0x2

    .line 334
    add-int/lit8 v8, v12, 0x6

    .line 337
    if-ge v11, v8, :cond_6

    .line 339
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDataContentHex length is invalid for check MFS length with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 341
    invoke-virtual {v6, v12, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cyu;->c:Ljava/lang/String;

    .line 342
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->b:I

    .line 343
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The left data len less then header length with left data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 344
    return-object v5

    .line 348
    :cond_6
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 351
    add-int/lit8 v7, v12, 0x6

    .line 352
    add-int/lit8 v8, v12, 0x8

    .line 355
    if-ge v11, v8, :cond_7

    .line 357
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDataContentHex length is invalid for check MFS length and control with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 359
    invoke-virtual {v6, v12, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cyu;->c:Ljava/lang/String;

    .line 360
    move-object/from16 v0, p0

    iput v9, v0, Lo/cyu;->b:I

    .line 361
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "The left data len less then header length with left data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v4, p0

    iget-object v4, v4, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 362
    return-object v5

    .line 366
    :cond_7
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    and-int/lit8 v15, v0, 0x3

    .line 368
    const/4 v0, 0x0

    if-ne v0, v15, :cond_b

    .line 369
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "controlFSNInfo is single package."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 371
    new-instance v16, Lo/cyh;

    invoke-direct/range {v16 .. v16}, Lo/cyh;-><init>()V

    .line 376
    const/4 v0, 0x0

    move-object/from16 v1, v16

    iput-boolean v0, v1, Lo/cyh;->d:Z

    .line 378
    add-int/lit8 v7, v12, 0x8

    .line 379
    add-int/lit8 v0, v9, 0x3

    mul-int/lit8 v0, v0, 0x2

    add-int v8, v12, v0

    .line 381
    if-le v8, v11, :cond_8

    .line 384
    add-int/lit8 v0, v9, 0x3

    add-int/lit8 v0, v0, 0x2

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->b:I

    .line 386
    invoke-virtual {v6, v12, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cyu;->c:Ljava/lang/String;

    .line 388
    move-object/from16 v0, p0

    iget v0, v0, Lo/cyu;->b:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->d:I

    goto :goto_2

    .line 391
    :cond_8
    if-lt v11, v8, :cond_9

    if-le v7, v8, :cond_a

    .line 392
    :cond_9
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDataContentHex length is invalid for copy common data content with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 393
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->b:I

    .line 394
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->d:I

    .line 395
    const-string v0, ""

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cyu;->c:Ljava/lang/String;

    .line 396
    return-object v5

    .line 399
    :cond_a
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v14

    .line 401
    move-object/from16 v0, v16

    iput-object v14, v0, Lo/cyh;->a:[B

    .line 403
    const/4 v0, 0x1

    move-object/from16 v1, v16

    iput-boolean v0, v1, Lo/cyh;->b:Z

    .line 405
    add-int/lit8 v0, v9, -0x1

    move-object/from16 v1, v16

    iput v0, v1, Lo/cyh;->c:I

    .line 407
    const/4 v0, 0x1

    move-object/from16 v1, v16

    iput-boolean v0, v1, Lo/cyh;->e:Z

    .line 409
    move-object/from16 v0, v16

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 411
    :goto_2
    goto/16 :goto_6

    .line 412
    :cond_b
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "controlFSNInfo is multi package."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 414
    add-int/lit8 v7, v12, 0xa

    .line 415
    add-int/lit8 v0, v9, 0x3

    mul-int/lit8 v0, v0, 0x2

    add-int v8, v12, v0

    .line 418
    add-int/lit8 v0, v8, 0x4

    if-le v0, v11, :cond_c

    .line 419
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "strDataContentHexLen less than endPosition."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 422
    add-int/lit8 v0, v9, 0x3

    add-int/lit8 v0, v0, 0x2

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->b:I

    .line 424
    invoke-virtual {v6, v12, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cyu;->c:Ljava/lang/String;

    .line 426
    move-object/from16 v0, p0

    iget v0, v0, Lo/cyu;->b:I

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->d:I

    goto :goto_3

    .line 429
    :cond_c
    if-lt v11, v8, :cond_d

    if-le v7, v8, :cond_e

    .line 430
    :cond_d
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDataContentHex length is invalid for copy common data content with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 431
    const-string v0, ""

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/cyu;->c:Ljava/lang/String;

    .line 432
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->b:I

    .line 433
    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput v0, v1, Lo/cyu;->d:I

    .line 434
    return-object v5

    .line 438
    :cond_e
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v14

    .line 440
    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 442
    array-length v0, v14

    add-int/2addr v13, v0

    .line 446
    :goto_3
    const/4 v0, 0x3

    if-ne v0, v15, :cond_11

    move-object/from16 v0, p0

    iget v0, v0, Lo/cyu;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_11

    .line 447
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Receive all Tag."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 449
    if-lez v13, :cond_11

    .line 451
    invoke-static {v13}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v16

    .line 453
    const/16 v17, 0x0

    :goto_4
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v17

    if-ge v1, v0, :cond_f

    .line 454
    move/from16 v0, v17

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 453
    add-int/lit8 v17, v17, 0x1

    goto :goto_4

    .line 458
    :cond_f
    new-instance v17, Lo/cyh;

    invoke-direct/range {v17 .. v17}, Lo/cyh;-><init>()V

    .line 460
    invoke-virtual/range {v16 .. v16}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    move-object/from16 v1, v17

    iput-object v0, v1, Lo/cyh;->a:[B

    .line 462
    const/4 v0, 0x1

    move-object/from16 v1, v17

    iput-boolean v0, v1, Lo/cyh;->d:Z

    .line 464
    move-object/from16 v0, v17

    iput v13, v0, Lo/cyh;->c:I

    .line 466
    if-le v8, v11, :cond_10

    .line 467
    const/4 v0, 0x0

    move-object/from16 v1, v17

    iput-boolean v0, v1, Lo/cyh;->e:Z

    goto :goto_5

    .line 469
    :cond_10
    const/4 v0, 0x1

    move-object/from16 v1, v17

    iput-boolean v0, v1, Lo/cyh;->e:Z

    .line 472
    :goto_5
    move-object/from16 v0, v17

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 474
    invoke-interface {v10}, Ljava/util/List;->clear()V

    .line 476
    const/4 v13, 0x0

    .line 482
    :cond_11
    :goto_6
    add-int/lit8 v0, v9, 0x3

    add-int/lit8 v0, v0, 0x2

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v12, v0

    .line 483
    goto/16 :goto_1

    .line 486
    :cond_12
    if-lez v13, :cond_14

    .line 487
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Exist sliced package and not receive last package."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 489
    invoke-static {v13}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v15

    .line 491
    const/16 v16, 0x0

    :goto_7
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    move/from16 v1, v16

    if-ge v1, v0, :cond_13

    .line 492
    move/from16 v0, v16

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-virtual {v15, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 491
    add-int/lit8 v16, v16, 0x1

    goto :goto_7

    .line 495
    :cond_13
    new-instance v16, Lo/cyh;

    invoke-direct/range {v16 .. v16}, Lo/cyh;-><init>()V

    .line 496
    const/4 v0, 0x1

    move-object/from16 v1, v16

    iput-boolean v0, v1, Lo/cyh;->d:Z

    .line 497
    invoke-virtual {v15}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    move-object/from16 v1, v16

    iput-object v0, v1, Lo/cyh;->a:[B

    .line 498
    move-object/from16 v0, v16

    iput v13, v0, Lo/cyh;->c:I

    .line 499
    const/4 v0, 0x0

    move-object/from16 v1, v16

    iput-boolean v0, v1, Lo/cyh;->e:Z

    .line 500
    move-object/from16 v0, v16

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 504
    :cond_14
    return-object v5
.end method

.method public b(I[B)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)Ljava/util/ArrayList<[B>;"
        }
    .end annotation

    .line 207
    if-lez p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 208
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 212
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 214
    add-int/lit8 v0, p1, 0x4

    add-int/lit8 v3, v0, 0x2

    .line 216
    iget v0, p0, Lo/cyu;->a:I

    if-gt v3, v0, :cond_2

    .line 218
    invoke-direct {p0, p1, p2, v2}, Lo/cyu;->e(I[BLjava/util/ArrayList;)V

    goto :goto_0

    .line 221
    :cond_2
    invoke-direct {p0, p1, p2, v2}, Lo/cyu;->a(I[BLjava/util/ArrayList;)V

    .line 224
    :goto_0
    return-object v2
.end method

.method public b(I)V
    .locals 0

    .line 611
    iput p1, p0, Lo/cyu;->a:I

    .line 612
    return-void
.end method

.method public c(I[B)Ljava/lang/String;
    .locals 9

    .line 517
    const/4 v0, 0x0

    aget-byte v0, p2, v0

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_2

    iget v0, p0, Lo/cyu;->b:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 520
    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 522
    const/4 v6, 0x2

    .line 523
    const/4 v7, 0x6

    .line 525
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v0, v7, :cond_0

    .line 526
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "strDataContentHex length is invalid with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 527
    const-string v0, ""

    return-object v0

    .line 530
    :cond_0
    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v8

    .line 531
    add-int/lit8 v0, v8, 0x3

    add-int/lit8 v0, v0, 0x2

    array-length v1, p2

    if-le v0, v1, :cond_1

    .line 532
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "data content len less than linkDataLen."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 534
    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    .line 536
    add-int/lit8 v0, v8, 0x1

    add-int/lit8 v0, v0, 0x2

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lo/cyu;->b:I

    .line 537
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mV2TotalDataLen = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyu;->b:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 539
    iget v0, p0, Lo/cyu;->b:I

    array-length v1, p2

    sub-int/2addr v0, v1

    iput v0, p0, Lo/cyu;->d:I

    .line 540
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mV2LeftDataLen = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/cyu;->d:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 543
    :cond_1
    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 545
    :goto_0
    goto/16 :goto_2

    .line 546
    :cond_2
    iget v0, p0, Lo/cyu;->b:I

    if-gtz v0, :cond_3

    .line 547
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->b:I

    .line 548
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->d:I

    .line 549
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mV2TotalDataLen result is 0 return."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 550
    const-string v0, ""

    return-object v0

    .line 555
    :cond_3
    iget v0, p0, Lo/cyu;->b:I

    const/4 v1, 0x6

    if-ge v0, v1, :cond_4

    .line 557
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mV2TotalDataLen less than link header length."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 559
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    .line 560
    iget-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    return-object v0

    .line 563
    :cond_4
    iget v0, p0, Lo/cyu;->d:I

    if-ge p1, v0, :cond_5

    .line 565
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    .line 566
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "data content len less than mV2LeftDataLen."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 568
    iget v0, p0, Lo/cyu;->d:I

    sub-int/2addr v0, p1

    iput v0, p0, Lo/cyu;->d:I

    goto/16 :goto_2

    .line 569
    :cond_5
    iget v0, p0, Lo/cyu;->d:I

    if-ne p1, v0, :cond_6

    .line 570
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "data content len equal mV2LeftDataLen."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 571
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->b:I

    .line 572
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->d:I

    .line 574
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    .line 575
    iget-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    return-object v0

    .line 578
    :cond_6
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "data content len more than mV2LeftDataLen."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 579
    iget v0, p0, Lo/cyu;->d:I

    aget-byte v0, p2, v0

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_7

    .line 580
    iget v0, p0, Lo/cyu;->d:I

    const/4 v1, 0x0

    invoke-static {p2, v1, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v5

    .line 581
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/cyu;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v5}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    .line 582
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "data content len more than mV2LeftDataLen. data is valid!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 583
    goto :goto_1

    .line 585
    :cond_7
    const-string v0, ""

    iput-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    .line 586
    const-string v0, "01"

    const-string v1, "BTDeviceV2ProtocolDataWrap"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "data content len more than mV2LeftDataLen. data is invalid!!!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 589
    :goto_1
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->b:I

    .line 590
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->d:I

    .line 591
    iget-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    return-object v0

    .line 595
    :goto_2
    const-string v0, ""

    return-object v0
.end method

.method public d()V
    .locals 1

    .line 602
    const-string v0, ""

    iput-object v0, p0, Lo/cyu;->c:Ljava/lang/String;

    .line 603
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->d:I

    .line 604
    const/4 v0, 0x0

    iput v0, p0, Lo/cyu;->b:I

    .line 605
    return-void
.end method
