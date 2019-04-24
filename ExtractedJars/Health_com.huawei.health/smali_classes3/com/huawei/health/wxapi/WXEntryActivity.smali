.class public Lcom/huawei/health/wxapi/WXEntryActivity;
.super Landroid/app/Activity;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/wxapi/WXEntryActivity$a;
    }
.end annotation


# instance fields
.field private a:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

.field private d:Landroid/content/Context;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/health/wxapi/WXEntryActivity;)Landroid/content/Context;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->d:Landroid/content/Context;

    return-object v0
.end method

.method private b(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V
    .locals 5

    .line 334
    if-eqz p1, :cond_0

    .line 335
    :try_start_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    const/4 p1, 0x0

    .line 340
    :cond_0
    goto :goto_0

    .line 338
    :catch_0
    move-exception v4

    .line 339
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doGet======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    :goto_0
    if-eqz p2, :cond_1

    .line 344
    :try_start_1
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 345
    const/4 p2, 0x0

    .line 349
    :cond_1
    goto :goto_1

    .line 347
    :catch_1
    move-exception v4

    .line 348
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doGet======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 351
    :goto_1
    if-eqz p3, :cond_2

    .line 352
    invoke-virtual {p3}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 353
    const/4 p3, 0x0

    .line 355
    :cond_2
    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 267
    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    :cond_0
    const-string v0, "urlStr = null"

    return-object v0

    .line 270
    :cond_1
    const-string v4, ""

    .line 271
    const/4 v5, 0x0

    .line 272
    const/4 v6, 0x0

    .line 273
    const/4 v7, 0x0

    .line 274
    const/4 v8, 0x0

    .line 275
    const/4 v9, -0x1

    .line 278
    :try_start_0
    new-instance v5, Ljava/net/URL;

    invoke-direct {v5, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 279
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doGet==="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-virtual {v5}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "https"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 283
    .line 284
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljavax/net/ssl/HttpsURLConnection;

    .line 286
    sget-object v0, Lorg/apache/http/conn/ssl/SSLSocketFactory;->BROWSER_COMPATIBLE_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;

    invoke-virtual {v10, v0}, Ljavax/net/ssl/HttpsURLConnection;->setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V

    .line 287
    move-object v6, v10

    .line 288
    goto :goto_0

    .line 289
    :cond_2
    invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v6, v0

    .line 291
    :goto_0
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V

    .line 292
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V

    .line 293
    const-string v0, "GET"

    invoke-virtual {v6, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 294
    const-string v0, "accept"

    const-string v1, "*/*"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    const-string v0, "connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v6, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v9

    .line 297
    const/16 v0, 0xc8

    if-ne v9, v0, :cond_4

    .line 298
    invoke-virtual {v6}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v7, v0

    .line 299
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    move-object v8, v0

    .line 300
    const/4 v10, -0x1

    .line 301
    const/16 v0, 0x400

    new-array v11, v0, [B

    .line 303
    :goto_1
    invoke-virtual {v7, v11}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v10, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 304
    const/4 v0, 0x0

    invoke-virtual {v8, v11, v0, v10}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_1

    .line 306
    :cond_3
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->flush()V

    .line 308
    const-string v0, "UTF-8"

    invoke-virtual {v8, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    .line 309
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "response == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/ProtocolException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    :cond_4
    invoke-direct {p0, v7, v8, v6}, Lcom/huawei/health/wxapi/WXEntryActivity;->b(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 327
    goto/16 :goto_2

    .line 312
    :catch_0
    move-exception v10

    .line 313
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doGet======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/net/MalformedURLException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 314
    const-string v4, "MalformedURLException"

    .line 326
    invoke-direct {p0, v7, v8, v6}, Lcom/huawei/health/wxapi/WXEntryActivity;->b(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 327
    goto/16 :goto_2

    .line 316
    :catch_1
    move-exception v10

    .line 317
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doGet======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 326
    invoke-direct {p0, v7, v8, v6}, Lcom/huawei/health/wxapi/WXEntryActivity;->b(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 327
    goto :goto_2

    .line 319
    :catch_2
    move-exception v10

    .line 320
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    :try_start_3
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doGet======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/net/ProtocolException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 326
    invoke-direct {p0, v7, v8, v6}, Lcom/huawei/health/wxapi/WXEntryActivity;->b(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 327
    goto :goto_2

    .line 322
    :catch_3
    move-exception v10

    .line 323
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "doGet======="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 326
    invoke-direct {p0, v7, v8, v6}, Lcom/huawei/health/wxapi/WXEntryActivity;->b(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 327
    goto :goto_2

    .line 326
    :catchall_0
    move-exception v12

    invoke-direct {p0, v7, v8, v6}, Lcom/huawei/health/wxapi/WXEntryActivity;->b(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;Ljava/net/HttpURLConnection;)V

    .line 327
    throw v12

    .line 328
    :goto_2
    return-object v4
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 91
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 93
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v4

    .line 94
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    if-eq v4, v0, :cond_0

    .line 96
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate Process Uid error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXEntryActivity;->finish()V

    .line 98
    return-void

    .line 101
    :cond_0
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    iput-object p0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->d:Landroid/content/Context;

    .line 105
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wx36bda3d35fbcfd06"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXAPIFactory;->createWXAPI(Landroid/content/Context;Ljava/lang/String;Z)Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->a:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 106
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->a:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const-string v1, "wx36bda3d35fbcfd06"

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->registerApp(Ljava/lang/String;)Z

    .line 109
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->a:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXEntryActivity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-interface {v0, v1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    goto :goto_0

    .line 111
    :catch_0
    move-exception v5

    .line 113
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXEntryActivity;->finish()V

    .line 115
    return-void

    .line 125
    :goto_0
    return-void
.end method

.method protected onDestroy()V
    .locals 4

    .line 159
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 160
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onDestroy()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    return-void
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 4

    .line 360
    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    .line 361
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onNewIntent() intent="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 362
    invoke-virtual {p0, p1}, Lcom/huawei/health/wxapi/WXEntryActivity;->setIntent(Landroid/content/Intent;)V

    .line 363
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->a:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 365
    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->a:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v0, p1, p0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    .line 367
    :cond_0
    return-void
.end method

.method protected onPause()V
    .locals 4

    .line 145
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 146
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onPause()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    return-void
.end method

.method public onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V
    .locals 4

    .line 173
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResp(BaseResp req) req="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 177
    :sswitch_0
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " ConstantsAPI.COMMAND_GETMESSAGE_FROM_WX"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    goto :goto_0

    .line 180
    :sswitch_1
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " ConstantsAPI.COMMAND_SHOWMESSAGE_FROM_WX"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    .line 185
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXEntryActivity;->finish()V

    .line 187
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method public onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    .locals 7

    .line 192
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResp(BaseResp resp) resp="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 195
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResp() ConstantsAPI.COMMAND_SENDAUTH == resp.getType()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    move-object v4, p1

    check-cast v4, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;

    .line 197
    iget-object v5, v4, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;->code:Ljava/lang/String;

    .line 198
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResp() code="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/wxapi/WXEntryActivity;->d:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 201
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.weixin.qq.com/sns/oauth2/access_token?appid=wx36bda3d35fbcfd06&secret=78223e719cab52ae6e52118d7cb32b0f&code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "&grant_type=authorization_code"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 207
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "request=="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    new-instance v0, Lcom/huawei/health/wxapi/WXEntryActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/huawei/health/wxapi/WXEntryActivity$a;-><init>(Lcom/huawei/health/wxapi/WXEntryActivity;Lcom/huawei/health/wxapi/WXEntryActivity$1;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-virtual {v0, v1}, Lcom/huawei/health/wxapi/WXEntryActivity$a;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 209
    goto :goto_0

    .line 213
    :cond_0
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResp() call finsh()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    new-instance v6, Landroid/content/Intent;

    sget-object v0, Lo/etz;->c:Ljava/lang/String;

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 215
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXEntryActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v6}, Lo/dbg;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 216
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXEntryActivity;->finish()V

    .line 221
    :goto_0
    goto/16 :goto_4

    .line 222
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 224
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " COMMAND_SENDMESSAGE_TO_WX onResp() resp = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    const/4 v4, 0x0

    .line 227
    iget v0, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 230
    :pswitch_0
    const v4, 0x7f020a66

    .line 233
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebk;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ebo;

    .line 235
    if-eqz v5, :cond_3

    .line 236
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse() if (pluginSocialShareAdapter != null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    invoke-interface {v5}, Lo/ebo;->getIBaseResponseCallback()Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v6

    .line 238
    if-eqz v6, :cond_2

    .line 239
    iget v0, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 240
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse() errCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " shareType = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 242
    :cond_2
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onResponse() if (cb != null) ELSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 244
    :goto_1
    goto :goto_3

    .line 247
    :pswitch_1
    const v4, 0x7f020a68

    .line 248
    goto :goto_3

    .line 250
    :pswitch_2
    const v4, 0x7f020a67

    .line 251
    goto :goto_3

    .line 253
    :goto_2
    :pswitch_3
    const v4, 0x7f020a67

    .line 256
    :cond_3
    :goto_3
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResp() result = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const/4 v0, 0x1

    invoke-static {p0, v4, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 258
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResp() will be finish().."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    invoke-virtual {p0}, Lcom/huawei/health/wxapi/WXEntryActivity;->finish()V

    .line 262
    :cond_4
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method protected onResume()V
    .locals 4

    .line 138
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 139
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onResume()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    return-void
.end method

.method protected onStart()V
    .locals 4

    .line 131
    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    .line 132
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onStart()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    return-void
.end method

.method protected onStop()V
    .locals 4

    .line 152
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 153
    const-string v0, "WXEntryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " onStop()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    return-void
.end method
