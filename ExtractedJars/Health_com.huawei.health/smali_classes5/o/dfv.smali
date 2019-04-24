.class public Lo/dfv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dfv$d;,
        Lo/dfv$a;,
        Lo/dfv$i;,
        Lo/dfv$e;,
        Lo/dfv$b;,
        Lo/dfv$c;
    }
.end annotation


# static fields
.field static g:Ljava/lang/String;

.field private static k:Lo/dfv;

.field private static n:Ljava/lang/Object;

.field private static final q:Ljava/lang/Object;

.field private static s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;>;"
        }
    .end annotation
.end field

.field private static x:Ljava/lang/Object;


# instance fields
.field private A:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private B:Lo/djs$a;

.field private C:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private D:J

.field a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dfm;>;"
        }
    .end annotation
.end field

.field b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dfq;>;"
        }
    .end annotation
.end field

.field c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dfx;>;"
        }
    .end annotation
.end field

.field d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field e:Ljava/util/concurrent/ExecutorService;

.field private f:Landroid/content/Context;

.field private h:Lo/dde;

.field private i:Lo/dfz;

.field private j:J

.field private l:Lo/dfv$e;

.field private m:Z

.field private o:Z

.field private p:Z

.field private r:Landroid/os/Handler;

.field private t:Landroid/os/HandlerThread;

.field private u:Lo/dqi;

.field private v:I

.field private w:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 114
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dfv;->n:Ljava/lang/Object;

    .line 142
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dfv;->s:Ljava/util/Map;

    .line 198
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dfv;->q:Ljava/lang/Object;

    .line 344
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dfv;->x:Ljava/lang/Object;

    .line 1258
    const-string v0, ""

    sput-object v0, Lo/dfv;->g:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dfv;->m:Z

    .line 123
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dfv;->o:Z

    .line 129
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dfv;->p:Z

    .line 154
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dfv;->r:Landroid/os/Handler;

    .line 155
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dfv;->t:Landroid/os/HandlerThread;

    .line 400
    new-instance v0, Lo/dfv$3;

    invoke-direct {v0, p0}, Lo/dfv$3;-><init>(Lo/dfv;)V

    iput-object v0, p0, Lo/dfv;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 517
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->w:I

    .line 518
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->y:I

    .line 549
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dfv;->b:Ljava/util/List;

    .line 597
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->v:I

    .line 598
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->z:I

    .line 627
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dfv;->c:Ljava/util/List;

    .line 922
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dfv;->a:Ljava/util/List;

    .line 924
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dfv;->j:J

    .line 925
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/dfv;->D:J

    .line 1391
    new-instance v0, Lo/dfv$4;

    invoke-direct {v0, p0}, Lo/dfv$4;-><init>(Lo/dfv;)V

    iput-object v0, p0, Lo/dfv;->B:Lo/djs$a;

    .line 1406
    new-instance v0, Lo/dfv$1;

    invoke-direct {v0, p0}, Lo/dfv$1;-><init>(Lo/dfv;)V

    iput-object v0, p0, Lo/dfv;->C:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1416
    new-instance v0, Lo/dfv$2;

    invoke-direct {v0, p0}, Lo/dfv$2;-><init>(Lo/dfv;)V

    iput-object v0, p0, Lo/dfv;->A:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 163
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "HWFitnessMgr Constructor"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iput-object p1, p0, Lo/dfv;->f:Landroid/content/Context;

    .line 165
    invoke-static {p1}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lo/dfv;->h:Lo/dde;

    .line 166
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 167
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mHWDeviceConfigManager is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 168
    return-void

    .line 171
    :cond_0
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    iget-object v1, p0, Lo/dfv;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v2, 0x186a7

    invoke-virtual {v0, v2, v1}, Lo/dde;->b(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 173
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    iget-object v1, p0, Lo/dfv;->B:Lo/djs$a;

    invoke-virtual {v0, v1}, Lo/dde;->e(Lo/djs;)V

    .line 174
    invoke-static {p1}, Lo/dqi;->b(Landroid/content/Context;)Lo/dqi;

    move-result-object v0

    iput-object v0, p0, Lo/dfv;->u:Lo/dqi;

    .line 175
    iget-object v0, p0, Lo/dfv;->u:Lo/dqi;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 176
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWCombineMigrateMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    :cond_1
    invoke-static {}, Lo/dfz;->d()Lo/dfz;

    move-result-object v0

    iput-object v0, p0, Lo/dfv;->i:Lo/dfz;

    .line 182
    const/4 v0, 0x5

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lo/dfv;->e:Ljava/util/concurrent/ExecutorService;

    .line 185
    iget-object v0, p0, Lo/dfv;->i:Lo/dfz;

    invoke-virtual {v0, p0}, Lo/dfz;->e(Lo/dfv;)V

    .line 188
    invoke-direct {p0}, Lo/dfv;->l()V

    .line 191
    new-instance v0, Lo/dfv$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dfv$e;-><init>(Lo/dfv;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dfv;->l:Lo/dfv$e;

    .line 193
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HWFitnessMgr"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dfv;->t:Landroid/os/HandlerThread;

    .line 194
    iget-object v0, p0, Lo/dfv;->t:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 195
    new-instance v0, Lo/dfv$d;

    iget-object v1, p0, Lo/dfv;->t:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/dfv$d;-><init>(Lo/dfv;Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dfv;->r:Landroid/os/Handler;

    .line 196
    return-void
.end method

.method private a(I)V
    .locals 5

    .line 658
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "doSyncTodayComplete errCode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 660
    const/16 v0, 0x2718

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lo/dfv;->a(IILjava/lang/Object;)V

    .line 661
    invoke-direct {p0}, Lo/dfv;->i()V

    .line 662
    return-void
.end method

.method private a(IILjava/lang/Object;)V
    .locals 10

    .line 229
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procCallback callback cmd="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, " error="

    const/4 v4, 0x2

    aput-object v3, v2, v4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 230
    invoke-static {}, Lo/dfv;->g()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 231
    :try_start_0
    sget-object v0, Lo/dfv;->s:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/List;

    .line 232
    if-eqz v6, :cond_1

    .line 233
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ge v1, v0, :cond_1

    .line 234
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 235
    const/4 v0, 0x0

    if-eq v0, v8, :cond_0

    .line 236
    invoke-interface {v8, p2, p3}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 237
    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 238
    goto :goto_1

    .line 240
    :cond_0
    invoke-interface {v6, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 243
    :cond_1
    :goto_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 244
    :goto_2
    return-void
.end method

.method private a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 8

    .line 771
    sget-object v5, Lo/dfv;->n:Ljava/lang/Object;

    monitor-enter v5

    .line 772
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessTodayDatarun enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 773
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 774
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 775
    :cond_0
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncFitnessTodayDatarun get device info error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 776
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 777
    const v0, 0x493e4

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 779
    :cond_1
    monitor-exit v5

    return-void

    .line 788
    :cond_2
    const/4 v0, 0x4

    const-wide/32 v1, 0x9c40

    :try_start_1
    invoke-direct {p0, v0, v1, v2}, Lo/dfv;->d(IJ)V

    .line 789
    const/16 v0, 0x2718

    invoke-direct {p0, v0, p1}, Lo/dfv;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 790
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessTodayData enter thread"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 791
    invoke-static {}, Lo/dgb;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 792
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    .line 793
    :goto_0
    return-void
.end method

.method static synthetic a(Lo/dfv;)V
    .locals 0

    .line 101
    invoke-direct {p0}, Lo/dfv;->s()V

    return-void
.end method

.method static synthetic a(Lo/dfv;I)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->c(I)V

    return-void
.end method

.method static synthetic a(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->k([B)V

    return-void
.end method

.method private a([B)V
    .locals 6

    .line 601
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->v:I

    .line 602
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->z:I

    .line 604
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetStatusFrameCount Complete"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 606
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 607
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 608
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetStatusFrameCount return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 609
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dfv;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 610
    return-void

    .line 612
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->f([B)I

    move-result v0

    iput v0, p0, Lo/dfv;->v:I

    .line 613
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetStatusFrameCount get status frame count :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dfv;->v:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 617
    goto :goto_0

    .line 615
    :catch_0
    move-exception v5

    .line 616
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 619
    :goto_0
    iget v0, p0, Lo/dfv;->v:I

    if-lez v0, :cond_1

    .line 620
    iget v0, p0, Lo/dfv;->z:I

    invoke-static {v0}, Lo/dgb;->e(I)V

    .line 621
    iget v0, p0, Lo/dfv;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dfv;->z:I

    goto :goto_1

    .line 623
    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dfv;->c(I)V

    .line 625
    :goto_1
    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/dfv;
    .locals 6

    .line 201
    sget-object v4, Lo/dfv;->q:Ljava/lang/Object;

    monitor-enter v4

    .line 202
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInstance() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    sget-object v0, Lo/dfv;->k:Lo/dfv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 204
    new-instance v0, Lo/dfv;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dfv;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dfv;->k:Lo/dfv;

    .line 206
    :cond_0
    sget-object v0, Lo/dfv;->k:Lo/dfv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 207
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method static synthetic b(Lo/dfv;I)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->a(I)V

    return-void
.end method

.method static synthetic b(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->g([B)V

    return-void
.end method

.method private b([B)V
    .locals 7

    .line 476
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "procDeviceDataReport"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    const/4 v5, 0x0

    .line 480
    :try_start_0
    invoke-static {p1}, Lo/dfi;->h([B)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v5, v0

    .line 483
    goto :goto_0

    .line 481
    :catch_0
    move-exception v6

    .line 482
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 485
    :goto_0
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procDeviceDataReport action ="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 487
    const/4 v0, 0x1

    if-ne v5, v0, :cond_0

    .line 488
    new-instance v0, Lo/dfv$10;

    invoke-direct {v0, p0}, Lo/dfv$10;-><init>(Lo/dfv;)V

    invoke-virtual {p0, v0}, Lo/dfv;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 494
    :cond_0
    const/4 v0, 0x2

    if-ne v5, v0, :cond_1

    .line 495
    new-instance v0, Lo/dfv$6;

    invoke-direct {v0, p0}, Lo/dfv$6;-><init>(Lo/dfv;)V

    invoke-virtual {p0, v0}, Lo/dfv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 501
    :cond_1
    const/4 v0, 0x3

    if-ne v5, v0, :cond_2

    .line 502
    new-instance v0, Lo/dfv$9;

    invoke-direct {v0, p0}, Lo/dfv$9;-><init>(Lo/dfv;)V

    invoke-virtual {p0, v0}, Lo/dfv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 509
    :cond_2
    const/16 v0, 0x8

    if-ne v5, v0, :cond_3

    .line 510
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "action == DeviceReportThroshold.ACTION_SYNC_WORKOUT_MASK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 511
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.7.15 notify to sync workout data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 512
    invoke-direct {p0}, Lo/dfv;->u()V

    .line 514
    :cond_3
    :goto_1
    return-void
.end method

.method private c(I)V
    .locals 5

    .line 386
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "notifyDetailSyncComplete errCode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 388
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lo/dfv;->d(I)V

    .line 389
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 390
    invoke-direct {p0}, Lo/dfv;->f()V

    goto :goto_0

    .line 392
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dfv;->m:Z

    .line 393
    const-string v0, "notifyDetailSyncComplete"

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/dfv;->e(ZLjava/lang/String;)V

    .line 394
    const-string v0, "false"

    invoke-direct {p0, v0}, Lo/dfv;->c(Ljava/lang/String;)V

    .line 395
    invoke-direct {p0}, Lo/dfv;->m()V

    .line 396
    const/16 v0, 0x2719

    const/4 v1, 0x0

    invoke-direct {p0, v0, p1, v1}, Lo/dfv;->a(IILjava/lang/Object;)V

    .line 398
    :goto_0
    return-void
.end method

.method private c(IZ)V
    .locals 7

    .line 352
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncCompleteRun isNeedSyncwork:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 353
    sget-object v5, Lo/dfv;->x:Ljava/lang/Object;

    monitor-enter v5

    .line 354
    const/16 v0, 0x2719

    const/4 v1, 0x0

    :try_start_0
    invoke-direct {p0, v0, p1, v1}, Lo/dfv;->a(IILjava/lang/Object;)V

    .line 355
    const-string v0, "false"

    invoke-direct {p0, v0}, Lo/dfv;->c(Ljava/lang/String;)V

    .line 356
    invoke-direct {p0}, Lo/dfv;->m()V

    .line 357
    invoke-direct {p0}, Lo/dfv;->h()V

    .line 358
    if-eqz p2, :cond_0

    .line 359
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    iget-object v1, p0, Lo/dfv;->B:Lo/djs$a;

    iget-object v2, p0, Lo/dfv;->A:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dde;->e(Lo/djs;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 361
    :cond_0
    monitor-exit v5

    goto :goto_0

    :catchall_0
    move-exception v6

    monitor-exit v5

    throw v6

    .line 362
    :goto_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 4

    .line 1322
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    const/16 v1, 0x2718

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "KEY_SYNCHRONIZING_DATA_FLAG"

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, p1, v3}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 1324
    return-void
.end method

.method static synthetic c(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->a([B)V

    return-void
.end method

.method private c([B)V
    .locals 7

    .line 630
    const/4 v5, 0x0

    .line 632
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetStatusFrame Complete"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 634
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 635
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 636
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetStatusFrame return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dfv;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 638
    return-void

    .line 640
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->k([B)Lo/dfx;

    move-result-object v6

    .line 641
    iget-object v0, p0, Lo/dfv;->c:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 646
    goto :goto_0

    .line 643
    :catch_0
    move-exception v6

    .line 644
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 645
    const v5, 0x31128

    .line 648
    :goto_0
    iget v0, p0, Lo/dfv;->z:I

    iget v1, p0, Lo/dfv;->v:I

    if-ge v0, v1, :cond_1

    .line 649
    iget v0, p0, Lo/dfv;->z:I

    invoke-static {v0}, Lo/dgb;->e(I)V

    .line 650
    iget v0, p0, Lo/dfv;->z:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dfv;->z:I

    goto :goto_1

    .line 653
    :cond_1
    invoke-direct {p0, v5}, Lo/dfv;->c(I)V

    .line 655
    :goto_1
    return-void
.end method

.method private d(J)J
    .locals 11

    .line 934
    move-wide v4, p1

    .line 935
    new-instance v6, Ljava/util/Date;

    const-wide/16 v0, 0x3e8

    mul-long/2addr v0, p1

    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 936
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 937
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 938
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddhhmm"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 940
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "0000"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v10

    .line 941
    invoke-virtual {v10}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-wide v4, v0

    .line 944
    goto :goto_0

    .line 942
    :catch_0
    move-exception v10

    .line 943
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBeginOfDate enter"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 946
    :goto_0
    return-wide v4
.end method

.method static synthetic d(Lo/dfv;)Landroid/content/Context;
    .locals 1

    .line 101
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    return-object v0
.end method

.method private d(I)V
    .locals 5

    .line 711
    iget-object v0, p0, Lo/dfv;->l:Lo/dfv$e;

    if-eqz v0, :cond_0

    .line 712
    iget-object v0, p0, Lo/dfv;->l:Lo/dfv$e;

    invoke-virtual {v0, p1}, Lo/dfv$e;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 713
    iget-object v0, p0, Lo/dfv;->l:Lo/dfv$e;

    invoke-virtual {v0, p1}, Lo/dfv$e;->removeMessages(I)V

    goto :goto_0

    .line 716
    :cond_0
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "fitnessMgrRemoveMSG mHWFitnessMgrHandler is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 718
    :cond_1
    :goto_0
    return-void
.end method

.method private d(IJ)V
    .locals 5

    .line 703
    iget-object v0, p0, Lo/dfv;->l:Lo/dfv$e;

    if-eqz v0, :cond_0

    .line 704
    iget-object v0, p0, Lo/dfv;->l:Lo/dfv$e;

    invoke-virtual {v0, p1, p2, p3}, Lo/dfv$e;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0

    .line 706
    :cond_0
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "fitnessMgrSendMSGDelay mHWFitnessMgrHandler is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 708
    :goto_0
    return-void
.end method

.method private d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 216
    invoke-static {}, Lo/dfv;->g()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2

    .line 217
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 218
    :try_start_0
    sget-object v0, Lo/dfv;->s:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/List;

    .line 219
    if-nez v3, :cond_0

    .line 220
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 221
    sget-object v0, Lo/dfv;->s:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    :cond_0
    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 225
    :cond_1
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4

    .line 226
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 10

    .line 956
    sget-object v5, Lo/dfv;->n:Ljava/lang/Object;

    monitor-enter v5

    .line 957
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syncFitnessDetailDataRun enter thread isNeedSyncwork:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 959
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v6

    .line 960
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 961
    :cond_0
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailDataRun get device info error"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 962
    const v0, 0x493e4

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 963
    monitor-exit v5

    return-void

    .line 966
    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lo/dfv;->m:Z

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 967
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData data syncing"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 968
    const v0, 0x493e2

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 969
    monitor-exit v5

    return-void

    .line 972
    :cond_2
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lo/dfv;->m:Z

    .line 973
    const-string v0, "syncFitnessDetailDataRun"

    invoke-virtual {p0, p2, v0}, Lo/dfv;->e(ZLjava/lang/String;)V

    .line 974
    const-string v0, "true"

    invoke-direct {p0, v0}, Lo/dfv;->c(Ljava/lang/String;)V

    .line 975
    const/4 v0, 0x0

    const-wide/32 v1, 0x3a980

    invoke-direct {p0, v0, v1, v2}, Lo/dfv;->d(IJ)V

    .line 976
    const/16 v0, 0x2719

    invoke-direct {p0, v0, p1}, Lo/dfv;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 977
    invoke-direct {p0}, Lo/dfv;->p()V

    .line 979
    invoke-direct {p0}, Lo/dfv;->n()J

    move-result-wide v0

    iput-wide v0, p0, Lo/dfv;->j:J

    .line 980
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    .line 981
    const-wide/16 v0, 0x3e8

    div-long/2addr v7, v0

    .line 982
    long-to-int v0, v7

    int-to-long v0, v0

    iput-wide v0, p0, Lo/dfv;->D:J

    .line 984
    iget-wide v0, p0, Lo/dfv;->D:J

    iget-wide v2, p0, Lo/dfv;->j:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x93a80

    cmp-long v0, v0, v2

    if-gtz v0, :cond_3

    iget-wide v0, p0, Lo/dfv;->j:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_4

    .line 985
    :cond_3
    iget-wide v0, p0, Lo/dfv;->D:J

    const-wide/32 v2, 0x93a80

    sub-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Lo/dfv;->d(J)J

    move-result-wide v0

    iput-wide v0, p0, Lo/dfv;->j:J

    .line 986
    iget-wide v0, p0, Lo/dfv;->j:J

    invoke-virtual {p0, v0, v1}, Lo/dfv;->e(J)V

    goto :goto_0

    .line 987
    :cond_4
    iget-wide v0, p0, Lo/dfv;->j:J

    iget-wide v2, p0, Lo/dfv;->D:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_5

    iget-wide v0, p0, Lo/dfv;->j:J

    iget-wide v2, p0, Lo/dfv;->D:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_5

    .line 989
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 990
    iget-wide v0, p0, Lo/dfv;->D:J

    const-wide/16 v2, 0x3d

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dfv;->j:J

    goto :goto_0

    .line 991
    :cond_5
    iget-wide v0, p0, Lo/dfv;->j:J

    iget-wide v2, p0, Lo/dfv;->D:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_6

    .line 993
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData lastSync time is not correct and need writeback. "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 994
    iget-wide v0, p0, Lo/dfv;->D:J

    const-wide/16 v2, 0x3d

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lo/dfv;->j:J

    .line 995
    iget-wide v0, p0, Lo/dfv;->j:J

    invoke-virtual {p0, v0, v1}, Lo/dfv;->e(J)V

    .line 997
    :cond_6
    :goto_0
    iget-wide v0, p0, Lo/dfv;->j:J

    iget-wide v2, p0, Lo/dfv;->D:J

    invoke-static {v0, v1, v2, v3}, Lo/dgb;->e(JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 999
    monitor-exit v5

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v5

    throw v9

    .line 1000
    :goto_1
    return-void
.end method

.method static synthetic d(Lo/dfv;IZ)V
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2}, Lo/dfv;->c(IZ)V

    return-void
.end method

.method static synthetic d(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->e([B)V

    return-void
.end method

.method static synthetic d(Lo/dfv;[BI)V
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2}, Lo/dfv;->d([BI)V

    return-void
.end method

.method private d([B)V
    .locals 6

    .line 553
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetSamplePointFrame"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 555
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 556
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 557
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrame return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 558
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dfv;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 559
    return-void

    .line 561
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->g([B)Lo/dfq;

    move-result-object v5

    .line 562
    iget-object v0, p0, Lo/dfv;->b:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 566
    goto :goto_0

    .line 564
    :catch_0
    move-exception v5

    .line 565
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrame Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    :goto_0
    iget v0, p0, Lo/dfv;->y:I

    iget v1, p0, Lo/dfv;->w:I

    if-ge v0, v1, :cond_1

    .line 569
    iget v0, p0, Lo/dfv;->y:I

    invoke-static {v0}, Lo/dgb;->d(I)V

    .line 570
    iget v0, p0, Lo/dfv;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dfv;->y:I

    goto :goto_1

    .line 572
    :cond_1
    invoke-direct {p0}, Lo/dfv;->o()V

    .line 574
    :goto_1
    return-void
.end method

.method private d([BI)V
    .locals 7

    .line 460
    const v5, 0x31128

    .line 462
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procSetCmdResult Complete cmd="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 464
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 465
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v0

    move v5, v0

    .line 466
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCmdResult return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 470
    :cond_0
    goto :goto_0

    .line 468
    :catch_0
    move-exception v6

    .line 469
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 472
    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0, p2, v5, v0}, Lo/dfv;->a(IILjava/lang/Object;)V

    .line 473
    return-void
.end method

.method static synthetic e(Lo/dfv;)Landroid/os/Handler;
    .locals 1

    .line 101
    iget-object v0, p0, Lo/dfv;->r:Landroid/os/Handler;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 1266
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dfv;->g:Ljava/lang/String;

    .line 1268
    sget-object v0, Lo/dfv;->g:Ljava/lang/String;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 1269
    const-string v0, ""

    sput-object v0, Lo/dfv;->g:Ljava/lang/String;

    .line 1272
    :cond_0
    sget-object v0, Lo/dfv;->g:Ljava/lang/String;

    return-object v0
.end method

.method private e(Lcom/huawei/up/model/UserInfomation;)V
    .locals 4

    .line 1122
    const-string v0, "05"

    const-string v1, "setDeviceUserInfo"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    invoke-static {p1}, Lo/dgb;->c(Lcom/huawei/up/model/UserInfomation;)V

    .line 1124
    return-void
.end method

.method static synthetic e(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    return-void
.end method

.method static synthetic e(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 0

    .line 101
    invoke-direct {p0, p1, p2}, Lo/dfv;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    return-void
.end method

.method static synthetic e(Lo/dfv;Lcom/huawei/up/model/UserInfomation;)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->e(Lcom/huawei/up/model/UserInfomation;)V

    return-void
.end method

.method static synthetic e(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->d([B)V

    return-void
.end method

.method private e([B)V
    .locals 6

    .line 521
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->w:I

    .line 522
    const/4 v0, 0x0

    iput v0, p0, Lo/dfv;->y:I

    .line 524
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetSamplePointFrameCount"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 526
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 527
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v5

    .line 528
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrameCount return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    const v0, 0x493e7

    invoke-virtual {p0, v0}, Lo/dfv;->b(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 530
    return-void

    .line 532
    :cond_0
    :try_start_1
    invoke-static {p1}, Lo/dfi;->a([B)I

    move-result v0

    iput v0, p0, Lo/dfv;->w:I

    .line 533
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procGetSamplePointFrameCount get sample frame count :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/dfv;->w:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 537
    goto :goto_0

    .line 535
    :catch_0
    move-exception v5

    .line 536
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    :goto_0
    iget v0, p0, Lo/dfv;->w:I

    if-lez v0, :cond_1

    .line 540
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procGetSamplePointFrameCount get sample frame index :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lo/dfv;->y:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 541
    iget v0, p0, Lo/dfv;->y:I

    invoke-static {v0}, Lo/dgb;->d(I)V

    .line 542
    iget v0, p0, Lo/dfv;->y:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/dfv;->y:I

    goto :goto_1

    .line 545
    :cond_1
    invoke-direct {p0}, Lo/dfv;->o()V

    .line 547
    :goto_1
    return-void
.end method

.method private f()V
    .locals 7

    .line 274
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveFitnessDate."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v5

    .line 277
    invoke-interface {v5}, Lo/clt;->d()Z

    move-result v6

    .line 278
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "saveFitnessDate isExistHiHealthService = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 279
    if-eqz v6, :cond_0

    .line 280
    const/4 v0, 0x5

    const-wide/32 v1, 0x1d4c0

    invoke-direct {p0, v0, v1, v2}, Lo/dfv;->d(IJ)V

    goto :goto_0

    .line 282
    :cond_0
    const v0, 0x493e1

    invoke-virtual {p0, v0}, Lo/dfv;->b(I)V

    .line 283
    return-void

    .line 285
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/dfv;->o:Z

    .line 287
    invoke-virtual {p0}, Lo/dfv;->a()V

    .line 289
    iget-object v0, p0, Lo/dfv;->i:Lo/dfz;

    iget-object v1, p0, Lo/dfv;->b:Ljava/util/List;

    iget-object v2, p0, Lo/dfv;->c:Ljava/util/List;

    invoke-virtual {v0, p0, v1, v2}, Lo/dfz;->b(Lo/dfv;Ljava/util/List;Ljava/util/List;)V

    .line 290
    iget-object v0, p0, Lo/dfv;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 291
    iget-object v0, p0, Lo/dfv;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 293
    return-void
.end method

.method private static declared-synchronized g()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dfv;

    monitor-enter v1

    .line 212
    :try_start_0
    sget-object v0, Lo/dfv;->s:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic g(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->i([B)V

    return-void
.end method

.method private g([B)V
    .locals 5

    .line 767
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetActivityReminder do not porcess"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 768
    return-void
.end method

.method private h()V
    .locals 7

    .line 247
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendDetailSyncSuccBroadcast."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 250
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_detail_sync_success"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 251
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 252
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 254
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.health.action.AW70_FITNESS_DETAIL_SYNC_SUCCESS_ACTION"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 255
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 257
    return-void
.end method

.method private i()V
    .locals 7

    .line 260
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendTodaySyncSuccBroadcast."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 261
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.FITNESS_DATA_TODAY_SYNC"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 262
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 263
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 265
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_summary_sync_success"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 266
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 267
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 268
    return-void
.end method

.method static synthetic i(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->c([B)V

    return-void
.end method

.method private i([B)V
    .locals 8

    .line 1152
    const v5, 0x31128

    .line 1153
    const/4 v6, 0x0

    .line 1154
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetUserInfoData Complete cmd=21"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1156
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 1157
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v0

    move v5, v0

    .line 1158
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "procSetCmdResult return err:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1160
    :cond_0
    const/4 v5, 0x0

    .line 1162
    invoke-static {p1}, Lo/dfi;->i([B)Lcom/huawei/datatype/FitnessUserInfo;
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v6, v0

    .line 1166
    :goto_0
    goto :goto_1

    .line 1164
    :catch_0
    move-exception v7

    .line 1165
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1168
    :goto_1
    const/16 v0, 0x15

    invoke-direct {p0, v0, v5, v6}, Lo/dfv;->a(IILjava/lang/Object;)V

    .line 1169
    return-void
.end method

.method static synthetic k(Lo/dfv;[B)V
    .locals 0

    .line 101
    invoke-direct {p0, p1}, Lo/dfv;->b([B)V

    return-void
.end method

.method private k([B)V
    .locals 8

    .line 666
    const v6, 0x31128

    .line 668
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "procGetTodayFitnessData Complete"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 670
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/dfv;->d(I)V

    .line 673
    const/4 v0, 0x2

    :try_start_0
    aget-byte v0, p1, v0

    const/16 v1, 0x7f

    if-ne v0, v1, :cond_0

    .line 674
    invoke-static {p1}, Lo/dfi;->d([B)I

    move-result v0

    move v6, v0

    .line 675
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procGetTodayFitnessData return err:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 677
    :cond_0
    invoke-static {p1}, Lo/dfi;->b([B)Lo/dfp;

    move-result-object v5

    .line 678
    iget-object v0, p0, Lo/dfv;->i:Lo/dfz;

    invoke-virtual {v0, p0, v5}, Lo/dfz;->b(Lo/dfv;Lo/dfp;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 679
    const/4 v6, 0x0

    .line 683
    :goto_0
    goto :goto_1

    .line 681
    :catch_0
    move-exception v7

    .line 682
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " Exception :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    :goto_1
    invoke-direct {p0, v6}, Lo/dfv;->a(I)V

    .line 686
    return-void
.end method

.method private l()V
    .locals 5

    .line 823
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleUserLogin enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 824
    iget-object v0, p0, Lo/dfv;->i:Lo/dfz;

    invoke-virtual {v0, p0}, Lo/dfz;->d(Lo/dfv;)V

    .line 825
    return-void
.end method

.method private m()V
    .locals 5

    .line 1330
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendDialogDismisssBroadcast."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1331
    new-instance v4, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.ACTION_DIALOG_DISMISS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1332
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1333
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1334
    return-void
.end method

.method private n()J
    .locals 6

    .line 1061
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getLastSyncTime enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1062
    new-instance v5, Lo/dga;

    invoke-direct {v5}, Lo/dga;-><init>()V

    .line 1063
    invoke-virtual {v5, p0}, Lo/dga;->d(Lo/dfv;)J

    move-result-wide v0

    return-wide v0
.end method

.method private o()V
    .locals 8

    .line 578
    invoke-static {p0}, Lo/dgc;->e(Lo/dfv;)J

    move-result-wide v4

    .line 579
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long v6, v0, v2

    .line 580
    const-string v0, "05"

    const-string v1, "syncStatusPoint"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 581
    sub-long v0, v4, v6

    const-wide/32 v2, 0x93a80

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, v4, v0

    if-nez v0, :cond_1

    .line 582
    :cond_0
    const-wide/32 v0, 0x93a80

    sub-long v0, v6, v0

    invoke-direct {p0, v0, v1}, Lo/dfv;->d(J)J

    move-result-wide v4

    .line 583
    invoke-static {p0, v4, v5}, Lo/dgc;->b(Lo/dfv;J)V

    goto :goto_0

    .line 584
    :cond_1
    cmp-long v0, v4, v6

    if-ltz v0, :cond_2

    sub-long v0, v4, v6

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 586
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStatusPoint lastStatusTime is not correct. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 587
    const-wide/16 v0, 0x3d

    sub-long v4, v6, v0

    goto :goto_0

    .line 588
    :cond_2
    sub-long v0, v4, v6

    const-wide/16 v2, 0x12c

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 590
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "syncStatusPoint lastStatusTime is not correct and need writeback. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 591
    const-wide/16 v0, 0x3d

    sub-long v4, v6, v0

    .line 592
    invoke-static {p0, v4, v5}, Lo/dgc;->b(Lo/dfv;J)V

    .line 594
    :cond_3
    :goto_0
    invoke-static {v4, v5, v6, v7}, Lo/dgb;->c(JJ)V

    .line 595
    return-void
.end method

.method private p()V
    .locals 1

    .line 950
    iget-object v0, p0, Lo/dfv;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 951
    iget-object v0, p0, Lo/dfv;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 952
    iget-object v0, p0, Lo/dfv;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 953
    return-void
.end method

.method private s()V
    .locals 8

    .line 1367
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDefaultDeviceReportThroshold."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1368
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 1369
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 1370
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 1371
    if-nez v6, :cond_0

    .line 1372
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDefaultDeviceReportThroshold deviceCapability is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1373
    return-void

    .line 1376
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1377
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setDefaultDeviceReportThroshold is not support"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1378
    return-void

    .line 1381
    :cond_1
    invoke-static {}, Lo/dfr;->b()Ljava/util/List;

    move-result-object v7

    .line 1382
    invoke-static {v7}, Lo/dgb;->e(Ljava/util/List;)V

    .line 1384
    :cond_2
    return-void
.end method

.method private u()V
    .locals 4

    .line 1387
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sending broadcast to sync workout data."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1388
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    iget-object v1, p0, Lo/dfv;->B:Lo/djs$a;

    iget-object v2, p0, Lo/dfv;->C:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v1, v2}, Lo/dde;->e(Lo/djs;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1389
    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    .line 834
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "hwfitnessmgr registerDeviceToHiHealth"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 835
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 836
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 837
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 838
    invoke-static {v5}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 840
    :cond_0
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwfitnessmgr registerDeviceToHiHealth deviceInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 842
    :goto_0
    goto :goto_1

    .line 843
    :cond_1
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwfitnessmgr registerDeviceToHiHealth enter mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 845
    :goto_1
    return-void
.end method

.method public a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 8

    .line 848
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v5

    .line 849
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleDeviceConnection device Connect state = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 851
    const/4 v0, 0x2

    if-ne v5, v0, :cond_1

    .line 852
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleDeviceConnection"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 854
    invoke-static {p1}, Lo/fju;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 858
    invoke-virtual {p0}, Lo/dfv;->b()Lcom/huawei/up/model/UserInfomation;

    move-result-object v6

    .line 861
    iget-object v0, p0, Lo/dfv;->u:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 862
    iget-object v0, p0, Lo/dfv;->u:Lo/dqi;

    new-instance v1, Lo/dfv$7;

    invoke-direct {v1, p0}, Lo/dfv$7;-><init>(Lo/dfv;)V

    invoke-virtual {v0, v1}, Lo/dqi;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 874
    :cond_0
    new-instance v0, Lo/dfv$8;

    invoke-direct {v0, p0}, Lo/dfv$8;-><init>(Lo/dfv;)V

    invoke-virtual {p0, v6, v0}, Lo/dfv;->d(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 902
    invoke-virtual {p0}, Lo/dfv;->c()V

    .line 903
    goto :goto_1

    :cond_1
    const/4 v0, 0x3

    if-ne v5, v0, :cond_2

    .line 905
    invoke-static {}, Lo/dfv;->g()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 906
    :try_start_0
    sget-object v0, Lo/dfv;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 907
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 908
    :goto_0
    iget-boolean v0, p0, Lo/dfv;->o:Z

    if-nez v0, :cond_2

    .line 909
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Data sync bt bt disconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 910
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dfv;->m:Z

    .line 911
    const-string v0, "false"

    invoke-direct {p0, v0}, Lo/dfv;->c(Ljava/lang/String;)V

    .line 912
    invoke-direct {p0}, Lo/dfv;->m()V

    .line 913
    const v0, 0x493e4

    invoke-virtual {p0, v0}, Lo/dfv;->b(I)V

    .line 914
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.health.fitness_detail_sync_fail"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 915
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 916
    iget-object v0, p0, Lo/dfv;->f:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 919
    :cond_2
    :goto_1
    return-void
.end method

.method public a(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 4

    .line 1189
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWFitnessAW70Mgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " setActivityReminder enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1190
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "saveActivityReminder enable "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1193
    iget-object v0, p0, Lo/dfv;->u:Lo/dqi;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1194
    iget-object v0, p0, Lo/dfv;->u:Lo/dqi;

    invoke-virtual {v0, p1}, Lo/dqi;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V

    .line 1197
    :cond_0
    if-eqz p3, :cond_1

    .line 1198
    const/4 v0, 0x7

    invoke-direct {p0, v0, p2}, Lo/dfv;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 1200
    :cond_1
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1202
    :goto_0
    invoke-static {p1}, Lo/dgb;->b(Lcom/huawei/hwcommonmodel/fitnessdatatype/ActivityReminder;)V

    .line 1203
    return-void
.end method

.method public b()Lcom/huawei/up/model/UserInfomation;
    .locals 7

    .line 1277
    const/4 v5, 0x0

    .line 1279
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v6

    .line 1280
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 1281
    invoke-virtual {v6}, Lo/dnm;->i()Lcom/huawei/up/model/UserInfomation;

    move-result-object v5

    .line 1282
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getLocalUserinfo return  userInfomation"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 1284
    :cond_0
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hwUserProfileMgr is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1288
    :goto_0
    if-nez v5, :cond_1

    .line 1289
    new-instance v5, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v5}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 1292
    :cond_1
    return-object v5
.end method

.method public b(I)V
    .locals 5

    .line 336
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "procDetailSyncComplete errCode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 337
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/dfv;->d(I)V

    .line 338
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dfv;->m:Z

    .line 339
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/dfv;->o:Z

    .line 340
    iget-object v0, p0, Lo/dfv;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dfv$b;

    invoke-virtual {p0}, Lo/dfv;->k()Z

    move-result v2

    invoke-direct {v1, p0, p1, v2}, Lo/dfv$b;-><init>(Lo/dfv;IZ)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 341
    const-string v0, "procDetailSyncComplete"

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Lo/dfv;->e(ZLjava/lang/String;)V

    .line 342
    return-void
.end method

.method public b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 1025
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "syncFitnessDetailData enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1026
    new-instance v0, Lo/dfv$11;

    invoke-direct {v0, p0, p1}, Lo/dfv$11;-><init>(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-virtual {p0, v0}, Lo/dfv;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1033
    return-void
.end method

.method public c()V
    .locals 5

    .line 296
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "setDeviceFitnessGoal enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 298
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;-><init>()V

    new-instance v2, Lo/dfv$5;

    invoke-direct {v2, p0}, Lo/dfv$5;-><init>(Lo/dfv;)V

    invoke-virtual {v0, v1, v2}, Lo/dgu;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 305
    return-void
.end method

.method public d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2

    .line 801
    iget-object v0, p0, Lo/dfv;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dfv$i;

    invoke-direct {v1, p0, p1}, Lo/dfv$i;-><init>(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 802
    return-void
.end method

.method public d(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7

    .line 1130
    iget-object v0, p0, Lo/dfv;->h:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->h()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 1131
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1132
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "current device is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    return-void

    .line 1136
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czw;->e(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 1137
    if-nez v6, :cond_1

    .line 1138
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUserInfo deviceCapability is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1139
    return-void

    .line 1141
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1142
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUserInfo support get user info"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1143
    const/16 v0, 0x15

    invoke-direct {p0, v0, p2}, Lo/dfv;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 1144
    invoke-static {}, Lo/dgb;->a()V

    goto :goto_0

    .line 1146
    :cond_2
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getUserInfo not support get user info"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1147
    invoke-direct {p0, p1}, Lo/dfv;->e(Lcom/huawei/up/model/UserInfomation;)V

    .line 1149
    :goto_0
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1301
    const/4 v0, 0x0

    return v0
.end method

.method public e(I)V
    .locals 5

    .line 331
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "doDetailSyncComplete errCode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 332
    invoke-virtual {p0, p1}, Lo/dfv;->b(I)V

    .line 333
    return-void
.end method

.method public e(J)V
    .locals 7

    .line 1070
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "setLastSyncTime time="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1071
    new-instance v5, Lo/dga;

    invoke-direct {v5}, Lo/dga;-><init>()V

    .line 1072
    new-instance v6, Lo/dfa;

    invoke-direct {v6}, Lo/dfa;-><init>()V

    .line 1073
    invoke-virtual {v6, p1, p2}, Lo/dfa;->a(J)V

    .line 1074
    invoke-virtual {v5, p0, v6}, Lo/dga;->a(Lo/dfv;Lo/dfa;)V

    .line 1075
    return-void
.end method

.method public e(ZLjava/lang/String;)V
    .locals 4

    .line 1431
    const-string v0, "HWFitnessAW70Mgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter setNeedWorkout :needWorkout:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  isFrom:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1432
    iput-boolean p1, p0, Lo/dfv;->p:Z

    .line 1433
    return-void
.end method

.method public k()Z
    .locals 1

    .line 1427
    iget-boolean v0, p0, Lo/dfv;->p:Z

    return v0
.end method
