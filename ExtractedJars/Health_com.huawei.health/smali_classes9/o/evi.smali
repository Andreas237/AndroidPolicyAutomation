.class public Lo/evi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lo/evi;


# instance fields
.field private final a:Lokhttp3/OkHttpClient;

.field public final b:Ljava/util/Map;
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

.field public e:Ljava/lang/Object;

.field private final f:Lokhttp3/MediaType;

.field private final h:Lokhttp3/OkHttpClient;


# direct methods
.method private constructor <init>()V
    .locals 4

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    iput-object v0, p0, Lo/evi;->a:Lokhttp3/OkHttpClient;

    .line 50
    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    iput-object v0, p0, Lo/evi;->f:Lokhttp3/MediaType;

    .line 51
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/evi;->b:Ljava/util/Map;

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/evi;->c:Ljava/util/List;

    .line 53
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/evi;->e:Ljava/lang/Object;

    .line 55
    iget-object v0, p0, Lo/evi;->a:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1e

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 56
    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 57
    const-wide/16 v2, 0xa

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 58
    iget-object v0, p0, Lo/evi;->a:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    new-instance v1, Lokhttp3/Dispatcher;

    invoke-direct {v1}, Lokhttp3/Dispatcher;-><init>()V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->dispatcher(Lokhttp3/Dispatcher;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v0

    iput-object v0, p0, Lo/evi;->h:Lokhttp3/OkHttpClient;

    .line 60
    iget-object v0, p0, Lo/evi;->a:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lokhttp3/Dispatcher;->setMaxRequests(I)V

    .line 61
    iget-object v0, p0, Lo/evi;->h:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->dispatcher()Lokhttp3/Dispatcher;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lokhttp3/Dispatcher;->setMaxRequests(I)V

    .line 62
    return-void
.end method

.method private a(Ljava/io/File;)Z
    .locals 3

    .line 388
    const/4 v2, 0x0

    .line 389
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 390
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    .line 391
    if-nez v2, :cond_0

    .line 392
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v2

    .line 395
    :cond_0
    return v2
.end method

.method private b(Lo/evl;Lokhttp3/OkHttpClient$Builder;)V
    .locals 2

    .line 329
    invoke-virtual {p2}, Lokhttp3/OkHttpClient$Builder;->networkInterceptors()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lo/evi$1;

    invoke-direct {v1, p0, p1}, Lo/evi$1;-><init>(Lo/evi;Lo/evl;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 344
    return-void
.end method

.method private b(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/evl;)V
    .locals 15

    .line 347
    const/4 v6, 0x0

    .line 348
    const/4 v7, 0x0

    .line 349
    const/4 v8, 0x0

    .line 350
    const/4 v9, 0x0

    .line 351
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

    .line 353
    :try_start_0
    invoke-direct {p0, v10}, Lo/evi;->a(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 354
    invoke-static {v10}, Lokio/Okio;->sink(Ljava/io/File;)Lokio/Sink;

    move-result-object v0

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Sink;)Lokio/BufferedSink;

    move-result-object v0

    move-object v6, v0

    .line 355
    invoke-virtual/range {p2 .. p2}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->source()Lokio/BufferedSource;

    move-result-object v0

    move-object v7, v0

    .line 356
    const/16 v0, 0x2000

    new-array v11, v0, [B

    .line 358
    :goto_0
    invoke-interface {v7, v11}, Lokio/BufferedSource;->read([B)I

    move-result v0

    move v12, v0

    int-to-long v0, v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 359
    const/4 v0, 0x0

    invoke-interface {v6, v11, v0, v12}, Lokio/BufferedSink;->write([BII)Lokio/BufferedSink;

    goto :goto_0

    .line 361
    :cond_0
    invoke-interface {v6}, Lokio/BufferedSink;->flush()V

    .line 362
    const/4 v8, 0x1

    .line 363
    new-instance v13, Ljava/io/File;

    move-object/from16 v0, p3

    invoke-direct {v13, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 364
    invoke-virtual {v10, v13}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 368
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/evh;->d(Ljava/lang/String;J)V

    .line 369
    const/4 v0, 0x0

    invoke-static {v0}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/evi;->d(ILjava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v1}, Lo/evi;->c(Lorg/json/JSONObject;Lo/evl;)V

    goto :goto_1

    .line 370
    :cond_1
    invoke-virtual {v13}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/evh;->c(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v13, v0, v1}, Lo/evh;->b(Ljava/io/File;J)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 371
    const/4 v0, 0x0

    invoke-static {v0}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/evi;->d(ILjava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v1}, Lo/evi;->c(Lorg/json/JSONObject;Lo/evl;)V

    goto :goto_1

    .line 373
    :cond_2
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const/4 v1, 0x0

    move-object/from16 v2, p4

    invoke-direct {p0, v1, v0, v2}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V

    .line 375
    :goto_1
    goto :goto_2

    .line 376
    :cond_3
    new-instance v0, Ljava/lang/Exception;

    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    const/4 v1, 0x0

    move-object/from16 v2, p4

    invoke-direct {p0, v1, v0, v2}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 383
    :goto_2
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/evi;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 384
    goto :goto_3

    .line 378
    :catch_0
    move-exception v11

    .line 379
    :try_start_1
    invoke-interface/range {p1 .. p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v11, v1}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 383
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/evi;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 384
    goto :goto_3

    .line 380
    :catch_1
    move-exception v11

    .line 381
    :try_start_2
    invoke-interface/range {p1 .. p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    move-result-object v0

    move-object/from16 v1, p4

    invoke-direct {p0, v0, v11, v1}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 383
    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/evi;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 384
    goto :goto_3

    .line 383
    :catchall_0
    move-exception v14

    move-object v0, p0

    move-object v1, v6

    move-object v2, v7

    move-object v3, v9

    move-object v4, v10

    move v5, v8

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lo/evi;->e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V

    .line 384
    throw v14

    .line 385
    :goto_3
    return-void
.end method

.method private c(JJZLo/evl;)V
    .locals 6

    .line 126
    if-eqz p6, :cond_0

    .line 127
    move-object v0, p6

    move-wide v1, p1

    move-wide v3, p3

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/evl;->a(JJZ)V

    .line 129
    :cond_0
    return-void
.end method

.method static synthetic c(Lo/evi;JJZLo/evl;)V
    .locals 0

    .line 42
    invoke-direct/range {p0 .. p6}, Lo/evi;->c(JJZLo/evl;)V

    return-void
.end method

.method static synthetic c(Lo/evi;Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V

    return-void
.end method

.method private c(Lokhttp3/Request;Ljava/lang/String;Lo/evl;)V
    .locals 6

    .line 284
    iget-object v0, p0, Lo/evi;->h:Lokhttp3/OkHttpClient;

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v1

    .line 285
    invoke-direct {p0, p3, v1}, Lo/evi;->b(Lo/evl;Lokhttp3/OkHttpClient$Builder;)V

    .line 287
    invoke-virtual {v1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object v2

    .line 288
    invoke-virtual {v2, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object v3

    .line 289
    iget-object v4, p0, Lo/evi;->e:Ljava/lang/Object;

    monitor-enter v4

    .line 290
    :try_start_0
    iget-object v0, p0, Lo/evi;->c:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 291
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 292
    :goto_0
    new-instance v0, Lo/evi$5;

    invoke-direct {v0, p0, p3, p2}, Lo/evi$5;-><init>(Lo/evi;Lo/evl;Ljava/lang/String;)V

    invoke-interface {v3, v0}, Lokhttp3/Call;->enqueue(Lokhttp3/Callback;)V

    .line 306
    return-void
.end method

.method private c(Lorg/json/JSONObject;Lo/evl;)V
    .locals 0

    .line 112
    if-eqz p2, :cond_0

    .line 113
    invoke-virtual {p2, p1}, Lo/evl;->c(Lorg/json/JSONObject;)V

    .line 115
    :cond_0
    return-void
.end method

.method private static d(ILjava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 437
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

.method private d(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/evl;)V
    .locals 4

    .line 309
    iget-object v2, p0, Lo/evi;->e:Ljava/lang/Object;

    monitor-enter v2

    .line 310
    :try_start_0
    iget-object v0, p0, Lo/evi;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 311
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 312
    :goto_0
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 314
    :sswitch_0
    new-instance v0, Ljava/lang/Exception;

    const/16 v1, 0x1f4

    invoke-static {v1}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p4}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V

    .line 315
    goto :goto_2

    .line 317
    :sswitch_1
    invoke-direct {p0, p1, p2, p3, p4}, Lo/evi;->b(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/evl;)V

    .line 318
    goto :goto_2

    .line 320
    :sswitch_2
    new-instance v0, Ljava/lang/Exception;

    const/16 v1, 0x1f7

    invoke-static {v1}, Lo/evo;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p4}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V

    .line 321
    goto :goto_2

    .line 323
    :goto_1
    new-instance v0, Ljava/lang/Exception;

    const-string v1, "http unkow"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p4}, Lo/evi;->d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V

    .line 326
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

.method private d(Lokhttp3/Request;Ljava/lang/Exception;Lo/evl;)V
    .locals 0

    .line 103
    if-eqz p3, :cond_0

    .line 104
    invoke-virtual {p3, p1, p2}, Lo/evl;->a(Lokhttp3/Request;Ljava/lang/Exception;)V

    .line 106
    :cond_0
    return-void
.end method

.method public static e()Lo/evi;
    .locals 3

    .line 66
    sget-object v0, Lo/evi;->d:Lo/evi;

    if-nez v0, :cond_1

    .line 67
    const-class v1, Lo/evi;

    monitor-enter v1

    .line 68
    :try_start_0
    sget-object v0, Lo/evi;->d:Lo/evi;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lo/evi;

    invoke-direct {v0}, Lo/evi;-><init>()V

    sput-object v0, Lo/evi;->d:Lo/evi;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 73
    :cond_1
    :goto_0
    sget-object v0, Lo/evi;->d:Lo/evi;

    return-object v0
.end method

.method static synthetic e(Lo/evi;Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/evl;)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3, p4}, Lo/evi;->d(Lokhttp3/Call;Lokhttp3/Response;Ljava/lang/String;Lo/evl;)V

    return-void
.end method

.method private e(Lokio/BufferedSink;Lokio/BufferedSource;Ljava/io/FileInputStream;Ljava/io/File;Z)V
    .locals 5

    .line 399
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 401
    :try_start_0
    invoke-interface {p1}, Lokio/BufferedSink;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    goto :goto_0

    .line 402
    :catch_0
    move-exception v4

    .line 403
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 406
    :cond_0
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 408
    :try_start_1
    invoke-interface {p2}, Lokio/BufferedSource;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 411
    goto :goto_1

    .line 409
    :catch_1
    move-exception v4

    .line 410
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, p3, :cond_2

    .line 415
    :try_start_2
    invoke-virtual {p3}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    .line 418
    goto :goto_2

    .line 416
    :catch_2
    move-exception v4

    .line 417
    const-string v0, "HttpRequest"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 420
    :cond_2
    :goto_2
    if-nez p5, :cond_3

    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 421
    invoke-virtual {p4}, Ljava/io/File;->delete()Z

    move-result v4

    .line 422
    if-eqz v4, :cond_3

    .line 423
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

    .line 426
    :cond_3
    return-void
.end method


# virtual methods
.method public a()Lokhttp3/Request$Builder;
    .locals 5

    .line 77
    new-instance v1, Lokhttp3/Request$Builder;

    invoke-direct {v1}, Lokhttp3/Request$Builder;-><init>()V

    .line 79
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v2

    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 82
    invoke-virtual {v2}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    .line 86
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 87
    const-string v0, "x-huid"

    invoke-virtual {v1, v0, v3}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 90
    :cond_1
    invoke-static {}, Lo/bzp;->e()Ljava/lang/String;

    move-result-object v4

    .line 92
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 93
    const-string v0, "x-version"

    invoke-virtual {v1, v0, v4}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    .line 96
    :cond_2
    return-object v1
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;Lo/evl;)V
    .locals 1

    .line 257
    invoke-virtual {p0}, Lo/evi;->a()Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Lo/evi;->c(Lokhttp3/Request;Ljava/lang/String;Lo/evl;)V

    .line 258
    return-void
.end method
