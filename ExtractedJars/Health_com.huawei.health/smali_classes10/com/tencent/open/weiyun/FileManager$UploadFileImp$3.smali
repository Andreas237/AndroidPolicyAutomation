.class Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->doUpload()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;


# direct methods
.method constructor <init>(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)V
    .locals 0

    .line 385
    iput-object p1, p0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 18

    .line 387
    new-instance v4, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v4}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 388
    const/16 v0, 0x3a98

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 389
    const/16 v0, 0x4e20

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 391
    sget-object v0, Lorg/apache/http/HttpVersion;->HTTP_1_1:Lorg/apache/http/HttpVersion;

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpProtocolParams;->setVersion(Lorg/apache/http/params/HttpParams;Lorg/apache/http/ProtocolVersion;)V

    .line 392
    const-string v0, "UTF-8"

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpProtocolParams;->setContentCharset(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 393
    const-string v0, "TX_QQF_ANDROID"

    invoke-static {v4, v0}, Lorg/apache/http/params/HttpProtocolParams;->setUserAgent(Lorg/apache/http/params/HttpParams;Ljava/lang/String;)V

    .line 395
    new-instance v5, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v5, v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 396
    const/4 v6, 0x0

    .line 397
    const/4 v7, 0x0

    .line 399
    const/4 v8, 0x0

    .line 400
    const/4 v9, 0x0

    .line 401
    const/high16 v10, 0x20000

    .line 402
    new-array v11, v10, [B

    .line 403
    const/4 v12, 0x0

    .line 405
    :try_start_0
    new-instance v12, Ljava/io/FileInputStream;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$400(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v12, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    goto :goto_0

    .line 406
    :catch_0
    move-exception v13

    .line 407
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v14

    .line 408
    const/4 v0, -0x2

    iput v0, v14, Landroid/os/Message;->what:I

    .line 409
    const-string v0, ""

    iput-object v0, v14, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 410
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v14}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 411
    return-void

    .line 415
    :goto_0
    int-to-long v0, v8

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$800(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 417
    :try_start_1
    invoke-virtual {v12, v11}, Ljava/io/FileInputStream;->read([B)I

    move-result v9

    .line 418
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0, v11, v9, v8}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1400(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;[BII)[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v13

    .line 419
    add-int/2addr v8, v9

    .line 426
    goto :goto_1

    .line 420
    :catch_1
    move-exception v14

    .line 421
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v15

    .line 422
    const/4 v0, -0x2

    iput v0, v15, Landroid/os/Message;->what:I

    .line 423
    const-string v0, ""

    iput-object v0, v15, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 424
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 425
    goto/16 :goto_4

    .line 428
    :goto_1
    if-nez v13, :cond_0

    .line 429
    goto/16 :goto_4

    .line 432
    :cond_0
    new-instance v6, Lorg/apache/http/client/methods/HttpPost;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "http://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$200(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/ftn_handler/?bmd5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v1}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$700(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 433
    const-string v0, "Accept-Encoding"

    const-string v1, "*/*"

    invoke-virtual {v6, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    const-string v0, "Connection"

    const-string v1, "Keep-Alive"

    invoke-virtual {v6, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    const-string v0, "Pragma"

    const-string v1, "no-cache"

    invoke-virtual {v6, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 436
    const-string v0, "Content-Type"

    const-string v1, "application/x-www-form-urlencoded"

    invoke-virtual {v6, v0, v1}, Lorg/apache/http/client/methods/HttpPost;->setHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    new-instance v14, Lorg/apache/http/entity/ByteArrayEntity;

    invoke-direct {v14, v13}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V

    .line 439
    invoke-virtual {v6, v14}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 441
    move-object v7, v6

    .line 442
    const/4 v15, 0x0

    .line 444
    :try_start_2
    invoke-interface {v5, v7}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v16

    .line 445
    invoke-interface/range {v16 .. v16}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v17

    .line 446
    invoke-interface/range {v17 .. v17}, Lorg/apache/http/StatusLine;->getStatusCode()I
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    move v15, v0

    .line 452
    goto :goto_2

    .line 447
    :catch_2
    move-exception v16

    .line 448
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v17

    .line 449
    const/4 v0, -0x2

    move-object/from16 v1, v17

    iput v0, v1, Landroid/os/Message;->what:I

    .line 450
    const-string v0, ""

    move-object/from16 v1, v17

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 451
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 454
    :goto_2
    const/16 v0, 0xc8

    if-ne v15, v0, :cond_2

    .line 455
    int-to-long v0, v8

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$800(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 456
    int-to-long v0, v8

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v2}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$800(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)J

    move-result-wide v2

    div-long/2addr v0, v2

    long-to-int v2, v0

    move/from16 v16, v2

    .line 457
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v17

    .line 458
    const/4 v0, 0x1

    move-object/from16 v1, v17

    iput v0, v1, Landroid/os/Message;->what:I

    .line 459
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v17

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 460
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 461
    goto :goto_3

    .line 462
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v16

    .line 463
    const/4 v0, 0x2

    move-object/from16 v1, v16

    iput v0, v1, Landroid/os/Message;->what:I

    .line 464
    const-string v0, ""

    move-object/from16 v1, v16

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 465
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 466
    goto :goto_3

    .line 468
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v16

    .line 469
    const/16 v0, -0x9

    move-object/from16 v1, v16

    iput v0, v1, Landroid/os/Message;->what:I

    .line 470
    const-string v0, ""

    move-object/from16 v1, v16

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 471
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 472
    goto :goto_4

    .line 474
    :goto_3
    goto/16 :goto_0

    .line 477
    :cond_3
    :goto_4
    :try_start_3
    invoke-virtual {v12}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    .line 484
    goto :goto_5

    .line 478
    :catch_3
    move-exception v14

    .line 479
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v15

    .line 480
    const/4 v0, -0x2

    iput v0, v15, Landroid/os/Message;->what:I

    .line 481
    invoke-virtual {v14}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v15, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 482
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/tencent/open/weiyun/FileManager$UploadFileImp$3;->this$1:Lcom/tencent/open/weiyun/FileManager$UploadFileImp;

    invoke-static {v0}, Lcom/tencent/open/weiyun/FileManager$UploadFileImp;->access$1300(Lcom/tencent/open/weiyun/FileManager$UploadFileImp;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 483
    return-void

    .line 485
    :goto_5
    return-void
.end method
