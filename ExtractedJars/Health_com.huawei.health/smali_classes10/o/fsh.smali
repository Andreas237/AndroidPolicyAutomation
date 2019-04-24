.class public final Lo/fsh;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b([B[B[BLjavax/crypto/Cipher;I)[B
    .locals 19
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 220
    move-object/from16 v0, p1

    array-length v0, v0

    int-to-long v4, v0

    .line 221
    move-object/from16 v0, p2

    array-length v0, v0

    int-to-long v6, v0

    .line 222
    move-object/from16 v0, p0

    array-length v0, v0

    rsub-int/lit8 v8, v0, 0xf

    .line 233
    const/16 v0, 0x10

    new-array v9, v0, [B

    .line 235
    const/4 v10, 0x0

    .line 237
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_0

    .line 238
    const/4 v10, 0x1

    .line 241
    :cond_0
    add-int/lit8 v0, p4, -0x2

    div-int/lit8 v11, v0, 0x2

    .line 243
    add-int/lit8 v12, v8, -0x1

    .line 255
    mul-int/lit8 v0, v10, 0x40

    mul-int/lit8 v1, v11, 0x8

    add-int/2addr v0, v1

    add-int/2addr v0, v12

    int-to-byte v0, v0

    const/4 v1, 0x0

    aput-byte v0, v9, v1

    .line 258
    move-object/from16 v0, p0

    array-length v0, v0

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v9, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 260
    const/16 v0, 0x8

    shr-long v0, v4, v0

    long-to-int v0, v0

    int-to-byte v0, v0

    const/16 v1, 0xe

    aput-byte v0, v9, v1

    .line 261
    long-to-int v0, v4

    int-to-byte v0, v0

    const/16 v1, 0xf

    aput-byte v0, v9, v1

    .line 263
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 267
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_3

    .line 280
    const v14, 0xff00

    .line 282
    const-wide v15, 0x100000000L

    .line 291
    new-instance v17, Lo/fpp;

    invoke-direct/range {v17 .. v17}, Lo/fpp;-><init>()V

    .line 292
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-lez v0, :cond_1

    const-wide/32 v0, 0xff00

    cmp-long v0, v6, v0

    if-gez v0, :cond_1

    .line 294
    move-object/from16 v0, v17

    const/16 v1, 0x10

    invoke-virtual {v0, v6, v7, v1}, Lo/fpp;->b(JI)V

    goto :goto_0

    .line 296
    :cond_1
    const-wide/32 v0, 0xff00

    cmp-long v0, v6, v0

    if-ltz v0, :cond_2

    const-wide v0, 0x100000000L

    cmp-long v0, v6, v0

    if-gez v0, :cond_2

    .line 298
    const v18, 0xfffe

    .line 299
    move-object/from16 v0, v17

    move/from16 v1, v18

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Lo/fpp;->c(II)V

    .line 300
    move-object/from16 v0, v17

    const/16 v1, 0x20

    invoke-virtual {v0, v6, v7, v1}, Lo/fpp;->b(JI)V

    .line 302
    goto :goto_0

    .line 304
    :cond_2
    const v18, 0xffff

    .line 305
    move-object/from16 v0, v17

    move/from16 v1, v18

    const/16 v2, 0x10

    invoke-virtual {v0, v1, v2}, Lo/fpp;->c(II)V

    .line 306
    move-object/from16 v0, v17

    const/16 v1, 0x40

    invoke-virtual {v0, v6, v7, v1}, Lo/fpp;->b(JI)V

    .line 308
    :goto_0
    move-object/from16 v0, v17

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/fpp;->e([B)V

    .line 310
    invoke-virtual/range {v17 .. v17}, Lo/fpp;->e()[B

    move-result-object v18

    .line 311
    move-object/from16 v0, v18

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/fsp;->a([BI)Ljava/util/List;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 320
    :cond_3
    move-object/from16 v0, p1

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/fsp;->a([BI)Ljava/util/List;

    move-result-object v0

    invoke-interface {v13, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 324
    move-object/from16 v0, p3

    invoke-virtual {v0, v9}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/fsp;->e([BI)[B

    move-result-object v14

    .line 327
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, [B

    .line 328
    move-object/from16 v0, v16

    invoke-static {v0, v14}, Lo/fsp;->a([B[B)[B

    move-result-object v17

    .line 329
    move-object/from16 v0, p3

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/fsp;->e([BI)[B

    move-result-object v14

    .line 330
    goto :goto_1

    .line 333
    :cond_4
    move/from16 v0, p4

    invoke-static {v14, v0}, Lo/fsp;->e([BI)[B

    move-result-object v15

    .line 335
    return-object v15
.end method

.method public static b([B[B[B[BI)[B
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 156
    array-length v0, p3

    int-to-long v2, v0

    .line 159
    const-string v0, "AES"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v4

    .line 160
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 168
    move/from16 v0, p4

    invoke-static {p1, p3, p2, v4, v0}, Lo/fsh;->b([B[B[BLjavax/crypto/Cipher;I)[B

    move-result-object v5

    .line 174
    invoke-static {v2, v3, p1, v4}, Lo/fsh;->d(J[BLjavax/crypto/Cipher;)Ljava/util/List;

    move-result-object v6

    .line 175
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, [B

    .line 176
    invoke-static {v6, v2, v3}, Lo/fsh;->e(Ljava/util/List;J)[B

    move-result-object v8

    .line 183
    invoke-static {p3, v8}, Lo/fsp;->a([B[B)[B

    move-result-object v9

    .line 186
    move/from16 v0, p4

    invoke-static {v7, v0}, Lo/fsp;->e([BI)[B

    move-result-object v0

    invoke-static {v5, v0}, Lo/fsp;->a([B[B)[B

    move-result-object v10

    .line 192
    invoke-static {v9, v10}, Lo/fsp;->c([B[B)[B

    move-result-object v11

    .line 194
    return-object v11
.end method

.method private static d(J[BLjavax/crypto/Cipher;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[BLjavax/crypto/Cipher;)Ljava/util/List<[B>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 353
    array-length v0, p2

    rsub-int/lit8 v4, v0, 0xf

    .line 355
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 361
    long-to-double v0, p0

    const-wide/high16 v2, 0x4030000000000000L    # 16.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-int v6, v0

    .line 364
    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    .line 365
    new-instance v8, Lo/fpp;

    invoke-direct {v8}, Lo/fpp;-><init>()V

    .line 381
    add-int/lit8 v9, v4, -0x1

    .line 384
    const/16 v0, 0x8

    invoke-virtual {v8, v9, v0}, Lo/fpp;->c(II)V

    .line 387
    invoke-virtual {v8, p2}, Lo/fpp;->e([B)V

    .line 390
    int-to-long v0, v7

    mul-int/lit8 v2, v4, 0x8

    invoke-virtual {v8, v0, v1, v2}, Lo/fpp;->b(JI)V

    .line 391
    invoke-virtual {v8}, Lo/fpp;->e()[B

    move-result-object v10

    .line 394
    invoke-virtual {p3, v10}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lo/fsp;->e([BI)[B

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 364
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 397
    :cond_0
    return-object v5
.end method

.method public static d([B[B[B[BI)[B
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    .line 86
    move-object/from16 v0, p3

    array-length v0, v0

    sub-int v0, v0, p4

    int-to-long v7, v0

    .line 89
    const-string v0, "AES"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v9

    .line 90
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p0, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v9, v1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 96
    move-object/from16 v0, p1

    invoke-static {v7, v8, v0, v9}, Lo/fsh;->d(J[BLjavax/crypto/Cipher;)Ljava/util/List;

    move-result-object v10

    .line 97
    const/4 v0, 0x0

    invoke-interface {v10, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, [B

    .line 98
    invoke-static {v10, v7, v8}, Lo/fsh;->e(Ljava/util/List;J)[B

    move-result-object v12

    .line 101
    long-to-int v0, v7

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lo/fsp;->e([BI)[B

    move-result-object v13

    .line 107
    invoke-static {v13, v12}, Lo/fsp;->a([B[B)[B

    move-result-object v5

    .line 110
    move/from16 v0, p4

    new-array v14, v0, [B

    .line 111
    long-to-int v0, v7

    move-object/from16 v1, p3

    const/4 v2, 0x0

    move/from16 v3, p4

    invoke-static {v1, v0, v14, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 114
    move/from16 v0, p4

    invoke-static {v11, v0}, Lo/fsp;->e([BI)[B

    move-result-object v0

    invoke-static {v14, v0}, Lo/fsp;->a([B[B)[B

    move-result-object v4

    .line 120
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move/from16 v2, p4

    invoke-static {v0, v5, v1, v9, v2}, Lo/fsh;->b([B[B[BLjavax/crypto/Cipher;I)[B

    move-result-object v6

    .line 128
    invoke-static {v4, v6}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 129
    return-object v5

    .line 131
    :cond_0
    new-instance v0, Lo/fsl;

    invoke-direct {v0, v6, v4}, Lo/fsl;-><init>([B[B)V

    throw v0
.end method

.method private static e(Ljava/util/List;J)[B
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<[B>;J)[B"
        }
    .end annotation

    .line 413
    const/4 v0, 0x0

    new-array v4, v0, [B

    .line 416
    long-to-double v0, p1

    const-wide/high16 v2, 0x4030000000000000L    # 16.0

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v5, v0

    .line 419
    const/4 v6, 0x1

    :goto_0
    if-gt v6, v5, :cond_0

    .line 420
    invoke-interface {p0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    invoke-static {v4, v0}, Lo/fsp;->c([B[B)[B

    move-result-object v4

    .line 419
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 423
    :cond_0
    return-object v4
.end method
