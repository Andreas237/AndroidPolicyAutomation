.class public Lo/crf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/crf$a;,
        Lo/crf$c;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private a:Lo/crz;

.field private b:Lo/cqd;

.field private c:Lo/csh;

.field private e:Lo/cry;

.field private f:Lo/crx;

.field private g:Lo/crv;

.field private h:Lo/cse;

.field private i:Lo/csc;

.field private k:Lo/cru;

.field private l:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/concurrent/ExecutorService;

.field private n:Lo/crt;

.field private o:Lo/csb;

.field private p:Lo/cqy;

.field private s:Lo/crh;

.field private t:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lo/crf;->l:Ljava/util/Queue;

    .line 64
    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    .line 68
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqd;->d(Landroid/content/Context;)Lo/cqd;

    move-result-object v0

    iput-object v0, p0, Lo/crf;->b:Lo/cqd;

    .line 69
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqy;->d(Landroid/content/Context;)Lo/cqy;

    move-result-object v0

    iput-object v0, p0, Lo/crf;->p:Lo/cqy;

    .line 70
    new-instance v0, Lo/crz;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->a:Lo/crz;

    .line 71
    new-instance v0, Lo/cry;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cry;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->e:Lo/cry;

    .line 72
    new-instance v0, Lo/csh;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csh;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->c:Lo/csh;

    .line 73
    new-instance v0, Lo/cru;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cru;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->k:Lo/cru;

    .line 74
    new-instance v0, Lo/crv;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crv;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->g:Lo/crv;

    .line 75
    new-instance v0, Lo/crx;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crx;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->f:Lo/crx;

    .line 76
    new-instance v0, Lo/cse;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/cse;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->h:Lo/cse;

    .line 77
    new-instance v0, Lo/csc;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csc;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->i:Lo/csc;

    .line 78
    new-instance v0, Lo/csb;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/csb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->o:Lo/csb;

    .line 79
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/crf;->m:Ljava/util/concurrent/ExecutorService;

    .line 80
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/crh;->a(Landroid/content/Context;)Lo/crh;

    move-result-object v0

    iput-object v0, p0, Lo/crf;->s:Lo/crh;

    .line 81
    new-instance v0, Lo/crt;

    sget-object v1, Lo/crf;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/crt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/crf;->n:Lo/crt;

    .line 82
    return-void
.end method

.method synthetic constructor <init>(Lo/crf$4;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/crf;-><init>()V

    return-void
.end method

.method private a()V
    .locals 6

    .line 296
    iget-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 297
    :cond_0
    return-void

    .line 300
    :cond_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAsynHealthDatasStat() asyncStatList size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    :goto_0
    iget-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 304
    :try_start_0
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 305
    iget-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {p0, v0}, Lo/crf;->c(Lcom/huawei/hihealth/HiHealthData;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 309
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 310
    goto :goto_1

    .line 306
    :catch_0
    move-exception v4

    .line 307
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveAsynHealthDatasStat() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 309
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 310
    goto :goto_1

    .line 309
    :catchall_0
    move-exception v5

    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 310
    throw v5

    :goto_1
    goto :goto_0

    .line 312
    :cond_2
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/crf;
    .locals 1

    .line 92
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/crf;->d:Landroid/content/Context;

    .line 93
    sget-object v0, Lo/crf$c;->e:Lo/crf;

    return-object v0
.end method

.method private c(Lcom/huawei/hihealth/HiHealthData;)V
    .locals 2

    .line 332
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getType()I

    move-result v1

    .line 333
    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    .line 337
    :sswitch_0
    iget-object v0, p0, Lo/crf;->a:Lo/crz;

    invoke-virtual {v0, p1}, Lo/crz;->e(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 338
    goto :goto_1

    .line 340
    :sswitch_1
    iget-object v0, p0, Lo/crf;->g:Lo/crv;

    invoke-virtual {v0, p1}, Lo/crv;->c(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 341
    goto :goto_1

    .line 344
    :sswitch_2
    iget-object v0, p0, Lo/crf;->e:Lo/cry;

    invoke-virtual {v0, p1}, Lo/cry;->d(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 345
    goto :goto_1

    .line 348
    :sswitch_3
    iget-object v0, p0, Lo/crf;->k:Lo/cru;

    invoke-virtual {v0, p1}, Lo/cru;->c(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 349
    goto :goto_1

    .line 352
    :sswitch_4
    iget-object v0, p0, Lo/crf;->c:Lo/csh;

    invoke-virtual {v0, p1}, Lo/csh;->b(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 353
    goto :goto_1

    .line 359
    :sswitch_5
    iget-object v0, p0, Lo/crf;->f:Lo/crx;

    invoke-virtual {v0, p1}, Lo/crx;->b(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 360
    goto :goto_1

    .line 369
    :sswitch_6
    iget-object v0, p0, Lo/crf;->h:Lo/cse;

    invoke-virtual {v0, p1}, Lo/cse;->c(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 370
    goto :goto_1

    .line 372
    :sswitch_7
    iget-object v0, p0, Lo/crf;->i:Lo/csc;

    invoke-virtual {v0, p1}, Lo/csc;->b(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 373
    goto :goto_1

    .line 375
    :sswitch_8
    iget-object v0, p0, Lo/crf;->o:Lo/csb;

    invoke-virtual {v0, p1}, Lo/csb;->a(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 376
    goto :goto_1

    .line 378
    :goto_0
    invoke-static {v1}, Lo/cmi;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 379
    iget-object v0, p0, Lo/crf;->n:Lo/crt;

    invoke-virtual {v0, p1}, Lo/crt;->a(Lcom/huawei/hihealth/HiHealthData;)Z

    .line 383
    :cond_0
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_1
        0x7d2 -> :sswitch_5
        0x7e2 -> :sswitch_5
        0x7e3 -> :sswitch_6
        0x7e4 -> :sswitch_6
        0x7e5 -> :sswitch_6
        0x7f2 -> :sswitch_7
        0x835 -> :sswitch_8
        0x2712 -> :sswitch_5
        0x4e21 -> :sswitch_0
        0x55f0 -> :sswitch_2
        0x5654 -> :sswitch_3
        0x7531 -> :sswitch_4
        0x9c76 -> :sswitch_0
    .end sparse-switch
.end method

.method static synthetic c(Lo/crf;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lo/crf;->a()V

    return-void
.end method

.method static synthetic d()Landroid/content/Context;
    .locals 1

    .line 47
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    return-object v0
.end method

.method private g()V
    .locals 8

    .line 315
    iget-object v0, p0, Lo/crf;->l:Ljava/util/Queue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/crf;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 316
    :cond_0
    return-void

    .line 318
    :cond_1
    iget-object v0, p0, Lo/crf;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->size()I

    move-result v4

    .line 319
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 320
    iget-object v0, p0, Lo/crf;->l:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 321
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 322
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {p0, v0}, Lo/crf;->c(Lcom/huawei/hihealth/HiHealthData;)V

    .line 323
    invoke-interface {v7}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 325
    :cond_2
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveRealTimeHealthDatasStat() size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v5

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)I
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)I"
        }
    .end annotation

    .line 170
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-gtz p2, :cond_1

    .line 171
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSyncHealthDetailData datas is null or who <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    const/4 v0, 0x7

    return v0

    .line 174
    :cond_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSyncHealthDetailData() datas size is = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 176
    iget-object v0, p0, Lo/crf;->p:Lo/cqy;

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v8

    .line 177
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 178
    :cond_2
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSyncHealthDetailData() null == clients ||clients.isEmpty ()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    const/16 v0, 0xa

    return v0

    .line 181
    :cond_3
    const/4 v9, 0x0

    .line 185
    :try_start_0
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 186
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 188
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v10

    .line 189
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 190
    iget-object v0, p0, Lo/crf;->s:Lo/crh;

    move-object v1, v12

    move v2, v10

    move-object v3, v8

    move/from16 v4, p2

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/crh;->b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_4

    .line 191
    const/4 v9, 0x4

    .line 193
    :cond_4
    goto :goto_0

    .line 201
    :cond_5
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 202
    goto :goto_1

    .line 195
    :catch_0
    move-exception v10

    .line 197
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSyncHealthDetailData e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v10}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 198
    const/16 v9, 0xb

    .line 201
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 202
    goto :goto_1

    .line 201
    :catchall_0
    move-exception v13

    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 202
    throw v13

    .line 203
    :goto_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveSyncHealthDetailData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    return v9
.end method

.method public b(Ljava/util/List;)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/cob;>;)I"
        }
    .end annotation

    .line 101
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 102
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthStatData statTables is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    const/4 v0, 0x7

    return v0

    .line 105
    :cond_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthStatData() statTables size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 107
    const/4 v6, 0x0

    .line 109
    :try_start_0
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 110
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cob;

    .line 112
    iget-object v0, p0, Lo/crf;->b:Lo/cqd;

    invoke-virtual {v0, v8}, Lo/cqd;->d(Lo/cob;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_2

    .line 113
    const/4 v6, 0x4

    .line 115
    :cond_2
    goto :goto_0

    .line 120
    :cond_3
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 121
    goto :goto_1

    .line 116
    :catch_0
    move-exception v7

    .line 117
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthStatData e is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    const/16 v6, 0xb

    .line 120
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 121
    goto :goto_1

    .line 120
    :catchall_0
    move-exception v9

    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 121
    throw v9

    .line 122
    :goto_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthStatData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    return v6
.end method

.method public b(Ljava/util/List;I)I
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)I"
        }
    .end annotation

    .line 132
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-gtz p2, :cond_1

    .line 133
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthDetailData datas is null or who <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    const/4 v0, 0x7

    return v0

    .line 136
    :cond_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthDetailData() data size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 138
    iget-object v0, p0, Lo/crf;->p:Lo/cqy;

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Lo/cqy;->a(I)Ljava/util/List;

    move-result-object v8

    .line 139
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 140
    :cond_2
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthDetailData() null == clients ||clients.isEmpty ()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const/16 v0, 0xa

    return v0

    .line 143
    :cond_3
    const/4 v9, 0x0

    .line 145
    :try_start_0
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 147
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hihealth/HiHealthData;

    .line 149
    invoke-virtual {v12}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v10

    .line 150
    iget-object v0, p0, Lo/crf;->s:Lo/crh;

    move-object v1, v12

    move v2, v10

    move-object v3, v8

    move/from16 v4, p2

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/crh;->b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_4

    .line 151
    const/4 v9, 0x4

    .line 153
    :cond_4
    goto :goto_0

    .line 158
    :cond_5
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 159
    goto :goto_1

    .line 154
    :catch_0
    move-exception v10

    .line 155
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthDetailData() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 156
    const/16 v9, 0xb

    .line 158
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 159
    goto :goto_1

    .line 158
    :catchall_0
    move-exception v13

    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 159
    throw v13

    .line 160
    :goto_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferHealthDetailData() end totalTime = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v6

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    return v9
.end method

.method public b(Ljava/util/List;II)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)I"
        }
    .end annotation

    .line 220
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-gtz p2, :cond_1

    .line 221
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bulkSaveDetailHiHealthData hiHealthDatas is null or app <= 0 app = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 222
    const/4 v0, 0x3

    return v0

    .line 224
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 227
    :try_start_0
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 228
    iget-object v0, p0, Lo/crf;->s:Lo/crh;

    invoke-virtual {v0, p1, p2, p3}, Lo/crh;->a(Ljava/util/List;II)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v6

    .line 233
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 234
    goto :goto_0

    .line 229
    :catch_0
    move-exception v7

    .line 230
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bulkSaveDetailHiHealthData() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    const/16 v6, 0xb

    .line 233
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 234
    goto :goto_0

    .line 233
    :catchall_0
    move-exception v8

    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 234
    throw v8

    .line 235
    :goto_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "bulkSaveDetailHiHealthData() size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",totalTime = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    return v6
.end method

.method public b()V
    .locals 4

    .line 412
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "do onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Lo/crf;->m:Ljava/util/concurrent/ExecutorService;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 414
    iget-object v0, p0, Lo/crf;->m:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 416
    :cond_0
    return-void
.end method

.method public b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;)Z
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List<Ljava/lang/Integer;>;)Z"
        }
    .end annotation

    .line 209
    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    if-gtz p2, :cond_1

    .line 210
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveOneSyncHealthDetailData clients is null or who <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    const/4 v0, 0x0

    return v0

    .line 213
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiHealthData;->getClientID()I

    move-result v6

    .line 214
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiHealthData;->setSyncStatus(I)V

    .line 215
    iget-object v0, p0, Lo/crf;->s:Lo/crh;

    move-object v1, p1

    move v2, v6

    move-object v3, p3

    move v4, p2

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/crh;->b(Lcom/huawei/hihealth/HiHealthData;ILjava/util/List;II)Z

    move-result v0

    return v0
.end method

.method public c()V
    .locals 4

    .line 268
    iget-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 269
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doAsyncHealthDataStat() statList is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    return-void

    .line 272
    :cond_1
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doAsyncHealthDataStat() start "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    iget-object v0, p0, Lo/crf;->m:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 274
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doAsyncHealthDataStat singleThreadPool is closed! Restarting..."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 275
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/crf;->m:Ljava/util/concurrent/ExecutorService;

    .line 277
    :cond_2
    iget-object v0, p0, Lo/crf;->m:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/crf$a;

    invoke-direct {v1, p0}, Lo/crf$a;-><init>(Lo/crf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 278
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 255
    invoke-static {p1}, Lo/cve;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 257
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 258
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepareRealTimeHealthDataStat() list is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    return-void

    .line 261
    :cond_1
    iget-object v0, p0, Lo/crf;->l:Ljava/util/Queue;

    invoke-interface {v0, v4}, Ljava/util/Queue;->addAll(Ljava/util/Collection;)Z

    .line 262
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepareRealTimeHealthDataStat() list size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",realTimeStatList size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/crf;->l:Ljava/util/Queue;

    invoke-interface {v2}, Ljava/util/Queue;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    return-void
.end method

.method public d(Ljava/util/List;I)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;I)I"
        }
    .end annotation

    .line 165
    iget-object v0, p0, Lo/crf;->s:Lo/crh;

    invoke-virtual {v0, p1, p2}, Lo/crh;->b(Ljava/util/List;I)I

    move-result v0

    return v0
.end method

.method public d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;)V"
        }
    .end annotation

    .line 243
    invoke-static {p1}, Lo/cve;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    .line 245
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 246
    :cond_0
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepareAsyncHealthDataStat() list is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 247
    return-void

    .line 249
    :cond_1
    iget-object v0, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, v4}, Ljava/util/concurrent/BlockingQueue;->addAll(Ljava/util/Collection;)Z

    .line 250
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "prepareAsyncHealthDataStat() list size = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",asyncStatList size = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/crf;->t:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v2}, Ljava/util/concurrent/BlockingQueue;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 251
    return-void
.end method

.method public e()V
    .locals 6

    .line 283
    :try_start_0
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->b()V

    .line 284
    invoke-direct {p0}, Lo/crf;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 288
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 289
    goto :goto_0

    .line 285
    :catch_0
    move-exception v4

    .line 286
    const-string v0, "HiH_HiHealthDataInsertStore"

    const/4 v1, 0x2

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doRealTimeHealthDataStat() e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 288
    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 289
    goto :goto_0

    .line 288
    :catchall_0
    move-exception v5

    sget-object v0, Lo/crf;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnu;->b(Landroid/content/Context;)Lo/cnu;

    move-result-object v0

    invoke-virtual {v0}, Lo/cnu;->e()V

    .line 289
    throw v5

    .line 290
    :goto_0
    return-void
.end method
