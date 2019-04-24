.class public final Lo/boe;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 11

    .line 192
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 193
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 195
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 196
    invoke-static {v7, v8, p1, p2}, Lo/boe;->d(IIII)F

    move-result v10

    .line 197
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 198
    move-object v0, p0

    move v3, v7

    move v4, v8

    move-object v5, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 14

    .line 99
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 100
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 102
    int-to-float v0, p1

    int-to-float v1, v7

    div-float v9, v0, v1

    .line 103
    move/from16 v0, p2

    int-to-float v0, v0

    int-to-float v1, v8

    div-float v10, v0, v1

    .line 105
    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 106
    invoke-virtual {v11, v9, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 108
    const/4 v12, 0x0

    .line 112
    move-object v0, p0

    move v3, v7

    move v4, v8

    move-object v5, v11

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    :try_start_0
    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v12, v0

    .line 117
    goto :goto_0

    .line 114
    :catch_0
    move-exception v13

    .line 116
    const-string v0, "BitmapUtils"

    const-string v1, "Decode bitmap OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    :goto_0
    return-object v12
.end method

.method public static b(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 6

    .line 292
    const/4 v4, 0x0

    .line 293
    if-eqz p0, :cond_1

    .line 297
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 298
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 297
    :goto_0
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    move-object v4, v0

    .line 299
    new-instance v5, Landroid/graphics/Canvas;

    invoke-direct {v5, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 300
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v3, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 301
    invoke-virtual {p0, v5}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 306
    goto :goto_1

    .line 303
    :catch_0
    move-exception v5

    .line 305
    const-string v0, "BitmapUtils"

    const-string v1, "drawableToBitmap IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 308
    :cond_1
    :goto_1
    return-object v4
.end method

.method public static b(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1

    .line 59
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lo/boe;->c(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 16

    .line 400
    if-nez p0, :cond_0

    .line 402
    const/4 v0, 0x0

    return-object v0

    .line 404
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 405
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    .line 407
    const/4 v8, 0x0

    const/4 v9, 0x0

    .line 408
    if-lt v5, v6, :cond_1

    .line 410
    move v7, v6

    .line 411
    sub-int v0, v5, v6

    div-int/lit8 v8, v0, 0x2

    goto :goto_0

    .line 415
    :cond_1
    move v7, v5

    .line 416
    sub-int v0, v6, v5

    div-int/lit8 v9, v0, 0x2

    .line 423
    :goto_0
    move-object/from16 v0, p0

    :try_start_0
    invoke-static {v0, v8, v9, v7, v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v11

    .line 426
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v7, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v10

    .line 427
    new-instance v12, Landroid/graphics/Canvas;

    invoke-direct {v12, v10}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 430
    new-instance v13, Landroid/graphics/BitmapShader;

    sget-object v0, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v1, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v13, v11, v0, v1}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 431
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v13, v0}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 433
    new-instance v14, Landroid/graphics/Paint;

    invoke-direct {v14}, Landroid/graphics/Paint;-><init>()V

    .line 434
    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 435
    invoke-virtual {v14, v13}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 437
    new-instance v0, Landroid/graphics/RectF;

    int-to-float v3, v7

    int-to-float v4, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v15, v0

    .line 440
    int-to-float v0, v7

    div-float v0, v0, p1

    int-to-float v1, v7

    div-float v1, v1, p1

    invoke-virtual {v12, v15, v0, v1, v14}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    .line 442
    return-object v10

    .line 444
    :catch_0
    move-exception v11

    .line 446
    const-string v0, "BitmapUtils"

    const-string v1, "roundBitmap IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 447
    const/4 v0, 0x0

    return-object v0

    .line 449
    :catch_1
    move-exception v11

    .line 451
    const-string v0, "BitmapUtils"

    const-string v1, "roundBitmap OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c(Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 4

    .line 71
    const/4 v2, 0x0

    .line 75
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v2, v0

    .line 84
    goto :goto_0

    .line 77
    :catch_0
    move-exception v3

    .line 79
    const-string v0, "BitmapUtils"

    const-string v1, "Make the canonical path error"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    goto :goto_0

    .line 81
    :catch_1
    move-exception v3

    .line 83
    const-string v0, "BitmapUtils"

    const-string v1, "Decode bitmap OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    :goto_0
    return-object v2
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 319
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 321
    const/4 v0, 0x0

    return-object v0

    .line 323
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bor;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 324
    return-object v3
.end method

.method public static c(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;)[B
    .locals 6

    .line 261
    const/4 v3, 0x0

    .line 265
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    mul-int/2addr v1, v2

    mul-int/lit8 v1, v1, 0x4

    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    move-object v3, v0

    .line 267
    const/16 v0, 0x64

    invoke-virtual {p0, p1, v0, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 269
    invoke-virtual {v3}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v4

    .line 277
    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 269
    return-object v4

    .line 271
    :catch_0
    move-exception v4

    .line 273
    const-string v0, "BitmapUtils"

    const-string v1, "Decode bitmap OutOfMemoryError"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 277
    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 278
    goto :goto_0

    .line 277
    :catchall_0
    move-exception v5

    invoke-static {v3}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 278
    throw v5

    .line 280
    :goto_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method private static d(IIII)F
    .locals 4

    .line 248
    int-to-float v0, p2

    int-to-float v1, p0

    div-float v2, v0, v1

    .line 249
    int-to-float v0, p3

    int-to-float v1, p1

    div-float v3, v0, v1

    .line 250
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v0

    return v0
.end method

.method public static d(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 21

    .line 335
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 336
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    .line 339
    if-gt v5, v6, :cond_0

    .line 341
    int-to-float v0, v5

    const/high16 v1, 0x40000000    # 2.0f

    div-float v7, v0, v1

    .line 342
    const/4 v8, 0x0

    .line 343
    const/4 v9, 0x0

    .line 344
    int-to-float v10, v5

    .line 345
    int-to-float v11, v5

    .line 346
    move v6, v5

    .line 347
    const/4 v12, 0x0

    .line 348
    const/4 v13, 0x0

    .line 349
    int-to-float v14, v5

    .line 350
    int-to-float v15, v5

    goto :goto_0

    .line 354
    :cond_0
    int-to-float v0, v6

    const/high16 v1, 0x40000000    # 2.0f

    div-float v7, v0, v1

    .line 355
    sub-int v0, v5, v6

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v16, v0, v1

    .line 356
    move/from16 v8, v16

    .line 357
    int-to-float v0, v5

    sub-float v10, v0, v16

    .line 358
    const/4 v9, 0x0

    .line 359
    int-to-float v11, v6

    .line 360
    move v5, v6

    .line 361
    const/4 v12, 0x0

    .line 362
    const/4 v13, 0x0

    .line 363
    int-to-float v14, v6

    .line 364
    int-to-float v15, v6

    .line 367
    :goto_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v5, v6, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v16

    .line 368
    new-instance v0, Landroid/graphics/Canvas;

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    move-object/from16 v17, v0

    .line 370
    new-instance v18, Landroid/graphics/Paint;

    invoke-direct/range {v18 .. v18}, Landroid/graphics/Paint;-><init>()V

    .line 371
    new-instance v0, Landroid/graphics/Rect;

    float-to-int v1, v8

    float-to-int v3, v10

    float-to-int v4, v11

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object/from16 v19, v0

    .line 372
    new-instance v0, Landroid/graphics/Rect;

    float-to-int v3, v14

    float-to-int v4, v15

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    move-object/from16 v20, v0

    .line 374
    move-object/from16 v0, v18

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 376
    move-object/from16 v0, v17

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawARGB(IIII)V

    .line 377
    move-object/from16 v0, v18

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 382
    move-object/from16 v0, v17

    move-object/from16 v1, v18

    invoke-virtual {v0, v7, v7, v7, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 384
    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v1}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    .line 386
    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move-object/from16 v2, v19

    move-object/from16 v3, v20

    move-object/from16 v4, v18

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 388
    return-object v16
.end method

.method public static d(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;
    .locals 14

    .line 132
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 134
    const-string v0, "BitmapUtils"

    const-string v1, "uniformScaleBitmap sourceBitmap is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    const/4 v0, 0x0

    return-object v0

    .line 141
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 142
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 144
    if-gt v7, p1, :cond_1

    move/from16 v0, p2

    if-le v8, v0, :cond_4

    .line 147
    :cond_1
    int-to-float v0, p1

    int-to-float v1, v7

    div-float v9, v0, v1

    .line 148
    move/from16 v0, p2

    int-to-float v0, v0

    int-to-float v1, v8

    div-float v10, v0, v1

    .line 149
    invoke-static {v9, v10}, Ljava/lang/Math;->min(FF)F

    move-result v11

    .line 151
    new-instance v12, Landroid/graphics/Matrix;

    invoke-direct {v12}, Landroid/graphics/Matrix;-><init>()V

    .line 152
    int-to-float v0, v7

    mul-float/2addr v0, v11

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_2

    .line 155
    int-to-float v0, v7

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    invoke-virtual {v12, v0, v11}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_0

    .line 157
    :cond_2
    int-to-float v0, v8

    mul-float/2addr v0, v11

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-gez v0, :cond_3

    .line 160
    int-to-float v0, v8

    const/high16 v1, 0x3f800000    # 1.0f

    div-float v0, v1, v0

    invoke-virtual {v12, v11, v0}, Landroid/graphics/Matrix;->postScale(FF)Z

    goto :goto_0

    .line 164
    :cond_3
    invoke-virtual {v12, v11, v11}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 167
    :goto_0
    move-object v0, p0

    move v3, v7

    move v4, v8

    move-object v5, v12

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v13

    .line 168
    return-object v13

    .line 178
    :cond_4
    goto :goto_1

    .line 171
    :catch_0
    move-exception v7

    .line 173
    const-string v0, "BitmapUtils"

    const-string v1, "MediaUtils createBitmap OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 178
    goto :goto_1

    .line 175
    :catch_1
    move-exception v7

    .line 177
    const-string v0, "BitmapUtils"

    const-string v1, "MediaUtils createBitmap IllegalArgumentException"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    :goto_1
    return-object p0
.end method

.method public static e(Landroid/graphics/Bitmap;III)Landroid/graphics/Bitmap;
    .locals 13

    .line 211
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v7

    .line 212
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    .line 214
    new-instance v9, Landroid/graphics/Matrix;

    invoke-direct {v9}, Landroid/graphics/Matrix;-><init>()V

    .line 215
    int-to-float v0, p1

    int-to-float v1, v8

    div-float v10, v0, v1

    .line 216
    int-to-float v0, v7

    mul-float/2addr v0, v10

    float-to-int v11, v0

    .line 217
    if-lt v11, p2, :cond_0

    move/from16 v0, p3

    if-gt v11, v0, :cond_0

    .line 219
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 220
    move-object v0, p0

    move v3, v7

    move v4, v8

    move-object v5, v9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 222
    :cond_0
    if-ge v11, p2, :cond_1

    .line 224
    int-to-float v0, p2

    int-to-float v1, v7

    div-float v10, v0, v1

    .line 225
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 226
    int-to-float v0, v8

    int-to-float v1, p1

    div-float/2addr v1, v10

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v12, v0, v1

    .line 227
    move-object v0, p0

    float-to-int v2, v12

    move v3, v7

    int-to-float v1, p1

    div-float/2addr v1, v10

    float-to-int v1, v1

    add-int/lit8 v4, v1, 0x1

    move-object v5, v9

    const/4 v1, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 231
    :cond_1
    invoke-virtual {v9, v10, v10}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 232
    int-to-float v0, v7

    move/from16 v1, p3

    int-to-float v1, v1

    div-float/2addr v1, v10

    sub-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v12, v0, v1

    .line 233
    move-object v0, p0

    float-to-int v1, v12

    move/from16 v2, p3

    int-to-float v2, v2

    div-float/2addr v2, v10

    float-to-int v2, v2

    add-int/lit8 v3, v2, 0x1

    move v4, v8

    move-object v5, v9

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
