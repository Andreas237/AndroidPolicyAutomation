.class public Lo/bsc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lo/bsc;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lokhttp3/Call;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokhttp3/Call;>;"
        }
    .end annotation
.end field

.field private final d:Lokhttp3/OkHttpClient;

.field public e:Ljava/lang/Object;

.field private final f:Lokhttp3/OkHttpClient;

.field private final h:Lokhttp3/MediaType;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    iput-object v0, p0, Lo/bsc;->d:Lokhttp3/OkHttpClient;

    .line 58
    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    iput-object v0, p0, Lo/bsc;->h:Lokhttp3/MediaType;

    .line 59
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/bsc;->a:Ljava/util/Map;

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bsc;->c:Ljava/util/List;

    .line 61
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/bsc;->e:Ljava/lang/Object;

    .line 63
    iget-object v0, p0, Lo/bsc;->d:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 64
    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 65
    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 66
    iget-object v0, p0, Lo/bsc;->d:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    new-instance v1, Lokhttp3/Dispatcher;

    invoke-direct {v1}, Lokhttp3/Dispatcher;-><init>()V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->dispatcher(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    iput-object v0, p0, Lo/bsc;->f:Lokhttp3/OkHttpClient;

    .line 68
    iget-object v0, p0, Lo/bsc;->d:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lokhttp3/Dispatcher;->setMaxRequests(I)V

    .line 69
    iget-object v0, p0, Lo/bsc;->f:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lokhttp3/Dispatcher;->setMaxRequests(I)V

    .line 70
    return-void
.end method

.method private a(IJJ)V
    .locals 5

    .line 403
    sub-long v2, p4, p2

    .line 404
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    const-wide/16 v0, 0x1388

    cmp-long v0, v2, v0

    if-ltz v0, :cond_3

    .line 405
    :cond_0
    const/16 v0, 0x1f4

    if-ne p1, v0, :cond_1

    .line 406
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 407
    const-string v0, "target"

    const-string v1, "1"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    const-string v0, "target_source_type"

    const-string v1, "2"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    const-string v0, "delay_ms"

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    const-string v0, "flag"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 411
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 412
    goto/16 :goto_0

    :cond_1
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_2

    .line 413
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 414
    const-string v0, "target"

    const-string v1, "1"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    const-string v0, "target_source_type"

    const-string v1, "2"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    const-string v0, "delay_ms"

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    const-string v0, "flag"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 426
    goto :goto_0

    .line 427
    :cond_2
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 428
    const-string v0, "target"

    const-string v1, "1"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    const-string v0, "target_source_type"

    const-string v1, "2"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 430
    const-string v0, "delay_ms"

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    const-string v0, "flag"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 435
    :cond_3
    :goto_0
    return-void
.end method

.method private a(JJZLo/bsf;)V
    .locals 6

    .line 134
    if-eqz p6, :cond_0

    .line 135
    move-object v0, p6

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/bsf;->onProgress(JJZ)V

    .line 137
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/bsc;JJ)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bsc;->d(JJ)V

    return-void
.end method

.method static synthetic a(Lo/bsc;JJZLo/bsf;)V
    .locals 0

    .line 51
    invoke-direct/range {p0 .. p6}, Lo/bsc;->a(JJZLo/bsf;)V

    return-void
.end method

.method private a(Lokhttp3/Request;Ljava/lang/String;Lo/bsf;)V
    .locals 13

    .line 348
    iget-object v0, p0, Lo/bsc;->f:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v6

    .line 349
    move-object/from16 v0, p3

    invoke-direct {p0, v0, v6}, Lo/bsc;->e(Lo/bsf;Lokhttp3/OkHttpClient$Builder;)V

    .line 350
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 351
    invoke-virtual {v6}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v9

    .line 352
    invoke-virtual {v9, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v10

    .line 353
    iget-object v11, p0, Lo/bsc;->e:Ljava/lang/Object;

    monitor-enter v11

    .line 354
    :try_start_0
    iget-object v0, p0, Lo/bsc;->c:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 355
    monitor-exit v11

    goto :goto_0

    :catchall_0
    move-exception v12

    monitor-exit v11

    throw v12

    .line 356
    :goto_0
    new-instance v0, Lo/bsc$5;

    move-object v1, p0

    move-object/from16 v2, p3

    move-wide v3, v7

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/bsc$5;-><init>(Lo/bsc;Lo/bsf;JLjava/lang/String;)V

    invoke-interface {v10, v0}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 374
    return-void
.end method

.method private a(Lorg/json/JSONObject;Lo/bsf;)V
    .locals 0

    .line 120
    if-eqz p2, :cond_0

    .line 121
    invoke-virtual {p2, p1}, Lo/bsf;->onSuccess(Lorg/json/JSONObject;)V

    .line 123
    :cond_0
    return-void
.end method

.method private a(Ljava/io/File;)Z
    .locals 3

    .line 513
    const/4 v2, 0x0

    .line 514
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 515
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    .line 516
    if-nez v2, :cond_0

    .line 517
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v2

    .line 520
    :cond_0
    return v2
.end method

.method public static b()Lo/bsc;
    .locals 3

    .line 74
    sget-object v0, Lo/bsc;->b:Lo/bsc;

    if-nez v0, :cond_1

    .line 75
    const-class v1, Lo/bsc;

    monitor-enter v1

    .line 76
    :try_start_0
    sget-object v0, Lo/bsc;->b:Lo/bsc;

    if-nez v0, :cond_0

    .line 77
    new-instance v0, Lo/bsc;

    invoke-direct {v0}, Lo/bsc;-><init>()V

    sput-object v0, Lo/bsc;->b:Lo/bsc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 81
    :cond_1
    :goto_0
    sget-object v0, Lo/bsc;->b:Lo/bsc;

    return-object v0
.end method

.method private b(IJJ)V
    .locals 5

    .line 281
    sub-long v2, p4, p2

    .line 282
    const-wide/16 v0, 0x1388

    cmp-long v0, v2, v0

    if-ltz v0, :cond_0

    .line 283
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 284
    const-string v0, "module"

    const-string v1, "3"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    const-string v0, "status"

    const-string v1, "0"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    const-string v0, "delay"

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    const-string v0, "errorcode"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_REQUEST_MODULE_85030001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 290
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/Exception;JJ)V
    .locals 6

    .line 253
    const/16 v2, 0x270f

    .line 254
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-nez v0, :cond_0

    instance-of v0, p1, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Connection timed out"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 255
    :cond_0
    const/16 v2, 0x3eb

    goto :goto_0

    .line 256
    :cond_1
    instance-of v0, p1, Ljava/net/ConnectException;

    if-nez v0, :cond_2

    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_3

    .line 257
    :cond_2
    const/4 v2, -0x8

    goto :goto_0

    .line 258
    :cond_3
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Canceled"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 259
    const/4 v2, -0x2

    goto :goto_0

    .line 260
    :cond_4
    const/16 v0, 0x1f4

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 261
    const/16 v2, 0x1f4

    goto :goto_0

    .line 262
    :cond_5
    const/16 v0, 0x1f7

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 263
    const/16 v2, 0x1f7

    .line 265
    :cond_6
    :goto_0
    sub-long v3, p4, p2

    .line 266
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 267
    const-string v0, "module"

    const-string v1, "3"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    const-string v0, "status"

    const-string v1, "1"

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    const-string v0, "delay"

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    const-string v0, "errorcode"

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_REQUEST_MODULE_85030001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 272
    return-void
.end method

.method static synthetic b(Lo/bsc;IJJ)V
    .locals 0

    .line 51
    invoke-direct/range {p0 .. p5}, Lo/bsc;->a(IJJ)V

    return-void
.end method

.method static synthetic b(Lo/bsc;Lokhttp3/Call;Lokhttp3/Response;Lo/bsf;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/bsc;->e(Lokhttp3/Call;Lokhttp3/Response;Lo/bsf;)V

    return-void
.end method

.method private b(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/bsf;)V
    .locals 4

    .line 377
    iget-object v2, p0, Lo/bsc;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 378
    :try_start_0
    iget-object v0, p0, Lo/bsc;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 379
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 380
    :goto_0
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 382
    :sswitch_0
    new-instance v0, Ljava/lang/Exception;

    const/16 v1, 0x1f4

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p4}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 383
    goto :goto_2

    .line 385
    :sswitch_1
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bsc;->d(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/bsf;)V

    .line 386
    goto :goto_2

    .line 388
    :sswitch_2
    new-instance v0, Ljava/lang/Exception;

    const/16 v1, 0x1f7

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p4}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 389
    goto :goto_2

    .line 391
    :goto_1
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "http unkow"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p4}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 394
    :goto_2
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc8 -> :sswitch_1
        0x1f4 -> :sswitch_0
        0x1f7 -> :sswitch_2
    .end sparse-switch
.end method

.method static synthetic c(Lo/bsc;Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    return-void
.end method

.method private static d(ILjava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 562
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "resultCode"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "resultDesc"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "datas"

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method private d(JJ)V
    .locals 5

    .line 443
    sub-long v2, p3, p1

    .line 445
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 446
    const-string v0, "target"

    const-string v1, "1"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 447
    const-string v0, "target_source_type"

    const-string v1, "2"

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    const-string v0, "delay_ms"

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    const-string v0, "flag"

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 450
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_DEPEND_85040001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 451
    return-void
.end method

.method static synthetic d(Lo/bsc;IJJ)V
    .locals 0

    .line 51
    invoke-direct/range {p0 .. p5}, Lo/bsc;->b(IJJ)V

    return-void
.end method

.method static synthetic d(Lo/bsc;Ljava/lang/Exception;JJ)V
    .locals 0

    .line 51
    invoke-direct/range {p0 .. p5}, Lo/bsc;->b(Ljava/lang/Exception;JJ)V

    return-void
.end method

.method private d(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/bsf;)V
    .locals 15

    .line 472
    const/4 v6, 0x0

    .line 473
    const/4 v7, 0x0

    .line 474
    const/4 v8, 0x0

    .line 475
    const/4 v9, 0x0

    .line 476
    new-instance v10, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v1, p3

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".temp"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v10, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 478
    :try_start_0
    invoke-direct {p0, v10}, Lo/bsc;->a(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 479
    invoke-static {v10}, Lokio/Okio;->sink(Ljava/io/File;)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    move-object v6, v0

    .line 480
    invoke-virtual/range {p2 .. p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    move-object v7, v0

    .line 481
    const/16 v0, 0x2000

    new-array v11, v0, [B

    .line 483
    :goto_0
    invoke-interface {v7, v11}, Lokio/BufferedSource;->read([B)I

    move-result v0

    move v12, v0

    int-to-long v0, v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 484
    const/4 v0, 0x0

    invoke-interface {v6, v11, v0, v12}, Lokio/BufferedSink;->write([BII)Lokio/BufferedSink;

    goto :goto_0

    .line 486
    :cond_0
    invoke-interface {v6}, Lokio/BufferedSink;->flush()V

    .line 487
    const/4 v8, 0x1

    .line 488
    new-instance v13, Ljava/io/File;

    move-object/from16 v0, p3

    invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 489
    invoke-virtual {v10, v13}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 493
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bsm;->b(Ljava/lang/String;J)V

    .line 494
    const/4 v0, 0x0

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/bsc;->d(ILjava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v1}, Lo/bsc;->a(Lorg/json/JSONObject;Lo/bsf;)V

    goto :goto_1

    .line 495
    :cond_1
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsm;->n(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lo/bsm;->d(Ljava/io/File;J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 496
    const/4 v0, 0x0

    invoke-static {v0}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/bsc;->d(ILjava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v1}, Lo/bsc;->a(Lorg/json/JSONObject;Lo/bsf;)V

    goto :goto_1

    .line 498
    :cond_2
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const/4 v1, 0x0

    move-object/from16 v2, p4

    invoke-direct {p0, v1, v0, v2}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 500
    :goto_1
    goto :goto_2

    .line 501
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const/4 v1, 0x0

    move-object/from16 v2, p4

    invoke-direct {p0, v1, v0, v2}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 508
    :goto_2
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bsc;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 509
    goto :goto_3

    .line 503
    :catch_0
    move-exception v11

    .line 504
    :try_start_1
    invoke-interface/range {p1 .. p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v11, v1}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 508
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bsc;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 509
    goto :goto_3

    .line 505
    :catch_1
    move-exception v11

    .line 506
    :try_start_2
    invoke-interface/range {p1 .. p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v11, v1}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 508
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bsc;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 509
    goto :goto_3

    .line 508
    :catchall_0
    move-exception v14

    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/bsc;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 509
    throw v14

    .line 510
    :goto_3
    return-void
.end method

.method private d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V
    .locals 0

    .line 111
    if-eqz p3, :cond_0

    .line 112
    invoke-virtual {p3, p1, p2}, Lo/bsf;->onFailure(Lokhttp3/Request;Ljava/lang/Exception;)V

    .line 114
    :cond_0
    return-void
.end method

.method private e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 3

    .line 294
    invoke-static {}, Lo/bsl;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 295
    const-string v0, "my"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    .line 296
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 298
    :cond_0
    return-object p1
.end method

.method static synthetic e(Lo/bsc;Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/bsf;)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bsc;->b(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/bsf;)V

    return-void
.end method

.method private e(Lo/bsf;Lokhttp3/OkHttpClient$Builder;)V
    .locals 2

    .line 454
    invoke-virtual {p2}, Lokhttp3/OkHttpClient$Builder;->networkInterceptors()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lo/bsc$3;

    invoke-direct {v1, p0, p1}, Lo/bsc$3;-><init>(Lo/bsc;Lo/bsf;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 469
    return-void
.end method

.method private e(Lokhttp3/Call;Lokhttp3/Response;Lo/bsf;)V
    .locals 5

    .line 303
    :try_start_0
    invoke-virtual {p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v4

    .line 304
    const-string v0, "HttpRequest"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeStr datas = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 305
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0, p3}, Lo/bsc;->a(Lorg/json/JSONObject;Lo/bsf;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    .line 310
    goto :goto_0

    .line 306
    :catch_0
    move-exception v4

    .line 307
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-direct {p0, v0, v4, p3}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 310
    goto :goto_0

    .line 308
    :catch_1
    move-exception v4

    .line 309
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v0

    invoke-direct {p0, v0, v4, p3}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 311
    :goto_0
    return-void
.end method

.method private e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V
    .locals 5

    .line 524
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 526
    :try_start_0
    invoke-interface {p1}, Lokio/BufferedSink;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 529
    goto :goto_0

    .line 527
    :catch_0
    move-exception v4

    .line 528
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 531
    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 533
    :try_start_1
    invoke-interface {p2}, Lokio/BufferedSource;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 536
    goto :goto_1

    .line 534
    :catch_1
    move-exception v4

    .line 535
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 540
    :try_start_2
    invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 543
    goto :goto_2

    .line 541
    :catch_2
    move-exception v4

    .line 542
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 545
    :cond_2
    :goto_2
    if-nez p5, :cond_3

    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 546
    invoke-virtual {p4}, Ljava/io/File;->delete()Z

    move-result v4

    .line 547
    if-eqz v4, :cond_3

    .line 548
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "down fail"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 551
    :cond_3
    return-void
.end method


# virtual methods
.method public a()Lokhttp3/Request$Builder;
    .locals 5

    .line 85
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 87
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v2

    .line 88
    const/4 v3, 0x0

    .line 89
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 90
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    .line 94
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 95
    const-string v0, "x-huid"

    invoke-virtual {v1, v0, v3}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 98
    :cond_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 100
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 101
    const-string v0, "x-version"

    invoke-virtual {v1, v0, v4}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 104
    :cond_2
    return-object v1
.end method

.method public b(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsf;)V
    .locals 13

    .line 194
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 195
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "URL == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    new-instance v0, Ljava/lang/Exception;

    const v1, 0x30d58

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    move-object/from16 v2, p3

    invoke-direct {p0, v1, v0, v2}, Lo/bsc;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/bsf;)V

    .line 197
    return-void

    .line 199
    :cond_0
    const-string v0, "HttpRequest"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 202
    iget-object v0, p0, Lo/bsc;->h:Lokhttp3/MediaType;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v9

    .line 203
    invoke-virtual {p0}, Lo/bsc;->a()Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, v9}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v10

    .line 204
    iget-object v0, p0, Lo/bsc;->d:Lokhttp3/OkHttpClient;

    invoke-virtual {v0, v10}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v11

    .line 205
    invoke-direct {p0, p1, p2}, Lo/bsc;->e(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    .line 206
    iget-object v0, p0, Lo/bsc;->a:Ljava/util/Map;

    invoke-interface {v0, v12, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    new-instance v0, Lo/bsc$1;

    move-object v1, p0

    move-object v2, v12

    move-object v3, p1

    move-object/from16 v4, p3

    move-wide v5, v7

    invoke-direct/range {v0 .. v6}, Lo/bsc$1;-><init>(Lo/bsc;Ljava/lang/String;Ljava/lang/String;Lo/bsf;J)V

    invoke-interface {v11, v0}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 244
    return-void
.end method

.method public e()V
    .locals 8

    .line 567
    iget-object v4, p0, Lo/bsc;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 568
    const/4 v5, 0x0

    :goto_0
    :try_start_0
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    iget-object v0, v0, Lo/bsc;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 569
    invoke-static {}, Lo/bsc;->b()Lo/bsc;

    move-result-object v0

    iget-object v0, v0, Lo/bsc;->c:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lokhttp3/Call;

    .line 570
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Lokhttp3/Call;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 571
    invoke-interface {v6}, Lokhttp3/Call;->cancel()V

    .line 572
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel down all file"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 568
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 575
    :cond_1
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 576
    :goto_1
    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;Lo/bsf;)V
    .locals 1

    .line 321
    invoke-virtual {p0}, Lo/bsc;->a()Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lo/bsc;->a(Lokhttp3/Request;Ljava/lang/String;Lo/bsf;)V

    .line 322
    return-void
.end method
