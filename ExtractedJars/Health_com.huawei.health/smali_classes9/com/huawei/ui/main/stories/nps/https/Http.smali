.class public Lcom/huawei/ui/main/stories/nps/https/Http;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "PLGOPER_Http"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 9

    .line 277
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v4

    .line 279
    invoke-static {p0, v4}, Lcom/huawei/ui/main/stories/nps/https/Http;->download(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v5

    .line 280
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 281
    const/4 v0, -0x1

    return v0

    .line 283
    :cond_0
    const/4 v6, 0x0

    .line 284
    invoke-static {p0, v5, p2}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->saveFile(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Z

    move-result v7

    .line 285
    if-nez v7, :cond_1

    .line 286
    const/4 v6, -0x1

    .line 289
    :cond_1
    :try_start_0
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 292
    goto :goto_0

    .line 290
    :catch_0
    move-exception v8

    .line 291
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 294
    :goto_0
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    return v6
.end method

.method public static download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I
    .locals 5

    .line 215
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v4

    .line 216
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 217
    if-eqz p3, :cond_0

    .line 218
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;->onFinished(ILjava/lang/String;)V

    .line 219
    const/4 v0, -0x1

    return v0

    .line 223
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/https/Http$2;

    invoke-direct {v1, v4, p0, p2, p3}, Lcom/huawei/ui/main/stories/nps/https/Http$2;-><init>(Ljava/net/HttpURLConnection;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 264
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 266
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    const/4 v0, 0x0

    return v0
.end method

.method public static download(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 304
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 306
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v4

    .line 307
    invoke-static {p0, v4}, Lcom/huawei/ui/main/stories/nps/https/Http;->download(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v5

    .line 308
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 309
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == inputStream"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    const/4 v0, 0x0

    return-object v0

    .line 312
    :cond_0
    invoke-static {p0, v5}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->readInputStream(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 313
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    return-object v6
.end method

.method public static download(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;
    .locals 8

    .line 352
    const/4 v4, 0x0

    .line 353
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 354
    return-object v4

    .line 357
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v5

    .line 358
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "download-->responseCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    const/16 v0, 0xc8

    if-ne v5, v0, :cond_1

    .line 360
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v4, v0

    .line 367
    :cond_1
    if-eqz v4, :cond_2

    .line 369
    :try_start_1
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 372
    goto/16 :goto_0

    .line 370
    :catch_0
    move-exception v5

    .line 371
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 372
    goto/16 :goto_0

    .line 362
    :catch_1
    move-exception v5

    .line 363
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 367
    goto :goto_0

    .line 364
    .line 369
    .line 370
    .line 371
    .line 372
    .line 372
    :catch_2
    move-exception v5

    .line 365
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 367
    goto :goto_0

    .line 367
    .line 369
    .line 370
    .line 371
    .line 372
    .line 372
    :catchall_0
    move-exception v6

    nop

    .line 369
    .line 370
    .line 371
    .line 372
    .line 374
    throw v6

    .line 376
    :cond_2
    :goto_0
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    return-object v4
.end method

.method public static initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;
    .locals 7

    .line 319
    const/4 v5, 0x0

    .line 321
    :try_start_0
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 325
    goto :goto_0

    .line 322
    :catch_0
    move-exception v6

    .line 323
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    return-object v5

    .line 328
    :goto_0
    :try_start_1
    invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-object v5, v0

    .line 332
    goto :goto_1

    .line 329
    :catch_1
    move-exception v6

    .line 330
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 331
    return-object v5

    .line 333
    :goto_1
    const/16 v0, 0x1388

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 334
    const/16 v0, 0x1388

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 336
    const-string v0, "GET"

    :try_start_2
    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/net/ProtocolException; {:try_start_2 .. :try_end_2} :catch_2

    .line 340
    goto :goto_2

    .line 337
    :catch_2
    move-exception v6

    .line 338
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/net/ProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 339
    return-object v5

    .line 342
    :goto_2
    return-object v5
.end method

.method public static postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I"
        }
    .end annotation

    .line 36
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry Http.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  Param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Header:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p3}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v4

    .line 41
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 42
    if-eqz p4, :cond_0

    .line 43
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p4, v0, v1}, Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;->onFinished(ILjava/lang/String;)V

    .line 45
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 48
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 49
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 50
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 52
    const-string v0, "POST"

    :try_start_0
    invoke-virtual {v4, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 53
    :catch_0
    move-exception v5

    .line 54
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/net/ProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const/4 v0, -0x1

    return v0

    .line 58
    :goto_0
    invoke-static {p0, v4, p3}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->setHeader(Landroid/content/Context;Ljava/net/HttpURLConnection;Ljava/util/HashMap;)V

    .line 60
    invoke-static {p2}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->getBody(Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v5

    .line 62
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->strBody:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/ui/main/stories/nps/https/Http$1;

    invoke-direct {v1, v5, v4, p4}, Lcom/huawei/ui/main/stories/nps/https/Http$1;-><init>(Ljava/lang/String;Ljava/net/HttpURLConnection;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 121
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 123
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit AchieveHttps.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const/4 v0, 0x0

    return v0
.end method

.method public static postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Ljava/lang/String;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 138
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry Http.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Url:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  Param:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Header:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Ljava/util/HashMap;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const/4 v4, 0x0

    .line 143
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v5

    .line 144
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 145
    return-object v4

    .line 148
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    .line 149
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setDoInput(Z)V

    .line 150
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setUseCaches(Z)V

    .line 152
    const-string v0, "POST"

    :try_start_0
    invoke-virtual {v5, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    goto :goto_0

    .line 153
    :catch_0
    move-exception v6

    .line 154
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/net/ProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    return-object v4

    .line 158
    :goto_0
    move-object/from16 v0, p3

    invoke-static {p0, v5, v0}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->setHeader(Landroid/content/Context;Ljava/net/HttpURLConnection;Ljava/util/HashMap;)V

    .line 160
    invoke-static {p2}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->getBody(Ljava/util/HashMap;)Ljava/lang/String;

    move-result-object v6

    .line 162
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->strBody:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    const/4 v7, 0x0

    .line 165
    const/4 v8, 0x0

    .line 168
    :try_start_1
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 169
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    move-object v7, v0

    .line 170
    const-string v0, "UTF-8"

    invoke-virtual {v6, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/io/OutputStream;->write([B)V

    .line 171
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V

    .line 173
    :cond_1
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->connect()V

    .line 175
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v9

    .line 176
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->responseCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    const/16 v0, 0xc8

    if-ne v9, v0, :cond_2

    .line 178
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v8, v0

    .line 179
    invoke-static {v8}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->readInputStream(Ljava/io/InputStream;)[B

    move-result-object v10

    .line 180
    new-instance v0, Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-direct {v0, v10, v1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    move-object v4, v0

    .line 181
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "postReq-->jsonResult:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->a(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    :cond_2
    if-eqz v7, :cond_3

    .line 190
    :try_start_2
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 194
    :cond_3
    goto :goto_1

    .line 192
    :catch_1
    move-exception v9

    .line 193
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    :goto_1
    if-eqz v8, :cond_4

    .line 197
    :try_start_3
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 201
    :cond_4
    goto/16 :goto_6

    .line 199
    :catch_2
    move-exception v9

    .line 200
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    goto/16 :goto_6

    .line 183
    :catch_3
    move-exception v9

    .line 184
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 189
    if-eqz v7, :cond_5

    .line 190
    :try_start_5
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 194
    :cond_5
    goto :goto_2

    .line 192
    :catch_4
    move-exception v9

    .line 193
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    :goto_2
    if-eqz v8, :cond_6

    .line 197
    :try_start_6
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 201
    :cond_6
    goto/16 :goto_6

    .line 199
    :catch_5
    move-exception v9

    .line 200
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    goto/16 :goto_6

    .line 185
    :catch_6
    move-exception v9

    .line 186
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 189
    if-eqz v7, :cond_7

    .line 190
    :try_start_8
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    .line 194
    :cond_7
    goto :goto_3

    .line 192
    :catch_7
    move-exception v9

    .line 193
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    :goto_3
    if-eqz v8, :cond_8

    .line 197
    :try_start_9
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_8

    .line 201
    :cond_8
    goto :goto_6

    .line 199
    :catch_8
    move-exception v9

    .line 200
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    goto :goto_6

    .line 188
    :catchall_0
    move-exception v11

    .line 189
    if-eqz v7, :cond_9

    .line 190
    :try_start_a
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_9

    .line 194
    :cond_9
    goto :goto_4

    .line 192
    :catch_9
    move-exception v12

    .line 193
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    :goto_4
    if-eqz v8, :cond_a

    .line 197
    :try_start_b
    invoke-virtual {v8}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_a

    .line 201
    :cond_a
    goto :goto_5

    .line 199
    :catch_a
    move-exception v12

    .line 200
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v12}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    :goto_5
    throw v11

    .line 203
    :goto_6
    const-string v0, "PLGOPER_Http"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit AchieveHttps.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return-object v4
.end method
