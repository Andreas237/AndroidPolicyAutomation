.class public Lo/dlf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile c:Lo/dlf;


# instance fields
.field private a:Lo/dlw;

.field private b:Landroid/content/Context;

.field private d:Lo/dlz;

.field private e:Lo/dlu;

.field private f:Lo/dln;

.field private g:Lo/dmb;

.field private h:Lo/dma;

.field private i:Ljava/util/concurrent/ExecutorService;

.field private k:Lo/dll;

.field private l:Lo/dlm;

.field private m:Lo/dlp;

.field private n:Lo/dmp;

.field private o:Lo/eaa;

.field private p:Lo/dlt;

.field private q:Landroid/os/Handler;

.field private r:J

.field private s:J

.field private t:Lo/cmg;

.field private u:J

.field private w:Lo/dml;

.field private x:Lcom/huawei/pluginmessagecenter/service/MessageObserver;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 422
    new-instance v0, Lo/dlf$16;

    invoke-direct {v0, p0}, Lo/dlf$16;-><init>(Lo/dlf;)V

    iput-object v0, p0, Lo/dlf;->t:Lo/cmg;

    .line 627
    new-instance v0, Lo/dlf$6;

    invoke-direct {v0, p0}, Lo/dlf$6;-><init>(Lo/dlf;)V

    iput-object v0, p0, Lo/dlf;->x:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    .line 641
    new-instance v0, Lo/dlf$8;

    invoke-direct {v0, p0}, Lo/dlf$8;-><init>(Lo/dlf;)V

    iput-object v0, p0, Lo/dlf;->w:Lo/dml;

    .line 106
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    .line 107
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    .line 108
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dlf;->q:Landroid/os/Handler;

    .line 109
    new-instance v0, Lo/dlz;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlz;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->d:Lo/dlz;

    .line 110
    new-instance v0, Lo/dlu;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlu;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->e:Lo/dlu;

    .line 112
    new-instance v0, Lo/dma;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dma;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->h:Lo/dma;

    .line 113
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dll;->d(Landroid/content/Context;)Lo/dll;

    move-result-object v0

    iput-object v0, p0, Lo/dlf;->k:Lo/dll;

    .line 114
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dlf;->f:Lo/dln;

    .line 115
    new-instance v0, Lo/dlp;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlp;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->m:Lo/dlp;

    .line 116
    new-instance v0, Lo/dlt;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlt;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->p:Lo/dlt;

    .line 117
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/eaa;->c(Landroid/content/Context;)Lo/eaa;

    move-result-object v0

    iput-object v0, p0, Lo/dlf;->o:Lo/eaa;

    .line 118
    new-instance v0, Lo/dlw;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlw;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->a:Lo/dlw;

    .line 119
    new-instance v0, Lo/dmb;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dmb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->g:Lo/dmb;

    .line 120
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    iput-object v0, p0, Lo/dlf;->n:Lo/dmp;

    .line 121
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 122
    invoke-direct {p0}, Lo/dlf;->f()V

    .line 123
    invoke-direct {p0}, Lo/dlf;->i()V

    .line 124
    invoke-direct {p0}, Lo/dlf;->h()V

    .line 125
    invoke-direct {p0}, Lo/dlf;->g()V

    .line 126
    invoke-direct {p0}, Lo/dlf;->k()V

    .line 127
    invoke-direct {p0}, Lo/dlf;->n()V

    .line 131
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/dlf;J)J
    .locals 0

    .line 67
    iput-wide p1, p0, Lo/dlf;->r:J

    return-wide p1
.end method

.method static synthetic a(Lo/dlf;)Lo/dlp;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->m:Lo/dlp;

    return-object v0
.end method

.method private a()Z
    .locals 8

    .line 242
    const/4 v4, 0x0

    .line 243
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    .line 244
    const/16 v1, 0x4e29

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_timercheck_time"

    .line 243
    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 245
    if-eqz v5, :cond_0

    const-string v0, ""

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 246
    :cond_0
    const/4 v4, 0x1

    goto :goto_0

    .line 248
    :cond_1
    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 250
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x6ddd00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 251
    const/4 v4, 0x1

    .line 254
    :cond_2
    :goto_0
    return v4
.end method

.method public static a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z
    .locals 2

    .line 669
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 670
    const/4 v0, 0x1

    return v0

    .line 672
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lo/dlf;J)J
    .locals 0

    .line 67
    iput-wide p1, p0, Lo/dlf;->u:J

    return-wide p1
.end method

.method static synthetic b(Lo/dlf;)Landroid/content/Context;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lo/dlf;)Lo/dlu;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->e:Lo/dlu;

    return-object v0
.end method

.method static synthetic d(Lo/dlf;J)J
    .locals 0

    .line 67
    iput-wide p1, p0, Lo/dlf;->s:J

    return-wide p1
.end method

.method public static d(Landroid/content/Context;)Lo/dlf;
    .locals 3

    .line 95
    sget-object v0, Lo/dlf;->c:Lo/dlf;

    if-nez v0, :cond_1

    .line 96
    const-class v1, Lo/dlf;

    monitor-enter v1

    .line 97
    :try_start_0
    sget-object v0, Lo/dlf;->c:Lo/dlf;

    if-nez v0, :cond_0

    .line 98
    new-instance v0, Lo/dlf;

    invoke-direct {v0, p0}, Lo/dlf;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dlf;->c:Lo/dlf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 102
    :cond_1
    :goto_0
    sget-object v0, Lo/dlf;->c:Lo/dlf;

    return-object v0
.end method

.method static synthetic d(Lo/dlf;)Lo/dlz;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->d:Lo/dlz;

    return-object v0
.end method

.method static synthetic e(Lo/dlf;)Lo/dlw;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->a:Lo/dlw;

    return-object v0
.end method

.method public static e(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z
    .locals 4

    .line 681
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getExpireTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getExpireTime()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lo/eae;->c(J)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 682
    const/4 v0, 0x1

    return v0

    .line 684
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private f()V
    .locals 3

    .line 337
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dlf$12;

    invoke-direct {v1, p0}, Lo/dlf$12;-><init>(Lo/dlf;)V

    const/4 v2, 0x7

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 360
    return-void
.end method

.method static synthetic f(Lo/dlf;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/dlf;->l()V

    return-void
.end method

.method static synthetic g(Lo/dlf;)Lo/dlt;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->p:Lo/dlt;

    return-object v0
.end method

.method private g()V
    .locals 3

    .line 482
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dlf$5;

    invoke-direct {v1, p0}, Lo/dlf$5;-><init>(Lo/dlf;)V

    const/16 v2, 0x66

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 506
    return-void
.end method

.method static synthetic h(Lo/dlf;)Lo/dma;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->h:Lo/dma;

    return-object v0
.end method

.method private h()V
    .locals 3

    .line 396
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dlf$17;

    invoke-direct {v1, p0}, Lo/dlf$17;-><init>(Lo/dlf;)V

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 420
    return-void
.end method

.method static synthetic i(Lo/dlf;)J
    .locals 2

    .line 67
    iget-wide v0, p0, Lo/dlf;->u:J

    return-wide v0
.end method

.method private i()V
    .locals 3

    .line 366
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dlf$13;

    invoke-direct {v1, p0}, Lo/dlf$13;-><init>(Lo/dlf;)V

    const/16 v2, 0x9

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 390
    return-void
.end method

.method static synthetic k(Lo/dlf;)Lo/dmb;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->g:Lo/dmb;

    return-object v0
.end method

.method private k()V
    .locals 3

    .line 478
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    iget-object v1, p0, Lo/dlf;->t:Lo/cmg;

    const/16 v2, 0x65

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(ILo/cmg;)V

    .line 479
    return-void
.end method

.method private l()V
    .locals 4

    .line 534
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doWeightChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 535
    iget-object v0, p0, Lo/dlf;->p:Lo/dlt;

    invoke-virtual {v0}, Lo/dlt;->c()V

    .line 536
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$4;

    invoke-direct {v1, p0}, Lo/dlf$4;-><init>(Lo/dlf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 558
    return-void
.end method

.method static synthetic l(Lo/dlf;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/dlf;->p()V

    return-void
.end method

.method static synthetic m(Lo/dlf;)Landroid/os/Handler;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->q:Landroid/os/Handler;

    return-object v0
.end method

.method private m()V
    .locals 4

    .line 564
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doBloodPressChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 565
    iget-object v0, p0, Lo/dlf;->p:Lo/dlt;

    invoke-virtual {v0}, Lo/dlt;->d()V

    .line 566
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$1;

    invoke-direct {v1, p0}, Lo/dlf$1;-><init>(Lo/dlf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 572
    return-void
.end method

.method static synthetic n(Lo/dlf;)J
    .locals 2

    .line 67
    iget-wide v0, p0, Lo/dlf;->r:J

    return-wide v0
.end method

.method private n()V
    .locals 3

    .line 512
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 513
    const/4 v0, 0x2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 514
    const/4 v0, 0x3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 515
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/dlf$2;

    invoke-direct {v1, p0}, Lo/dlf$2;-><init>(Lo/dlf;)V

    invoke-virtual {v0, v2, v1}, Lo/clq;->a(Ljava/util/List;Lo/cmg;)V

    .line 528
    return-void
.end method

.method static synthetic o(Lo/dlf;)J
    .locals 2

    .line 67
    iget-wide v0, p0, Lo/dlf;->s:J

    return-wide v0
.end method

.method private o()V
    .locals 2

    .line 651
    iget-object v0, p0, Lo/dlf;->n:Lo/dmp;

    iget-object v1, p0, Lo/dlf;->w:Lo/dml;

    invoke-virtual {v0, v1}, Lo/dmp;->d(Lo/dml;)V

    .line 652
    return-void
.end method

.method private p()V
    .locals 4

    .line 578
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "doBloodPressChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 579
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$10;

    invoke-direct {v1, p0}, Lo/dlf$10;-><init>(Lo/dlf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 585
    return-void
.end method

.method static synthetic p(Lo/dlf;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Lo/dlf;->m()V

    return-void
.end method

.method static synthetic q(Lo/dlf;)Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method static synthetic r(Lo/dlf;)Lo/dmp;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->n:Lo/dmp;

    return-object v0
.end method

.method static synthetic t(Lo/dlf;)Lo/dll;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/dlf;->k:Lo/dll;

    return-object v0
.end method

.method private t()V
    .locals 2

    .line 655
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$9;

    invoke-direct {v1, p0}, Lo/dlf$9;-><init>(Lo/dlf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 661
    return-void
.end method


# virtual methods
.method public a(DLo/egg;)V
    .locals 4

    .line 607
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 608
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeGoalWeight, isNoCloudVersion, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p3, v0, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 610
    return-void

    .line 612
    :cond_0
    iget-object v0, p0, Lo/dlf;->d:Lo/dlz;

    invoke-virtual {v0, p1, p2, p3}, Lo/dlz;->e(DLo/egg;)V

    .line 613
    return-void
.end method

.method public a(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 157
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$7;

    invoke-direct {v1, p0, p1, p2}, Lo/dlf$7;-><init>(Lo/dlf;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 176
    return-void
.end method

.method public a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 183
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$15;

    invoke-direct {v1, p0, p1}, Lo/dlf$15;-><init>(Lo/dlf;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 190
    return-void
.end method

.method public b()V
    .locals 2

    .line 286
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$14;

    invoke-direct {v1, p0}, Lo/dlf$14;-><init>(Lo/dlf;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 293
    return-void
.end method

.method public b(DDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 593
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 594
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "jugdeRightWeightGoal, isNoCloudVersion, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p5, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 596
    return-void

    .line 598
    :cond_0
    iget-object v0, p0, Lo/dlf;->d:Lo/dlz;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/dlz;->c(DDLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 599
    return-void
.end method

.method public b(I)V
    .locals 2

    .line 139
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$3;

    invoke-direct {v1, p0, p1}, Lo/dlf$3;-><init>(Lo/dlf;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 145
    return-void
.end method

.method public b(Landroid/content/Context;D)V
    .locals 1

    .line 621
    iget-object v0, p0, Lo/dlf;->d:Lo/dlz;

    invoke-virtual {v0, p1, p2, p3}, Lo/dlz;->e(Landroid/content/Context;D)V

    .line 622
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 202
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimerCheck"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 204
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimerCheck, isNoCloudVersion, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const v0, 0x186a1

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 206
    return-void

    .line 208
    :cond_0
    invoke-direct {p0}, Lo/dlf;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 209
    iget-object v0, p0, Lo/dlf;->i:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dlf$11;

    invoke-direct {v1, p0, p1}, Lo/dlf$11;-><init>(Lo/dlf;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    .line 231
    :cond_1
    const v0, 0x186a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x186a1

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 232
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTimingCheck, interval not enought"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    :goto_0
    return-void
.end method

.method public c()V
    .locals 4

    .line 262
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 263
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "init, isNoCloudVersion, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    return-void

    .line 266
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 267
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storedemo no smart init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    return-void

    .line 270
    :cond_1
    invoke-direct {p0}, Lo/dlf;->o()V

    .line 271
    iget-object v0, p0, Lo/dlf;->o:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dlf;->x:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 272
    iget-object v0, p0, Lo/dlf;->o:Lo/eaa;

    iget-object v1, p0, Lo/dlf;->x:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->e(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 274
    :cond_2
    iget-object v0, p0, Lo/dlf;->h:Lo/dma;

    invoke-virtual {v0}, Lo/dma;->a()V

    .line 275
    invoke-direct {p0}, Lo/dlf;->t()V

    .line 276
    invoke-virtual {p0}, Lo/dlf;->b()V

    .line 277
    invoke-virtual {p0}, Lo/dlf;->d()V

    .line 279
    iget-object v0, p0, Lo/dlf;->l:Lo/dlm;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 280
    new-instance v0, Lo/dlm;

    iget-object v1, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dlm;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlf;->l:Lo/dlm;

    .line 282
    :cond_3
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/dlf;->l:Lo/dlm;

    invoke-virtual {v0, v1}, Lo/brt;->c(Lo/buh;)V

    .line 283
    return-void
.end method

.method public d()V
    .locals 3

    .line 194
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    const-class v1, Lcom/huawei/hwsmartinteractmgr/service/SmartInteractService;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 195
    iget-object v0, p0, Lo/dlf;->b:Landroid/content/Context;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 196
    return-void
.end method

.method public e()V
    .locals 4

    .line 312
    invoke-static {}, Lo/czu;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 313
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy, isNoCloudVersion, return"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    return-void

    .line 317
    :cond_0
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 318
    const-string v0, "SMART_HWSmartInteractManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "storedemo no smart destroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 319
    return-void

    .line 322
    :cond_1
    iget-object v0, p0, Lo/dlf;->o:Lo/eaa;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dlf;->x:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 323
    iget-object v0, p0, Lo/dlf;->o:Lo/eaa;

    iget-object v1, p0, Lo/dlf;->x:Lcom/huawei/pluginmessagecenter/service/MessageObserver;

    invoke-virtual {v0, v1}, Lo/eaa;->d(Lcom/huawei/pluginmessagecenter/service/MessageObserver;)V

    .line 326
    :cond_2
    iget-object v0, p0, Lo/dlf;->h:Lo/dma;

    invoke-virtual {v0}, Lo/dma;->c()V

    .line 329
    iget-object v0, p0, Lo/dlf;->n:Lo/dmp;

    iget-object v1, p0, Lo/dlf;->w:Lo/dml;

    invoke-virtual {v0, v1}, Lo/dmp;->c(Lo/dml;)V

    .line 330
    invoke-static {}, Lo/brt;->c()Lo/brt;

    move-result-object v0

    iget-object v1, p0, Lo/dlf;->l:Lo/dlm;

    invoke-virtual {v0, v1}, Lo/brt;->d(Lo/buh;)V

    .line 331
    return-void
.end method
