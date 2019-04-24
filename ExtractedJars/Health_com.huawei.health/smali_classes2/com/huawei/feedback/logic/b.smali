.class public final Lcom/huawei/feedback/logic/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "Feedback"

.field private static b:Lcom/huawei/lcagent/client/LogMetricInfo; = null


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/feedback/logic/b;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    return-void
.end method

.method private static a(Landroid/content/Context;Lcom/huawei/feedback/bean/d;Lcom/huawei/feedback/bean/f;Landroid/os/Handler;)V
    .locals 1

    .line 335
    const/4 v0, 0x2

    invoke-static {p3, v0}, Lcom/huawei/feedback/logic/b;->a(Landroid/os/Handler;I)V

    .line 337
    return-void
.end method

.method public static a(Landroid/os/Handler;I)V
    .locals 3

    .line 517
    move-object v1, p0

    .line 518
    new-instance v2, Landroid/os/Message;

    invoke-direct {v2}, Landroid/os/Message;-><init>()V

    .line 519
    iput p1, v2, Landroid/os/Message;->what:I

    .line 520
    invoke-virtual {v1, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 521
    return-void
.end method

.method private static a(Lcom/huawei/feedback/bean/f;Landroid/content/Context;)V
    .locals 4

    .line 525
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 526
    invoke-static {p0}, Lcom/huawei/feedback/logic/f;->a(Lcom/huawei/feedback/bean/f;)J

    .line 529
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    .line 530
    const-string v0, "pQuestionId"

    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    const/4 v0, 0x4

    invoke-static {p1, v0, v2}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/content/ContentValues;)V

    .line 534
    new-instance v3, Landroid/content/Intent;

    const-string v0, "UpdateRecordListBroadcast"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 536
    invoke-static {p1}, Landroid/a/a/b/a;->a(Landroid/content/Context;)Landroid/a/a/b/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/a/a/b/a;->a(Landroid/content/Intent;)Z

    .line 538
    return-void
.end method

.method public static a(Lcom/huawei/feedback/bean/f;Ljava/lang/String;)V
    .locals 15

    .line 344
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    .line 345
    const/4 v5, 0x0

    .line 346
    const/4 v6, 0x0

    .line 347
    const/4 v7, 0x0

    .line 348
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/b/a;->a()V

    .line 352
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 353
    new-instance v8, Ljava/net/URL;

    const-string v0, "https://iservice.vmall.com:443/osg/feedbackAction!addQuestion.htm"

    invoke-direct {v8, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 355
    invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ljavax/net/ssl/HttpsURLConnection;

    .line 356
    const-string v0, "POST"

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 357
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 358
    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 359
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 363
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 364
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 365
    const-string v0, "Content-Type"

    const-string v1, "multipart/form-data;boundary=---------------------------40612316912668"

    invoke-virtual {v9, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    const v0, 0x1d4c0

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 369
    const v0, 0x1d4c0

    invoke-virtual {v9, v0}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 371
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 373
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    .line 374
    const-string v0, "deviceType"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 375
    const-string v0, "sysVersion"

    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 377
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->h()V

    .line 381
    :cond_0
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->i()Ljava/lang/String;

    move-result-object v10

    .line 382
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 384
    const-string v10, "000000000000000"

    .line 386
    :cond_1
    const-string v0, "deviceID"

    invoke-static {v0, v10, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 387
    const-string v0, "deviceToken"

    .line 388
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/feedback/a/b/b;->c()Ljava/lang/String;

    move-result-object v1

    .line 387
    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 390
    const-string v0, "question"

    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 392
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->y()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 394
    const-string v0, "questionType"

    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->y()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    goto :goto_0

    .line 399
    :cond_2
    const-string v0, "questionType"

    .line 400
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 401
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_cloud_service"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 400
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 399
    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 405
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->w()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-static {v1, v0, v5}, Lcom/huawei/feedback/logic/s;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 408
    const-string v0, "versionID"

    const-string v1, "2.0"

    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 411
    const-string v0, "pQuestionId"

    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 414
    const-string v0, "appId"

    .line 415
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "1"

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->x()Ljava/lang/String;

    move-result-object v1

    .line 414
    :goto_1
    invoke-static {v0, v1, v5}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 417
    invoke-static {v5}, Lcom/huawei/feedback/logic/s;->a(Ljava/io/DataOutputStream;)I

    .line 419
    invoke-virtual {v5}, Ljava/io/DataOutputStream;->flush()V

    .line 422
    invoke-virtual {v9}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v7, v0

    .line 423
    new-instance v11, Ljava/lang/StringBuffer;

    invoke-direct {v11}, Ljava/lang/StringBuffer;-><init>()V

    .line 424
    const/4 v12, 0x0

    .line 425
    const/16 v0, 0x400

    new-array v13, v0, [B

    .line 428
    :goto_2
    invoke-virtual {v7, v13}, Ljava/io/InputStream;->read([B)I

    move-result v12

    .line 429
    const/4 v0, -0x1

    if-ne v0, v12, :cond_4

    .line 432
    goto :goto_3

    .line 436
    :cond_4
    new-instance v0, Ljava/lang/String;

    const-string v1, "utf-8"

    const/4 v2, 0x0

    invoke-direct {v0, v13, v2, v12, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v11, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 440
    :goto_3
    invoke-virtual {v11}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v6

    .line 459
    const-string v0, "Feedback"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 460
    const-string v0, "Feedback"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 461
    goto :goto_4

    .line 442
    :catch_0
    move-exception v8

    .line 444
    const-string v0, "Feedback"

    const-string v1, "appendFeedback UnsupportedEncodingException"

    :try_start_1
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    invoke-static {p0, v4}, Lcom/huawei/feedback/logic/b;->a(Lcom/huawei/feedback/bean/f;Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 459
    const-string v0, "Feedback"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 460
    const-string v0, "Feedback"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 447
    return-void

    .line 449
    :catch_1
    move-exception v8

    .line 452
    const-string v0, "Feedback"

    const-string v1, "appendFeedback io error"

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 454
    invoke-static {p0, v4}, Lcom/huawei/feedback/logic/b;->a(Lcom/huawei/feedback/bean/f;Landroid/content/Context;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 459
    const-string v0, "Feedback"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 460
    const-string v0, "Feedback"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 455
    return-void

    .line 459
    :catchall_0
    move-exception v14

    const-string v0, "Feedback"

    invoke-static {v7, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 460
    const-string v0, "Feedback"

    invoke-static {v5, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    throw v14

    .line 471
    :goto_4
    new-instance v8, Lcom/huawei/feedback/logic/r;

    invoke-direct {v8}, Lcom/huawei/feedback/logic/r;-><init>()V

    .line 472
    invoke-virtual {v8, v6}, Lcom/huawei/feedback/logic/r;->a(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    invoke-virtual {v8}, Lcom/huawei/feedback/logic/r;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 475
    invoke-virtual {v8}, Lcom/huawei/feedback/logic/r;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->r()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 479
    invoke-virtual {v8}, Lcom/huawei/feedback/logic/r;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 482
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 483
    invoke-static {p0}, Lcom/huawei/feedback/logic/f;->a(Lcom/huawei/feedback/bean/f;)J

    .line 487
    :cond_5
    new-instance v9, Landroid/content/Intent;

    const-string v0, "UpdateRecordListBroadcast"

    invoke-direct {v9, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 489
    invoke-static {v4}, Landroid/a/a/b/a;->a(Landroid/content/Context;)Landroid/a/a/b/a;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/a/a/b/a;->a(Landroid/content/Intent;)Z

    .line 491
    new-instance v10, Landroid/content/ContentValues;

    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    .line 492
    const-string v0, "pQuestionId"

    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 494
    const/4 v0, 0x5

    invoke-static {v4, v0, v10}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/content/ContentValues;)V

    .line 496
    goto :goto_5

    .line 500
    :cond_6
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 501
    invoke-static {p0}, Lcom/huawei/feedback/logic/f;->a(Lcom/huawei/feedback/bean/f;)J

    .line 504
    new-instance v9, Landroid/content/ContentValues;

    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 505
    const-string v0, "pQuestionId"

    invoke-virtual {p0}, Lcom/huawei/feedback/bean/f;->t()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 506
    const/4 v0, 0x4

    invoke-static {v4, v0, v9}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/content/ContentValues;)V

    .line 508
    new-instance v10, Landroid/content/Intent;

    const-string v0, "UpdateRecordListBroadcast"

    invoke-direct {v10, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 510
    invoke-static {v4}, Landroid/a/a/b/a;->a(Landroid/content/Context;)Landroid/a/a/b/a;

    move-result-object v0

    invoke-virtual {v0, v10}, Landroid/a/a/b/a;->a(Landroid/content/Intent;)Z

    .line 514
    :goto_5
    return-void
.end method

.method private static a(Lcom/huawei/feedback/logic/r;Lcom/huawei/feedback/bean/d;Lcom/huawei/feedback/bean/f;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;)V
    .locals 5

    .line 236
    invoke-static {}, Lcom/huawei/feedback/logic/f;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    invoke-static {}, Lcom/huawei/feedback/logic/f;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0x1f4

    if-ge v0, v1, :cond_5

    .line 238
    invoke-virtual {p0}, Lcom/huawei/feedback/logic/r;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/feedback/bean/d;->h()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 240
    invoke-virtual {p0}, Lcom/huawei/feedback/logic/r;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->i(Ljava/lang/String;)V

    .line 244
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/d;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->l(Ljava/lang/String;)V

    .line 246
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy/M/d HH:mm"

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 248
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    .line 249
    invoke-virtual {p2, v3}, Lcom/huawei/feedback/bean/f;->k(Ljava/lang/String;)V

    .line 252
    invoke-virtual {p2}, Lcom/huawei/feedback/bean/f;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->n(Ljava/lang/String;)V

    .line 254
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->c(I)V

    .line 256
    invoke-virtual {p2, p3}, Lcom/huawei/feedback/bean/f;->m(Ljava/lang/String;)V

    .line 257
    invoke-virtual {p2, p4}, Lcom/huawei/feedback/bean/f;->o(Ljava/lang/String;)V

    .line 259
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/d;->n()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->p(Ljava/lang/String;)V

    .line 260
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/d;->p()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->g(Ljava/lang/String;)V

    .line 262
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 264
    invoke-virtual {p1}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->j(Ljava/lang/String;)V

    .line 267
    :cond_0
    const-string v0, "1"

    invoke-virtual {v0, p6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    const/4 v0, 0x5

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    goto :goto_0

    .line 272
    :cond_1
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lcom/huawei/feedback/bean/f;->b(I)V

    .line 274
    :goto_0
    invoke-static {p2}, Lcom/huawei/feedback/logic/f;->c(Lcom/huawei/feedback/bean/f;)V

    .line 275
    new-instance v4, Landroid/content/Intent;

    const-string v0, "UpdateRecordListBroadcast"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 276
    invoke-static {p5}, Landroid/a/a/b/a;->a(Landroid/content/Context;)Landroid/a/a/b/a;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/a/a/b/a;->a(Landroid/content/Intent;)Z

    .line 279
    :cond_2
    invoke-static {}, Lcom/huawei/feedback/d;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 281
    const/4 v0, 0x1

    invoke-static {p7, v0}, Lcom/huawei/feedback/logic/b;->a(Landroid/os/Handler;I)V

    goto :goto_1

    .line 284
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/feedback/bean/f;->j()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_4

    .line 286
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p5, v0, v1}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/content/ContentValues;)V

    goto :goto_1

    .line 289
    :cond_4
    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p5, v0, v1}, Lcom/huawei/feedback/logic/g;->a(Landroid/content/Context;ILandroid/content/ContentValues;)V

    .line 294
    :cond_5
    :goto_1
    return-void
.end method

.method public static a(Lcom/huawei/feedback/bean/d;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/lcagent/client/LogMetricInfo;Lcom/huawei/lcagent/client/LogCollectManager;ZLandroid/os/Handler;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/feedback/bean/f;I)Z
    .locals 22

    .line 67
    const/4 v8, 0x0

    .line 69
    move-object/from16 v9, p8

    .line 70
    if-eqz p7, :cond_0

    .line 72
    sput-object p5, Lcom/huawei/feedback/logic/b;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    .line 74
    :cond_0
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v10

    .line 75
    const/4 v11, 0x0

    .line 76
    const/4 v12, 0x0

    .line 77
    const/4 v13, 0x0

    .line 78
    const-string v14, ""

    .line 79
    invoke-static {}, Lcom/huawei/phoneserviceuni/common/b/a;->a()V

    .line 82
    const-string v0, "http.keepAlive"

    const-string v1, "false"

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/System;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    new-instance v15, Ljava/net/URL;

    const-string v0, "https://iservice.vmall.com:443/osg/feedbackAction!addQuestion.htm"

    invoke-direct {v15, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v15}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Ljavax/net/ssl/HttpsURLConnection;

    .line 86
    const-string v0, "POST"

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Ljavax/net/ssl/HttpsURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 87
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setDoOutput(Z)V

    .line 88
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setDoInput(Z)V

    .line 89
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setUseCaches(Z)V

    .line 93
    const-string v0, "Connection"

    const-string v1, "keep-alive"

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    const-string v0, "Charset"

    const-string v1, "UTF-8"

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    const-string v0, "Content-Type"

    const-string v1, "multipart/form-data;boundary=---------------------------40612316912668"

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    move-object/from16 v0, v16

    const v1, 0x1d4c0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setConnectTimeout(I)V

    .line 99
    move-object/from16 v0, v16

    const v1, 0x1d4c0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setReadTimeout(I)V

    .line 102
    move-object/from16 v0, v16

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljavax/net/ssl/HttpsURLConnection;->setChunkedStreamingMode(I)V

    .line 104
    invoke-virtual/range {v16 .. v16}, Ljavax/net/ssl/HttpsURLConnection;->connect()V

    .line 106
    new-instance v0, Ljava/io/DataOutputStream;

    invoke-virtual/range {v16 .. v16}, Ljavax/net/ssl/HttpsURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v11, v0

    .line 107
    const-string v0, "deviceType"

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 108
    const-string v0, "sysVersion"

    sget-object v1, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 111
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 112
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->h()V

    .line 114
    :cond_1
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/feedback/a/b/b;->i()Ljava/lang/String;

    move-result-object v17

    .line 115
    invoke-static/range {v17 .. v17}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 116
    const-string v17, "000000000000000"

    .line 117
    :cond_2
    const-string v0, "deviceID"

    move-object/from16 v1, v17

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 118
    const-string v0, "deviceToken"

    .line 119
    invoke-static {}, Lcom/huawei/feedback/a/b/b;->a()Lcom/huawei/feedback/a/b/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/feedback/a/b/b;->c()Ljava/lang/String;

    move-result-object v1

    .line 118
    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 120
    const-string v0, "contactAddress"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 121
    const-string v0, "question"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 128
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 129
    const-string v0, "questionType"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->o()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    goto :goto_0

    .line 131
    :cond_3
    const-string v0, "questionType"

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 132
    invoke-static {}, Lcom/huawei/feedback/FeedbackApi;->getApplicationcontext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "feedback_cloud_service"

    invoke-static {v2, v3}, Lcom/huawei/feedback/f;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    .line 131
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 137
    :goto_0
    const-string v0, "\\|"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v18

    .line 139
    move-object/from16 v0, v18

    array-length v0, v0

    move/from16 v19, v0

    .line 142
    move/from16 v0, v19

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 143
    const/4 v0, 0x0

    aget-object v0, v18, v0

    const-string v1, ""

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->a(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    goto :goto_1

    .line 145
    :cond_4
    invoke-static/range {v18 .. v18}, Lcom/huawei/feedback/logic/s;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    .line 146
    const/4 v0, 0x1

    invoke-static {v0, v11, v14}, Lcom/huawei/feedback/logic/s;->a(ZLjava/io/DataOutputStream;Ljava/lang/String;)I

    .line 152
    :goto_1
    const-string v0, "versionID"

    const-string v1, "3.0"

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 155
    const-string v0, "appId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->n()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 156
    const-string v0, "isUploadLog"

    move-object/from16 v1, p10

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 157
    const-string v0, "frequency"

    move-object/from16 v1, p9

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 158
    const-string v0, "0"

    move-object/from16 v1, p10

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 159
    const-string v0, "uploadFileName"

    const-string v1, ""

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    goto :goto_2

    .line 161
    :cond_5
    const-string v0, "uploadFileName"

    move-object/from16 v1, p11

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 172
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->k()Z

    move-result v0

    if-eqz v0, :cond_6

    if-eqz p7, :cond_6

    sget-object v0, Lcom/huawei/feedback/logic/b;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    if-eqz v0, :cond_6

    sget-object v0, Lcom/huawei/feedback/logic/b;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    iget-object v0, v0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    .line 173
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 174
    sget-object v0, Lcom/huawei/feedback/logic/b;->b:Lcom/huawei/lcagent/client/LogMetricInfo;

    iget-object v0, v0, Lcom/huawei/lcagent/client/LogMetricInfo;->path:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1, v11, v0}, Lcom/huawei/feedback/logic/s;->a(ZLjava/io/DataOutputStream;Ljava/lang/String;)I

    .line 181
    :cond_6
    const-string v0, "apkType"

    invoke-static/range {p13 .. p13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 183
    invoke-static {v10}, Lcom/huawei/feedback/e;->k(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 184
    const-string v0, "isPush"

    const-string v1, "1"

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    goto :goto_3

    .line 186
    :cond_7
    const-string v0, "isPush"

    const-string v1, "0"

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 190
    :goto_3
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 191
    const-string v0, "appPackageName"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 194
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 195
    const-string v0, "appVersion"

    invoke-virtual/range {p0 .. p0}, Lcom/huawei/feedback/bean/d;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v11}, Lcom/huawei/feedback/logic/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/io/DataOutputStream;)I

    .line 198
    :cond_9
    invoke-static {v11}, Lcom/huawei/feedback/logic/s;->a(Ljava/io/DataOutputStream;)I

    .line 200
    invoke-virtual {v11}, Ljava/io/DataOutputStream;->flush()V

    .line 201
    invoke-virtual/range {v16 .. v16}, Ljavax/net/ssl/HttpsURLConnection;->getResponseCode()I

    move-result v0

    const/16 v1, 0x1f7

    if-ne v0, v1, :cond_a

    .line 203
    move-object/from16 v0, p0

    move-object/from16 v1, p12

    invoke-static {v10, v0, v1, v9}, Lcom/huawei/feedback/logic/b;->a(Landroid/content/Context;Lcom/huawei/feedback/bean/d;Lcom/huawei/feedback/bean/f;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 204
    const/16 v20, 0x0

    .line 216
    const-string v0, "Feedback"

    invoke-static {v12, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 217
    const-string v0, "Feedback"

    invoke-static {v11, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 218
    invoke-static {v14}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/lang/String;)Z

    return v20

    .line 207
    :cond_a
    :try_start_1
    invoke-virtual/range {v16 .. v16}, Ljavax/net/ssl/HttpsURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    move-object v12, v0

    .line 208
    invoke-static {v12}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v13

    .line 209
    const-string v0, "Feedback"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 216
    const-string v0, "Feedback"

    invoke-static {v12, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 217
    const-string v0, "Feedback"

    invoke-static {v11, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 218
    invoke-static {v14}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/lang/String;)Z

    .line 219
    goto :goto_4

    .line 210
    :catch_0
    move-exception v15

    .line 211
    const-string v0, "Feedback"

    const-string v1, "IOException ..."

    :try_start_2
    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    move-object/from16 v0, p0

    move-object/from16 v1, p12

    invoke-static {v10, v0, v1, v9}, Lcom/huawei/feedback/logic/b;->a(Landroid/content/Context;Lcom/huawei/feedback/bean/d;Lcom/huawei/feedback/bean/f;Landroid/os/Handler;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 214
    const/16 v16, 0x0

    .line 216
    const-string v0, "Feedback"

    invoke-static {v12, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 217
    const-string v0, "Feedback"

    invoke-static {v11, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 218
    invoke-static {v14}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/lang/String;)Z

    return v16

    .line 216
    :catchall_0
    move-exception v21

    const-string v0, "Feedback"

    invoke-static {v12, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 217
    const-string v0, "Feedback"

    invoke-static {v11, v0}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 218
    invoke-static {v14}, Lcom/huawei/phoneserviceuni/common/e/b;->a(Ljava/lang/String;)Z

    throw v21

    .line 221
    :goto_4
    new-instance v15, Lcom/huawei/feedback/logic/r;

    invoke-direct {v15}, Lcom/huawei/feedback/logic/r;-><init>()V

    .line 222
    const/4 v0, 0x0

    if-eq v0, v13, :cond_b

    invoke-virtual {v15, v13}, Lcom/huawei/feedback/logic/r;->a(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    invoke-virtual {v15}, Lcom/huawei/feedback/logic/r;->a()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    .line 224
    const/4 v8, 0x1

    .line 226
    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p12

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move-object v5, v10

    move-object/from16 v6, p10

    move-object v7, v9

    invoke-static/range {v0 .. v7}, Lcom/huawei/feedback/logic/b;->a(Lcom/huawei/feedback/logic/r;Lcom/huawei/feedback/bean/d;Lcom/huawei/feedback/bean/f;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Landroid/os/Handler;)V

    goto :goto_5

    .line 229
    :cond_b
    const-string v0, "Feedback"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "response = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/phoneserviceuni/common/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 230
    move-object/from16 v0, p0

    move-object/from16 v1, p12

    invoke-static {v10, v0, v1, v9}, Lcom/huawei/feedback/logic/b;->a(Landroid/content/Context;Lcom/huawei/feedback/bean/d;Lcom/huawei/feedback/bean/f;Landroid/os/Handler;)V

    .line 233
    :goto_5
    return v8
.end method
