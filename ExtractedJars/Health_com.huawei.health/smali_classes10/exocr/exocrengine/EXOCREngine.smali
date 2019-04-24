.class public Lexocr/exocrengine/EXOCREngine;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lexocr/exocrengine/EXOCREngine;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 60
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lexocr/exocrengine/EXOCREngine;->b:[B

    .line 68
    const-string v0, "exocrenginec"

    :try_start_0
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    goto :goto_0

    .line 70
    :catch_0
    move-exception v2

    .line 72
    const-string v0, "BankCardRecog loadLibrary error , BankCardRecog.so not found\uff01"

    const/4 v1, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 74
    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 16

    .line 425
    move/from16 v0, p1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 427
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 428
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x42b40000    # 90.0f

    invoke-virtual {v7, v2, v0, v1}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 429
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-float v8, v0

    .line 430
    const/4 v9, 0x0

    .line 432
    const/16 v0, 0x9

    new-array v10, v0, [F

    .line 433
    invoke-virtual {v7, v10}, Landroid/graphics/Matrix;->getValues([F)V

    .line 435
    const/4 v0, 0x2

    aget v11, v10, v0

    .line 436
    const/4 v0, 0x5

    aget v12, v10, v0

    .line 437
    sub-float v0, v8, v11

    sub-float v1, v9, v12

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 438
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v13

    .line 439
    new-instance v14, Landroid/graphics/Paint;

    invoke-direct {v14}, Landroid/graphics/Paint;-><init>()V

    .line 440
    new-instance v15, Landroid/graphics/Canvas;

    invoke-direct {v15, v13}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 441
    move-object/from16 v0, p0

    invoke-virtual {v15, v0, v7, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 442
    return-object v13

    .line 444
    :cond_0
    move/from16 v0, p1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 446
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 447
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    const/high16 v2, 0x43340000    # 180.0f

    invoke-virtual {v7, v2, v0, v1}, Landroid/graphics/Matrix;->setRotate(FFF)V

    .line 448
    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 449
    return-object v8

    .line 453
    :cond_1
    return-object p0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 6

    .line 173
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    .line 174
    move-object v3, v2

    .line 175
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v4, v0, [B

    .line 177
    const/4 v5, 0x0

    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v5, v0, :cond_0

    .line 178
    invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v4, v5

    .line 177
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 179
    :cond_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    aput-byte v1, v4, v0

    .line 180
    invoke-static {v4}, Lexocr/exocrengine/EXOCREngine;->c([B)I

    .line 182
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lexocr/exocrengine/EXOCREngine;->b(Landroid/content/Context;)I

    .line 183
    const/4 v0, 0x1

    return v0
.end method

.method public static b(Landroid/app/Activity;)I
    .locals 3

    .line 84
    if-nez p0, :cond_0

    .line 86
    const/4 v0, 0x3

    return v0

    .line 88
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v1

    .line 89
    const/4 v2, 0x3

    .line 90
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 93
    :pswitch_0
    const/4 v2, 0x3

    .line 94
    goto :goto_1

    .line 96
    :pswitch_1
    const/4 v2, 0x1

    .line 97
    goto :goto_1

    .line 99
    :pswitch_2
    const/4 v2, 0x4

    .line 100
    goto :goto_1

    .line 102
    :pswitch_3
    const/4 v2, 0x2

    .line 103
    goto :goto_1

    .line 105
    :goto_0
    const/4 v2, 0x3

    .line 108
    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static b(Landroid/content/Context;)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/UnsatisfiedLinkError;
        }
    .end annotation

    .line 467
    const/4 v2, 0x0

    .line 470
    :try_start_0
    invoke-static {p0}, Lexocr/exocrengine/EXOCREngine;->nativeCheckSignature(Landroid/content/Context;)I
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    .line 476
    goto :goto_0

    .line 472
    :catch_0
    move-exception v3

    .line 474
    const-string v0, "CardRecog nativeCheckSignature error"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 475
    throw v3

    .line 477
    :goto_0
    return v2
.end method

.method public static c([B)I
    .locals 7

    .line 489
    sget-object v2, Lexocr/exocrengine/EXOCREngine;->b:[B

    monitor-enter v2

    .line 491
    :try_start_0
    sget-object v0, Lexocr/exocrengine/EXOCREngine;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v3

    .line 492
    const/4 v0, 0x1

    if-eq v3, v0, :cond_0

    .line 494
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exocrenginec has init. the total is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lexocr/exocrengine/EXOCREngine;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 495
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 497
    :cond_0
    const/4 v4, 0x0

    .line 500
    :try_start_1
    invoke-static {p0}, Lexocr/exocrengine/EXOCREngine;->nativeInit([B)I
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v4, v0

    .line 505
    goto :goto_0

    .line 502
    :catch_0
    move-exception v5

    .line 504
    const-string v0, "CardRecog nativeInit error"

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v5, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 507
    :goto_0
    monitor-exit v2

    return v4

    .line 508
    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6
.end method

.method public static c([BILexocr/base/ExBaseCardInfo;)Lexocr/base/ExBaseCardInfo;
    .locals 13

    .line 293
    const/4 v2, 0x0

    .line 294
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x0

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 295
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 296
    shl-int/lit8 v0, v3, 0x8

    add-int v9, v0, v4

    .line 298
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x2

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 299
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x3

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 300
    shl-int/lit8 v0, v3, 0x8

    add-int v9, v0, v4

    .line 302
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x4

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 303
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    const/4 v0, 0x5

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 304
    shl-int/lit8 v0, v3, 0x8

    add-int v9, v0, v4

    .line 305
    move v11, v9

    .line 308
    const/4 v10, 0x0

    .line 309
    :goto_0
    add-int/lit8 v0, p1, -0x9

    if-ge v2, v0, :cond_0

    .line 311
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 312
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 313
    shl-int/lit8 v0, v3, 0x8

    add-int v9, v0, v4

    .line 314
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 315
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 316
    shl-int/lit8 v0, v3, 0x8

    add-int v5, v0, v4

    .line 317
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 318
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 319
    shl-int/lit8 v0, v3, 0x8

    add-int v6, v0, v4

    .line 320
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 321
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 322
    shl-int/lit8 v0, v3, 0x8

    add-int v7, v0, v4

    .line 323
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v3, v0, 0xff

    .line 324
    move v0, v2

    add-int/lit8 v2, v2, 0x1

    aget-byte v0, p0, v0

    and-int/lit16 v4, v0, 0xff

    .line 325
    shl-int/lit8 v0, v3, 0x8

    add-int v8, v0, v4

    .line 326
    int-to-char v0, v9

    invoke-virtual {p2, v0, v10}, Lexocr/base/ExBaseCardInfo;->setNumbersAtIndex(CI)V

    .line 327
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v5, v6, v7, v8}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2, v0, v10}, Lexocr/base/ExBaseCardInfo;->setRectsAtIndex(Landroid/graphics/Rect;I)V

    .line 328
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 330
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0, v10}, Lexocr/base/ExBaseCardInfo;->setNumbersAtIndex(CI)V

    .line 332
    invoke-virtual {p2, v10}, Lexocr/base/ExBaseCardInfo;->setCharCount(I)V

    .line 333
    invoke-virtual {p2}, Lexocr/base/ExBaseCardInfo;->getCharCount()I

    move-result v12

    .line 334
    invoke-virtual {p2}, Lexocr/base/ExBaseCardInfo;->setStrNumbers()V

    .line 336
    const/4 v0, 0x6

    if-lt v12, v0, :cond_1

    const/16 v0, 0x40

    if-gt v12, v0, :cond_1

    if-eq v10, v11, :cond_2

    .line 338
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 340
    :cond_2
    return-object p2
.end method

.method public static c([BIILandroid/graphics/Rect;)Z
    .locals 18

    .line 198
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Rect;->width()I

    move-result v2

    .line 201
    move-object/from16 v0, p3

    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 202
    move-object/from16 v0, p3

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/lit8 v4, v0, -0x1

    .line 205
    const/4 v10, 0x0

    .line 206
    const/16 v11, 0x8

    .line 208
    const/16 v0, 0x780

    new-array v0, v0, [I

    move-object/from16 v16, v0

    .line 209
    const/16 v0, 0x780

    new-array v0, v0, [I

    move-object/from16 v17, v0

    .line 212
    move v7, v3

    const/4 v8, 0x0

    :goto_0
    if-gt v7, v4, :cond_0

    .line 214
    aget-byte v0, p0, v7

    aput v0, v16, v8

    .line 212
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 217
    :cond_0
    const/4 v10, 0x0

    .line 218
    const/4 v7, 0x0

    :goto_1
    if-ge v7, v11, :cond_1

    .line 219
    aget v0, v16, v7

    add-int/2addr v10, v0

    .line 218
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    .line 220
    :cond_1
    const/4 v7, 0x0

    const/16 v6, 0x8

    const/16 v9, 0x8

    :goto_2
    if-gt v7, v11, :cond_2

    .line 222
    add-int/lit8 v9, v9, 0x1

    .line 223
    aget v0, v16, v6

    add-int/2addr v10, v0

    .line 224
    div-int v0, v10, v9

    aput v0, v17, v7

    .line 220
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 226
    :cond_2
    const/4 v5, 0x0

    :goto_3
    add-int/lit8 v0, v2, -0x8

    if-ge v7, v0, :cond_3

    .line 228
    aget v0, v16, v6

    aget v1, v16, v5

    sub-int/2addr v0, v1

    add-int/2addr v10, v0

    .line 229
    div-int v0, v10, v9

    aput v0, v17, v7

    .line 226
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 231
    :cond_3
    :goto_4
    if-ge v7, v2, :cond_4

    .line 233
    add-int/lit8 v9, v9, -0x1

    .line 234
    aget v0, v16, v5

    sub-int/2addr v10, v0

    .line 235
    div-int v0, v10, v9

    aput v0, v17, v7

    .line 231
    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 238
    :cond_4
    const/4 v7, 0x0

    :goto_5
    if-ge v7, v2, :cond_7

    .line 240
    aget v0, v16, v7

    add-int/lit16 v0, v0, 0x80

    aget v1, v17, v7

    sub-int v15, v0, v1

    .line 241
    if-gez v15, :cond_5

    .line 242
    const/4 v15, 0x0

    .line 243
    :cond_5
    const/16 v0, 0xff

    if-le v15, v0, :cond_6

    .line 244
    const/16 v15, 0xff

    .line 245
    :cond_6
    aput v15, v17, v7

    .line 238
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 247
    :cond_7
    const/4 v12, 0x0

    .line 248
    const/16 v13, 0xff

    .line 249
    const/4 v14, 0x0

    .line 250
    const/4 v7, 0x0

    :goto_6
    if-ge v7, v2, :cond_c

    .line 252
    aget v0, v17, v7

    if-le v0, v12, :cond_8

    .line 253
    aget v12, v17, v7

    .line 254
    :cond_8
    aget v0, v17, v7

    if-ge v0, v13, :cond_9

    .line 255
    aget v13, v17, v7

    .line 256
    :cond_9
    and-int/lit8 v0, v7, 0x7

    const/4 v1, 0x7

    if-ne v0, v1, :cond_b

    .line 258
    sub-int v15, v12, v13

    .line 259
    if-le v15, v14, :cond_a

    .line 260
    move v14, v15

    .line 261
    :cond_a
    const/4 v12, 0x0

    .line 262
    const/16 v13, 0xff

    .line 250
    :cond_b
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 266
    :cond_c
    const/16 v0, 0xa

    if-le v14, v0, :cond_d

    .line 268
    const/4 v0, 0x1

    return v0

    .line 272
    :cond_d
    const/4 v0, 0x0

    return v0
.end method

.method public static d()I
    .locals 7

    .line 519
    sget-object v2, Lexocr/exocrengine/EXOCREngine;->b:[B

    monitor-enter v2

    .line 521
    :try_start_0
    sget-object v0, Lexocr/exocrengine/EXOCREngine;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v3

    .line 522
    if-eqz v3, :cond_0

    .line 524
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exocrenginec initNum is not 0.the last times is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lexocr/exocrengine/EXOCREngine;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->b(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 525
    monitor-exit v2

    const/4 v0, 0x0

    return v0

    .line 527
    :cond_0
    const/4 v4, 0x0

    .line 530
    :try_start_1
    invoke-static {}, Lexocr/exocrengine/EXOCREngine;->nativeDone()I
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    move v4, v0

    .line 535
    goto :goto_0

    .line 532
    :catch_0
    move-exception v5

    .line 534
    const-string v0, "CardRecog nativeDone error"

    const/4 v1, 0x0

    :try_start_2
    invoke-static {v0, v5, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 536
    :goto_0
    monitor-exit v2

    return v4

    .line 537
    :catchall_0
    move-exception v6

    monitor-exit v2

    throw v6
.end method

.method public static d([BIIIILandroid/graphics/Rect;)Landroid/graphics/Bitmap;
    .locals 26

    .line 357
    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Rect;->width()I

    move-result v8

    .line 358
    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Rect;->height()I

    move-result v9

    .line 360
    move/from16 v0, p3

    const/16 v1, 0x11

    if-eq v0, v1, :cond_0

    move/from16 v0, p3

    const/16 v1, 0x14

    if-ne v0, v1, :cond_a

    .line 362
    :cond_0
    mul-int v10, p1, p2

    .line 363
    mul-int v0, v8, v9

    new-array v11, v0, [I

    .line 364
    move-object/from16 v12, p0

    .line 365
    move-object/from16 v0, p5

    iget v0, v0, Landroid/graphics/Rect;->top:I

    mul-int v0, v0, p1

    move-object/from16 v1, p5

    iget v1, v1, Landroid/graphics/Rect;->left:I

    add-int v13, v0, v1

    .line 366
    move-object/from16 v0, p5

    iget v0, v0, Landroid/graphics/Rect;->top:I

    div-int/lit8 v0, v0, 0x2

    mul-int v0, v0, p1

    move-object/from16 v1, p5

    iget v1, v1, Landroid/graphics/Rect;->left:I

    div-int/lit8 v1, v1, 0x2

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    add-int v14, v0, v10

    .line 369
    const/16 v19, 0x0

    :goto_0
    move/from16 v0, v19

    if-ge v0, v9, :cond_9

    .line 371
    mul-int v20, v19, v8

    .line 372
    const/16 v21, 0x0

    :goto_1
    move/from16 v0, v21

    if-ge v0, v8, :cond_7

    .line 374
    add-int v0, v13, v21

    aget-byte v0, v12, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v15, v0, -0x10

    .line 376
    shr-int/lit8 v0, v21, 0x1

    shl-int/lit8 v18, v0, 0x1

    .line 377
    add-int v0, v14, v18

    aget-byte v0, v12, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v17, v0, -0x80

    .line 378
    add-int v0, v14, v18

    add-int/lit8 v0, v0, 0x1

    aget-byte v0, v12, v0

    and-int/lit16 v0, v0, 0xff

    add-int/lit8 v16, v0, -0x80

    .line 380
    mul-int/lit16 v0, v15, 0x4a8

    move/from16 v22, v0

    .line 381
    move/from16 v0, v17

    mul-int/lit16 v0, v0, 0x662

    add-int v23, v22, v0

    .line 382
    move/from16 v0, v17

    mul-int/lit16 v0, v0, 0x341

    sub-int v0, v22, v0

    move/from16 v1, v16

    mul-int/lit16 v1, v1, 0x190

    sub-int v24, v0, v1

    .line 383
    move/from16 v0, v16

    mul-int/lit16 v0, v0, 0x812

    add-int v25, v22, v0

    .line 385
    if-gez v23, :cond_1

    .line 386
    const/16 v23, 0x0

    goto :goto_2

    .line 387
    :cond_1
    move/from16 v0, v23

    const v1, 0x3ffff

    if-le v0, v1, :cond_2

    .line 388
    const v23, 0x3ffff

    .line 389
    :cond_2
    :goto_2
    if-gez v24, :cond_3

    .line 390
    const/16 v24, 0x0

    goto :goto_3

    .line 391
    :cond_3
    move/from16 v0, v24

    const v1, 0x3ffff

    if-le v0, v1, :cond_4

    .line 392
    const v24, 0x3ffff

    .line 393
    :cond_4
    :goto_3
    if-gez v25, :cond_5

    .line 394
    const/16 v25, 0x0

    goto :goto_4

    .line 395
    :cond_5
    move/from16 v0, v25

    const v1, 0x3ffff

    if-le v0, v1, :cond_6

    .line 396
    const v25, 0x3ffff

    .line 398
    :cond_6
    :goto_4
    add-int v0, v20, v21

    shl-int/lit8 v1, v23, 0x6

    const/high16 v2, 0xff0000

    and-int/2addr v1, v2

    const/high16 v2, -0x1000000

    or-int/2addr v1, v2

    shr-int/lit8 v2, v24, 0x2

    const v3, 0xff00

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    shr-int/lit8 v2, v25, 0xa

    and-int/lit16 v2, v2, 0xff

    or-int/2addr v1, v2

    aput v1, v11, v0

    .line 372
    add-int/lit8 v21, v21, 0x1

    goto/16 :goto_1

    .line 401
    :cond_7
    add-int v13, v13, p1

    .line 402
    move-object/from16 v0, p5

    iget v0, v0, Landroid/graphics/Rect;->top:I

    add-int v0, v0, v19

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 404
    add-int v14, v14, p1

    .line 369
    :cond_8
    add-int/lit8 v19, v19, 0x1

    goto/16 :goto_0

    .line 407
    :cond_9
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v8, v9, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v19

    .line 408
    move-object/from16 v0, v19

    move-object v1, v11

    move v3, v8

    move v6, v8

    move v7, v9

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    .line 409
    move-object/from16 v0, v19

    move/from16 v1, p4

    invoke-static {v0, v1}, Lexocr/exocrengine/EXOCREngine;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v19

    .line 410
    return-object v19

    .line 412
    :cond_a
    const/4 v0, 0x0

    return-object v0
.end method

.method public static e([BIIIIIIIII[BI)I
    .locals 4

    .line 561
    const/4 v2, 0x0

    .line 564
    :try_start_0
    invoke-static/range {p0 .. p11}, Lexocr/exocrengine/EXOCREngine;->nativeRecoScanLineRawdata([BIIIIIIIII[BI)I
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v2, v0

    .line 570
    goto :goto_0

    .line 567
    :catch_0
    move-exception v3

    .line 569
    const-string v0, "CardRecog recoScanLineRawdata error"

    const/4 v1, 0x0

    invoke-static {v0, v3, v1}, Lcom/huawei/wallet/utils/log/LogC;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 571
    :goto_0
    return v2
.end method

.method private static native nativeCheckSignature(Landroid/content/Context;)I
.end method

.method private static native nativeDone()I
.end method

.method private static native nativeInit([B)I
.end method

.method public static native nativeRecoScanLineRawdata([BIIIIIIIII[BI)I
.end method
