.class public final Lexocr/bankcard/EXBankCardReco;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const/4 v0, 0x0

    sput-boolean v0, Lexocr/bankcard/EXBankCardReco;->a:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([BIIIIIIII[BI[I)Landroid/graphics/Bitmap;
    .locals 16

    .line 431
    invoke-static {}, Lexocr/bankcard/EXBankCardReco;->e()V

    .line 432
    const/4 v14, 0x0

    .line 435
    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move/from16 v8, p8

    move-object/from16 v11, p9

    move/from16 v12, p10

    move-object/from16 v13, p11

    const/4 v9, 0x1

    const/4 v10, 0x1

    :try_start_0
    invoke-static/range {v0 .. v13}, Lexocr/bankcard/EXBankCardReco;->nativeRecoNV21ST([BIIIIIIIIII[BI[I)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v14, v0

    .line 441
    goto :goto_0

    .line 438
    :catch_0
    move-exception v15

    .line 440
    const-string v0, "BankCardRecog nativeRecoRawdat error"

    const/4 v1, 0x0

    invoke-static {v0, v15, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 442
    :goto_0
    return-object v14
.end method

.method public static c(Landroid/content/Context;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsatisfiedLinkError;
        }
    .end annotation

    .line 464
    invoke-static {}, Lexocr/bankcard/EXBankCardReco;->e()V

    .line 465
    const/4 v2, 0x0

    .line 468
    :try_start_0
    invoke-static {p0}, Lexocr/bankcard/EXBankCardReco;->nativeCheckSignature(Landroid/content/Context;)I
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 474
    goto :goto_0

    .line 470
    :catch_0
    move-exception v3

    .line 472
    const-string v0, "BankCardRecog nativeCheckSignature error"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 473
    throw v3

    .line 475
    :goto_0
    return v2
.end method

.method public static c()Ljava/lang/String;
    .locals 7

    .line 333
    invoke-static {}, Lexocr/bankcard/EXBankCardReco;->e()V

    .line 334
    const/4 v3, 0x0

    .line 336
    const/16 v0, 0x100

    new-array v4, v0, [B

    .line 339
    :try_start_0
    invoke-static {v4}, Lexocr/bankcard/EXBankCardReco;->nativeGetVersion([B)I

    .line 340
    const/4 v5, 0x0

    .line 341
    const/4 v6, 0x0

    :goto_0
    array-length v0, v4

    const/16 v0, 0x100

    if-ge v6, v0, :cond_1

    .line 343
    aget-byte v0, v4, v6
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v0, :cond_0

    .line 345
    goto :goto_1

    .line 347
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 341
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 351
    :cond_1
    :goto_1
    :try_start_1
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    const/4 v2, 0x0

    invoke-direct {v0, v4, v2, v5, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1

    move-object v3, v0

    .line 356
    goto :goto_2

    .line 353
    :catch_0
    move-exception v6

    .line 355
    const-string v0, "BankCardRecog version encoding error "

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V
    :try_end_2
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_2 .. :try_end_2} :catch_1

    .line 361
    :goto_2
    goto :goto_3

    .line 358
    :catch_1
    move-exception v5

    .line 360
    const-string v0, "BankCardRecog nativeGetVersion error"

    const/4 v1, 0x0

    invoke-static {v0, v5, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 362
    :goto_3
    return-object v3
.end method

.method public static c([BILexocr/bankcard/EXBankCardInfo;)Z
    .locals 16

    .line 128
    invoke-static {}, Lexocr/bankcard/EXBankCardReco;->e()V

    .line 129
    if-nez p2, :cond_0

    .line 130
    const/4 v0, 0x0

    return v0

    .line 137
    :cond_0
    const/4 v12, 0x0

    .line 139
    const/4 v14, 0x0

    .line 144
    move/from16 v0, p1

    const/16 v1, 0x9c

    if-ge v0, v1, :cond_1

    .line 145
    const/4 v0, 0x0

    return v0

    .line 147
    :cond_1
    const/4 v5, 0x0

    .line 148
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 149
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 150
    shl-int/lit8 v0, v3, 0x8

    add-int v11, v0, v4

    .line 153
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 154
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 155
    shl-int/lit8 v0, v3, 0x8

    add-int v11, v0, v4

    .line 214
    const/16 v5, 0x84

    .line 217
    add-int/lit8 v5, v5, 0x1

    .line 219
    const/4 v6, 0x1

    :goto_0
    const/16 v0, 0x8

    if-ge v6, v0, :cond_2

    .line 220
    add-int/lit8 v5, v5, 0x1

    .line 219
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 222
    :cond_2
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 223
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 224
    shl-int/lit8 v0, v3, 0x8

    add-int v11, v0, v4

    .line 227
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 228
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 229
    shl-int/lit8 v0, v3, 0x8

    add-int v11, v0, v4

    .line 257
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 258
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 259
    shl-int/lit8 v0, v3, 0x8

    add-int v11, v0, v4

    .line 260
    move v13, v11

    .line 262
    :goto_1
    add-int/lit8 v0, p1, -0x9

    if-ge v5, v0, :cond_3

    .line 264
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 265
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 266
    shl-int/lit8 v0, v3, 0x8

    add-int v11, v0, v4

    .line 267
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 268
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 269
    shl-int/lit8 v0, v3, 0x8

    add-int v7, v0, v4

    .line 270
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 271
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 272
    shl-int/lit8 v0, v3, 0x8

    add-int v8, v0, v4

    .line 273
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 274
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 275
    shl-int/lit8 v0, v3, 0x8

    add-int v9, v0, v4

    .line 276
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 277
    move v0, v5

    add-int/lit8 v5, v5, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 278
    shl-int/lit8 v0, v3, 0x8

    add-int v10, v0, v4

    .line 279
    int-to-char v0, v11

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v12}, Lexocr/bankcard/EXBankCardInfo;->setNumbersAtIndex(CI)V

    .line 280
    new-instance v0, Landroid/graphics/Rect;

    add-int v1, v7, v9

    add-int v2, v8, v10

    invoke-direct {v0, v7, v8, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object/from16 v1, p2

    invoke-virtual {v1, v0, v12}, Lexocr/bankcard/EXBankCardInfo;->setRectsAtIndex(Landroid/graphics/Rect;I)V

    .line 281
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_1

    .line 283
    :cond_3
    move-object/from16 v0, p2

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v12}, Lexocr/bankcard/EXBankCardInfo;->setNumbersAtIndex(CI)V

    .line 284
    move-object/from16 v0, p2

    invoke-virtual {v0, v12}, Lexocr/bankcard/EXBankCardInfo;->setCharCount(I)V

    .line 285
    invoke-virtual/range {p2 .. p2}, Lexocr/bankcard/EXBankCardInfo;->getCharCount()I

    move-result v15

    .line 286
    invoke-virtual/range {p2 .. p2}, Lexocr/bankcard/EXBankCardInfo;->setStrNumbers()V

    .line 288
    const/16 v0, 0xa

    if-lt v15, v0, :cond_4

    const/16 v0, 0x18

    if-gt v15, v0, :cond_4

    if-eq v12, v13, :cond_5

    .line 290
    :cond_4
    const/4 v14, 0x0

    goto :goto_2

    .line 294
    :cond_5
    const/4 v14, 0x1

    .line 296
    :goto_2
    return v14
.end method

.method public static d([BIIIIIII)F
    .locals 4

    .line 447
    invoke-static {}, Lexocr/bankcard/EXBankCardReco;->e()V

    .line 448
    const/4 v2, 0x0

    .line 451
    :try_start_0
    invoke-static/range {p0 .. p7}, Lexocr/bankcard/EXBankCardReco;->nativeFocusScore([BIIIIIII)F
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 458
    goto :goto_0

    .line 453
    :catch_0
    move-exception v3

    .line 455
    const-string v0, "BankCardRecog nativeFocusScore error"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 456
    invoke-static {p0, p1, p2}, Lexocr/bankcard/EXBankCardReco;->e([BII)F

    move-result v2

    .line 457
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getFocusScore result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V

    .line 459
    :goto_0
    return v2
.end method

.method private static e([BII)F
    .locals 18

    .line 302
    const/4 v4, 0x0

    .line 303
    div-int/lit8 v0, p2, 0x2

    div-int/lit8 v1, p2, 0x4

    sub-int v5, v0, v1

    .line 304
    div-int/lit8 v0, p2, 0x2

    div-int/lit8 v1, p2, 0x4

    add-int v6, v0, v1

    .line 305
    div-int/lit8 v0, p1, 0x2

    div-int/lit8 v1, p1, 0x4

    sub-int v7, v0, v1

    .line 306
    div-int/lit8 v0, p1, 0x2

    div-int/lit8 v1, p1, 0x4

    add-int v8, v0, v1

    .line 308
    const/4 v11, 0x0

    .line 309
    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 310
    const/4 v15, 0x0

    .line 312
    move v9, v5

    :goto_0
    if-ge v9, v6, :cond_1

    .line 314
    mul-int v0, v9, p1

    add-int v11, v0, v7

    .line 315
    move v10, v7

    :goto_1
    if-ge v10, v8, :cond_0

    .line 317
    sub-int v0, v11, p1

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    add-int v1, v11, p1

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/2addr v0, v1

    sub-int v1, v11, p1

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    sub-int/2addr v0, v1

    add-int v1, v11, p1

    add-int/lit8 v1, v1, -0x1

    aget-byte v1, p0, v1

    and-int/lit16 v1, v1, 0xff

    sub-int v14, v0, v1

    .line 319
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    move-result v14

    .line 320
    add-int/2addr v12, v14

    .line 321
    mul-int v0, v14, v14

    add-int/2addr v13, v0

    .line 315
    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 312
    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 324
    :cond_1
    sub-int v0, v8, v7

    sub-int v1, v6, v5

    mul-int v15, v0, v1

    .line 325
    int-to-float v0, v12

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v15

    div-float/2addr v0, v1

    float-to-double v1, v0

    move-wide/from16 v16, v1

    .line 326
    int-to-float v0, v13

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float/2addr v0, v1

    int-to-float v1, v15

    div-float/2addr v0, v1

    float-to-double v0, v0

    mul-double v2, v16, v16

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v4, v0

    .line 328
    return v4
.end method

.method private static declared-synchronized e()V
    .locals 4

    const-class v3, Lexocr/bankcard/EXBankCardReco;

    monitor-enter v3

    .line 29
    :try_start_0
    sget-boolean v0, Lexocr/bankcard/EXBankCardReco;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 33
    const-string v0, "BankCardRecog"

    :try_start_1
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 34
    const/4 v0, 0x1

    sput-boolean v0, Lexocr/bankcard/EXBankCardReco;->a:Z

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ExBankCardRecog version : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lexocr/bankcard/EXBankCardReco;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    goto :goto_0

    .line 37
    :catch_0
    move-exception v2

    .line 39
    const-string v0, "BankCardRecog loadLibrary error , BankCardRecog.so not found\uff01"

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v2, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    :cond_0
    :goto_0
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v2

    monitor-exit v3

    throw v2
.end method

.method private static native nativeCheckSignature(Landroid/content/Context;)I
.end method

.method private static native nativeFocusScore([BIIIIIII)F
.end method

.method private static native nativeGetVersion([B)I
.end method

.method private static native nativeRecoNV21ST([BIIIIIIIIII[BI[I)Landroid/graphics/Bitmap;
.end method
