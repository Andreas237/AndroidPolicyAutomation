.class public Lcom/tencent/connect/share/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 4

    .line 342
    invoke-static {p0, p1, p2}, Lcom/tencent/connect/share/a;->b(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v2

    .line 346
    const/16 v0, 0x8

    if-gt v2, v0, :cond_0

    .line 347
    const/4 v3, 0x1

    .line 348
    :goto_0
    if-ge v3, v2, :cond_1

    .line 349
    shl-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 352
    :cond_0
    add-int/lit8 v0, v2, 0x7

    div-int/lit8 v0, v0, 0x8

    mul-int/lit8 v3, v0, 0x8

    .line 355
    :cond_1
    return v3
.end method

.method private static a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 12

    .line 193
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    .line 194
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    .line 195
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 196
    if-le v8, v9, :cond_0

    move v10, v8

    goto :goto_0

    :cond_0
    move v10, v9

    .line 197
    :goto_0
    int-to-float v0, p1

    int-to-float v1, v10

    div-float v11, v0, v1

    .line 198
    invoke-virtual {v7, v11, v11}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 199
    move-object v0, p0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    move-object v5, v7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public static final a(Ljava/lang/String;I)Landroid/graphics/Bitmap;
    .locals 8

    .line 281
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 282
    const/4 v0, 0x0

    return-object v0

    .line 284
    :cond_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 285
    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 287
    :try_start_0
    invoke-static {p0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 290
    goto :goto_0

    .line 288
    :catch_0
    move-exception v3

    .line 289
    invoke-virtual {v3}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 291
    :goto_0
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 292
    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 293
    iget-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-nez v0, :cond_1

    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 295
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 297
    :cond_2
    if-le v3, v4, :cond_3

    move v5, v3

    goto :goto_1

    :cond_3
    move v5, v4

    .line 298
    :goto_1
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v0, v2, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 299
    if-le v5, p1, :cond_4

    .line 300
    mul-int v0, p1, p1

    const/4 v1, -0x1

    invoke-static {v2, v1, v0}, Lcom/tencent/connect/share/a;->a(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 303
    :cond_4
    const/4 v0, 0x0

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 304
    const/4 v6, 0x0

    .line 306
    :try_start_1
    invoke-static {p0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 309
    goto :goto_2

    .line 307
    :catch_1
    move-exception v7

    .line 308
    invoke-virtual {v7}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 310
    :goto_2
    if-nez v6, :cond_5

    .line 311
    const/4 v0, 0x0

    return-object v0

    .line 313
    :cond_5
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 314
    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 315
    if-le v3, v4, :cond_6

    move v5, v3

    goto :goto_3

    :cond_6
    move v5, v4

    .line 316
    :goto_3
    if-le v5, p1, :cond_7

    .line 317
    invoke-static {v6, p1}, Lcom/tencent/connect/share/a;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    .line 319
    :cond_7
    return-object v6
.end method

.method protected static final a(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 211
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 212
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 213
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 215
    :cond_0
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    .line 217
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 219
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 221
    :cond_1
    if-eqz p0, :cond_2

    .line 222
    const/4 v4, 0x0

    .line 224
    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 225
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x50

    invoke-virtual {p0, v0, v1, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 226
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V

    .line 227
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V

    .line 228
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 229
    const/4 p0, 0x0

    .line 230
    return-object v3

    .line 231
    :catch_0
    move-exception v5

    .line 233
    invoke-virtual {v5}, Ljava/io/FileNotFoundException;->printStackTrace()V

    .line 237
    goto :goto_0

    .line 234
    :catch_1
    move-exception v5

    .line 236
    invoke-virtual {v5}, Ljava/io/IOException;->printStackTrace()V

    .line 239
    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static final a(Landroid/content/Context;Ljava/lang/String;Lcom/tencent/open/utils/AsynLoadImgBack;)V
    .locals 3

    .line 47
    const-string v0, "AsynScaleCompressImage"

    const-string v1, "scaleCompressImage"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 50
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/tencent/open/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V

    .line 51
    return-void

    .line 53
    :cond_0
    invoke-static {}, Lcom/tencent/open/utils/Util;->hasSDCard()Z

    move-result v0

    if-nez v0, :cond_1

    .line 55
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/tencent/open/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V

    .line 56
    return-void

    .line 58
    :cond_1
    new-instance v2, Lcom/tencent/connect/share/a$1;

    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v2, v0, p2}, Lcom/tencent/connect/share/a$1;-><init>(Landroid/os/Looper;Lcom/tencent/open/utils/AsynLoadImgBack;)V

    .line 76
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/tencent/connect/share/a$2;

    invoke-direct {v1, p1, v2}, Lcom/tencent/connect/share/a$2;-><init>(Ljava/lang/String;Landroid/os/Handler;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 111
    return-void
.end method

.method public static final a(Landroid/content/Context;Ljava/util/ArrayList;Lcom/tencent/open/utils/AsynLoadImgBack;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/ArrayList<Ljava/lang/String;>;Lcom/tencent/open/utils/AsynLoadImgBack;)V"
        }
    .end annotation

    .line 120
    const-string v0, "AsynScaleCompressImage"

    const-string v1, "batchScaleCompressImage"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    if-nez p1, :cond_0

    .line 123
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/tencent/open/utils/AsynLoadImgBack;->saved(ILjava/lang/String;)V

    .line 124
    return-void

    .line 131
    :cond_0
    new-instance v2, Lcom/tencent/connect/share/a$3;

    invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v2, v0, p2}, Lcom/tencent/connect/share/a$3;-><init>(Landroid/os/Looper;Lcom/tencent/open/utils/AsynLoadImgBack;)V

    .line 144
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/tencent/connect/share/a$4;

    invoke-direct {v1, p1, v2}, Lcom/tencent/connect/share/a$4;-><init>(Ljava/util/ArrayList;Landroid/os/Handler;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 184
    return-void
.end method

.method static synthetic a(Ljava/lang/String;II)Z
    .locals 1

    .line 31
    invoke-static {p0, p1, p2}, Lcom/tencent/connect/share/a;->b(Ljava/lang/String;II)Z

    move-result v0

    return v0
.end method

.method private static b(Landroid/graphics/BitmapFactory$Options;II)I
    .locals 10

    .line 360
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    int-to-double v4, v0

    .line 361
    iget v0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    int-to-double v6, v0

    .line 363
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/4 v8, 0x1

    goto :goto_0

    :cond_0
    mul-double v0, v4, v6

    int-to-double v2, p2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v8, v0

    .line 365
    :goto_0
    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/16 v9, 0x80

    goto :goto_1

    :cond_1
    int-to-double v0, p1

    div-double v0, v4, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    int-to-double v2, p1

    div-double v2, v6, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    double-to-int v9, v0

    .line 369
    :goto_1
    if-ge v9, v8, :cond_2

    .line 371
    return v8

    .line 374
    :cond_2
    const/4 v0, -0x1

    if-ne p2, v0, :cond_3

    const/4 v0, -0x1

    if-ne p1, v0, :cond_3

    .line 376
    const/4 v0, 0x1

    return v0

    .line 377
    :cond_3
    const/4 v0, -0x1

    if-ne p1, v0, :cond_4

    .line 378
    return v8

    .line 380
    :cond_4
    return v9
.end method

.method private static final b(Ljava/lang/String;II)Z
    .locals 8

    .line 248
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 249
    const/4 v0, 0x0

    return v0

    .line 251
    :cond_0
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 252
    const/4 v0, 0x1

    iput-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 254
    :try_start_0
    invoke-static {p0, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 257
    goto :goto_0

    .line 255
    :catch_0
    move-exception v4

    .line 256
    invoke-virtual {v4}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 258
    :goto_0
    iget v4, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 259
    iget v5, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 260
    iget-boolean v0, v3, Landroid/graphics/BitmapFactory$Options;->mCancel:Z

    if-nez v0, :cond_1

    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v0, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 262
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 264
    :cond_2
    if-le v4, v5, :cond_3

    move v6, v4

    goto :goto_1

    :cond_3
    move v6, v5

    .line 265
    :goto_1
    if-ge v4, v5, :cond_4

    move v7, v4

    goto :goto_2

    :cond_4
    move v7, v5

    .line 266
    :goto_2
    const-string v0, "AsynScaleCompressImage"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "longSide="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "shortSide="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 267
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    iput-object v0, v3, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 269
    if-gt v6, p2, :cond_5

    if-le v7, p1, :cond_6

    .line 270
    :cond_5
    const/4 v0, 0x1

    return v0

    .line 272
    :cond_6
    const/4 v0, 0x0

    return v0
.end method
