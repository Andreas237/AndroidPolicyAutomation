.class public final Lo/aqs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aqs$a;
    }
.end annotation


# static fields
.field private static final d:[Ljava/lang/String;

.field private static e:Lo/aqs;


# instance fields
.field private a:Ljava/lang/Object;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Lo/aqu;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/Executor;

.field private g:Lo/aqs$a;

.field private i:Lo/azh;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 79
    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "0"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "1"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "i"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "s"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "m"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "b"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "l"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sput-object v0, Lo/aqs;->d:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 8

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 85
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/aqs;->b:Ljava/util/Map;

    .line 90
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/aqs;->a:Ljava/lang/Object;

    .line 100
    new-instance v0, Lo/aqs$2;

    invoke-direct {v0, p0}, Lo/aqs$2;-><init>(Lo/aqs;)V

    iput-object v0, p0, Lo/aqs;->i:Lo/azh;

    .line 118
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v6, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    new-instance v7, Lo/bre;

    const-string v1, "thread-pool-download"

    const/16 v2, 0xa

    invoke-direct {v7, v1, v2}, Lo/bre;-><init>(Ljava/lang/String;I)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const-wide/16 v3, 0x1e

    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v0, p0, Lo/aqs;->c:Ljava/util/concurrent/Executor;

    .line 121
    return-void
.end method

.method static synthetic a(Lo/aqs;)Ljava/lang/Object;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/aqs;->a:Ljava/lang/Object;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Lo/aqu;
    .locals 4

    .line 530
    iget-object v1, p0, Lo/aqs;->b:Ljava/util/Map;

    monitor-enter v1

    .line 532
    const/4 v2, 0x0

    .line 533
    :try_start_0
    iget-object v0, p0, Lo/aqs;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 535
    iget-object v0, p0, Lo/aqs;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/aqu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 537
    :cond_0
    monitor-exit v1

    return-object v2

    .line 538
    :catchall_0
    move-exception v3

    monitor-exit v1

    throw v3
.end method

.method public static declared-synchronized d()Lo/aqs;
    .locals 3

    const-class v1, Lo/aqs;

    monitor-enter v1

    .line 130
    :try_start_0
    sget-object v0, Lo/aqs;->e:Lo/aqs;

    if-nez v0, :cond_0

    .line 132
    new-instance v0, Lo/aqs;

    invoke-direct {v0}, Lo/aqs;-><init>()V

    sput-object v0, Lo/aqs;->e:Lo/aqs;

    .line 134
    :cond_0
    sget-object v0, Lo/aqs;->e:Lo/aqs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private d(Ljava/lang/String;Lo/aqu;)V
    .locals 3

    .line 549
    iget-object v1, p0, Lo/aqs;->b:Ljava/util/Map;

    monitor-enter v1

    .line 551
    :try_start_0
    iget-object v0, p0, Lo/aqs;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 552
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 553
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 577
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "p"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/aqs;->d:[Ljava/lang/String;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 578
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 580
    const-string v0, ""

    return-object v0

    .line 584
    :cond_0
    const/4 v4, -0x1

    .line 585
    const/4 v5, 0x0

    :goto_0
    sget-object v0, Lo/aqs;->d:[Ljava/lang/String;

    array-length v0, v0

    if-ge v5, v0, :cond_2

    .line 587
    sget-object v0, Lo/aqs;->d:[Ljava/lang/String;

    aget-object v0, v0, v5

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 589
    move v4, v5

    .line 590
    goto :goto_1

    .line 585
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 594
    :cond_2
    :goto_1
    if-gez v4, :cond_3

    .line 596
    return-object v3

    .line 599
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "p"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lo/aqs;->d:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 601
    return-object v3
.end method

.method private e()V
    .locals 13

    .line 462
    iget-object v3, p0, Lo/aqs;->b:Ljava/util/Map;

    monitor-enter v3

    .line 464
    const-string v0, "MediaDownloadManager"

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "executeAllWaitDownloadTask downloadTaskList.size:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/aqs;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 468
    const/4 v6, 0x0

    .line 470
    iget-object v0, p0, Lo/aqs;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    .line 472
    invoke-static {}, Lo/bcd;->a()Ljava/lang/String;

    move-result-object v9

    .line 473
    const/4 v10, 0x0

    .line 474
    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 476
    const-string v0, "MediaDownloadManager"

    const-string v1, "executeAllWaitDownloadTask mCode is null."

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 477
    const/4 v10, 0x1

    .line 480
    :cond_0
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 482
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map$Entry;

    .line 483
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/aqu;

    .line 484
    invoke-virtual {v4}, Lo/aqu;->b()Lo/bqs;

    move-result-object v5

    .line 485
    if-eqz v10, :cond_1

    .line 487
    invoke-virtual {v5}, Lo/bqs;->e()Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;

    move-result-object v11

    .line 488
    const-string v0, "mCode is null."

    const/4 v1, -0x1

    invoke-interface {v11, v0, v1}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 489
    goto :goto_0

    .line 492
    :cond_1
    invoke-virtual {v4}, Lo/aqu;->e()Lo/arc;

    move-result-object v7

    .line 493
    invoke-virtual {v7, v9}, Lo/arc;->c(Ljava/lang/String;)V

    .line 494
    invoke-direct {p0, v4}, Lo/aqs;->e(Lo/aqu;)V

    goto :goto_0

    .line 498
    :cond_2
    if-eqz v10, :cond_3

    .line 500
    iget-object v0, p0, Lo/aqs;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 502
    :cond_3
    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception v12

    monitor-exit v3

    throw v12

    .line 503
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/aqs;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lo/aqs;->e()V

    return-void
.end method

.method private e(Lo/aqu;)V
    .locals 3

    .line 280
    if-nez p1, :cond_0

    .line 282
    return-void

    .line 284
    :cond_0
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/aqs;->c:Ljava/util/concurrent/Executor;

    new-instance v2, Lo/aqs$5;

    invoke-direct {v2, p0}, Lo/aqs$5;-><init>(Lo/aqs;)V

    invoke-virtual {v0, v1, p1, v2}, Lo/brb;->c(Ljava/util/concurrent/Executor;Lo/brd;Lo/brc;)Lo/bqy;

    .line 292
    return-void
.end method


# virtual methods
.method public a(Lo/aqy;ZLcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V
    .locals 13

    .line 297
    invoke-virtual {p1}, Lo/aqy;->e()Ljava/lang/String;

    move-result-object v3

    .line 298
    invoke-virtual {p1}, Lo/aqy;->a()Ljava/lang/String;

    move-result-object v4

    .line 299
    invoke-virtual {p1}, Lo/aqy;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 300
    invoke-virtual {p1}, Lo/aqy;->c()I

    move-result v6

    .line 302
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 304
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadVoice no storage permission!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, "no storage permission!."

    move-object/from16 v1, p3

    const/4 v2, 0x4

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 306
    return-void

    .line 309
    :cond_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 311
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadVoice uId is invalidate!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 312
    const-string v0, "uId is null."

    move-object/from16 v1, p3

    const/4 v2, -0x1

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 313
    return-void

    .line 316
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 318
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadVoice msgId is invalidate!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 319
    const-string v0, "msgId is null."

    move-object/from16 v1, p3

    const/4 v2, -0x1

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 320
    return-void

    .line 323
    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 325
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadVoice url is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    const-string v0, "url is null."

    move-object/from16 v1, p3

    const/4 v2, -0x1

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 327
    return-void

    .line 331
    :cond_3
    invoke-direct {p0, v3}, Lo/aqs;->b(Ljava/lang/String;)Lo/aqu;

    move-result-object v7

    .line 333
    if-eqz v7, :cond_4

    .line 335
    const-string v0, "MediaDownloadManager"

    const-string v1, "downloadMediaFile task is not null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 336
    invoke-virtual {v7}, Lo/aqu;->b()Lo/bqs;

    move-result-object v8

    .line 337
    invoke-virtual {v8}, Lo/bqs;->b()I

    move-result v9

    .line 339
    move-object/from16 v0, p3

    invoke-virtual {v8, v0}, Lo/bqs;->e(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 340
    move-object/from16 v0, p3

    invoke-interface {v0, v9}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onProgressChanged(I)V

    .line 341
    return-void

    .line 344
    :cond_4
    move-object v8, v4

    .line 351
    new-instance v9, Lo/arb;

    invoke-direct {v9, v8}, Lo/arb;-><init>(Ljava/lang/String;)V

    .line 353
    invoke-virtual {v9, v5}, Lo/arb;->b(Ljava/lang/String;)V

    .line 355
    if-nez p2, :cond_5

    .line 358
    invoke-virtual {v9, v5}, Lo/arb;->d(Ljava/lang/String;)V

    .line 361
    :cond_5
    invoke-static {}, Lo/bcd;->a()Ljava/lang/String;

    move-result-object v10

    .line 362
    invoke-virtual {v9, v10}, Lo/arb;->c(Ljava/lang/String;)V

    .line 365
    new-instance v11, Lo/bqs;

    invoke-direct {v11}, Lo/bqs;-><init>()V

    .line 367
    invoke-virtual {v11, v6}, Lo/bqs;->c(I)V

    .line 368
    move-object/from16 v0, p3

    invoke-virtual {v11, v0}, Lo/bqs;->e(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 369
    invoke-virtual {v11, v3}, Lo/bqs;->c(Ljava/lang/String;)V

    .line 371
    new-instance v7, Lo/aqu;

    invoke-direct {v7, v11}, Lo/aqu;-><init>(Lo/bqs;)V

    .line 372
    invoke-virtual {v7, v9}, Lo/aqu;->e(Lo/arc;)V

    .line 375
    invoke-direct {p0, v3, v7}, Lo/aqs;->d(Ljava/lang/String;Lo/aqu;)V

    .line 377
    invoke-interface/range {p3 .. p3}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onStarted()V

    .line 380
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 383
    iget-object v0, p0, Lo/aqs;->g:Lo/aqs$a;

    if-nez v0, :cond_6

    .line 385
    new-instance v0, Lo/aqs$a;

    invoke-direct {v0, p0}, Lo/aqs$a;-><init>(Lo/aqs;)V

    iput-object v0, p0, Lo/aqs;->g:Lo/aqs$a;

    .line 388
    :cond_6
    iget-object v0, p0, Lo/aqs;->g:Lo/aqs$a;

    invoke-static {v0}, Lo/aqs$a;->c(Lo/aqs$a;)Z

    move-result v12

    .line 389
    const-string v0, "MediaDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadMediaFile mcode is null. isThdRunning is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 390
    if-eqz v12, :cond_7

    .line 392
    return-void

    .line 395
    :cond_7
    iget-object v0, p0, Lo/aqs;->g:Lo/aqs$a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aqs$a;->b(Lo/aqs$a;Z)Z

    .line 396
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    iget-object v1, p0, Lo/aqs;->i:Lo/azh;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b(Lo/azh;)V

    .line 397
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, Lo/aqs;->g:Lo/aqs$a;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 398
    goto :goto_0

    .line 402
    :cond_8
    invoke-direct {p0, v7}, Lo/aqs;->e(Lo/aqu;)V

    .line 405
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .line 562
    iget-object v1, p0, Lo/aqs;->b:Ljava/util/Map;

    monitor-enter v1

    .line 564
    :try_start_0
    iget-object v0, p0, Lo/aqs;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 565
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 566
    :goto_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 2

    .line 512
    invoke-direct {p0, p1}, Lo/aqs;->b(Ljava/lang/String;)Lo/aqu;

    move-result-object v0

    .line 514
    if-eqz v0, :cond_0

    .line 516
    invoke-virtual {v0}, Lo/aqu;->b()Lo/bqs;

    move-result-object v1

    .line 517
    invoke-virtual {v1}, Lo/bqs;->c()V

    .line 518
    invoke-virtual {p0, p1}, Lo/aqs;->c(Ljava/lang/String;)V

    .line 520
    :cond_0
    return-void
.end method

.method public e(Lo/aqy;ZLcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V
    .locals 16

    .line 142
    const-string v0, "MediaDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Enter loadThumbImage isSingle:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v2, p2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    invoke-virtual/range {p1 .. p1}, Lo/aqy;->e()Ljava/lang/String;

    move-result-object v3

    .line 144
    invoke-virtual/range {p1 .. p1}, Lo/aqy;->a()Ljava/lang/String;

    move-result-object v4

    .line 145
    invoke-virtual/range {p1 .. p1}, Lo/aqy;->d()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 146
    invoke-virtual/range {p1 .. p1}, Lo/aqy;->b()Ljava/lang/String;

    move-result-object v6

    .line 147
    invoke-virtual/range {p1 .. p1}, Lo/aqy;->c()I

    move-result v7

    .line 149
    invoke-static {}, Lo/bpk;->b()Lo/bpk;

    move-result-object v0

    invoke-static {}, Lo/bci;->d()Lo/bci;

    move-result-object v1

    invoke-virtual {v1}, Lo/bci;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bpk;->c(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadThumbImage no storage permission!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 152
    const-string v0, "no storage permission!."

    move-object/from16 v1, p3

    const/4 v2, 0x4

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 153
    return-void

    .line 156
    :cond_0
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadThumbImage uId is invalidate!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    const-string v0, "uId is null."

    move-object/from16 v1, p3

    const/4 v2, -0x1

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 160
    return-void

    .line 163
    :cond_1
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 165
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadThumbImage msgId is invalidate!"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    const-string v0, "msgId is null."

    move-object/from16 v1, p3

    const/4 v2, -0x1

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 167
    return-void

    .line 170
    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 172
    const-string v0, "MediaDownloadManager"

    const-string v1, "loadThumbImage url is empty"

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    const-string v0, "url is null."

    move-object/from16 v1, p3

    const/4 v2, -0x1

    invoke-interface {v1, v0, v2}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onFailed(Ljava/lang/String;I)V

    .line 174
    return-void

    .line 178
    :cond_3
    move-object/from16 v0, p0

    invoke-direct {v0, v3}, Lo/aqs;->b(Ljava/lang/String;)Lo/aqu;

    move-result-object v8

    .line 180
    if-eqz v8, :cond_4

    .line 182
    const-string v0, "MediaDownloadManager"

    const-string v1, "downloadMediaFile task is not null"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    invoke-virtual {v8}, Lo/aqu;->b()Lo/bqs;

    move-result-object v9

    .line 184
    invoke-virtual {v9}, Lo/bqs;->b()I

    move-result v10

    .line 186
    move-object/from16 v0, p3

    invoke-virtual {v9, v0}, Lo/bqs;->e(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 187
    move-object/from16 v0, p3

    invoke-interface {v0, v10}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onProgressChanged(I)V

    .line 188
    return-void

    .line 191
    :cond_4
    move-object v9, v4

    .line 192
    const-string v0, "MediaDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadThumbImage imageUrl before:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    const-string v0, "MediaDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "loadThumbImage imageUrl after:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 199
    new-instance v10, Lo/ard;

    invoke-direct {v10, v9}, Lo/ard;-><init>(Ljava/lang/String;)V

    .line 201
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 203
    invoke-static {}, Lo/bcm;->e()Lo/bcm;

    move-result-object v0

    invoke-virtual {v0}, Lo/bcm;->o()I

    move-result v11

    .line 204
    invoke-virtual {v10, v11}, Lo/ard;->d(I)V

    .line 205
    invoke-virtual {v10, v11}, Lo/ard;->b(I)V

    .line 209
    :cond_5
    invoke-virtual {v10, v5}, Lo/ard;->b(Ljava/lang/String;)V

    .line 211
    move-object/from16 v0, p0

    invoke-direct {v0, v6}, Lo/aqs;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 212
    const/4 v12, 0x0

    .line 213
    if-nez p2, :cond_6

    .line 216
    invoke-virtual {v10, v5}, Lo/ard;->d(Ljava/lang/String;)V

    .line 219
    :cond_6
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 221
    move-object v12, v11

    .line 224
    :cond_7
    invoke-virtual {v10, v12}, Lo/ard;->a(Ljava/lang/String;)V

    .line 226
    invoke-static {}, Lo/bcd;->a()Ljava/lang/String;

    move-result-object v13

    .line 227
    invoke-virtual {v10, v13}, Lo/ard;->c(Ljava/lang/String;)V

    .line 230
    new-instance v14, Lo/bqs;

    invoke-direct {v14}, Lo/bqs;-><init>()V

    .line 232
    invoke-virtual {v14, v7}, Lo/bqs;->c(I)V

    .line 233
    move-object/from16 v0, p3

    invoke-virtual {v14, v0}, Lo/bqs;->e(Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;)V

    .line 234
    invoke-virtual {v14, v3}, Lo/bqs;->c(Ljava/lang/String;)V

    .line 236
    new-instance v8, Lo/aqu;

    invoke-direct {v8, v14}, Lo/aqu;-><init>(Lo/bqs;)V

    .line 237
    invoke-virtual {v8, v10}, Lo/aqu;->e(Lo/arc;)V

    .line 240
    move-object/from16 v0, p0

    invoke-direct {v0, v3, v8}, Lo/aqs;->d(Ljava/lang/String;Lo/aqu;)V

    .line 242
    invoke-interface/range {p3 .. p3}, Lcom/huawei/health/sns/util/protocol/http/utils/IDownloadListener;->onStarted()V

    .line 245
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 248
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aqs;->g:Lo/aqs$a;

    if-nez v0, :cond_8

    .line 250
    new-instance v0, Lo/aqs$a;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lo/aqs$a;-><init>(Lo/aqs;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/aqs;->g:Lo/aqs$a;

    .line 253
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aqs;->g:Lo/aqs$a;

    invoke-static {v0}, Lo/aqs$a;->c(Lo/aqs$a;)Z

    move-result v15

    .line 254
    const-string v0, "MediaDownloadManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "downloadMediaFile mcode is null. isThdRunning is "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 255
    if-eqz v15, :cond_9

    .line 257
    return-void

    .line 260
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aqs;->g:Lo/aqs$a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/aqs$a;->b(Lo/aqs$a;Z)Z

    .line 261
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/aqs;->i:Lo/azh;

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->b(Lo/azh;)V

    .line 262
    new-instance v0, Ljava/lang/Thread;

    move-object/from16 v1, p0

    iget-object v1, v1, Lo/aqs;->g:Lo/aqs$a;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 263
    goto :goto_0

    .line 267
    :cond_a
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lo/aqs;->e(Lo/aqu;)V

    .line 269
    :goto_0
    return-void
.end method
