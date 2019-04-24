.class public Lo/dqf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static e:Z

.field private static l:Z

.field private static n:Ljava/lang/String;

.field private static o:Z


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Landroid/content/Context;

.field private d:Landroid/os/Handler;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:J

.field private i:Ljava/lang/String;

.field private k:J

.field private p:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    const/4 v0, 0x0

    sput-boolean v0, Lo/dqf;->o:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/Boolean;ZZ)V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 59
    iput-object p1, p0, Lo/dqf;->c:Landroid/content/Context;

    .line 60
    iput-object p2, p0, Lo/dqf;->d:Landroid/os/Handler;

    .line 61
    iput-object p3, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    .line 62
    invoke-static {p4}, Lo/dqf;->e(Z)V

    .line 63
    invoke-static {p5}, Lo/dqf;->c(Z)V

    .line 64
    return-void
.end method

.method private a()J
    .locals 3

    .line 83
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 84
    new-instance v2, Ljava/io/File;

    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v0

    return-wide v0

    .line 89
    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private a(I)V
    .locals 4

    .line 358
    const/4 v0, 0x3

    if-ge p1, v0, :cond_0

    .line 359
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download cancel,network is connect but not avaiable, set the state to DOWNLOADING_STATE_RETRY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    const/4 v0, 0x3

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 361
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    goto :goto_0

    .line 363
    :cond_0
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download cancel,network is connect but not avaiable, set the state to DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 364
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 365
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 366
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    .line 367
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 369
    :goto_0
    return-void
.end method

.method private a(Ljava/lang/Object;I)V
    .locals 2

    .line 421
    iget-object v0, p0, Lo/dqf;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 422
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 423
    iput-object p1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 424
    iput p2, v1, Landroid/os/Message;->what:I

    .line 425
    iget-object v0, p0, Lo/dqf;->d:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 427
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/Boolean;)Lo/doy;
    .locals 1

    .line 107
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    invoke-static {}, Lo/dpm;->m()Lo/doy;

    move-result-object v0

    return-object v0

    .line 110
    :cond_0
    sget-boolean v0, Lo/dqf;->l:Z

    if-eqz v0, :cond_1

    .line 111
    invoke-static {}, Lo/dpm;->p()Lo/doy;

    move-result-object v0

    return-object v0

    .line 112
    :cond_1
    sget-boolean v0, Lo/dqf;->e:Z

    if-eqz v0, :cond_2

    .line 113
    invoke-static {}, Lo/dpm;->n()Lo/doy;

    move-result-object v0

    return-object v0

    .line 116
    :cond_2
    invoke-static {}, Lo/dpm;->l()Lo/doy;

    move-result-object v0

    return-object v0
.end method

.method public static b(Z)V
    .locals 0

    .line 449
    sput-boolean p0, Lo/dqf;->o:Z

    .line 450
    return-void
.end method

.method public static b()Z
    .locals 1

    .line 445
    sget-boolean v0, Lo/dqf;->o:Z

    return v0
.end method

.method private c(Lorg/apache/http/client/HttpClient;)Lorg/apache/http/client/methods/HttpGet;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 390
    :try_start_0
    new-instance v4, Lorg/apache/http/client/methods/HttpGet;

    iget-object v0, p0, Lo/dqf;->a:Ljava/lang/String;

    invoke-direct {v4, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 398
    goto :goto_0

    .line 391
    :catch_0
    move-exception v5

    .line 392
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download failed, IllegalArgumentException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 393
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 394
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 395
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    .line 396
    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-direct {p0, v0, v1}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 397
    const/4 v0, 0x0

    return-object v0

    .line 400
    :goto_0
    iget-object v0, p0, Lo/dqf;->c:Landroid/content/Context;

    invoke-static {v4, p1, v0}, Lo/dpm;->e(Lorg/apache/http/HttpRequest;Lorg/apache/http/client/HttpClient;Landroid/content/Context;)V

    .line 401
    invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpGet;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.timeout"

    const/16 v2, 0x2710

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 402
    invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpGet;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.connection.timeout"

    const/16 v2, 0x4e20

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 403
    invoke-virtual {v4}, Lorg/apache/http/client/methods/HttpGet;->getParams()Lorg/apache/http/params/HttpParams;

    move-result-object v0

    const-string v1, "http.socket.buffer-size"

    const/16 v2, 0x2000

    invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setIntParameter(Ljava/lang/String;I)Lorg/apache/http/params/HttpParams;

    .line 404
    return-object v4
.end method

.method private c(ILjava/io/InputStream;[BLorg/apache/http/client/methods/HttpGet;Ljava/io/OutputStream;Lo/doq;)V
    .locals 15

    .line 186
    iget-wide v7, p0, Lo/dqf;->h:J

    .line 187
    iget-wide v9, p0, Lo/dqf;->k:J

    .line 188
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fileTotalSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", currentDownloadSize = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const/4 v11, 0x0

    .line 191
    const/4 v13, 0x0

    .line 193
    :goto_0
    invoke-static {}, Lo/dpm;->g()I

    move-result p1

    .line 195
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v12

    .line 199
    goto :goto_1

    .line 196
    :catch_0
    move-exception v14

    .line 197
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download failed  InputStream error:IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    const/4 v12, -0x1

    .line 202
    :goto_1
    const/4 v0, -0x1

    if-ne v12, v0, :cond_1

    .line 203
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    iget-object v0, p0, Lo/dqf;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dpm;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 205
    move/from16 v0, p1

    invoke-direct {p0, v0}, Lo/dqf;->d(I)V

    goto :goto_2

    .line 207
    :cond_0
    move/from16 v0, p1

    invoke-direct {p0, v0}, Lo/dqf;->a(I)V

    .line 209
    :goto_2
    invoke-virtual/range {p4 .. p4}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 210
    const/4 v13, 0x1

    .line 211
    goto/16 :goto_4

    .line 214
    :cond_1
    invoke-static {}, Lo/dqf;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 215
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download cancel"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    invoke-virtual/range {p4 .. p4}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 217
    goto/16 :goto_4

    .line 221
    :cond_2
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(I)V

    .line 224
    if-eqz p5, :cond_3

    .line 225
    move-object/from16 v0, p5

    move-object/from16 v1, p3

    const/4 v2, 0x0

    :try_start_1
    invoke-virtual {v0, v1, v2, v12}, Ljava/io/OutputStream;->write([BII)V

    .line 226
    invoke-virtual/range {p5 .. p5}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_2

    .line 227
    int-to-long v0, v12

    add-long/2addr v0, v9

    move-wide v9, v0

    .line 244
    :cond_3
    goto :goto_3

    .line 230
    :catch_1
    move-exception v14

    .line 231
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download failed OutputStream error: IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    invoke-virtual/range {p4 .. p4}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 234
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/dqf;->e(I)V

    .line 235
    const/4 v13, 0x1

    .line 236
    goto/16 :goto_4

    .line 237
    :catch_2
    move-exception v14

    .line 238
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download failed OutputStream error: IndexOutOfBoundsException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    invoke-virtual/range {p4 .. p4}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 241
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/dqf;->e(I)V

    .line 242
    const/4 v13, 0x1

    .line 243
    goto :goto_4

    .line 246
    :goto_3
    cmp-long v0, v9, v7

    if-gez v0, :cond_5

    .line 247
    rem-int/lit8 v0, v11, 0x14

    if-nez v0, :cond_4

    .line 248
    move-object/from16 v0, p6

    iput-wide v9, v0, Lo/doq;->e:J

    .line 249
    move-object/from16 v0, p6

    const/4 v1, 0x7

    invoke-direct {p0, v0, v1}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 252
    :cond_4
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 254
    :cond_5
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download complete"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    invoke-virtual/range {p4 .. p4}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 257
    move-object/from16 v0, p6

    iput-wide v9, v0, Lo/doq;->e:J

    .line 258
    move-object/from16 v0, p6

    const/4 v1, 0x7

    invoke-direct {p0, v0, v1}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 259
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 260
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    .line 261
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download complete, set the state to DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 262
    .line 265
    :goto_4
    move-object v0, p0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    move-object/from16 v2, p6

    move-wide v3, v7

    move-wide v5, v9

    invoke-direct/range {v0 .. v6}, Lo/dqf;->e(Ljava/lang/Boolean;Lo/doq;JJ)V

    .line 266
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/Boolean;)V
    .locals 3

    .line 453
    new-instance v1, Lo/doz;

    invoke-direct {v1}, Lo/doz;-><init>()V

    .line 454
    const/4 v0, 0x2

    iput v0, v1, Lo/doz;->e:I

    .line 455
    invoke-static {p0}, Lo/dpm;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/doz;->b:Ljava/lang/String;

    .line 456
    sget-object v0, Lo/dqf;->n:Ljava/lang/String;

    iput-object v0, v1, Lo/doz;->a:Ljava/lang/String;

    .line 457
    invoke-static {}, Lo/dqf;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 458
    invoke-static {}, Lo/dpm;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/doz;->c:Ljava/lang/String;

    goto :goto_0

    .line 459
    :cond_0
    invoke-static {}, Lo/dqf;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 460
    invoke-static {}, Lo/dpm;->o()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/doz;->c:Ljava/lang/String;

    goto :goto_0

    .line 462
    :cond_1
    invoke-static {}, Lo/dpm;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lo/dpm;->a(Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lo/doz;->c:Ljava/lang/String;

    .line 465
    :goto_0
    const-string v0, ""

    iput-object v0, v1, Lo/doz;->d:Ljava/lang/String;

    .line 466
    new-instance v2, Lo/dpw;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-direct {v2, p0, v1, v0}, Lo/dpw;-><init>(Landroid/content/Context;Lo/doz;Z)V

    .line 467
    new-instance v0, Ljava/lang/Thread;

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 468
    return-void
.end method

.method private c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V
    .locals 5

    .line 321
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "in finally"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 322
    if-eqz p3, :cond_0

    .line 323
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "httpClient close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 324
    invoke-interface {p3}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 327
    :cond_0
    if-eqz p2, :cond_1

    .line 328
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "outputStream close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    invoke-virtual {p2}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 333
    :cond_1
    goto :goto_0

    .line 331
    :catch_0
    move-exception v4

    .line 332
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "outputStream Exception is "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 335
    :goto_0
    if-eqz p1, :cond_2

    .line 336
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "inputStream close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 337
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 341
    :cond_2
    goto :goto_1

    .line 339
    :catch_1
    move-exception v4

    .line 340
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "inputStream Exception is "

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

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    :goto_1
    return-void
.end method

.method private c(Lo/doq;JJ)V
    .locals 4

    .line 283
    cmp-long v0, p4, p2

    if-ltz v0, :cond_0

    .line 284
    invoke-direct {p0, p1}, Lo/dqf;->e(Lo/doq;)V

    goto :goto_0

    .line 286
    :cond_0
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "currentDownloadSize < fileTotalSize"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 287
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 288
    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, v0, v1}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 290
    :goto_0
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    .line 291
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 292
    return-void
.end method

.method private static c(Z)V
    .locals 0

    .line 75
    sput-boolean p0, Lo/dqf;->e:Z

    .line 76
    return-void
.end method

.method private static c()Z
    .locals 1

    .line 71
    sget-boolean v0, Lo/dqf;->l:Z

    return v0
.end method

.method private d()V
    .locals 5

    .line 93
    iget-object v0, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqf;->b(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->h:Ljava/lang/String;

    iput-object v0, p0, Lo/dqf;->i:Ljava/lang/String;

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dqf;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dqf;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    .line 95
    iget-object v0, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqf;->b(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-wide v0, v0, Lo/doy;->m:J

    iput-wide v0, p0, Lo/dqf;->h:J

    .line 96
    iget-object v0, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqf;->b(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->o:Ljava/lang/String;

    iput-object v0, p0, Lo/dqf;->g:Ljava/lang/String;

    .line 97
    iget-object v0, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqf;->b(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->u:Ljava/lang/String;

    iput-object v0, p0, Lo/dqf;->f:Ljava/lang/String;

    .line 98
    iget-object v0, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqf;->b(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->c:Ljava/lang/String;

    sput-object v0, Lo/dqf;->n:Ljava/lang/String;

    .line 99
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 100
    invoke-direct {p0}, Lo/dqf;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dqf;->k:J

    .line 101
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadedFileSize="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/dqf;->k:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    iget-object v0, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-direct {p0, v0}, Lo/dqf;->b(Ljava/lang/Boolean;)Lo/doy;

    move-result-object v0

    iget-object v0, v0, Lo/doy;->w:Ljava/lang/String;

    iput-object v0, p0, Lo/dqf;->a:Ljava/lang/String;

    .line 103
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "downloadURL="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dqf;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "isApp:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " isAW70:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-boolean v3, Lo/dqf;->l:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    return-void
.end method

.method private d(I)V
    .locals 4

    .line 372
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download cancel,network is not avaiable"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 373
    const/4 v0, 0x3

    if-ge p1, v0, :cond_0

    .line 374
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download cancel,network is not avaiable, set the state to DOWNLOADING_STATE_RETRY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 375
    const/4 v0, 0x3

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 376
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    goto :goto_0

    .line 378
    :cond_0
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download cancel,network is not avaiable, set the state to DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 380
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 381
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    .line 382
    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 384
    :goto_0
    return-void
.end method

.method private d(Lo/doq;)V
    .locals 4

    .line 345
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verify md5 failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 346
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 347
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 348
    return-void
.end method

.method private d(Lorg/apache/http/client/methods/HttpGet;Lorg/apache/http/client/HttpClient;I)V
    .locals 4

    .line 408
    const/4 v0, 0x3

    if-ge p3, v0, :cond_0

    .line 409
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect failed, set the state to DOWNLOADING_STATE_RETRY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    const/4 v0, 0x3

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 411
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    goto :goto_0

    .line 413
    :cond_0
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect failed, set the state to DOWNLOADING_STATE_END and sendMessage DOWNLOAD_FAILED_CONNECT_ERROR"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/dqf;->e(I)V

    .line 416
    :goto_0
    invoke-virtual {p1}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 417
    invoke-interface {p2}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 418
    return-void
.end method

.method private e(I)V
    .locals 1

    .line 351
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-static {v0}, Lo/dpm;->k(Ljava/lang/String;)Z

    .line 352
    const/4 v0, 0x1

    invoke-static {v0}, Lo/dpm;->d(I)V

    .line 353
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dpm;->a(Z)V

    .line 354
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 355
    return-void
.end method

.method private e(Ljava/lang/Boolean;Lo/doq;JJ)V
    .locals 6

    .line 270
    invoke-static {}, Lo/dqf;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    const/16 v0, 0x9

    invoke-direct {p0, v0}, Lo/dqf;->e(I)V

    .line 272
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cancel download, set the state to DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    .line 276
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 277
    move-object v0, p0

    move-object v1, p2

    move-wide v2, p3

    move-wide v4, p5

    invoke-direct/range {v0 .. v5}, Lo/dqf;->c(Lo/doq;JJ)V

    .line 279
    :cond_1
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    return-void
.end method

.method private e(Lo/doq;)V
    .locals 5

    .line 296
    sget-boolean v0, Lo/dqf;->l:Z

    if-eqz v0, :cond_0

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dqf;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/dpm;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(new).apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 298
    :cond_0
    sget-boolean v0, Lo/dqf;->e:Z

    if-eqz v0, :cond_1

    .line 299
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dqf;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/dpm;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(new).zip"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 301
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/dqf;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lo/dpm;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "(new).apk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 303
    :goto_0
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newAppDir : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";HwSelfUpdateUtility.applicationInfo.STORAGEPATH :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dqf;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    invoke-direct {p0}, Lo/dqf;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 305
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 306
    iget-object v0, p0, Lo/dqf;->b:Ljava/lang/String;

    iput-object v0, p1, Lo/doq;->a:Ljava/lang/String;

    .line 307
    iget-object v0, p0, Lo/dqf;->f:Ljava/lang/String;

    iput-object v0, p1, Lo/doq;->b:Ljava/lang/String;

    .line 308
    iget-object v0, p0, Lo/dqf;->g:Ljava/lang/String;

    iput-object v0, p1, Lo/doq;->d:Ljava/lang/String;

    .line 309
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "dowaload complete and verify success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    const/16 v0, 0x8

    invoke-direct {p0, p1, v0}, Lo/dqf;->a(Ljava/lang/Object;I)V

    .line 311
    iget-object v0, p0, Lo/dqf;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/dqf;->p:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lo/dqf;->c(Landroid/content/Context;Ljava/lang/Boolean;)V

    goto :goto_1

    .line 313
    :cond_2
    invoke-direct {p0, p1}, Lo/dqf;->d(Lo/doq;)V

    goto :goto_1

    .line 316
    :cond_3
    invoke-direct {p0, p1}, Lo/dqf;->d(Lo/doq;)V

    .line 318
    :goto_1
    return-void
.end method

.method private static e(Z)V
    .locals 0

    .line 67
    sput-boolean p0, Lo/dqf;->l:Z

    .line 68
    return-void
.end method

.method private static e()Z
    .locals 1

    .line 79
    sget-boolean v0, Lo/dqf;->e:Z

    return v0
.end method

.method private h()Z
    .locals 7

    .line 430
    iget-object v4, p0, Lo/dqf;->f:Ljava/lang/String;

    .line 431
    iget-object v5, p0, Lo/dqf;->b:Ljava/lang/String;

    .line 432
    invoke-static {v5}, Lo/dpn;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 434
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "srcMd5="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,path="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verify md5 success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 437
    const/4 v0, 0x1

    return v0

    .line 439
    :cond_0
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verify md5 failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 440
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 17

    .line 122
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DownloadThread begin !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const/4 v8, 0x0

    .line 125
    const/4 v9, 0x0

    .line 128
    const/4 v12, 0x0

    .line 130
    :try_start_0
    invoke-direct/range {p0 .. p0}, Lo/dqf;->d()V

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dqf;->a:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 132
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the download uri is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    move-object/from16 v0, p0

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lo/dqf;->e(I)V

    .line 134
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the download uri is null, set the state to DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 135
    return-void

    .line 137
    :cond_0
    :try_start_1
    new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    move-object v12, v0

    .line 138
    new-instance v7, Lo/doq;

    invoke-direct {v7}, Lo/doq;-><init>()V

    .line 139
    move-object/from16 v0, p0

    iget-wide v0, v0, Lo/dqf;->h:J

    iput-wide v0, v7, Lo/doq;->c:J

    .line 141
    move-object/from16 v0, p0

    invoke-direct {v0, v12}, Lo/dqf;->c(Lorg/apache/http/client/HttpClient;)Lorg/apache/http/client/methods/HttpGet;
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v10

    .line 142
    if-nez v10, :cond_1

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 142
    return-void

    .line 144
    :cond_1
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Range size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lo/dqf;->k:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const-string v0, "Range"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bytes="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move-object/from16 v2, p0

    iget-wide v2, v2, Lo/dqf;->k:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v10, v0, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    invoke-static {}, Lo/dpm;->g()I

    move-result v13

    .line 147
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DownloadThread retryNum is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 149
    :try_start_3
    invoke-interface {v12, v10}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-result-object v11

    .line 154
    goto :goto_0

    .line 150
    :catch_0
    move-exception v14

    .line 151
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "connect failed, IOException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    move-object/from16 v0, p0

    invoke-direct {v0, v10, v12, v13}, Lo/dqf;->d(Lorg/apache/http/client/methods/HttpGet;Lorg/apache/http/client/HttpClient;I)V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 153
    return-void

    .line 155
    :goto_0
    const/16 v0, 0x2000

    :try_start_5
    new-array v14, v0, [B

    .line 156
    invoke-interface {v11}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move-result-object v0

    move-object v8, v0

    .line 158
    move-object/from16 v0, p0

    :try_start_6
    iget-object v0, v0, Lo/dqf;->c:Landroid/content/Context;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/dqf;->i:Ljava/lang/String;

    const v2, 0x8000

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    move-result-object v0

    move-object v9, v0

    .line 165
    goto :goto_1

    .line 159
    :catch_1
    move-exception v15

    .line 160
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    :try_start_7
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download failed:FileNotFoundException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    invoke-virtual {v10}, Lorg/apache/http/client/methods/HttpGet;->abort()V

    .line 162
    invoke-interface {v12}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 163
    move-object/from16 v0, p0

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lo/dqf;->e(I)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 164
    return-void

    .line 167
    :goto_1
    move-object/from16 v0, p0

    move v1, v13

    move-object v2, v8

    move-object v3, v14

    move-object v4, v10

    move-object v5, v9

    move-object v6, v7

    :try_start_8
    invoke-direct/range {v0 .. v6}, Lo/dqf;->c(ILjava/io/InputStream;[BLorg/apache/http/client/methods/HttpGet;Ljava/io/OutputStream;Lo/doq;)V
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 180
    goto/16 :goto_2

    .line 169
    :catch_2
    move-exception v13

    .line 170
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    :try_start_9
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RuntimeException e1 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    move-object/from16 v0, p0

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lo/dqf;->e(I)V

    .line 172
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RuntimeException Exception, set the state to DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 180
    goto :goto_2

    .line 173
    :catch_3
    move-exception v13

    .line 174
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    :try_start_a
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    move-object/from16 v0, p0

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lo/dqf;->e(I)V

    .line 176
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unknown Exception, set the state to DOWNLOADING_STATE_END"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 180
    goto :goto_2

    .line 178
    :catchall_0
    move-exception v16

    const/4 v11, 0x0

    .line 179
    move-object/from16 v0, p0

    invoke-direct {v0, v8, v9, v12}, Lo/dqf;->c(Ljava/io/InputStream;Ljava/io/OutputStream;Lorg/apache/http/client/HttpClient;)V

    .line 180
    throw v16

    .line 181
    :goto_2
    const-string v0, "DownloadThread"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "download end"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    return-void
.end method
