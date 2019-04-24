.class public Lo/aqr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/io/File;)Ljava/lang/String;
    .locals 4

    .line 544
    const-string v1, ""

    .line 545
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    .line 546
    const-string v0, "."

    invoke-virtual {v2, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v3

    .line 547
    if-lez v3, :cond_0

    .line 549
    add-int/lit8 v0, v3, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 551
    :cond_0
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;II)Ljava/lang/String;
    .locals 8

    .line 373
    const/4 v2, 0x0

    .line 374
    const/4 v3, 0x0

    .line 376
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    .line 377
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 380
    invoke-static {p0, v3}, Lo/aqr;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    .line 381
    if-eqz v6, :cond_0

    .line 383
    move-object v5, v3

    goto :goto_0

    .line 387
    :cond_0
    move-object v5, p0

    .line 388
    const-string v0, "MediaFileUtil"

    const-string v1, "imageCompress copy file failed "

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 393
    :goto_0
    :try_start_0
    invoke-static {v5, p3, p4}, Lo/bbw;->e(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 395
    invoke-static {v3, v2}, Lo/aqx;->d(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    .line 404
    goto :goto_1

    .line 397
    :catch_0
    move-exception v7

    .line 399
    const-string v0, "MediaFileUtil"

    const-string v1, "decodeFile OutOfMemoryError"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 404
    goto :goto_1

    .line 401
    :catch_1
    move-exception v7

    .line 403
    const-string v0, "MediaFileUtil"

    const-string v1, "decodeFile failed"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 406
    :goto_1
    return-object v3
.end method

.method private static a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 9

    .line 331
    const/4 v4, 0x0

    .line 334
    :try_start_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v0

    int-to-long v5, v0

    .line 336
    const-wide/16 v0, 0x400

    div-long v0, v5, v0

    const-wide/16 v2, 0x190

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/16 v7, 0x37

    goto :goto_0

    :cond_0
    const/16 v7, 0x64

    .line 337
    :goto_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 339
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1, v0, v7, v4}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 340
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V

    .line 342
    invoke-static {p0, p1}, Lo/aqx;->d(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 358
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 359
    goto :goto_1

    .line 344
    :catch_0
    move-exception v5

    .line 346
    const-string v0, "MediaFileUtil"

    const-string v1, "compressAndAddtoCache RuntimeException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 358
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 359
    goto :goto_1

    .line 348
    :catch_1
    move-exception v5

    .line 350
    const-string v0, "MediaFileUtil"

    const-string v1, "compressAndAddtoCache OutOfMemoryError"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 358
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 359
    goto :goto_1

    .line 352
    :catch_2
    move-exception v5

    .line 354
    const-string v0, "MediaFileUtil"

    const-string v1, "compressAndAddtoCache Throwable"

    :try_start_3
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 358
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 359
    goto :goto_1

    .line 358
    :catchall_0
    move-exception v8

    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 359
    throw v8

    .line 360
    :goto_1
    return-void
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 1

    .line 600
    invoke-static {p0}, Lo/bot;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static a(Ljava/io/InputStream;)[B
    .locals 7

    .line 121
    const/4 v2, 0x0

    .line 122
    const/16 v0, 0x400

    new-array v3, v0, [B

    .line 123
    const/4 v4, 0x0

    .line 126
    const/4 v5, -0x1

    .line 127
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v4, v0

    .line 128
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 130
    const/4 v0, 0x0

    invoke-virtual {v4, v3, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 132
    :cond_0
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    .line 140
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 141
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 142
    goto :goto_1

    .line 134
    :catch_0
    move-exception v5

    .line 136
    const-string v0, "MediaFileUtil"

    const-string v1, "readStream IOException"

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 141
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 142
    goto :goto_1

    .line 140
    :catchall_0
    move-exception v6

    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 141
    invoke-static {p0}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 142
    throw v6

    .line 143
    :goto_1
    return-object v2
.end method

.method public static b(Ljava/io/File;)Ljava/lang/String;
    .locals 5

    .line 562
    const/4 v1, 0x0

    .line 566
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v1, v0

    .line 568
    invoke-static {v1}, Lo/bor;->b(Ljava/io/InputStream;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 576
    if-eqz v1, :cond_0

    .line 578
    invoke-static {v1}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 568
    :cond_0
    return-object v2

    .line 570
    :catch_0
    move-exception v2

    .line 572
    const/4 v3, 0x0

    .line 576
    if-eqz v1, :cond_1

    .line 578
    invoke-static {v1}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 572
    :cond_1
    return-object v3

    .line 576
    :catchall_0
    move-exception v4

    if-eqz v1, :cond_2

    .line 578
    invoke-static {v1}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 580
    :cond_2
    throw v4
.end method

.method public static b()Z
    .locals 1

    .line 590
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/aqr;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static c(Landroid/net/Uri;)Ljava/io/InputStream;
    .locals 6

    .line 215
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 217
    const-string v0, "MediaFileUtil"

    const-string v1, "getInputStream error. the uri is null."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 218
    const/4 v0, 0x0

    return-object v0

    .line 220
    :cond_0
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 222
    const-string v0, "MediaFileUtil"

    const-string v1, "no storage permission."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_1
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v2

    .line 228
    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    .line 229
    const/4 v4, 0x0

    .line 232
    :try_start_0
    invoke-virtual {v3, p0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 237
    goto :goto_0

    .line 234
    :catch_0
    move-exception v5

    .line 236
    const-string v0, "MediaFileUtil"

    const-string v1, "open file failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    :goto_0
    if-nez v4, :cond_2

    .line 240
    const/4 v0, 0x0

    return-object v0

    .line 242
    :cond_2
    return-object v4
.end method

.method private static c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 13

    .line 418
    const/4 v2, 0x0

    .line 419
    const/4 v3, 0x0

    .line 420
    const/4 v4, 0x0

    .line 423
    const/4 v5, 0x0

    .line 424
    :try_start_0
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 425
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 428
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    .line 431
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 432
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".bak"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 434
    new-instance v10, Ljava/io/File;

    invoke-direct {v10, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 436
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v10}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 437
    const/16 v0, 0x400

    new-array v11, v0, [B

    .line 438
    :goto_0
    invoke-virtual {v3, v11}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 440
    const/4 v0, 0x0

    invoke-virtual {v4, v11, v0, v5}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    .line 442
    :cond_0
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V

    .line 444
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 446
    const/4 v2, 0x1

    goto :goto_1

    .line 450
    :cond_1
    const-string v0, "MediaFileUtil"

    const-string v1, "copyFile renameTo Exception"

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 460
    :cond_2
    :goto_1
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 461
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 462
    goto :goto_2

    .line 454
    :catch_0
    move-exception v5

    .line 456
    const-string v0, "MediaFileUtil"

    const-string v1, "copyFile IOException."

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 460
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 461
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 462
    goto :goto_2

    .line 460
    :catchall_0
    move-exception v12

    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 461
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 462
    throw v12

    .line 464
    :goto_2
    return v2
.end method

.method public static d(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 156
    invoke-static {p0}, Lo/aqr;->c(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3

    .line 157
    if-nez v3, :cond_0

    .line 159
    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_0
    const/4 v4, 0x0

    .line 168
    :try_start_0
    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v0

    invoke-virtual {v0}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v5

    .line 169
    const-string v0, "hwsns_image_"

    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 174
    goto :goto_0

    .line 171
    :catch_0
    move-exception v5

    .line 173
    const-string v0, "MediaFileUtil"

    const-string v1, "creat tmp file failed"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    :goto_0
    if-nez v4, :cond_1

    .line 178
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 179
    const/4 v0, 0x0

    return-object v0

    .line 183
    :cond_1
    invoke-static {v3, v4}, Lo/aqr;->e(Ljava/io/InputStream;Ljava/io/File;)Z

    move-result v5

    .line 184
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 186
    const/4 v6, 0x0

    .line 187
    if-eqz v5, :cond_2

    .line 190
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 191
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/bbw;->d(Ljava/lang/String;)Z

    move-result v1

    .line 190
    invoke-static {v0, p1, v1}, Lo/aqr;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    .line 195
    :cond_2
    const-string v0, "MediaFileUtil"

    const-string v1, "copy file failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    :goto_1
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_3

    .line 201
    const-string v0, "MediaFileUtil"

    const-string v1, "tmp file delete failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    :cond_3
    return-object v6
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 319
    invoke-static {p0}, Lo/bbw;->d(Ljava/lang/String;)Z

    move-result v0

    invoke-static {p0, p1, v0}, Lo/aqr;->e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/net/Uri;I)Landroid/graphics/Bitmap;
    .locals 7

    .line 73
    if-nez p0, :cond_0

    .line 75
    const/4 v0, 0x0

    return-object v0

    .line 77
    :cond_0
    invoke-static {p0}, Lo/aqr;->c(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    .line 78
    if-nez v2, :cond_1

    .line 80
    const/4 v0, 0x0

    return-object v0

    .line 82
    :cond_1
    const/4 v3, 0x0

    .line 83
    invoke-static {v2}, Lo/aqr;->a(Ljava/io/InputStream;)[B

    move-result-object v4

    .line 84
    if-nez v4, :cond_2

    .line 86
    invoke-static {v2}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 87
    const/4 v0, 0x0

    return-object v0

    .line 92
    :cond_2
    :try_start_0
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 93
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 94
    array-length v0, v4

    const/4 v1, 0x0

    invoke-static {v4, v1, v0, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 96
    invoke-static {v5, p1, p1}, Lo/aqn;->b(Landroid/graphics/BitmapFactory$Options;II)I

    move-result v0

    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 99
    const/4 v0, 0x0

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 100
    array-length v0, v4

    const/4 v1, 0x0

    invoke-static {v4, v1, v0, v5}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v3, v0

    .line 108
    invoke-static {v2}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 109
    goto :goto_0

    .line 102
    :catch_0
    move-exception v5

    .line 104
    const-string v0, "MediaFileUtil"

    const-string v1, "decodeSampledBitmapFromInputStream OutOfMemoryError "

    :try_start_1
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    invoke-static {v2}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 109
    goto :goto_0

    .line 108
    :catchall_0
    move-exception v6

    invoke-static {v2}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 109
    throw v6

    .line 110
    :goto_0
    return-object v3
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    .line 476
    move-object v2, p0

    .line 477
    const/4 v3, 0x0

    .line 478
    const/4 v4, 0x0

    .line 481
    const/4 v5, 0x0

    .line 482
    :try_start_0
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 483
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 487
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v3, v0

    .line 489
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    invoke-virtual {v0}, Lo/bbh;->a()Ljava/lang/String;

    move-result-object v7

    .line 491
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 493
    const-string v0, "MediaFileUtil"

    const-string v1, "getDiskSavePath() empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 494
    move-object v8, v2

    .line 529
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 530
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 494
    return-object v8

    .line 497
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/bbu;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 498
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 499
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 501
    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    .line 503
    const-string v0, ""

    const-string v1, "copyFileToDisk create cacheFile failed."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 508
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 510
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 511
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v4, v0

    .line 512
    const/16 v0, 0x400

    new-array v12, v0, [B

    .line 513
    :goto_0
    invoke-virtual {v3, v12}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    .line 515
    const/4 v0, 0x0

    invoke-virtual {v4, v12, v0, v5}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    .line 517
    :cond_2
    invoke-virtual {v4}, Ljava/io/FileOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 519
    move-object v2, v10

    .line 529
    :cond_3
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 530
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 531
    goto :goto_1

    .line 522
    :catch_0
    move-exception v5

    .line 524
    move-object v2, p0

    .line 525
    const-string v0, "MediaFileUtil"

    const-string v1, "copyFile IOException"

    :try_start_2
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 529
    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 530
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 531
    goto :goto_1

    .line 529
    :catchall_0
    move-exception v13

    invoke-static {v3}, Lo/bpe;->d(Ljava/io/InputStream;)V

    .line 530
    invoke-static {v4}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 531
    throw v13

    .line 533
    :goto_1
    return-object v2
.end method

.method private static e(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 13

    .line 256
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    .line 258
    :cond_0
    const-string v0, "MediaFileUtil"

    const-string v1, "error. the path file for compress is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 259
    const/4 v0, 0x0

    return-object v0

    .line 262
    :cond_1
    const-string v0, "MediaFileUtil"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "imageCompress isForced = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 264
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 265
    move-object v5, p0

    .line 268
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 270
    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v7

    .line 273
    invoke-static {}, Lo/bbh;->d()Lo/bbh;

    move-result-object v0

    const-string v1, "image"

    invoke-virtual {v0, p1, v1}, Lo/bbh;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 274
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->b()I

    move-result v10

    .line 276
    const-wide/16 v0, 0x400

    div-long v0, v7, v0

    const-wide/16 v2, 0x190

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    if-nez p2, :cond_2

    .line 278
    invoke-static {p0, v9, v4, v10, v10}, Lo/aqr;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 280
    :cond_2
    invoke-static {p0, v10, v10}, Lo/bbw;->e(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 282
    if-nez v6, :cond_3

    .line 284
    const-string v0, "MediaFileUtil"

    const-string v1, "imageCompress bitmap failed. try again"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 285
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->m()I

    move-result v11

    .line 286
    invoke-static {p0, v11, v11}, Lo/bbw;->e(Ljava/lang/String;II)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 289
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 290
    invoke-static {v11}, Lo/bbj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 291
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_b.jpg"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 293
    if-eqz v6, :cond_4

    .line 295
    invoke-static {v5, v6}, Lo/aqr;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    goto :goto_0

    .line 299
    :cond_4
    const-string v0, "MediaFileUtil"

    const-string v1, "imageCompress bitmap failed. bitmap is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 301
    :goto_0
    goto :goto_1

    .line 304
    :cond_5
    const-string v0, "MediaFileUtil"

    const-string v1, "error. the path file is not exist."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    :goto_1
    return-object v5
.end method

.method private static e(Ljava/io/InputStream;Ljava/io/File;)Z
    .locals 8

    .line 608
    const/4 v2, 0x0

    .line 611
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 613
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 615
    const-string v0, "MediaFileUtil"

    const-string v1, "delete exist file failed."

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 618
    :cond_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-object v2, v0

    .line 621
    const/16 v0, 0x1000

    :try_start_1
    new-array v3, v0, [B

    .line 623
    :goto_0
    invoke-virtual {p0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v4, v0

    if-ltz v0, :cond_1

    .line 625
    const/4 v0, 0x0

    invoke-virtual {v2, v3, v0, v4}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 630
    :cond_1
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 633
    :try_start_3
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 639
    goto :goto_2

    .line 635
    :catch_0
    move-exception v3

    .line 638
    const-string v0, "MediaFileUtil"

    const-string v1, "copyToFile failed."

    :try_start_4
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 640
    goto :goto_2

    .line 630
    :catchall_0
    move-exception v5

    :try_start_5
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->flush()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 633
    :try_start_6
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 639
    goto :goto_1

    .line 635
    :catch_1
    move-exception v6

    .line 638
    const-string v0, "MediaFileUtil"

    const-string v1, "copyToFile failed."

    :try_start_7
    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 640
    :goto_1
    throw v5
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 641
    :goto_2
    const/4 v3, 0x1

    .line 649
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 641
    return v3

    .line 643
    :catch_2
    move-exception v3

    .line 645
    const/4 v4, 0x0

    .line 649
    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 645
    return v4

    .line 649
    :catchall_1
    move-exception v7

    invoke-static {v2}, Lo/bpe;->b(Ljava/io/OutputStream;)V

    .line 650
    throw v7
.end method
