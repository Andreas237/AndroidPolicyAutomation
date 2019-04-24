.class public Lo/dlg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dlg$e;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;>;"
        }
    .end annotation
.end field

.field private static b:Lo/dlg;

.field private static final e:Ljava/lang/Object;


# instance fields
.field private c:Landroid/os/Handler;

.field private d:Lo/dlh;

.field private f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lo/dlg;->a:Ljava/util/List;

    .line 31
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dlg;->e:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlg;->d:Lo/dlh;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlg;->c:Landroid/os/Handler;

    .line 83
    new-instance v0, Lo/dlg$4;

    invoke-direct {v0, p0}, Lo/dlg$4;-><init>(Lo/dlg;)V

    iput-object v0, p0, Lo/dlg;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 50
    invoke-static {}, Lo/dlh;->a()Lo/dlh;

    move-result-object v0

    iput-object v0, p0, Lo/dlg;->d:Lo/dlh;

    .line 51
    new-instance v2, Landroid/os/HandlerThread;

    const-string v0, "HWFileTransferTaskQueue"

    invoke-direct {v2, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 52
    invoke-virtual {v2}, Landroid/os/HandlerThread;->start()V

    .line 53
    new-instance v0, Lo/dlg$e;

    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dlg$e;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dlg;->c:Landroid/os/Handler;

    .line 54
    return-void
.end method

.method private static declared-synchronized a()Ljava/lang/Object;
    .locals 3

    const-class v1, Lo/dlg;

    monitor-enter v1

    .line 140
    :try_start_0
    sget-object v0, Lo/dlg;->e:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private a(Ljava/util/List;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;>;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V"
        }
    .end annotation

    .line 144
    const/4 v2, 0x0

    .line 145
    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 146
    invoke-virtual {p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 147
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 148
    invoke-interface {p1, v3, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 149
    const/4 v2, 0x1

    .line 150
    goto :goto_1

    .line 145
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 153
    :cond_1
    :goto_1
    if-nez v2, :cond_2

    .line 154
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 156
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/dlg;)Landroid/os/Handler;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/dlg;->c:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic b()Ljava/lang/Object;
    .locals 1

    .line 25
    invoke-static {}, Lo/dlg;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lo/dlg;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/dlg;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method public static c()Lo/dlg;
    .locals 2

    .line 43
    sget-object v0, Lo/dlg;->b:Lo/dlg;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 44
    new-instance v0, Lo/dlg;

    invoke-direct {v0}, Lo/dlg;-><init>()V

    sput-object v0, Lo/dlg;->b:Lo/dlg;

    .line 46
    :cond_0
    sget-object v0, Lo/dlg;->b:Lo/dlg;

    return-object v0
.end method

.method static synthetic d()Ljava/util/List;
    .locals 1

    .line 25
    sget-object v0, Lo/dlg;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic d(Lo/dlg;)Lo/dlh;
    .locals 1

    .line 25
    iget-object v0, p0, Lo/dlg;->d:Lo/dlh;

    return-object v0
.end method


# virtual methods
.method public c(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V
    .locals 6

    .line 57
    invoke-static {}, Lo/dlg;->a()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 58
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile \u8fdb\u5165\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 60
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no aw70 device connected"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    monitor-exit v4

    return-void

    .line 64
    :cond_0
    :try_start_1
    sget-object v0, Lo/dlg;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 65
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    invoke-virtual {p1, p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setCallback(Ljava/lang/Object;)V

    .line 68
    const-string v0, "HWFileTransferTaskAW70Queue"

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

    .line 69
    sget-object v0, Lo/dlg;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    iget-object v0, p0, Lo/dlg;->d:Lo/dlh;

    iget-object v1, p0, Lo/dlg;->f:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, p1, v1}, Lo/dlh;->b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 73
    :cond_1
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile size != 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    invoke-virtual {p1, p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setCallback(Ljava/lang/Object;)V

    .line 75
    const-string v0, "HWFileTransferTaskAW70Queue"

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

    .line 77
    sget-object v0, Lo/dlg;->a:Ljava/util/List;

    invoke-direct {p0, v0, p1}, Lo/dlg;->a(Ljava/util/List;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V

    .line 79
    :goto_0
    const-string v0, "HWFileTransferTaskAW70Queue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getFile \u9000\u51fa\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 81
    :goto_1
    return-void
.end method
