.class public Lcom/huawei/ui/main/stories/nps/https/Https;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "PLGOPER_Https"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I
    .locals 10

    .line 286
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 288
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;

    .line 289
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 290
    const/4 v0, -0x1

    return v0

    .line 292
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/main/stories/nps/https/Https;->initHttpsURLConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 294
    invoke-static {p0, v4}, Lcom/huawei/ui/main/stories/nps/https/Http;->download(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v5

    .line 295
    const/4 v6, 0x0

    .line 297
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 298
    :try_start_0
    invoke-static {p0, v5, p2}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->saveFile(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v7

    .line 299
    if-nez v7, :cond_1

    .line 300
    const/4 v6, -0x1

    .line 302
    :cond_1
    goto :goto_0

    .line 303
    :cond_2
    const/4 v6, -0x1

    .line 311
    :goto_0
    if-eqz v5, :cond_4

    .line 313
    :try_start_1
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 316
    goto :goto_2

    .line 314
    :catch_0
    move-exception v7

    .line 315
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    goto :goto_2

    .line 306
    :catch_1
    move-exception v7

    .line 307
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 308
    const/4 v6, -0x1

    .line 311
    if-eqz v5, :cond_4

    .line 313
    :try_start_3
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 316
    goto :goto_2

    .line 314
    :catch_2
    move-exception v7

    .line 315
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 316
    goto :goto_2

    .line 311
    :catchall_0
    move-exception v8

    if-eqz v5, :cond_3

    .line 313
    :try_start_4
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 316
    goto :goto_1

    .line 314
    :catch_3
    move-exception v9

    .line 315
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    :cond_3
    :goto_1
    throw v8

    .line 320
    :cond_4
    :goto_2
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return v6
.end method

.method public static download(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I
    .locals 6

    .line 217
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;

    .line 220
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 221
    if-eqz p3, :cond_0

    .line 222
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;->onFinished(ILjava/lang/String;)V

    .line 224
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 226
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/nps/https/Https;->initHttpsURLConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 228
    new-instance v5, Lcom/huawei/ui/main/stories/nps/https/Https$2;

    invoke-direct {v5, v4, p0, p2, p3}, Lcom/huawei/ui/main/stories/nps/https/Https$2;-><init>(Ljavax/net/ssl/HttpsURLConnection;Landroid/content/Context;Ljava/lang/String;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)V

    .line 272
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->getThreadPollExInstance()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 274
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    const/4 v0, 0x0

    return v0
.end method

.method public static download(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 7

    .line 331
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;

    .line 332
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 333
    const/4 v0, 0x0

    return-object v0

    .line 335
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/main/stories/nps/https/Https;->initHttpsURLConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 337
    invoke-static {p0, v4}, Lcom/huawei/ui/main/stories/nps/https/Http;->download(Landroid/content/Context;Ljava/net/HttpURLConnection;)Ljava/io/InputStream;

    move-result-object v5

    .line 338
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 339
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download inputStream = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 340
    const/4 v0, 0x0

    return-object v0

    .line 342
    :cond_1
    invoke-static {p0, v5}, Lcom/huawei/ui/main/stories/nps/https/HttpUtils;->readInputStream(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 344
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit download"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 345
    return-object v6
.end method

.method public static initHttpsURLConnection(Ljavax/net/ssl/HttpsURLConnection;)V
    .locals 0

    .line 375
    return-void
.end method

.method public static postReq(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/String;>;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)I"
        }
    .end annotation

    .line 35
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry Https.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 36
    const-string v0, "PLGOPER_Https"

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

    .line 37
    const-string v0, "PLGOPER_Https"

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

    .line 39
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljavax/net/ssl/HttpsURLConnection;

    .line 40
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 41
    if-eqz p4, :cond_0

    .line 42
    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-interface {p4, v0, v1}, Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;->onFinished(ILjava/lang/String;)V

    .line 44
    :cond_0
    const/4 v0, -0x1

    return v0

    .line 46
    :cond_1
    invoke-static {v4}, Lcom/huawei/ui/main/stories/nps/https/Https;->initHttpsURLConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 47
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 48
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 49
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 52
    const-string v0, "POST"

    :try_start_0
    invoke-virtual {v4, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    goto :goto_0

    .line 53
    :catch_0
    move-exception v5

    .line 54
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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

    .line 64
    new-instance v6, Lcom/huawei/ui/main/stories/nps/https/Https$1;

    invoke-direct {v6, v5, v4, p4}, Lcom/huawei/ui/main/stories/nps/https/Https$1;-><init>(Ljava/lang/String;Ljavax/net/ssl/HttpsURLConnection;Lcom/huawei/ui/main/stories/nps/https/HttpResCallBack;)V

    .line 119
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/https/ThreadPoolUtils;->getThreadPollExInstance()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 121
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit AchieveHttps.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
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

    .line 137
    const/4 v4, 0x0

    .line 138
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "entry Https.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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

    .line 142
    invoke-static {p1}, Lcom/huawei/ui/main/stories/nps/https/Http;->initConnection(Ljava/lang/String;)Ljava/net/HttpURLConnection;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljavax/net/ssl/HttpsURLConnection;

    .line 143
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 144
    return-object v4

    .line 146
    :cond_0
    invoke-static {v5}, Lcom/huawei/ui/main/stories/nps/https/Https;->initHttpsURLConnection(Ljavax/net/ssl/HttpsURLConnection;)V

    .line 147
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 148
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 149
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 152
    const-string v0, "POST"

    :try_start_0
    invoke-virtual {v5, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0

    .line 156
    goto :goto_0

    .line 153
    :catch_0
    move-exception v6

    .line 154
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    invoke-virtual {v5}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

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
    invoke-virtual {v5}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 175
    invoke-virtual {v5}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v9

    .line 176
    const-string v0, "PLGOPER_Https"

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
    invoke-virtual {v5}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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
    const-string v0, "PLGOPER_Https"

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

    .line 204
    :goto_6
    const-string v0, "PLGOPER_Https"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "exit AchieveHttps.postReq"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    return-object v4
.end method
