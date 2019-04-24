.class Lcom/tencent/open/b/g$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/b/g;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/open/b/g;


# direct methods
.method constructor <init>(Lcom/tencent/open/b/g;)V
    .locals 0

    .line 346
    iput-object p1, p0, Lcom/tencent/open/b/g$4;->a:Lcom/tencent/open/b/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 16

    .line 350
    const/4 v3, 0x0

    .line 351
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lcom/tencent/open/b/g$4;->a:Lcom/tencent/open/b/g;

    invoke-virtual {v0}, Lcom/tencent/open/b/g;->c()Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-result-object v3

    .line 352
    if-nez v3, :cond_0

    .line 353
    return-void

    .line 356
    :cond_0
    const/4 v4, 0x0

    .line 357
    :try_start_1
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInstance(Landroid/content/Context;Ljava/lang/String;)Lcom/tencent/open/utils/OpenConfig;

    move-result-object v0

    const-string v1, "Common_HttpRetryCount"

    invoke-virtual {v0, v1}, Lcom/tencent/open/utils/OpenConfig;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 359
    if-nez v5, :cond_1

    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    move v0, v5

    :goto_0
    move v5, v0

    .line 360
    const-string v0, "openSDK_LOG.ReportManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->doReportCgi, retryCount: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    .line 362
    const/4 v6, 0x0

    .line 364
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 366
    :try_start_2
    invoke-static {}, Lcom/tencent/open/utils/Global;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "http://wspeed.qq.com/w.cgi"

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/tencent/open/utils/HttpUtils;->getHttpClient(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/http/client/HttpClient;

    move-result-object v7

    .line 367
    const/4 v8, 0x0

    .line 368
    new-instance v9, Lorg/apache/http/client/methods/HttpPost;

    const-string v0, "http://wspeed.qq.com/w.cgi"

    invoke-direct {v9, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 369
    const-string v0, "Accept-Encoding"

    const-string v1, "gzip"

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {v9, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 372
    invoke-static {v3}, Lcom/tencent/open/utils/HttpUtils;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v10

    .line 374
    invoke-static {v10}, Lcom/tencent/open/utils/Util;->getBytesUTF8(Ljava/lang/String;)[B

    move-result-object v11

    .line 375
    new-instance v12, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v12, v11}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 376
    invoke-virtual {v9, v12}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 377
    move-object v8, v9

    .line 379
    invoke-interface {v7, v8}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v13

    .line 380
    invoke-interface {v13}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v14

    .line 381
    invoke-interface {v14}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v15

    .line 383
    const-string v0, "openSDK_LOG.ReportManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "-->doReportCgi, statusCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    const/16 v0, 0xc8

    if-ne v15, v0, :cond_3

    .line 385
    invoke-static {}, Lcom/tencent/open/b/f;->a()Lcom/tencent/open/b/f;

    move-result-object v0

    const-string v1, "report_cgi"

    invoke-virtual {v0, v1}, Lcom/tencent/open/b/f;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/apache/http/conn/ConnectTimeoutException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/net/SocketTimeoutException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 387
    const/4 v6, 0x1

    .line 389
    :cond_3
    goto :goto_2

    .line 390
    :catch_0
    move-exception v7

    .line 391
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->doReportCgi, doupload exception"

    :try_start_3
    invoke-static {v0, v1, v7}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 397
    goto :goto_1

    .line 392
    :catch_1
    move-exception v7

    .line 393
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->doReportCgi, doupload exception"

    invoke-static {v0, v1, v7}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 397
    goto :goto_1

    .line 394
    :catch_2
    move-exception v7

    .line 395
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->doReportCgi, doupload exception"

    invoke-static {v0, v1, v7}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 396
    goto :goto_2

    .line 398
    :goto_1
    if-lt v4, v5, :cond_2

    .line 400
    :goto_2
    if-nez v6, :cond_4

    .line 401
    invoke-static {}, Lcom/tencent/open/b/f;->a()Lcom/tencent/open/b/f;

    move-result-object v0

    const-string v1, "report_cgi"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/b/g$4;->a:Lcom/tencent/open/b/g;

    iget-object v2, v2, Lcom/tencent/open/b/g;->c:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/tencent/open/b/f;->a(Ljava/lang/String;Ljava/util/List;)V

    .line 406
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/b/g$4;->a:Lcom/tencent/open/b/g;

    iget-object v0, v0, Lcom/tencent/open/b/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 409
    goto :goto_3

    .line 407
    :catch_3
    move-exception v3

    .line 408
    const-string v0, "openSDK_LOG.ReportManager"

    const-string v1, "-->doReportCgi, doupload exception out."

    invoke-static {v0, v1, v3}, Lcom/tencent/open/a/f;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 410
    :goto_3
    return-void
.end method
