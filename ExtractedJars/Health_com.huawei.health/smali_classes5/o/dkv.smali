.class public Lo/dkv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dkv$a;
    }
.end annotation


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Lo/dkv;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;>;"
        }
    .end annotation
.end field


# instance fields
.field private c:Lo/dkw;

.field private e:Landroid/os/Handler;

.field private h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dkv;->d:Ljava/util/List;

    .line 44
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dkv;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkv;->c:Lo/dkw;

    .line 53
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dkv;->e:Landroid/os/Handler;

    .line 186
    new-instance v0, Lo/dkv$4;

    invoke-direct {v0, p0}, Lo/dkv$4;-><init>(Lo/dkv;)V

    iput-object v0, p0, Lo/dkv;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 63
    invoke-static {}, Lo/dkw;->e()Lo/dkw;

    move-result-object v0

    iput-object v0, p0, Lo/dkv;->c:Lo/dkw;

    .line 64
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "HWFileTransferTaskQueue"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 65
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 66
    new-instance v0, Lo/dkv$a;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dkv$a;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dkv;->e:Landroid/os/Handler;

    .line 67
    return-void
.end method

.method static synthetic a(Lo/dkv;)Landroid/os/Handler;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dkv;->e:Landroid/os/Handler;

    return-object v0
.end method

.method private static declared-synchronized a()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dkv;

    monitor-enter v1

    .line 335
    :try_start_0
    sget-object v0, Lo/dkv;->a:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method static synthetic b()Ljava/lang/Object;
    .locals 1

    .line 38
    invoke-static {}, Lo/dkv;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/dkv;Ljava/util/List;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lo/dkv;->c(Ljava/util/List;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V

    return-void
.end method

.method public static c()Lo/dkv;
    .locals 2

    .line 56
    sget-object v0, Lo/dkv;->b:Lo/dkv;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 57
    new-instance v0, Lo/dkv;

    invoke-direct {v0}, Lo/dkv;-><init>()V

    sput-object v0, Lo/dkv;->b:Lo/dkv;

    .line 59
    :cond_0
    sget-object v0, Lo/dkv;->b:Lo/dkv;

    return-object v0
.end method

.method static synthetic c(Lo/dkv;)Lo/dkw;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dkv;->c:Lo/dkw;

    return-object v0
.end method

.method private c(Ljava/util/List;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;>;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V"
        }
    .end annotation

    .line 339
    const/4 v4, 0x0

    .line 340
    const/4 v5, -0x1

    .line 341
    const/4 v6, 0x1

    .line 342
    const/4 v7, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_5

    .line 343
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getPriority()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getPriority()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 344
    const/4 v0, 0x0

    if-ne v0, v7, :cond_1

    .line 345
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getSuspend()I

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_4

    .line 347
    add-int/lit8 v0, v7, 0x1

    invoke-interface {p1, v0, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 348
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 349
    invoke-static {}, Lo/dad;->c()Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 350
    invoke-static {}, Lo/dad;->c()Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 352
    :cond_0
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferFileInfos FILE_TRANSFER_SUSPENDED===="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 353
    const/4 v4, 0x1

    .line 354
    goto/16 :goto_2

    .line 357
    :cond_1
    invoke-interface {p1, v7, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 358
    const/4 v4, 0x1

    .line 359
    goto/16 :goto_2

    .line 361
    :cond_2
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getPriority()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getPriority()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 362
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 363
    move v5, v7

    goto :goto_1

    .line 365
    :cond_3
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v1

    if-ne v0, v1, :cond_4

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getTaskType()I

    move-result v0

    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getTaskType()I

    move-result v1

    if-ne v0, v1, :cond_4

    .line 366
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getSuspend()I

    move-result v6

    .line 367
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 368
    invoke-virtual {p2, v6}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 369
    invoke-interface {p1, v7, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 370
    const/4 v4, 0x1

    .line 371
    goto :goto_2

    .line 342
    :cond_4
    :goto_1
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 376
    :cond_5
    :goto_2
    if-nez v4, :cond_7

    .line 377
    const/4 v0, -0x1

    if-ne v0, v5, :cond_6

    .line 378
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 380
    :cond_6
    add-int/lit8 v0, v5, 0x1

    invoke-interface {p1, v0, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 384
    :cond_7
    :goto_3
    return-void
.end method

.method static synthetic e(Lo/dkv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dkv;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic e()Ljava/util/List;
    .locals 1

    .line 38
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    return-object v0
.end method

.method private e(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V
    .locals 6

    .line 176
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x4

    if-ne v1, v0, :cond_0

    .line 177
    move-object v4, p2

    check-cast v4, Lo/djv;

    .line 179
    const-string v0, "no device connected"

    const v1, 0x186a1

    :try_start_0
    invoke-interface {v4, v1, v0}, Lo/djv;->onFailure(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 182
    goto :goto_0

    .line 180
    :catch_0
    move-exception v5

    .line 181
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V
    .locals 8

    .line 70
    invoke-static {}, Lo/dkv;->a()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 71
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile \u8fdb\u5165\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 73
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 74
    invoke-static {}, Lo/dlg;->c()Lo/dlg;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dlg;->c(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V

    .line 76
    :cond_0
    invoke-direct {p0, p1, p2}, Lo/dkv;->e(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V

    .line 77
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    monitor-exit v6

    return-void

    .line 89
    :cond_1
    :try_start_1
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_5

    .line 90
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_2

    .line 94
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferFileInfo\'s type is not rela sleep!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    monitor-exit v6

    return-void

    .line 98
    :cond_2
    :try_start_2
    invoke-virtual {p1, p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setCallback(Ljava/lang/Object;)V

    .line 99
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFile transferFileInfo.getCallback() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getCallback()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " transferFileInfo.getType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    invoke-static {}, Lo/dkq;->e()Ljava/util/Timer;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    invoke-static {}, Lo/dkq;->c()Ljava/util/TimerTask;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    .line 103
    :cond_3
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    invoke-static {v0}, Lo/dkq;->c(Ljava/util/Timer;)V

    .line 104
    new-instance v0, Lo/dkv$3;

    invoke-direct {v0, p0}, Lo/dkv$3;-><init>(Lo/dkv;)V

    invoke-static {v0}, Lo/dkq;->c(Ljava/util/TimerTask;)V

    .line 139
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Timer start!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dkq;->a(I)V

    .line 141
    invoke-static {}, Lo/dkq;->e()Ljava/util/Timer;

    move-result-object v0

    invoke-static {}, Lo/dkq;->c()Ljava/util/TimerTask;

    move-result-object v1

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2710

    invoke-virtual/range {v0 .. v5}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    .line 145
    :cond_4
    iget-object v0, p0, Lo/dkv;->c:Lo/dkw;

    iget-object v1, p0, Lo/dkv;->h:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, p1, v1}, Lo/dkw;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto/16 :goto_0

    .line 147
    :cond_5
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFile size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/dkv;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/16 v1, 0xc8

    if-ne v1, v0, :cond_7

    .line 151
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferFileInfo\'s type is not rela sleep ,and need improve priortiy!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_6

    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getSuspend()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_6

    .line 153
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getPriority()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_6

    .line 154
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferFileInfo\'s type is not rela sleep ,and the priortiy is improved!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    .line 156
    invoke-static {}, Lo/dad;->c()Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    :cond_6
    monitor-exit v6

    return-void

    .line 162
    :cond_7
    :try_start_3
    invoke-virtual {p1, p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setCallback(Ljava/lang/Object;)V

    .line 163
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getFile transferFileInfo.getCallback() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getCallback()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " transferFileInfo.getType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    sget-object v0, Lo/dkv;->d:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Lo/dkv;->c(Ljava/util/List;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V

    .line 167
    :goto_0
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile \u9000\u51fa\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_8

    .line 169
    invoke-static {}, Lo/dlg;->c()Lo/dlg;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/dlg;->c(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 171
    :cond_8
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 172
    :goto_1
    return-void
.end method
