.class public Lcom/sina/weibo/sdk/net/HttpManager;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final BOUNDARY:Ljava/lang/String;

.field private static final END_MP_BOUNDARY:Ljava/lang/String;

.field private static final MP_BOUNDARY:Ljava/lang/String;

.field private static final TAG:Ljava/lang/String; = "HttpManager"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 43
    const-string v0, "weibosdkcore"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 47
    invoke-static {}, Lcom/sina/weibo/sdk/net/HttpManager;->getBoundry()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/net/HttpManager;->BOUNDARY:Ljava/lang/String;

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/net/HttpManager;->BOUNDARY:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/net/HttpManager;->MP_BOUNDARY:Ljava/lang/String;

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/net/HttpManager;->BOUNDARY:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/sina/weibo/sdk/net/HttpManager;->END_MP_BOUNDARY:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static buildParams(Ljava/io/OutputStream;Lcom/sina/weibo/sdk/net/WeiboParameters;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/exception/WeiboException;
        }
    .end annotation

    .line 343
    :try_start_0
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->keySet()Ljava/util/Set;

    move-result-object v2

    .line 346
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 347
    invoke-virtual {p1, v4}, Lcom/sina/weibo/sdk/net/WeiboParameters;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 348
    instance-of v0, v5, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 349
    new-instance v6, Ljava/lang/StringBuilder;

    const/16 v0, 0x64

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 350
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 351
    sget-object v0, Lcom/sina/weibo/sdk/net/HttpManager;->MP_BOUNDARY:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    const-string v0, "content-disposition: form-data; name=\""

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"\r\n\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    invoke-virtual {p1, v4}, Lcom/sina/weibo/sdk/net/WeiboParameters;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 355
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 357
    :cond_0
    goto :goto_0

    .line 360
    :cond_1
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 361
    invoke-virtual {p1, v4}, Lcom/sina/weibo/sdk/net/WeiboParameters;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 362
    instance-of v0, v5, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    .line 363
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 364
    sget-object v0, Lcom/sina/weibo/sdk/net/HttpManager;->MP_BOUNDARY:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    const-string v0, "content-disposition: form-data; name=\""

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"; filename=\"file\"\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    const-string v0, "Content-Type: application/octet-stream; charset=utf-8\r\n\r\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 369
    move-object v7, v5

    check-cast v7, Landroid/graphics/Bitmap;

    .line 370
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 371
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v1, 0x64

    invoke-virtual {v7, v0, v1, v8}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 372
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v9

    .line 374
    invoke-virtual {p0, v9}, Ljava/io/OutputStream;->write([B)V

    .line 375
    const-string v0, "\r\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 376
    goto :goto_2

    :cond_2
    instance-of v0, v5, Ljava/io/ByteArrayOutputStream;

    if-eqz v0, :cond_3

    .line 377
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    sget-object v0, Lcom/sina/weibo/sdk/net/HttpManager;->MP_BOUNDARY:Ljava/lang/String;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    const-string v0, "content-disposition: form-data; name=\""

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\"; filename=\"file\"\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    const-string v0, "Content-Type: application/octet-stream; charset=utf-8\r\n\r\n"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 383
    move-object v7, v5

    check-cast v7, Ljava/io/ByteArrayOutputStream;

    .line 384
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 385
    const-string v0, "\r\n"

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    .line 386
    invoke-virtual {v7}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 388
    :cond_3
    :goto_2
    goto/16 :goto_1

    .line 389
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lcom/sina/weibo/sdk/net/HttpManager;->END_MP_BOUNDARY:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 392
    goto :goto_3

    .line 390
    :catch_0
    move-exception v2

    .line 391
    new-instance v0, Lcom/sina/weibo/sdk/exception/WeiboException;

    invoke-direct {v0, v2}, Lcom/sina/weibo/sdk/exception/WeiboException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 393
    :goto_3
    return-void
.end method

.method private static native calcOauthSignNative(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static declared-synchronized downloadFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 20
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/exception/WeiboException;
        }
    .end annotation

    const-class v19, Lcom/sina/weibo/sdk/net/HttpManager;

    monitor-enter v19

    .line 266
    :try_start_0
    new-instance v4, Ljava/io/File;

    move-object/from16 v0, p2

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 267
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    .line 268
    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 270
    :cond_0
    new-instance v5, Ljava/io/File;

    move-object/from16 v0, p3

    invoke-direct {v5, v4, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 271
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 272
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    monitor-exit v19

    return-object v0

    .line 275
    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/webkit/URLUtil;->isValidUrl(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 276
    const-string v0, ""

    monitor-exit v19

    return-object v0

    .line 278
    :cond_2
    const-wide/16 v6, 0x0

    .line 279
    new-instance v8, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p2

    invoke-direct {v8, v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 281
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/net/ConnectionFactory;->createConnect(Ljava/lang/String;Landroid/content/Context;)Ljava/net/HttpURLConnection;

    move-result-object v9

    .line 282
    const v0, 0x493e0

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 283
    const v0, 0x493e0

    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 285
    const-string v0, "GET"

    :try_start_1
    invoke-virtual {v9, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 286
    goto :goto_0

    :catch_0
    move-exception v10

    .line 289
    :goto_0
    :try_start_2
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 290
    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v6

    goto :goto_1

    .line 292
    :cond_3
    invoke-virtual {v8}, Ljava/io/File;->createNewFile()Z

    .line 294
    :goto_1
    const-string v0, "RANGE"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-wide/16 v10, 0x0

    .line 296
    const-wide/16 v12, 0x0

    .line 297
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v14

    .line 298
    const/16 v0, 0xce

    if-ne v14, v0, :cond_4

    goto :goto_2

    .line 301
    :cond_4
    const/16 v0, 0xc8

    if-ne v14, v0, :cond_5

    .line 303
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getContentLength()I

    move-result v0

    int-to-long v10, v0

    goto :goto_2

    .line 306
    :cond_5
    const/4 v0, 0x1

    invoke-static {v9, v0}, Lcom/sina/weibo/sdk/net/HttpManager;->readConnectResponse(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;

    move-result-object v15

    .line 307
    new-instance v0, Lcom/sina/weibo/sdk/exception/WeiboHttpException;

    invoke-direct {v0, v15, v14}, Lcom/sina/weibo/sdk/exception/WeiboHttpException;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 310
    :goto_2
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v15

    .line 311
    new-instance v0, Ljava/io/RandomAccessFile;

    move-object v1, v8

    const-string v2, "rw"

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object/from16 v16, v0

    .line 312
    move-object/from16 v0, v16

    invoke-virtual {v0, v12, v13}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 313
    const/16 v0, 0x400

    new-array v0, v0, [B

    move-object/from16 v17, v0

    .line 314
    const/16 v18, 0x0

    .line 315
    :goto_3
    move-object/from16 v0, v17

    invoke-virtual {v15, v0}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move/from16 v18, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_6

    .line 316
    move-object/from16 v0, v16

    move-object/from16 v1, v17

    const/4 v2, 0x0

    move/from16 v3, v18

    invoke-virtual {v0, v1, v2, v3}, Ljava/io/RandomAccessFile;->write([BII)V

    goto :goto_3

    .line 318
    :cond_6
    invoke-virtual/range {v16 .. v16}, Ljava/io/RandomAccessFile;->close()V

    .line 319
    invoke-virtual {v15}, Ljava/io/InputStream;->close()V

    .line 321
    const-wide/16 v0, 0x0

    cmp-long v0, v10, v0

    if-eqz v0, :cond_7

    invoke-virtual {v8}, Ljava/io/File;->length()J

    move-result-wide v0

    cmp-long v0, v0, v10

    if-gez v0, :cond_8

    .line 322
    :cond_7
    invoke-virtual {v8}, Ljava/io/File;->delete()Z

    goto :goto_4

    .line 324
    :cond_8
    invoke-virtual {v8, v5}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 325
    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v0

    monitor-exit v19

    return-object v0

    .line 329
    :goto_4
    goto :goto_5

    .line 327
    :catch_1
    move-exception v10

    .line 330
    :goto_5
    const-string v0, ""

    monitor-exit v19

    return-object v0

    :catchall_0
    move-exception p0

    monitor-exit v19

    throw p0
.end method

.method public static fillCommonRequestParam(Lcom/sina/weibo/sdk/network/IRequestParam;)V
    .locals 0

    .line 218
    return-void
.end method

.method public static getBoundry()Ljava/lang/String;
    .locals 8

    .line 400
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 401
    const/4 v5, 0x1

    :goto_0
    const/16 v0, 0xc

    if-ge v5, v0, :cond_2

    .line 402
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    int-to-long v2, v5

    add-long v6, v0, v2

    .line 403
    const-wide/16 v0, 0x3

    rem-long v0, v6, v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 404
    long-to-int v0, v6

    int-to-char v0, v0

    rem-int/lit8 v0, v0, 0x9

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 405
    :cond_0
    const-wide/16 v0, 0x3

    rem-long v0, v6, v0

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 406
    const-wide/16 v0, 0x1a

    rem-long v0, v6, v0

    const-wide/16 v2, 0x41

    add-long/2addr v0, v2

    long-to-int v0, v0

    int-to-char v0, v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_1

    .line 408
    :cond_1
    const-wide/16 v0, 0x1a

    rem-long v0, v6, v0

    const-wide/16 v2, 0x61

    add-long/2addr v0, v2

    long-to-int v0, v0

    int-to-char v0, v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 401
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 411
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getOauthSign(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 425
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 426
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 427
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    :cond_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 430
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    :cond_1
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 433
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p4}, Lcom/sina/weibo/sdk/net/HttpManager;->calcOauthSignNative(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static getTimestamp()Ljava/lang/String;
    .locals 6

    .line 415
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v4, v0, v2

    .line 416
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static openRedirectUrl4LocationUri(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/net/WeiboParameters;)Ljava/lang/String;
    .locals 5

    .line 230
    const/4 v2, 0x0

    .line 231
    const-string v0, "GET"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    const-string v0, "?"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/sina/weibo/sdk/net/WeiboParameters;->encodeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 235
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/sina/weibo/sdk/net/WeiboParameters;->encodeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 237
    :goto_0
    invoke-static {p1, p0}, Lcom/sina/weibo/sdk/net/ConnectionFactory;->createConnect(Ljava/lang/String;Landroid/content/Context;)Ljava/net/HttpURLConnection;

    move-result-object v2

    goto :goto_1

    .line 239
    :cond_1
    invoke-static {p1, p0}, Lcom/sina/weibo/sdk/net/ConnectionFactory;->createConnect(Ljava/lang/String;Landroid/content/Context;)Ljava/net/HttpURLConnection;

    move-result-object v2

    .line 241
    :goto_1
    const-string v3, ""

    .line 243
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 244
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V

    .line 245
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 246
    const/16 v0, 0x12e

    if-eq v4, v0, :cond_2

    const/16 v0, 0x12d

    if-ne v4, v0, :cond_3

    .line 247
    :cond_2
    const-string v0, "Location"

    invoke-virtual {v2, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    goto :goto_2

    .line 249
    :cond_3
    const/16 v0, 0xc8

    if-ne v4, v0, :cond_4

    .line 250
    move-object v3, p1

    .line 252
    :cond_4
    :goto_2
    goto :goto_3

    :catch_0
    move-exception v4

    .line 253
    :goto_3
    return-object v3
.end method

.method public static openUrl(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/net/WeiboParameters;)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/sina/weibo/sdk/exception/WeiboException;
        }
    .end annotation

    .line 63
    invoke-static {p0, p1, p2, p3}, Lcom/sina/weibo/sdk/net/HttpManager;->requestHttpExecute(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/net/WeiboParameters;)Ljava/lang/String;

    move-result-object v3

    .line 64
    const-string v0, "HttpManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    return-object v3
.end method

.method private static readConnectResponse(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;
    .locals 9

    .line 129
    const/4 v2, 0x0

    .line 130
    const/4 v3, 0x0

    .line 131
    const/4 v4, 0x0

    .line 133
    const/4 v5, 0x0

    .line 134
    const/16 v0, 0x2000

    :try_start_0
    new-array v6, v0, [B

    .line 135
    if-eqz p1, :cond_0

    .line 136
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    .line 138
    :cond_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v3, v0

    .line 141
    :goto_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v4, v0

    .line 142
    if-eqz v3, :cond_2

    .line 143
    :goto_1
    invoke-virtual {v3, v6}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 144
    const/4 v0, 0x0

    invoke-virtual {v4, v6, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    .line 146
    :cond_1
    new-instance v2, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const-string v1, "UTF-8"

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    :cond_2
    if-eqz v3, :cond_3

    .line 153
    :try_start_1
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 155
    :cond_3
    goto :goto_2

    :catch_0
    move-exception v5

    .line 157
    :goto_2
    if-eqz v4, :cond_4

    .line 158
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 160
    :cond_4
    goto :goto_5

    :catch_1
    move-exception v5

    .line 162
    goto :goto_5

    .line 148
    :catch_2
    move-exception v5

    .line 149
    :try_start_3
    new-instance v0, Lcom/sina/weibo/sdk/exception/WeiboException;

    invoke-direct {v0, v5}, Lcom/sina/weibo/sdk/exception/WeiboException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 151
    :catchall_0
    move-exception v7

    .line 152
    if-eqz v3, :cond_5

    .line 153
    :try_start_4
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    .line 155
    :cond_5
    goto :goto_3

    :catch_3
    move-exception v8

    .line 157
    :goto_3
    if-eqz v4, :cond_6

    .line 158
    :try_start_5
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    .line 160
    :cond_6
    goto :goto_4

    :catch_4
    move-exception v8

    :goto_4
    throw v7

    .line 163
    :goto_5
    return-object v2
.end method

.method private static requestHttpExecute(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/sina/weibo/sdk/net/WeiboParameters;)Ljava/lang/String;
    .locals 7

    .line 70
    const/4 v2, 0x0

    .line 71
    const/4 v3, 0x0

    .line 73
    :try_start_0
    invoke-static {p0, p3}, Lcom/sina/weibo/sdk/net/HttpManager;->setHttpCommonParam(Landroid/content/Context;Lcom/sina/weibo/sdk/net/WeiboParameters;)V

    .line 74
    const-string v0, "GET"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "?"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/sina/weibo/sdk/net/WeiboParameters;->encodeUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 76
    invoke-static {p1, p0}, Lcom/sina/weibo/sdk/net/ConnectionFactory;->createConnect(Ljava/lang/String;Landroid/content/Context;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v3, v0

    .line 77
    const-string v0, "GET"

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 78
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 80
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    goto :goto_0

    .line 82
    :cond_0
    invoke-static {p1, p0}, Lcom/sina/weibo/sdk/net/ConnectionFactory;->createConnect(Ljava/lang/String;Landroid/content/Context;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v3, v0

    .line 83
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 85
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V

    .line 87
    invoke-virtual {p3}, Lcom/sina/weibo/sdk/net/WeiboParameters;->hasBinaryData()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 89
    invoke-static {v4, p3}, Lcom/sina/weibo/sdk/net/HttpManager;->buildParams(Ljava/io/OutputStream;Lcom/sina/weibo/sdk/net/WeiboParameters;)V

    .line 90
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V

    .line 91
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V

    .line 92
    goto :goto_0

    .line 93
    :cond_1
    new-instance v4, Ljava/io/DataOutputStream;

    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    invoke-direct {v4, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 94
    invoke-virtual {p3}, Lcom/sina/weibo/sdk/net/WeiboParameters;->encodeUrl()Ljava/lang/String;

    move-result-object v5

    .line 95
    const-string v0, "UTF-8"

    invoke-virtual {v5, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/io/DataOutputStream;->write([B)V

    .line 96
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V

    .line 97
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->close()V

    .line 102
    :goto_0
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v4

    .line 104
    const/16 v0, 0xc8

    if-eq v4, v0, :cond_2

    .line 105
    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/sina/weibo/sdk/net/HttpManager;->readConnectResponse(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;

    move-result-object v2

    .line 106
    new-instance v0, Lcom/sina/weibo/sdk/exception/WeiboHttpException;

    invoke-direct {v0, v2, v4}, Lcom/sina/weibo/sdk/exception/WeiboHttpException;-><init>(Ljava/lang/String;I)V

    throw v0

    .line 108
    :cond_2
    const/4 v0, 0x0

    invoke-static {v3, v0}, Lcom/sina/weibo/sdk/net/HttpManager;->readConnectResponse(Ljava/net/HttpURLConnection;Z)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 114
    if-eqz v3, :cond_4

    .line 115
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    goto :goto_1

    .line 110
    :catch_0
    move-exception v4

    .line 111
    :try_start_1
    invoke-virtual {v4}, Ljava/io/IOException;->printStackTrace()V

    .line 112
    new-instance v0, Lcom/sina/weibo/sdk/exception/WeiboException;

    invoke-direct {v0, v4}, Lcom/sina/weibo/sdk/exception/WeiboException;-><init>(Ljava/lang/Throwable;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    :catchall_0
    move-exception v6

    if-eqz v3, :cond_3

    .line 115
    invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V

    :cond_3
    throw v6

    .line 119
    :cond_4
    :goto_1
    return-object v2
.end method

.method private static setHttpCommonParam(Landroid/content/Context;Lcom/sina/weibo/sdk/net/WeiboParameters;)V
    .locals 8

    .line 179
    const-string v1, ""

    .line 180
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 181
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->getAppKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/sina/weibo/sdk/utils/Utility;->getAid(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 182
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    const-string v0, "aid"

    invoke-virtual {p1, v0, v1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    :cond_0
    invoke-static {}, Lcom/sina/weibo/sdk/net/HttpManager;->getTimestamp()Ljava/lang/String;

    move-result-object v2

    .line 190
    const-string v0, "oauth_timestamp"

    invoke-virtual {p1, v0, v2}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 194
    const-string v3, ""

    .line 195
    const-string v0, "access_token"

    invoke-virtual {p1, v0}, Lcom/sina/weibo/sdk/net/WeiboParameters;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 196
    const-string v0, "refresh_token"

    invoke-virtual {p1, v0}, Lcom/sina/weibo/sdk/net/WeiboParameters;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    .line 197
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Lcom/sina/weibo/sdk/net/WeiboParameters;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    .line 199
    if-eqz v4, :cond_1

    instance-of v0, v4, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 201
    move-object v3, v4

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    .line 203
    :cond_1
    if-eqz v5, :cond_2

    instance-of v0, v5, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 205
    move-object v3, v5

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    .line 206
    :cond_2
    if-eqz v6, :cond_3

    instance-of v0, v6, Ljava/lang/String;

    if-eqz v0, :cond_3

    .line 208
    move-object v3, v6

    check-cast v3, Ljava/lang/String;

    .line 210
    .line 211
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/sina/weibo/sdk/net/WeiboParameters;->getAppKey()Ljava/lang/String;

    move-result-object v0

    .line 210
    invoke-static {p0, v1, v3, v0, v2}, Lcom/sina/weibo/sdk/net/HttpManager;->getOauthSign(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 212
    const-string v0, "oauth_sign"

    invoke-virtual {p1, v0, v7}, Lcom/sina/weibo/sdk/net/WeiboParameters;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    return-void
.end method
