.class public Lo/dec;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/dec;


# instance fields
.field private b:Lcom/huawei/whitebox/e;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    invoke-static {}, Lcom/huawei/whitebox/e;->b()Lcom/huawei/whitebox/e;

    move-result-object v0

    iput-object v0, p0, Lo/dec;->b:Lcom/huawei/whitebox/e;

    .line 79
    return-void
.end method

.method private a(Ljava/lang/String;I)Ljava/lang/String;
    .locals 7

    .line 239
    const/4 v4, 0x0

    .line 241
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    .line 243
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    const/16 v1, 0x20

    if-ge v0, v1, :cond_0

    .line 244
    const/4 v0, 0x0

    return-object v0

    .line 248
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x20

    :try_start_1
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 250
    const/4 v0, 0x1

    if-ne v0, p2, :cond_1

    .line 251
    invoke-direct {p0}, Lo/dec;->a()[B

    move-result-object v5

    goto :goto_0

    .line 253
    :cond_1
    invoke-direct {p0}, Lo/dec;->b()[B

    move-result-object v5

    .line 255
    :goto_0
    const/16 v0, 0x20

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v6}, Lo/dec;->e(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {p0, v0, v5, v1}, Lo/dec;->d(Ljava/lang/String;[B[B)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 258
    goto :goto_1

    .line 256
    :catch_0
    move-exception v5

    .line 257
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decrypt--Exception:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    :cond_2
    :goto_1
    return-object v4
.end method

.method public static a(Landroid/content/Context;)Lo/dec;
    .locals 2

    .line 71
    sget-object v0, Lo/dec;->a:Lo/dec;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 73
    new-instance v0, Lo/dec;

    invoke-direct {v0}, Lo/dec;-><init>()V

    sput-object v0, Lo/dec;->a:Lo/dec;

    .line 75
    :cond_0
    sget-object v0, Lo/dec;->a:Lo/dec;

    return-object v0
.end method

.method private a()[B
    .locals 10

    .line 283
    const-string v0, "qhAwVGkf71A4I2k1h710M6KZJW0A-D8gsHEKtYlVPUE"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 284
    const-string v0, "MUt20CRGk05dZv1nM4LgV0Frl_MJpoomckQyPnkoW10"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    .line 285
    const-string v0, "C6B6C6ABC5A84C1CC5B6C693C684C7B04E3EC7BEC6B3C48829C59EC79F74C792C49CC6B560C6A1C5ADC5A9C484C790C7B8C5A9C4BAC4B1C790C5A4C4BDC6A0C5A7C6AEC799C587C4AEC4A45026"

    invoke-direct {p0, v0}, Lo/dec;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 286
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [B

    return-object v0

    .line 289
    :cond_1
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    move-result-object v7

    .line 290
    array-length v0, v4

    new-array v8, v0, [C

    .line 291
    const/4 v9, 0x0

    :goto_0
    array-length v0, v4

    if-ge v9, v0, :cond_2

    .line 292
    aget-char v0, v7, v9

    aget-char v1, v5, v9

    shl-int/lit8 v1, v1, 0x2

    xor-int/2addr v0, v1

    shl-int/lit8 v0, v0, 0x3

    aget-char v1, v4, v9

    xor-int/2addr v0, v1

    shr-int/lit8 v0, v0, 0x4

    int-to-char v0, v0

    aput-char v0, v8, v9

    .line 291
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 295
    :cond_2
    invoke-static {v8}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v3

    .line 296
    return-object v3
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 343
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 344
    const/4 v0, 0x0

    return-object v0

    .line 347
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v4

    .line 348
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v5, v0, [B

    .line 349
    const-string v6, "0123456789ABCDEF"

    .line 352
    const/4 v8, 0x0

    :goto_0
    array-length v0, v5

    if-ge v8, v0, :cond_1

    .line 353
    mul-int/lit8 v0, v8, 0x2

    aget-char v0, v4, v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    mul-int/lit8 v7, v0, 0x10

    .line 355
    mul-int/lit8 v0, v8, 0x2

    add-int/lit8 v0, v0, 0x1

    aget-char v0, v4, v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/2addr v7, v0

    .line 357
    and-int/lit16 v0, v7, 0xff

    int-to-byte v0, v0

    aput-byte v0, v5, v8

    .line 352
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 360
    :cond_1
    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    invoke-direct {v0, v5, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 361
    :catch_0
    move-exception v8

    .line 362
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "hexToString() e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    const/4 v0, 0x0

    return-object v0
.end method

.method private b()[B
    .locals 3

    .line 270
    const-string v0, "D4AAC76288A23005828B8FEF937D5650gjQUAXCxflcmPZ2H4/deJyHSeFoU71xl67CeEsCdM8UbcYpdKUEGhxRdwBmol2/q"

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/dec;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 272
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method private c(I)Z
    .locals 1

    .line 228
    invoke-static {p1}, Lo/dee;->a(I)Z

    move-result v0

    return v0
.end method

.method private d(Ljava/lang/String;[B[B)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 327
    invoke-static {p1}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v2

    .line 328
    const-string v0, "AES/CBC/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v3

    .line 329
    new-instance v4, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {v4, p2, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 330
    new-instance v5, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v5, p3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 331
    const/4 v0, 0x2

    invoke-virtual {v3, v0, v4, v5}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 332
    invoke-virtual {v3, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v6

    .line 333
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v6, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e()V
    .locals 0

    .line 82
    invoke-static {}, Lo/def;->b()V

    .line 83
    return-void
.end method

.method private e(Ljava/lang/String;)[B
    .locals 7

    .line 306
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 308
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v3, v0, [B

    .line 309
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-ge v4, v0, :cond_1

    .line 310
    mul-int/lit8 v0, v4, 0x2

    mul-int/lit8 v1, v4, 0x2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v5

    .line 311
    mul-int/lit8 v0, v4, 0x2

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v1, v4, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 312
    mul-int/lit8 v0, v5, 0x10

    add-int/2addr v0, v6

    int-to-byte v0, v0

    aput-byte v0, v3, v4

    .line 309
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 314
    :cond_1
    return-object v3
.end method


# virtual methods
.method public declared-synchronized a(ILjava/lang/String;)Ljava/lang/String;
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    monitor-enter p0

    .line 145
    move-object/from16 v0, p0

    move/from16 v1, p1

    :try_start_0
    invoke-direct {v0, v1}, Lo/dec;->c(I)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 146
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData dataType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 148
    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    if-gt v0, v1, :cond_1

    .line 149
    :cond_0
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData strContent is: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const-string v0, ""

    monitor-exit p0

    return-object v0

    .line 156
    :cond_1
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 158
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v0

    move-object/from16 v1, p2

    const/16 v2, 0x18

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 159
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " decryptData secret iv_str:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ";data_str:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 162
    invoke-static/range {p1 .. p1}, Lo/def;->e(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 163
    invoke-static {}, Lo/dbf;->D()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 164
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " decryptData rootkey is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    :cond_2
    invoke-static/range {p1 .. p1}, Lo/def;->c(I)Ljava/lang/String;

    move-result-object v8

    .line 168
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " encryptData secret_str is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    .line 170
    move-object/from16 v4, p2

    .line 171
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData10 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    monitor-exit p0

    return-object v4

    .line 175
    :cond_3
    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 177
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    invoke-virtual {v8, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 179
    invoke-static {v10}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v11

    .line 181
    invoke-static {v9}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v12

    .line 182
    invoke-static {}, Lo/dbf;->D()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 183
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " decryptData key_info is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v11}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ";iv_info is:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v12}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :cond_4
    invoke-static {v11, v7, v12}, Lo/def;->a([B[B[B)[B

    move-result-object v13

    .line 187
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getworkkey ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-static {v5}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v14

    .line 192
    invoke-static {v6}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v15

    .line 195
    const/4 v0, 0x2

    invoke-static {v0, v13, v14, v15}, Lo/ddy;->b(I[B[B[B)[B

    move-result-object v16

    .line 196
    invoke-static {}, Lo/dbf;->D()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 197
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " decryptData secret original is:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v16 .. v16}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    :cond_5
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    move-object/from16 v2, v16

    invoke-direct {v0, v2, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 200
    goto :goto_0

    .line 201
    :cond_6
    move-object/from16 v4, p2

    .line 202
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData11 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    :goto_0
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 205
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(ILjava/lang/String;)[B
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 456
    move-object/from16 v0, p0

    move/from16 v1, p1

    invoke-direct {v0, v1}, Lo/dec;->c(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 457
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData dataType:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 460
    move-object/from16 v0, p2

    const/4 v1, 0x0

    const/16 v2, 0x18

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 462
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v0

    move-object/from16 v1, p2

    const/16 v2, 0x18

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 465
    invoke-static/range {p1 .. p1}, Lo/def;->e(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 467
    invoke-static/range {p1 .. p1}, Lo/def;->c(I)Ljava/lang/String;

    move-result-object v8

    .line 468
    const/4 v0, 0x0

    if-ne v0, v8, :cond_0

    .line 469
    move-object/from16 v4, p2

    .line 470
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData10 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    const-string v0, "utf-8"

    invoke-virtual {v4, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0

    .line 474
    :cond_0
    const/4 v0, 0x0

    const/16 v1, 0x18

    invoke-virtual {v8, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 476
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x18

    invoke-virtual {v8, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    .line 478
    invoke-static {v10}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v11

    .line 480
    invoke-static {v9}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v12

    .line 482
    invoke-static {v11, v7, v12}, Lo/def;->a([B[B[B)[B

    move-result-object v13

    .line 483
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getworkkey ok"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 486
    invoke-static {v5}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v14

    .line 488
    invoke-static {v6}, Lo/deg;->d(Ljava/lang/String;)[B

    move-result-object v15

    .line 491
    const/4 v0, 0x2

    invoke-static {v0, v13, v14, v15}, Lo/ddy;->b(I[B[B[B)[B

    move-result-object v16

    .line 492
    return-object v16

    .line 494
    :cond_1
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "decryptData11 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 495
    const-string v0, "utf-8"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c(ILjava/lang/String;)Ljava/lang/String;
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    monitor-enter p0

    .line 96
    :try_start_0
    invoke-direct {p0, p1}, Lo/dec;->c(I)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 97
    const-string v0, "AES/CBC/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    .line 98
    invoke-virtual {v5}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v6

    .line 99
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_2

    .line 100
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 101
    array-length v8, v7

    .line 102
    rem-int v0, v8, v6

    if-eqz v0, :cond_0

    .line 103
    rem-int v0, v8, v6

    sub-int v0, v6, v0

    add-int/2addr v8, v0

    .line 105
    :cond_0
    new-array v9, v8, [B

    .line 106
    array-length v0, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v7, v1, v9, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 108
    invoke-static {p1}, Lo/def;->d(I)[B

    move-result-object v10

    .line 109
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " encryptData getworkkey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-static {}, Lo/def;->a()[B

    move-result-object v11

    .line 113
    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    const/4 v0, 0x0

    if-eq v0, v11, :cond_1

    .line 115
    const/4 v0, 0x2

    invoke-static {v0, v10, v11, v9}, Lo/ddy;->e(I[B[B[B)[B

    move-result-object v12

    .line 116
    invoke-static {v11}, Lo/deg;->a([B)Ljava/lang/String;

    move-result-object v13

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v12}, Lo/deg;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 118
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " encryptData secret is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    goto :goto_0

    .line 120
    :cond_1
    move-object/from16 v4, p2

    .line 121
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " encryptData secret is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_0
    goto :goto_1

    .line 124
    :cond_2
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "strContent is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    const/4 v4, 0x0

    .line 128
    :goto_1
    goto :goto_2

    .line 129
    :cond_3
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not need encrypt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    move-object/from16 v4, p2

    .line 132
    :goto_2
    monitor-exit p0

    return-object v4

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 217
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/dec;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(I[B)[B
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 412
    invoke-direct {p0, p1}, Lo/dec;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 413
    const-string v0, "AES/CBC/PKCS7Padding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v5

    .line 414
    invoke-virtual {v5}, Ljavax/crypto/Cipher;->getBlockSize()I

    move-result v6

    .line 415
    array-length v7, p2

    .line 416
    rem-int v0, v7, v6

    if-eqz v0, :cond_0

    .line 417
    rem-int v0, v7, v6

    sub-int v0, v6, v0

    add-int/2addr v7, v0

    .line 419
    :cond_0
    new-array v8, v7, [B

    .line 420
    array-length v0, p2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p2, v1, v8, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 423
    invoke-static {p1}, Lo/def;->d(I)[B

    move-result-object v9

    .line 424
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " encryptByteData getworkkey"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 426
    invoke-static {}, Lo/def;->a()[B

    move-result-object v10

    .line 428
    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    const/4 v0, 0x0

    if-eq v0, v10, :cond_1

    .line 430
    const/4 v0, 0x2

    invoke-static {v0, v9, v10, v8}, Lo/ddy;->e(I[B[B[B)[B

    move-result-object v11

    .line 431
    invoke-static {v10}, Lo/deg;->a([B)Ljava/lang/String;

    move-result-object v12

    .line 432
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Lo/deg;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 433
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " encryptData secret is not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 434
    goto :goto_0

    .line 435
    :cond_1
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " encryptData secret is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    return-object p2

    .line 438
    :goto_0
    goto :goto_1

    .line 439
    :cond_2
    const-string v0, "HWEncryptUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not need encrypt"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/ded;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    return-object p2

    .line 442
    :goto_1
    const-string v0, "utf-8"

    invoke-virtual {v4, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method
