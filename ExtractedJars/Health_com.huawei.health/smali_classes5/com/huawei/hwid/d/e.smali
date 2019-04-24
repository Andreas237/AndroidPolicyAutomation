.class public Lcom/huawei/hwid/d/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-class v0, Lcom/huawei/hwid/d/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)I
    .locals 1

    .line 383
    const/16 v0, 0x3e8

    if-le p0, v0, :cond_0

    .line 384
    const/16 v0, 0x3c

    return v0

    .line 385
    :cond_0
    const/16 v0, 0x2ee

    if-le p0, v0, :cond_1

    .line 386
    const/16 v0, 0x28

    return v0

    .line 387
    :cond_1
    const/16 v0, 0x1f4

    if-le p0, v0, :cond_2

    .line 388
    const/16 v0, 0x14

    return v0

    .line 390
    :cond_2
    const/16 v0, 0xa

    return v0
.end method

.method private static a(Ljava/lang/String;II)Landroid/graphics/Bitmap;
    .locals 9

    .line 404
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 405
    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 406
    invoke-static {p0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 408
    iget v3, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 409
    iget v4, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 410
    div-int v5, v3, p1

    .line 411
    div-int v6, v4, p2

    .line 414
    if-ge v5, v6, :cond_0

    .line 415
    move v7, v5

    goto :goto_0

    .line 417
    :cond_0
    move v7, v6

    .line 420
    :goto_0
    const/4 v0, 0x1

    if-ge v7, v0, :cond_1

    .line 421
    const/4 v7, 0x1

    .line 423
    :cond_1
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "Image compression ratio"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 425
    iput v7, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 427
    const/4 v0, 0x0

    iput-boolean v0, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 429
    invoke-static {p0, v2}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 431
    return-object v8
.end method

.method public static a(Landroid/content/Context;)Landroid/net/Uri;
    .locals 2

    .line 115
    invoke-static {p0}, Lcom/huawei/hwid/d/e;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 116
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    const/4 v0, 0x0

    return-object v0

    .line 120
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method private static a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;
    .locals 4

    .line 140
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 141
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 143
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 144
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".hwid.update.provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 145
    invoke-static {p0}, Lcom/huawei/hwid/d/e;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    invoke-static {p0, v3, p1}, Lcom/huawei/hwid/update/provider/UpdateProvider;->a(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0

    .line 148
    :cond_2
    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    .line 124
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 125
    const/4 v0, 0x0

    return-object v0

    .line 127
    :cond_0
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/huawei/hwid/d/e;->a(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    .line 129
    return-object v1
.end method

.method private static a()Ljava/lang/String;
    .locals 4

    .line 50
    new-instance v2, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 51
    new-instance v3, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd_HHmmss"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v3, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HwID_card_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v3, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/io/File;)V
    .locals 7

    .line 255
    if-nez p0, :cond_0

    .line 256
    return-void

    .line 258
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 259
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 260
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "deleteDirInnerPicFile files == null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 261
    return-void

    .line 263
    :cond_1
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_3

    aget-object v6, v3, v5

    .line 264
    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HwID_card_"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 265
    invoke-virtual {v6}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_2

    .line 266
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "delete file fail"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 270
    :cond_3
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;)Z
    .locals 14

    .line 334
    invoke-static {p0}, Lcom/huawei/hwid/d/e;->f(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v4

    .line 335
    iget v0, v4, Landroid/graphics/Point;->x:I

    if-lez v0, :cond_0

    iget v5, v4, Landroid/graphics/Point;->x:I

    goto :goto_0

    :cond_0
    const/16 v5, 0x780

    .line 336
    :goto_0
    iget v0, v4, Landroid/graphics/Point;->y:I

    if-lez v0, :cond_1

    iget v6, v4, Landroid/graphics/Point;->y:I

    goto :goto_1

    :cond_1
    const/16 v6, 0x438

    .line 337
    :goto_1
    invoke-static {p1, v5, v6}, Lcom/huawei/hwid/d/e;->a(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 338
    if-nez v7, :cond_2

    .line 339
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "bitmap is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 340
    const/4 v0, 0x0

    return v0

    .line 342
    :cond_2
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 343
    const/16 v9, 0x64

    .line 344
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v7, v0, v9, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 345
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    const/high16 v1, 0x1400000

    if-le v0, v1, :cond_3

    .line 346
    const/4 v0, 0x0

    return v0

    .line 348
    :cond_3
    :goto_2
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    move/from16 v1, p2

    mul-int/lit16 v1, v1, 0x400

    if-le v0, v1, :cond_4

    .line 349
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    array-length v0, v0

    div-int/lit16 v0, v0, 0x400

    invoke-static {v0}, Lcom/huawei/hwid/d/e;->a(I)I

    move-result v3

    .line 350
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 351
    sub-int/2addr v9, v3

    .line 352
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v7, v0, v9, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_2

    .line 354
    :cond_4
    const/4 v10, 0x0

    .line 356
    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    new-instance v1, Ljava/io/File;

    move-object/from16 v2, p3

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v10, v0

    .line 357
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v10, v0}, Ljava/io/FileOutputStream;->write([B)V

    .line 358
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->flush()V

    .line 359
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 363
    if-eqz v10, :cond_6

    .line 365
    :try_start_1
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 368
    goto :goto_4

    .line 366
    :catch_0
    move-exception v11

    .line 367
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "fos.close IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    goto :goto_4

    .line 360
    :catch_1
    move-exception v11

    .line 361
    :try_start_2
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "IOException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 363
    if-eqz v10, :cond_6

    .line 365
    :try_start_3
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 368
    goto :goto_4

    .line 366
    :catch_2
    move-exception v11

    .line 367
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "fos.close IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    goto :goto_4

    .line 363
    :catchall_0
    move-exception v12

    if-eqz v10, :cond_5

    .line 365
    :try_start_4
    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 368
    goto :goto_3

    .line 366
    :catch_3
    move-exception v13

    .line 367
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "fos.close IOException  "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    :cond_5
    :goto_3
    throw v12

    .line 371
    :cond_6
    :goto_4
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 372
    const/4 v0, 0x1

    return v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 6

    .line 155
    new-instance v2, Lcom/huawei/hwid/d/d;

    invoke-direct {v2, p0}, Lcom/huawei/hwid/d/d;-><init>(Landroid/content/Context;)V

    .line 156
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    .line 157
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".hwid.update.provider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 158
    const/4 v5, 0x0

    .line 160
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_1

    .line 161
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v1, 0x17

    if-le v0, v1, :cond_0

    .line 162
    const/4 v5, 0x1

    goto :goto_0

    .line 163
    :cond_0
    invoke-virtual {v2, v3, v4}, Lcom/huawei/hwid/d/d;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 164
    const/4 v5, 0x1

    .line 167
    :cond_1
    :goto_0
    return v5
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 170
    invoke-static {p0}, Lcom/huawei/hwid/d/e;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 171
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/huawei/hwid/d/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 174
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 178
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    .line 179
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 180
    const-string v0, ""

    return-object v0

    .line 182
    :cond_0
    const-string v0, "mounted_ro"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 183
    const-string v0, ""

    return-object v0

    .line 185
    :cond_1
    const-string v0, "mounted"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 186
    const-string v0, ""

    return-object v0

    .line 188
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    move-result-object v3

    .line 189
    if-eqz v3, :cond_3

    .line 190
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 192
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 193
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 194
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v5}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-nez v0, :cond_4

    .line 196
    const-string v0, ""

    return-object v0

    .line 198
    :cond_4
    return-object v4
.end method

.method public static e(Landroid/content/Context;)V
    .locals 4

    .line 238
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "deleteCachedFiles"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    invoke-static {p0}, Lcom/huawei/hwid/d/e;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 240
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    return-void

    .line 243
    :cond_0
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 244
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 245
    invoke-static {v3}, Lcom/huawei/hwid/d/e;->a(Ljava/io/File;)V

    .line 247
    :cond_1
    return-void
.end method

.method public static f(Landroid/content/Context;)Landroid/graphics/Point;
    .locals 12

    .line 279
    const-string v0, "window"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/view/WindowManager;

    .line 280
    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v8

    .line 281
    new-instance v9, Landroid/util/DisplayMetrics;

    invoke-direct {v9}, Landroid/util/DisplayMetrics;-><init>()V

    .line 282
    invoke-virtual {v8, v9}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 284
    iget v5, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 285
    iget v6, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 287
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_0

    .line 289
    :try_start_0
    const-class v0, Landroid/view/Display;

    const-string v1, "getRawHeight"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move v5, v0

    .line 290
    const-class v0, Landroid/view/Display;

    const-string v1, "getRawWidth"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v0, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result v0

    move v6, v0

    .line 301
    goto/16 :goto_0

    .line 291
    :catch_0
    move-exception v10

    .line 292
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize IllegalArgumentException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    goto/16 :goto_0

    .line 293
    :catch_1
    move-exception v10

    .line 294
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize IllegalAccessException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    goto/16 :goto_0

    .line 295
    :catch_2
    move-exception v10

    .line 296
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize InvocationTargetException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    goto/16 :goto_0

    .line 297
    :catch_3
    move-exception v10

    .line 298
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize NoSuchMethodException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    goto/16 :goto_0

    .line 299
    :catch_4
    move-exception v10

    .line 300
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize Exception "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    goto/16 :goto_0

    .line 302
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    .line 304
    new-instance v10, Landroid/graphics/Point;

    invoke-direct {v10}, Landroid/graphics/Point;-><init>()V

    .line 306
    :try_start_1
    const-class v0, Landroid/view/Display;

    const-string v1, "getRealSize"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Landroid/graphics/Point;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v10, v1, v2

    invoke-virtual {v0, v8, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    iget v0, v10, Landroid/graphics/Point;->y:I

    move v5, v0

    .line 308
    iget v0, v10, Landroid/graphics/Point;->x:I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_8
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_9

    move v6, v0

    .line 319
    goto :goto_0

    .line 309
    :catch_5
    move-exception v11

    .line 310
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize IllegalArgumentException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    goto :goto_0

    .line 311
    :catch_6
    move-exception v11

    .line 312
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize IllegalAccessException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    goto :goto_0

    .line 313
    :catch_7
    move-exception v11

    .line 314
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize InvocationTargetException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    goto :goto_0

    .line 315
    :catch_8
    move-exception v11

    .line 316
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize NoSuchMethodException "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    goto :goto_0

    .line 317
    :catch_9
    move-exception v11

    .line 318
    sget-object v0, Lcom/huawei/hwid/d/e;->a:Ljava/lang/String;

    const-string v1, "getRealScreenSize Exception "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    :cond_1
    :goto_0
    new-instance v10, Landroid/graphics/Point;

    invoke-direct {v10, v6, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 322
    return-object v10
.end method
