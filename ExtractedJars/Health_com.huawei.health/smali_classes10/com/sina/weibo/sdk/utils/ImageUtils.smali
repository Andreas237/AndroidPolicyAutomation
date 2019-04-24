.class public Lcom/sina/weibo/sdk/utils/ImageUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static copyFileToWeiboTem(Landroid/content/Context;Landroid/net/Uri;I)Ljava/lang/String;
    .locals 24

    .line 336
    const/4 v6, 0x0

    .line 337
    const/4 v7, 0x0

    .line 339
    :try_start_0
    invoke-static/range {p0 .. p0}, Lcom/sina/weibo/sdk/WeiboAppManager;->queryWbInfoInternal(Landroid/content/Context;)Lcom/sina/weibo/sdk/auth/WbAppInfo;

    move-result-object v8

    .line 340
    invoke-virtual {v8}, Lcom/sina/weibo/sdk/auth/WbAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v9

    .line 341
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 342
    const-string v9, "com.sina.weibo"

    .line 344
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "/Android/data/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/files/.composerTem/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 345
    new-instance v11, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v11, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 346
    invoke-virtual {v11}, Ljava/io/File;->mkdirs()Z

    .line 347
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v12

    .line 348
    const/4 v13, 0x0

    .line 349
    const/4 v14, 0x0

    .line 351
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "file"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v13, v0

    goto :goto_0

    .line 354
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "_display_name"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    move-object v14, v0

    .line 358
    if-eqz v14, :cond_2

    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 359
    const-string v0, "_display_name"

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    move-object v13, v0

    .line 366
    :cond_2
    :goto_0
    if-eqz v14, :cond_4

    .line 367
    :try_start_2
    invoke-interface {v14}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 363
    :catch_0
    move-exception v15

    .line 364
    const-string v0, "weibo sdk rename"

    :try_start_3
    invoke-virtual {v15}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 366
    if-eqz v14, :cond_4

    .line 367
    :try_start_4
    invoke-interface {v14}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    .line 366
    :catchall_0
    move-exception v16

    if-eqz v14, :cond_3

    .line 367
    :try_start_5
    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v16

    .line 370
    :cond_4
    :goto_1
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 371
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    if-nez p2, :cond_5

    const-string v1, "_sdk_temp.mp4"

    goto :goto_2

    :cond_5
    const-string v1, "_sdk_temp.jpg"

    :goto_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 374
    :cond_6
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "r"

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    move-result-object v15

    .line 375
    invoke-virtual {v15}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v16

    .line 376
    new-instance v0, Ljava/io/BufferedInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    move-object/from16 v2, v16

    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    move-object v6, v0

    .line 378
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v0

    .line 379
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 380
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->delete()Z

    .line 382
    :cond_7
    new-instance v0, Ljava/io/FileOutputStream;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v7, v0

    .line 383
    const/16 v0, 0x5a4

    new-array v0, v0, [B

    move-object/from16 v18, v0

    .line 385
    :goto_3
    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v19, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_8

    .line 386
    move-object/from16 v0, v18

    const/4 v1, 0x0

    move/from16 v2, v19

    invoke-virtual {v7, v0, v1, v2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_3

    .line 388
    :cond_8
    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getPath()Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result-object v20

    .line 394
    if-eqz v6, :cond_9

    .line 395
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 397
    :cond_9
    if-eqz v7, :cond_a

    .line 398
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 400
    :cond_a
    goto :goto_4

    :catch_1
    move-exception v21

    :goto_4
    return-object v20

    .line 390
    :catch_2
    move-exception v8

    .line 391
    const-string v0, "weibo sdk copy"

    :try_start_7
    invoke-virtual {v8}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 394
    if-eqz v6, :cond_b

    .line 395
    :try_start_8
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 397
    :cond_b
    if-eqz v7, :cond_c

    .line 398
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3

    .line 400
    :cond_c
    goto :goto_6

    :catch_3
    move-exception v8

    .line 402
    goto :goto_6

    .line 393
    :catchall_1
    move-exception v22

    .line 394
    if-eqz v6, :cond_d

    .line 395
    :try_start_9
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    .line 397
    :cond_d
    if-eqz v7, :cond_e

    .line 398
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_4

    .line 400
    :cond_e
    goto :goto_5

    :catch_4
    move-exception v23

    :goto_5
    throw v22

    .line 403
    :goto_6
    const/4 v0, 0x0

    return-object v0
.end method

.method private static delete(Ljava/io/File;)V
    .locals 3

    .line 265
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    move-result v0

    if-nez v0, :cond_0

    .line 266
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " doesn\'t be deleted!"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 269
    :cond_0
    return-void
.end method

.method private static deleteDependon(Ljava/lang/String;)Z
    .locals 5

    .line 277
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 278
    const/4 v0, 0x0

    return v0

    .line 279
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 280
    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 281
    nop

    const/4 v3, 0x5

    .line 282
    const/4 v4, 0x0

    .line 283
    if-eqz v1, :cond_2

    .line 284
    :cond_1
    :goto_0
    if-nez v4, :cond_2

    if-gt v2, v3, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 285
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move-result v0

    move v4, v0

    if-nez v0, :cond_1

    .line 286
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 289
    :cond_2
    return v4
.end method

.method public static getVideoDuring(Ljava/lang/String;)J
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xa
    .end annotation

    .line 408
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 409
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 410
    const-wide/16 v0, 0x0

    return-wide v0

    .line 413
    :cond_0
    :try_start_0
    new-instance v3, Landroid/media/MediaMetadataRetriever;

    invoke-direct {v3}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 414
    invoke-virtual {v3, p0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 415
    const/16 v0, 0x9

    invoke-virtual {v3, v0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    return-wide v0

    .line 416
    :catch_0
    move-exception v3

    .line 417
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private static isFileExisted(Ljava/lang/String;)Z
    .locals 2

    .line 298
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 299
    const/4 v0, 0x0

    return v0

    .line 300
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 301
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 302
    const/4 v0, 0x1

    return v0

    .line 304
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private static isParentExist(Ljava/io/File;)Z
    .locals 2

    .line 313
    if-nez p0, :cond_0

    .line 314
    const/4 v0, 0x0

    return v0

    .line 316
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v1

    .line 317
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 318
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    .line 319
    const/4 v0, 0x0

    return v0

    .line 321
    :cond_1
    const/4 v0, 0x1

    return v0

    .line 324
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static isWifi(Landroid/content/Context;)Z
    .locals 4

    .line 452
    const-string v0, "connectivity"

    .line 453
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 454
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    .line 455
    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 456
    const/4 v0, 0x1

    return v0

    .line 458
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private static makesureFileExist(Ljava/lang/String;)V
    .locals 3

    .line 430
    if-nez p0, :cond_0

    .line 431
    return-void

    .line 432
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 433
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2

    .line 434
    invoke-static {v1}, Lcom/sina/weibo/sdk/utils/ImageUtils;->isParentExist(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 435
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 436
    invoke-static {v1}, Lcom/sina/weibo/sdk/utils/ImageUtils;->delete(Ljava/io/File;)V

    .line 438
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 441
    goto :goto_0

    .line 439
    :catch_0
    move-exception v2

    .line 440
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    .line 444
    :cond_2
    :goto_0
    return-void
.end method

.method private static revitionImageSize(Ljava/lang/String;II)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 157
    if-gtz p1, :cond_0

    .line 158
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "size must be greater than 0!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 161
    :cond_0
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/ImageUtils;->isFileExisted(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 162
    new-instance v0, Ljava/io/FileNotFoundException;

    if-nez p0, :cond_1

    const-string v1, "null"

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 165
    :cond_2
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/BitmapHelper;->verifyBitmap(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 166
    new-instance v0, Ljava/io/IOException;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 169
    :cond_3
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 170
    new-instance v5, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v5}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 171
    const/4 v0, 0x1

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 172
    const/4 v0, 0x0

    invoke-static {v4, v0, v5}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 174
    :try_start_0
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 177
    goto :goto_1

    .line 175
    :catch_0
    move-exception v6

    .line 176
    invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V

    .line 179
    :goto_1
    const/4 v6, 0x0

    .line 180
    const/4 v7, 0x0

    .line 181
    :goto_2
    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    shr-int/2addr v0, v7

    if-gt v0, p1, :cond_4

    iget v0, v5, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    shr-int/2addr v0, v7

    if-gt v0, p1, :cond_4

    .line 182
    move v6, v7

    .line 183
    goto :goto_3

    .line 180
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 187
    :goto_3
    int-to-double v0, v6

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, v5, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 188
    const/4 v0, 0x0

    iput-boolean v0, v5, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 190
    invoke-static {p0, v5}, Lcom/sina/weibo/sdk/utils/ImageUtils;->safeDecodeBimtapFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v7

    .line 192
    if-nez v7, :cond_5

    .line 193
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Bitmap decode error!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 196
    :cond_5
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/ImageUtils;->deleteDependon(Ljava/lang/String;)Z

    .line 197
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/ImageUtils;->makesureFileExist(Ljava/lang/String;)V

    .line 198
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 199
    if-eqz v5, :cond_6

    iget-object v0, v5, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    if-eqz v0, :cond_6

    iget-object v0, v5, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v1, "png"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 200
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v7, v0, p2, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_4

    .line 202
    :cond_6
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v7, v0, p2, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 205
    :goto_4
    :try_start_1
    invoke-virtual {v8}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 208
    goto :goto_5

    .line 206
    :catch_1
    move-exception v9

    .line 207
    invoke-virtual {v9}, Ljava/lang/Exception;->printStackTrace()V

    .line 209
    :goto_5
    invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V

    .line 210
    return-void
.end method

.method private static revitionImageSizeHD(Ljava/lang/String;II)V
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 67
    if-gtz p1, :cond_0

    .line 68
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "size must be greater than 0!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_0
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/ImageUtils;->isFileExisted(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 71
    new-instance v0, Ljava/io/FileNotFoundException;

    if-nez p0, :cond_1

    const-string v1, "null"

    goto :goto_0

    :cond_1
    move-object v1, p0

    :goto_0
    invoke-direct {v0, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_2
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/BitmapHelper;->verifyBitmap(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 75
    new-instance v0, Ljava/io/IOException;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 78
    :cond_3
    mul-int/lit8 v4, p1, 0x2

    .line 79
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 80
    new-instance v6, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v6}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 81
    const/4 v0, 0x1

    iput-boolean v0, v6, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 82
    const/4 v0, 0x0

    invoke-static {v5, v0, v6}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 84
    :try_start_0
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    goto :goto_1

    .line 85
    :catch_0
    move-exception v7

    .line 86
    invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V

    .line 89
    :goto_1
    const/4 v7, 0x0

    .line 90
    const/4 v8, 0x0

    .line 91
    :goto_2
    iget v0, v6, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    shr-int/2addr v0, v8

    if-gt v0, v4, :cond_4

    iget v0, v6, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    shr-int/2addr v0, v8

    if-gt v0, v4, :cond_4

    .line 92
    move v7, v8

    .line 93
    goto :goto_3

    .line 90
    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 97
    :goto_3
    int-to-double v0, v7

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, v6, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, v6, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 100
    invoke-static {p0, v6}, Lcom/sina/weibo/sdk/utils/ImageUtils;->safeDecodeBimtapFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v8

    .line 102
    if-nez v8, :cond_5

    .line 103
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Bitmap decode error!"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 106
    :cond_5
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/ImageUtils;->deleteDependon(Ljava/lang/String;)Z

    .line 107
    invoke-static {p0}, Lcom/sina/weibo/sdk/utils/ImageUtils;->makesureFileExist(Ljava/lang/String;)V

    .line 109
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    if-le v0, v1, :cond_6

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 110
    :goto_4
    int-to-float v0, p1

    int-to-float v1, v9

    div-float v10, v0, v1

    .line 112
    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, v10, v0

    if-gez v0, :cond_8

    .line 116
    :goto_5
    :try_start_1
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, v10

    float-to-int v0, v0

    .line 117
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v1, v10

    float-to-int v1, v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 116
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v11

    .line 118
    goto :goto_6

    .line 119
    :catch_1
    move-exception v12

    .line 120
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 121
    float-to-double v0, v10

    const-wide v2, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v0, v2

    double-to-float v10, v0

    .line 122
    goto :goto_5

    .line 124
    :goto_6
    if-nez v11, :cond_7

    .line 125
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 127
    :cond_7
    new-instance v12, Landroid/graphics/Canvas;

    invoke-direct {v12, v11}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 128
    new-instance v13, Landroid/graphics/Matrix;

    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    .line 129
    invoke-virtual {v13, v10, v10}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 130
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {v12, v8, v13, v0}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 131
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 132
    move-object v8, v11

    .line 134
    :cond_8
    new-instance v11, Ljava/io/FileOutputStream;

    invoke-direct {v11, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 135
    if-eqz v6, :cond_9

    iget-object v0, v6, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    if-eqz v0, :cond_9

    iget-object v0, v6, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string v1, "png"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 136
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 v1, p2

    invoke-virtual {v8, v0, v1, v11}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    goto :goto_7

    .line 138
    :cond_9
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    move/from16 v1, p2

    invoke-virtual {v8, v0, v1, v11}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 141
    :goto_7
    :try_start_2
    invoke-virtual {v11}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 144
    goto :goto_8

    .line 142
    :catch_2
    move-exception v12

    .line 143
    invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V

    .line 146
    :goto_8
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 147
    return-void
.end method

.method private static safeDecodeBimtapFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 9

    .line 223
    move-object v2, p1

    .line 224
    if-nez v2, :cond_0

    .line 225
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 226
    const/4 v0, 0x1

    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 229
    :cond_0
    const/4 v3, 0x0

    .line 230
    const/4 v4, 0x0

    .line 232
    const/4 v5, 0x5

    .line 233
    const/4 v6, 0x0

    :goto_0
    const/4 v0, 0x5

    if-ge v6, v0, :cond_1

    .line 235
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    move-object v4, v0

    .line 236
    const/4 v0, 0x0

    invoke-static {v4, v0, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v0

    move-object v3, v0

    .line 238
    :try_start_1
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_3

    .line 241
    goto :goto_1

    .line 239
    :catch_0
    move-exception v7

    .line 240
    :try_start_2
    invoke-virtual {v7}, Ljava/io/IOException;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3

    .line 242
    :goto_1
    goto :goto_4

    .line 243
    :catch_1
    move-exception v7

    .line 244
    invoke-virtual {v7}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 245
    iget v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, v2, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 247
    :try_start_3
    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 250
    goto :goto_2

    .line 248
    :catch_2
    move-exception v8

    .line 249
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 253
    :goto_2
    goto :goto_3

    .line 251
    :catch_3
    move-exception v7

    .line 252
    goto :goto_4

    .line 233
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 256
    :cond_1
    :goto_4
    return-object v3
.end method
