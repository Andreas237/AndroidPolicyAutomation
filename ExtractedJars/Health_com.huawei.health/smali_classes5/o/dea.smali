.class public Lo/dea;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Lo/ddm;>;"
        }
    .end annotation
.end field

.field private static g:Lo/dea;

.field private static final o:Ljava/lang/Object;


# instance fields
.field public final a:Lo/cyb;

.field b:Lo/yc;

.field private c:Landroid/content/Context;

.field e:Lo/cxk;

.field private f:Landroid/os/HandlerThread;

.field private h:Lo/ddg;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation
.end field

.field private k:Lo/cys;

.field private l:Lo/yc;

.field private m:Landroid/os/Handler;

.field private n:Lo/cxx;

.field private p:Lo/ddx;

.field private r:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 93
    const/4 v0, 0x0

    sput-object v0, Lo/dea;->g:Lo/dea;

    .line 103
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 336
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/dea;->o:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dea;->k:Lo/cys;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/dea;->i:Ljava/util/List;

    .line 134
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    iput-object v0, p0, Lo/dea;->e:Lo/cxk;

    .line 137
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dea;->l:Lo/yc;

    .line 551
    new-instance v0, Lo/dea$5;

    invoke-direct {v0, p0}, Lo/dea$5;-><init>(Lo/dea;)V

    iput-object v0, p0, Lo/dea;->b:Lo/yc;

    .line 1722
    new-instance v0, Lo/dea$1;

    invoke-direct {v0, p0}, Lo/dea$1;-><init>(Lo/dea;)V

    iput-object v0, p0, Lo/dea;->n:Lo/cxx;

    .line 2499
    new-instance v0, Lo/dea$2;

    invoke-direct {v0, p0}, Lo/dea$2;-><init>(Lo/dea;)V

    iput-object v0, p0, Lo/dea;->r:Landroid/content/BroadcastReceiver;

    .line 2571
    new-instance v0, Lo/dea$7;

    invoke-direct {v0, p0}, Lo/dea$7;-><init>(Lo/dea;)V

    iput-object v0, p0, Lo/dea;->a:Lo/cyb;

    .line 162
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    .line 163
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Init BTSDK."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 165
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    iput-object v0, p0, Lo/dea;->k:Lo/cys;

    .line 166
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    iget-object v1, p0, Lo/dea;->n:Lo/cxx;

    invoke-virtual {v0, v1}, Lo/cys;->b(Lo/cxx;)V

    .line 178
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dea;->h:Lo/ddg;

    .line 179
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "save_dms_data"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/dea;->f:Landroid/os/HandlerThread;

    .line 180
    iget-object v0, p0, Lo/dea;->f:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 181
    new-instance v0, Landroid/os/Handler;

    iget-object v1, p0, Lo/dea;->f:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lo/dea;->m:Landroid/os/Handler;

    .line 184
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 185
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to find last active device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 187
    invoke-direct {p0}, Lo/dea;->m()V

    .line 190
    invoke-direct {p0}, Lo/dea;->t()Ljava/util/List;

    move-result-object v5

    .line 191
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 192
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Find active device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 193
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lo/dea;->d(Ljava/util/List;Z)V

    .line 198
    :cond_0
    invoke-direct {p0}, Lo/dea;->o()V

    .line 201
    iget-object v0, p0, Lo/dea;->e:Lo/cxk;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 202
    iget-object v0, p0, Lo/dea;->e:Lo/cxk;

    iget-object v1, p0, Lo/dea;->a:Lo/cyb;

    invoke-virtual {v0, v1}, Lo/cxk;->d(Lo/cyb;)V

    .line 204
    :cond_1
    return-void
.end method

.method private a(I)I
    .locals 1

    .line 3067
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 3082
    :pswitch_0
    const/4 v0, 0x1

    return v0

    .line 3084
    :goto_0
    :pswitch_1
    const/4 v0, -0x1

    return v0

    :pswitch_data_0
    .packed-switch -0x2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic a(Lo/dea;)Lo/cys;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lo/dea;
    .locals 4

    .line 339
    sget-object v2, Lo/dea;->o:Ljava/lang/Object;

    monitor-enter v2

    .line 340
    :try_start_0
    sget-object v0, Lo/dea;->g:Lo/dea;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 341
    new-instance v0, Lo/dea;

    invoke-direct {v0}, Lo/dea;-><init>()V

    sput-object v0, Lo/dea;->g:Lo/dea;

    .line 343
    :cond_0
    sget-object v0, Lo/dea;->g:Lo/dea;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 344
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 8

    .line 1669
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter reportConnectFail()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1671
    const/4 v5, 0x4

    .line 1672
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v5}, Lo/ddz;->d(Ljava/lang/String;I)V

    .line 1674
    invoke-virtual {p1, v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1677
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v6

    .line 1678
    invoke-direct {p0, v6}, Lo/dea;->f(Ljava/lang/String;)I

    move-result v7

    .line 1679
    const/4 v0, -0x1

    if-eq v0, v7, :cond_0

    .line 1680
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Update DeviceInfo state"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1681
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1685
    :cond_0
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1687
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1}, Lo/cys;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1688
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->a(Ljava/lang/String;)V

    .line 1690
    :cond_1
    return-void
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
    .locals 8

    .line 1553
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter handleDeviceUnequalActiveDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1557
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dea;->c(Ljava/lang/String;)I

    move-result v5

    .line 1558
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "activeDeviceIndex = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1560
    const/4 v0, -0x1

    if-eq v0, p2, :cond_3

    .line 1562
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v6

    .line 1563
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/ddz;->b(Ljava/lang/String;I)V

    .line 1564
    const/4 v0, -0x1

    if-ne v0, v6, :cond_1

    const/4 v0, -0x1

    if-eq v0, v5, :cond_1

    .line 1565
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "currentProductType is unknown."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1567
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v6

    .line 1568
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Lo/ddz;->b(Ljava/lang/String;I)V

    .line 1569
    const/4 v0, -0x1

    if-ne v0, v6, :cond_0

    .line 1571
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "List has this device but the product type is unknown."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1572
    return-void

    .line 1576
    :cond_0
    invoke-virtual {p1, v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1579
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1580
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v7

    .line 1581
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1582
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device name changed with name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1583
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 1585
    invoke-direct {p0}, Lo/dea;->p()V

    .line 1588
    :cond_2
    goto :goto_0

    .line 1590
    :cond_3
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "List do not has this device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1591
    return-void

    .line 1595
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v6

    .line 1596
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Wanted Device Identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v6}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1599
    const/4 v0, -0x1

    if-ne v0, v5, :cond_4

    const/4 v0, -0x1

    if-eq v0, p2, :cond_4

    .line 1600
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "activeDeviceIndex do not exist and deviceInfoIndex exist."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1602
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1603
    invoke-direct {p0, p1}, Lo/dea;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1604
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 1606
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to set active device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1607
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->b(Ljava/lang/String;)V

    .line 1609
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to set current device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1610
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1}, Lo/cys;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_1

    .line 1614
    :cond_4
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v7

    .line 1615
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Active Device Identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v7}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1617
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 1619
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "active is unequal with wanted device so set active info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1621
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1623
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1628
    :cond_5
    :goto_1
    invoke-static {v6, v6}, Lo/ddz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1630
    const/4 v0, 0x2

    invoke-static {v6, v0}, Lo/ddz;->d(Ljava/lang/String;I)V

    .line 1633
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1634
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1638
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceModel(Ljava/lang/String;)V

    .line 1640
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getbTversion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setbTversion(Ljava/lang/String;)V

    .line 1642
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSoft_version()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setSoft_version(Ljava/lang/String;)V

    .line 1644
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 1646
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1649
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x2

    if-ne v1, v0, :cond_6

    .line 1651
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1652
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0}, Lo/cys;->e()V

    .line 1658
    :cond_6
    invoke-direct {p0}, Lo/dea;->p()V

    .line 1660
    invoke-direct {p0}, Lo/dea;->n()V

    .line 1662
    invoke-direct {p0, p1}, Lo/dea;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1663
    return-void
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;IZ)V
    .locals 6

    .line 890
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-direct {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;-><init>()V

    invoke-static {v0, v1}, Lo/ddz;->a(Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 894
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dea;->f(Ljava/lang/String;)I

    move-result v5

    .line 895
    const/4 v0, -0x1

    if-ne v0, v5, :cond_0

    .line 896
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "index = -1, updateUsedDeviceActiveStatus"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 898
    :cond_0
    invoke-direct {p0, p1}, Lo/dea;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 899
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 901
    invoke-direct {p0}, Lo/dea;->p()V

    .line 904
    :goto_0
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 906
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1, p3}, Lo/cys;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Z)V

    .line 908
    :cond_1
    return-void
.end method

.method private a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 12

    .line 2098
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 2099
    if-eqz v5, :cond_0

    .line 2100
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device service id list info send timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2101
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto/16 :goto_1

    .line 2103
    :cond_0
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cxo;->k(Landroid/content/Context;[B)Ljava/util/List;

    move-result-object v6

    .line 2104
    const/4 v0, 0x0

    if-eq v0, v6, :cond_4

    .line 2106
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0, v6}, Lo/cxo;->e(Landroid/content/Context;Ljava/util/List;)Lo/cye;

    move-result-object v7

    .line 2107
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 2109
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->b(Ljava/lang/String;)I

    move-result v8

    .line 2110
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2111
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 2112
    const/16 v0, 0xa

    if-ne v0, v8, :cond_1

    const-string v0, "73617766697368"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "372E312E31"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2113
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "refresh."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2114
    const-string v11, "0103814E020101030C040708090A0D0E1011121314020107030B01050708090A0E1013161502010A030301090A02010C03010102011603030103070201170306010406070B0C02011903010102011B030101"

    .line 2115
    invoke-static {v11}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/cye;->a([B)V

    .line 2116
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v7, v0}, Lo/cye;->a(I)V

    .line 2119
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2120
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 2121
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Start to get device command id list info.Command\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Lo/cye;->g()I

    move-result v4

    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Lo/cye;->h()I

    move-result v4

    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Lo/cye;->c()[B

    move-result-object v4

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2122
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v7}, Lo/cys;->a(Lo/cye;)V

    .line 2124
    :cond_2
    goto :goto_0

    .line 2125
    :cond_3
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "btDeviceCommand is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2127
    :goto_0
    goto :goto_1

    .line 2128
    :cond_4
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device command id list info fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2130
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2133
    :goto_1
    return-void
.end method

.method private a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/lang/String;)V
    .locals 9

    .line 1170
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "active device mac address "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1171
    invoke-virtual {p1, p2}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 1173
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1174
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "OTA update, other command can\'t send..."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1175
    return-void

    .line 1178
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ServiceID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " CommandID = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1181
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dea;->k(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 1183
    new-instance v6, Lo/cye;

    invoke-direct {v6}, Lo/cye;-><init>()V

    .line 1186
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataLen()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 1188
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1190
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v0

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1191
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1193
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v8

    .line 1194
    invoke-virtual {v7, v8}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 1195
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "command data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v4

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1196
    goto :goto_0

    .line 1197
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "command data is null, if not OTA, data incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1201
    :goto_0
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 1204
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lo/cye;->a([B)V

    .line 1206
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v6, v0}, Lo/cye;->a(I)V

    .line 1208
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedAck()Z

    move-result v0

    invoke-virtual {v6, v0}, Lo/cye;->b(Z)V

    .line 1210
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getPriority()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cye;->b(I)V

    .line 1212
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v8

    .line 1213
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1215
    invoke-virtual {v6, v8}, Lo/cye;->a(Ljava/lang/String;)V

    .line 1217
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedEncrypt()Z

    move-result v0

    invoke-virtual {v6, v0}, Lo/cye;->d(Z)V

    .line 1219
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cye;->c(I)V

    .line 1221
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v0

    invoke-virtual {v6, v0}, Lo/cye;->f(I)V

    .line 1223
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1224
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v6}, Lo/cys;->a(Lo/cye;)V

    .line 1227
    :cond_2
    return-void
.end method

.method private a(Ljava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 601
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter removeUsedDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 602
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-ne v0, v1, :cond_0

    .line 603
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Parameter is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 604
    return-void

    .line 607
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 608
    invoke-direct/range {p0 .. p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 609
    const/4 v7, 0x0

    :goto_0
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_5

    .line 610
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v8

    .line 611
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v9

    .line 612
    const/4 v10, 0x0

    .line 613
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 614
    invoke-virtual {v12}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v13

    .line 615
    invoke-virtual {v8, v13}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 616
    const/4 v10, 0x1

    .line 617
    goto :goto_2

    .line 619
    :cond_1
    goto :goto_1

    .line 621
    :cond_2
    :goto_2
    if-nez v10, :cond_4

    .line 623
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "wanted remove device identify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v8}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 626
    const/4 v0, -0x1

    invoke-static {v8, v0}, Lo/ddz;->b(Ljava/lang/String;I)V

    .line 628
    const-string v0, ""

    invoke-static {v8, v0}, Lo/ddz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 630
    const/4 v0, 0x3

    invoke-static {v8, v0}, Lo/ddz;->d(Ljava/lang/String;I)V

    .line 634
    const/4 v0, -0x2

    if-eq v0, v9, :cond_3

    .line 635
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Add wanted deleted device into list."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 636
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 639
    :cond_3
    invoke-direct/range {p0 .. p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v11

    monitor-enter v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 640
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Remove Device from list."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 641
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 643
    invoke-direct/range {p0 .. p0}, Lo/dea;->n()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 644
    monitor-exit v11

    goto :goto_3

    :catchall_0
    move-exception v14

    monitor-exit v11

    :try_start_2
    throw v14

    .line 648
    :goto_3
    const/4 v0, -0x2

    if-ne v0, v9, :cond_4

    .line 649
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Save AF500 device remove info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 651
    invoke-direct/range {p0 .. p0}, Lo/dea;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 609
    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 657
    :cond_5
    monitor-exit v6

    goto :goto_4

    :catchall_1
    move-exception v15

    monitor-exit v6

    throw v15

    .line 659
    :goto_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 661
    invoke-direct/range {p0 .. p0}, Lo/dea;->p()V

    .line 662
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 663
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v5}, Lo/cys;->e(Ljava/util/List;)V

    .line 665
    move-object/from16 v0, p0

    invoke-direct {v0, v5}, Lo/dea;->b(Ljava/util/List;)V

    goto :goto_5

    .line 668
    :cond_6
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not need delete device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 670
    :cond_7
    :goto_5
    return-void
.end method

.method static synthetic a(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method private b(I)I
    .locals 1

    .line 3095
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 3101
    :pswitch_0
    const/4 v0, 0x2

    return v0

    .line 3104
    :pswitch_1
    const/4 v0, 0x4

    return v0

    .line 3107
    :pswitch_2
    const/4 v0, 0x3

    return v0

    .line 3109
    :goto_0
    :pswitch_3
    const/4 v0, -0x1

    return v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic b(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 1

    .line 87
    invoke-direct {p0, p1}, Lo/dea;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lo/dea;)Ljava/util/List;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    return-object v0
.end method

.method private b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 9

    .line 852
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter handleSameTypeDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 853
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 854
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleSameTypeDevice null == deviceInfo"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 855
    return-void

    .line 858
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v1

    invoke-static {v0, v1}, Lo/dbh;->d(II)Z

    move-result v5

    .line 859
    if-eqz v5, :cond_3

    .line 860
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 861
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v1

    invoke-static {v0, v1}, Lo/dbh;->d(II)Z

    move-result v8

    .line 862
    if-eqz v8, :cond_1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 863
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 864
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleSameTypeDevice has active aw70 device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 865
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 866
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 867
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->k(Ljava/lang/String;)V

    .line 868
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->d(Ljava/lang/String;)V

    .line 871
    :cond_1
    goto :goto_0

    :cond_2
    goto/16 :goto_2

    .line 873
    :cond_3
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 874
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v1

    invoke-static {v0, v1}, Lo/dbh;->d(II)Z

    move-result v8

    .line 875
    if-nez v8, :cond_4

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 876
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 877
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleSameTypeDevice has active other device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 878
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 879
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 880
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->k(Ljava/lang/String;)V

    .line 881
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->d(Ljava/lang/String;)V

    .line 884
    :cond_4
    goto :goto_1

    .line 886
    :cond_5
    :goto_2
    return-void
.end method

.method private b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 9

    .line 2442
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 2443
    if-eqz v5, :cond_0

    .line 2444
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device activity type info send timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2445
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto/16 :goto_0

    .line 2447
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to handle BT device supported activity type."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2448
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 2449
    invoke-static {p2, v6}, Lo/cxo;->c([BLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Z

    move-result v7

    .line 2450
    if-eqz v7, :cond_3

    .line 2451
    const/4 v0, 0x2

    const/4 v1, 0x5

    invoke-static {v0, v1, p2}, Lo/cxo;->c(II[B)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2452
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 2454
    invoke-static {}, Lo/cxo;->e()Lo/cye;

    move-result-object v8

    .line 2455
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2456
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2457
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get device notification type info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2458
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v8}, Lo/cys;->a(Lo/cye;)V

    .line 2460
    :cond_1
    goto :goto_0

    .line 2462
    :cond_2
    invoke-direct {p0, p1}, Lo/dea;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 2465
    :cond_3
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device activity type info fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2467
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2470
    :goto_0
    return-void
.end method

.method private b(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 2718
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, " ===EMUI===SendDisconnectBroadcastToEMUI..."

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2719
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_2

    .line 2720
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2721
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AndroidWear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2723
    :try_start_0
    new-instance v7, Landroid/content/Intent;

    const-string v0, "com.huawei.iconnect.action.DEVICE_BOND_STATE_CHANGED"

    invoke-direct {v7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2724
    new-instance v8, Landroid/content/ComponentName;

    const-string v0, "com.huawei.iconnect"

    const-string v1, "com.huawei.iconnect.MessageIntentService"

    invoke-direct {v8, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2725
    invoke-virtual {v7, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 2726
    invoke-static {}, Lo/ddv;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2727
    const-string v0, "DEVICE_ID"

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ddv;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_1

    .line 2729
    :cond_0
    const-string v0, "com.huawei.iconnect.extra.DEVICE_MAC_ADDRESS"

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2731
    :goto_1
    const-string v0, "android.bluetooth.device.extra.BOND_STATE"

    const/16 v1, 0xa

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2732
    const-string v0, "com.huawei.iconnect.extra.PACKAGE_NAME"

    const-string v1, "com.huawei.health"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2733
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {v0, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2736
    goto :goto_2

    .line 2734
    :catch_0
    move-exception v7

    .line 2735
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SecurityException :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2741
    :goto_2
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "===EMUI===SendDisconnectBroadcastToEMUI, send BOND_NONE broadcast, curMac = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    .line 2743
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "===EMUI===SendDisconnectBroadcastToEMUI, don\'t need send broadcast for AndroidWear"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2719
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 2746
    :cond_2
    return-void
.end method

.method static synthetic b(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 7

    .line 3138
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAlreadyUpdatedOfBand: strLastTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3139
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3140
    const/4 v0, 0x0

    return v0

    .line 3142
    :cond_0
    invoke-static {p0}, Lo/dea;->e(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v4

    .line 3143
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 3144
    const/4 v0, 0x0

    return v0

    .line 3146
    :cond_1
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    .line 3147
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v5

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0xf731400

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 3148
    const/4 v0, 0x0

    return v0

    .line 3150
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method private c(Ljava/lang/String;)I
    .locals 7

    .line 1272
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getActiveDeviceIndex(String identify)."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1273
    const/4 v5, -0x1

    .line 1274
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1275
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 1276
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    .line 1277
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1278
    move v5, v6

    .line 1279
    goto :goto_1

    .line 1275
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1284
    :cond_1
    :goto_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getActiveDeviceIndex"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1285
    return v5
.end method

.method private c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 6

    .line 932
    new-instance v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 934
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getbTversion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setbTversion(Ljava/lang/String;)V

    .line 935
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 936
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 937
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 938
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 939
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 940
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getmAuthVersion()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setmAuthVersion(I)V

    .line 941
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setAutoDetectSwitchStatus(I)V

    .line 942
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getFootWearPosition()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setFootWearPosition(I)V

    .line 943
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceModel(Ljava/lang/String;)V

    .line 944
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSoft_version()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setSoft_version(Ljava/lang/String;)V

    .line 945
    const-string v0, ""

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 946
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    goto :goto_0

    .line 948
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 950
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDevIdType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDevIdType(I)V

    .line 951
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 952
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getEncryptType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setEncryptType(I)V

    .line 953
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceBTType(I)V

    .line 955
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_3

    .line 956
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 957
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceModel(Ljava/lang/String;)V

    .line 958
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device name:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "devicemodel ="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 959
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    const-string v1, "PORSCHE DESIGN"

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 960
    :cond_2
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 963
    :cond_3
    return-object v5
.end method

.method private c(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 912
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "findWantedSwitchDevice enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 913
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 914
    const/4 v6, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 915
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 916
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 917
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 918
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 919
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "findWantedSwitchDevice find "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 920
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 914
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 923
    :cond_1
    return-object v5
.end method

.method static synthetic c(Lo/dea;)Lo/yc;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/dea;->l:Lo/yc;

    return-object v0
.end method

.method private c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
    .locals 10

    .line 1452
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter handleDeviceEqualActiveDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1454
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    .line 1456
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleDeviceIdentify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1458
    invoke-static {v5, v5}, Lo/ddz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1460
    invoke-static {v5}, Lo/ddz;->b(Ljava/lang/String;)I

    move-result v6

    .line 1462
    const/4 v0, -0x1

    if-ne v0, v6, :cond_1

    .line 1481
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dea;->c(Ljava/lang/String;)I

    move-result v7

    .line 1482
    const/4 v0, -0x1

    if-eq v0, v7, :cond_1

    .line 1483
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1484
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v9

    .line 1485
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9}, Lo/ddz;->b(Ljava/lang/String;I)V

    .line 1487
    const/4 v0, -0x1

    if-ne v0, v9, :cond_0

    .line 1489
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "List has this device but the product type is unknown."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1490
    return-void

    .line 1494
    :cond_0
    invoke-virtual {p1, v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1498
    :cond_1
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v7

    .line 1499
    const-string v0, ""

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1500
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v8

    .line 1501
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "====name3====="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1502
    if-eqz v8, :cond_2

    const-string v0, ""

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1503
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    goto :goto_0

    .line 1505
    :cond_2
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 1509
    :cond_3
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1510
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 1511
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device name changed with name = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1512
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 1514
    invoke-direct {p0}, Lo/dea;->p()V

    .line 1519
    :cond_4
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v8

    .line 1520
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    if-eq v8, v0, :cond_6

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, 0x3

    if-eq v1, v0, :cond_5

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v1, v0, :cond_6

    .line 1521
    :cond_5
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "change type "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1522
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1523
    invoke-direct {p0}, Lo/dea;->p()V

    .line 1526
    :cond_6
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceModel(Ljava/lang/String;)V

    .line 1528
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getbTversion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setbTversion(Ljava/lang/String;)V

    .line 1530
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSoft_version()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setSoft_version(Ljava/lang/String;)V

    .line 1532
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 1535
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1537
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1539
    const/4 v0, 0x2

    invoke-static {v5, v0}, Lo/ddz;->d(Ljava/lang/String;I)V

    .line 1543
    invoke-direct {p0, p1}, Lo/dea;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1544
    return-void
.end method

.method private c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 11

    .line 1968
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_a

    .line 1970
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to check Version Response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1972
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 1973
    if-eqz v5, :cond_0

    .line 1974
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get Version Command send timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1975
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto/16 :goto_1

    .line 1978
    :cond_0
    :try_start_0
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cxo;->b(Landroid/content/Context;[B)Lorg/json/JSONObject;

    move-result-object v6

    .line 1979
    const-string v0, "type"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 1981
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lo/ddz;->b(Ljava/lang/String;I)V

    .line 1983
    const-string v8, ""

    .line 1984
    const-string v0, "device_model"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1985
    const-string v0, "device_model"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 1986
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Lo/ddz;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1988
    :cond_1
    const-string v0, "BT_version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1989
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BT_version"

    .line 1990
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1989
    invoke-static {v0, v1}, Lo/ddz;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1993
    :cond_2
    const-string v0, "device_version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1994
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device_version"

    .line 1995
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1994
    invoke-static {v0, v1}, Lo/ddz;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1997
    :cond_3
    const-string v0, "soft_version"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 1998
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "soft_version"

    .line 1999
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1998
    invoke-static {v0, v1}, Lo/ddz;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 2001
    :cond_4
    const-string v0, "device_name"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2002
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "device_name"

    .line 2003
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2002
    invoke-static {v0, v1}, Lo/ddz;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2006
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v9

    .line 2007
    invoke-static {v9, v9}, Lo/ddz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2008
    const-string v0, "UUID"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2009
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "UUID"

    .line 2010
    invoke-virtual {v6, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 2009
    invoke-static {v0, v1}, Lo/ddz;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 2011
    const-string v0, "UUID"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 2013
    :cond_6
    const-string v0, "force_sn"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2014
    const-string v0, "force_sn"

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDevIdType(I)V

    .line 2019
    :cond_7
    invoke-virtual {p1, v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 2020
    const/4 v0, -0x1

    if-ne v0, v7, :cond_8

    .line 2021
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get Wrong Version Command."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2022
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 2025
    :cond_8
    invoke-static {}, Lo/cxo;->c()Lo/cye;

    move-result-object v10

    .line 2026
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2027
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 2028
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to set device time."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2029
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v10}, Lo/cys;->a(Lo/cye;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2034
    :cond_9
    :goto_0
    goto :goto_1

    .line 2032
    :catch_0
    move-exception v6

    .line 2033
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2037
    :cond_a
    :goto_1
    return-void
.end method

.method static synthetic c(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 87
    invoke-direct {p0, p1}, Lo/dea;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic c(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method static synthetic c(Lo/dea;Ljava/util/List;Z)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->d(Ljava/util/List;Z)V

    return-void
.end method

.method private d(I)I
    .locals 5

    .line 3051
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceClassification() deviceType "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3052
    invoke-direct {p0, p1}, Lo/dea;->a(I)I

    move-result v4

    .line 3053
    const/4 v0, -0x1

    if-ne v0, v4, :cond_0

    .line 3054
    invoke-direct {p0, p1}, Lo/dea;->b(I)I

    move-result v4

    .line 3056
    :cond_0
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceClassification() deviceClassification "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3057
    return v4
.end method

.method static synthetic d(Lo/dea;)Landroid/content/Context;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    return-object v0
.end method

.method private d(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 2224
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->resetDeviceCapability()V

    .line 2227
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 2229
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 2231
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 2233
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 2235
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 2237
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 2239
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 2241
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 2243
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 2245
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 2247
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 2249
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 2254
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 2256
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 2258
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 2260
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWearMessagePush(Z)V

    .line 2264
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 2268
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 2276
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 2278
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 2280
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 2282
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 2284
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 2286
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 2288
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 2290
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 2292
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetUserInfo(Z)V

    .line 2294
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportCoreSleep(Z)V

    .line 2296
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureisSupportHeartRateEnable(Z)V

    .line 2298
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 2300
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 2304
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 2306
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 2308
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 2312
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 2316
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 2318
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 2320
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 2324
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 2326
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 2330
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 2338
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 2340
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 2356
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 2358
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 2360
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 2364
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 2366
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 2368
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 2370
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 2372
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 2374
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 2378
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 2380
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 2382
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSSetParameter(Z)V

    .line 2386
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 2390
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 2392
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 2394
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 2396
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 2398
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 2400
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 2402
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 2404
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 2406
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 2408
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 2410
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 2412
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 2414
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 2418
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 2420
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 2422
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 2425
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPay(Z)V

    .line 2426
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportEsim(Z)V

    .line 2427
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMultiSim(Z)V

    .line 2430
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 2432
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 2434
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportStress(Z)V

    .line 2435
    return-void
.end method

.method private d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 12

    .line 1070
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendConnectStateBroadcast()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1071
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.CONNECTION_STATE_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1072
    const-class v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 1073
    const-string v0, "connect_error_code"

    invoke-static {}, Lo/cyc;->c()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1074
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 1075
    const-string v0, "deviceinfo"

    invoke-virtual {v6, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 1076
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1077
    const-string v0, "wear_device_list_size"

    iget-object v1, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1079
    :cond_0
    invoke-virtual {v5, v6}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1080
    invoke-virtual {p0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v7

    .line 1081
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v8

    .line 1082
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1083
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1085
    invoke-direct {p0, p1}, Lo/dea;->h(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1087
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter aw70 sendConnectStateBroadcast()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1088
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    const-string v1, "deviceUpdateSharedPreferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v9

    .line 1089
    const-string v0, "aw70UpdateCheckTime"

    const-string v1, ""

    invoke-interface {v9, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1090
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AW70 mAppCheckTime:   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1091
    invoke-static {v10}, Lo/dea;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1092
    new-instance v11, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.UPDATE_DEVICE"

    invoke-direct {v11, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1093
    const-string v0, "is_current_device_aw70"

    const/4 v1, 0x1

    invoke-virtual {v11, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1094
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v11, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1096
    :cond_1
    goto :goto_0

    .line 1097
    :cond_2
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1099
    invoke-direct {p0, p1}, Lo/dea;->h(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1100
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    .line 1101
    const v0, 0xf4240

    invoke-static {v0}, Lo/cyc;->e(I)V

    .line 1103
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    const-string v1, "deviceUpdateSharedPreferences"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v9

    .line 1104
    const-string v0, "deviceUpdateCheckTime"

    const-string v1, ""

    invoke-interface {v9, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 1105
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAppCheckTime:   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1106
    invoke-static {v10}, Lo/dea;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1107
    new-instance v11, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.UPDATE_DEVICE"

    invoke-direct {v11, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1108
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v11, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1112
    :cond_3
    :goto_0
    return-void
.end method

.method private d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 9

    .line 2043
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to check GATT Response."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2045
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 2046
    if-eqz v5, :cond_0

    .line 2047
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "GATT Command send timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2048
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto/16 :goto_1

    .line 2054
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 2055
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cxo;->c(Landroid/content/Context;[B)Z

    move-result v6

    goto :goto_0

    .line 2057
    :cond_1
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cxo;->e(Landroid/content/Context;[B)Z

    move-result v6

    .line 2060
    :goto_0
    if-eqz v6, :cond_5

    .line 2062
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->resetDeviceCapability()V

    .line 2064
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_3

    .line 2066
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cxo;->e(Landroid/content/Context;)Lo/cye;

    move-result-object v7

    .line 2067
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2068
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 2069
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Start to get device service id list info. Command = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Lo/cye;->g()I

    move-result v4

    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Lo/cye;->h()I

    move-result v4

    invoke-static {v4}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v7}, Lo/cye;->c()[B

    move-result-object v4

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2070
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v7}, Lo/cys;->a(Lo/cye;)V

    .line 2072
    :cond_2
    goto :goto_1

    .line 2074
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v7

    .line 2075
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Product type = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2076
    const/4 v0, -0x1

    if-eq v0, v7, :cond_4

    .line 2078
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v8

    .line 2079
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0, v7, v8}, Lo/cxv;->c(Landroid/content/Context;ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2083
    :cond_4
    invoke-direct {p0, p1}, Lo/dea;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2084
    goto :goto_1

    .line 2086
    :cond_5
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "GATT Time Set fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2088
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2091
    :goto_1
    return-void
.end method

.method private d(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;Z)V"
        }
    .end annotation

    .line 757
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, p2}, Lo/dea;->b(Ljava/util/List;ZZ)V

    .line 758
    return-void
.end method

.method static synthetic d(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 0

    .line 87
    invoke-direct {p0, p1}, Lo/dea;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    return-void
.end method

.method static synthetic d(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method static synthetic e(Lo/dea;Ljava/lang/String;)I
    .locals 1

    .line 87
    invoke-direct {p0, p1}, Lo/dea;->f(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method static synthetic e(Lo/dea;)Ljava/lang/Object;
    .locals 1

    .line 87
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static e(Ljava/lang/String;)Ljava/util/Date;
    .locals 6

    .line 3160
    const/4 v4, 0x0

    .line 3162
    :try_start_0
    new-instance v5, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMdd"

    invoke-direct {v5, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 3163
    invoke-virtual {v5, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v4

    .line 3167
    goto :goto_0

    .line 3164
    :catch_0
    move-exception v5

    .line 3165
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/text/ParseException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3166
    const/4 v0, 0x0

    return-object v0

    .line 3168
    :goto_0
    return-object v4
.end method

.method private e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 10

    .line 1373
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter addDeviceInfoToList()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1375
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dea;->f(Ljava/lang/String;)I

    move-result v6

    .line 1376
    const/4 v0, -0x1

    if-eq v0, v6, :cond_0

    .line 1377
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Find the same device during add device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1378
    return-void

    .line 1382
    :cond_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1383
    const/4 v7, 0x0

    :goto_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_2

    .line 1384
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1385
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 1386
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1387
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1388
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1389
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "alread has a active device, and is not from user change,so return"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1390
    return-void

    .line 1383
    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1396
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v7

    .line 1397
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "addDeviceIdentify = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, v7}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "device model"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1399
    invoke-static {v7, v7}, Lo/ddz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1400
    const/4 v0, 0x2

    invoke-static {v7, v0}, Lo/ddz;->d(Ljava/lang/String;I)V

    .line 1403
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 1404
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 1413
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v8

    monitor-enter v8

    .line 1414
    :try_start_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1415
    monitor-exit v8

    goto :goto_1

    :catchall_0
    move-exception v9

    monitor-exit v8

    throw v9

    .line 1417
    :goto_1
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 1418
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/4 v1, -0x2

    if-ne v1, v0, :cond_3

    .line 1421
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0}, Lo/cys;->e()V

    goto :goto_2

    .line 1425
    :cond_3
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->b(Ljava/lang/String;)V

    .line 1427
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1}, Lo/cys;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1429
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->h(Ljava/lang/String;)V

    .line 1434
    :cond_4
    :goto_2
    invoke-direct {p0}, Lo/dea;->p()V

    .line 1436
    invoke-direct {p0}, Lo/dea;->n()V

    .line 1438
    invoke-direct {p0, p1}, Lo/dea;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 1439
    return-void
.end method

.method private e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 12

    .line 2140
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 2141
    if-eqz v5, :cond_0

    .line 2142
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device command id list info send timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2143
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto/16 :goto_1

    .line 2146
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 2147
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0, v6}, Lo/cxv;->b(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2148
    invoke-static {}, Lo/cxo;->a()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2149
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 2151
    :cond_1
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0, p2, v6}, Lo/cxo;->e(Landroid/content/Context;[BLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Z

    move-result v7

    .line 2152
    if-eqz v7, :cond_b

    .line 2153
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to handle V2 protocol other capability."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2154
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->b(Ljava/lang/String;)I

    move-result v8

    .line 2155
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2156
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 2157
    const/16 v0, 0xa

    if-ne v0, v8, :cond_2

    const-string v0, "73617766697368"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "372E312E31"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2159
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "leo problem version, reset capability"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2160
    invoke-direct {p0, v6}, Lo/dea;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2163
    :cond_2
    const/16 v0, 0xa

    if-ne v0, v8, :cond_4

    const-string v0, "736177736861726B"

    invoke-virtual {v0, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, "4E5847313250"

    .line 2164
    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "4E4C4731334E"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2166
    :cond_3
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "leo problem version, reset heart rate capability"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2167
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 2170
    :cond_4
    const/4 v0, 0x1

    const/16 v1, 0x14

    invoke-static {v0, v1, p2}, Lo/cxo;->c(II[B)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2171
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "is support Gold card"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2172
    invoke-static {}, Lo/cxo;->f()Lo/cye;

    move-result-object v11

    .line 2173
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2174
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 2175
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get is support gold card"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2176
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v11}, Lo/cys;->a(Lo/cye;)V

    .line 2180
    :cond_5
    const/16 v0, 0x26

    const/4 v1, 0x2

    invoke-static {v0, v1, p2}, Lo/cxo;->c(II[B)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 2181
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "is support auto detect switch status and work mode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2182
    invoke-static {}, Lo/cxo;->i()Lo/cye;

    move-result-object v11

    .line 2183
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2184
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 2185
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get auto detect switch status and work mode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2186
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v11}, Lo/cys;->a(Lo/cye;)V

    .line 2192
    :cond_6
    const/4 v0, 0x1

    const/16 v1, 0x12

    invoke-static {v0, v1, p2}, Lo/cxo;->c(II[B)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2193
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 2195
    invoke-static {}, Lo/cxo;->d()Lo/cye;

    move-result-object v11

    .line 2196
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2197
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 2198
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get device activity type info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2199
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v11}, Lo/cys;->a(Lo/cye;)V

    .line 2201
    :cond_7
    goto :goto_0

    :cond_8
    const/4 v0, 0x2

    const/4 v1, 0x5

    invoke-static {v0, v1, p2}, Lo/cxo;->c(II[B)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2202
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 2204
    invoke-static {}, Lo/cxo;->e()Lo/cye;

    move-result-object v11

    .line 2205
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 2206
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 2207
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get device notification type info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2208
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v11}, Lo/cys;->a(Lo/cye;)V

    .line 2210
    :cond_9
    goto :goto_0

    .line 2211
    :cond_a
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Not supported activity and notification type"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2213
    invoke-direct {p0, p1}, Lo/dea;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2215
    :goto_0
    goto :goto_1

    .line 2216
    :cond_b
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device command id list info fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2218
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2221
    :goto_1
    return-void
.end method

.method private e(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 841
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 842
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 843
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cxk;->d(Ljava/lang/String;)Z

    move-result v7

    .line 844
    if-nez v7, :cond_0

    .line 845
    const-string v0, "01"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "removeBTDeviceInstance Remove bond device fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 848
    :cond_0
    goto :goto_0

    .line 849
    :cond_1
    return-void
.end method

.method static synthetic e(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method private f(Ljava/lang/String;)I
    .locals 4

    .line 1327
    const/4 v2, -0x1

    .line 1328
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1329
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 1330
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1331
    move v2, v3

    .line 1332
    goto :goto_1

    .line 1329
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 1337
    :cond_1
    :goto_1
    return v2
.end method

.method private f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 11

    .line 2805
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter handleHandshakeSuccess()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2807
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/ddz;->d(Ljava/lang/String;Z)V

    .line 2810
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    .line 2811
    const-string v0, ""

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2812
    invoke-virtual {p1, v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 2815
    :cond_0
    invoke-static {v5}, Lo/ddz;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 2816
    invoke-virtual {p1, v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceModel(Ljava/lang/String;)V

    .line 2817
    invoke-static {v5}, Lo/ddz;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 2818
    invoke-virtual {p1, v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setbTversion(Ljava/lang/String;)V

    .line 2819
    invoke-static {v5}, Lo/ddz;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setSoft_version(Ljava/lang/String;)V

    .line 2820
    invoke-static {v5}, Lo/ddz;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 2821
    invoke-static {v5}, Lo/ddz;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 2822
    invoke-virtual {p1, v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setUUID(Ljava/lang/String;)V

    .line 2823
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_1

    .line 2824
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter handleHandshakeSuccess() set Device model :"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2825
    const-string v0, "PORSCHE DESIGN"

    invoke-static {v8, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2826
    const-string v0, "PORSCHE DESIGN"

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 2829
    :cond_1
    invoke-direct {p0, v5}, Lo/dea;->f(Ljava/lang/String;)I

    move-result v10

    .line 2830
    const/4 v0, -0x1

    if-ne v0, v10, :cond_2

    .line 2831
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device List do not has this device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2833
    invoke-direct {p0, p1}, Lo/dea;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 2835
    :cond_2
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Device List has this device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2836
    invoke-direct {p0, v5}, Lo/dea;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2838
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "current Mac Address equals active device Mac address."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2839
    invoke-direct {p0, p1, v10}, Lo/dea;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    goto :goto_0

    .line 2841
    :cond_3
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "pre MacAddress do not equals current Mac address."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2843
    invoke-direct {p0, p1, v10}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 2846
    :goto_0
    return-void
.end method

.method private f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 8

    .line 2890
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter handleGetGoldCard."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2892
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 2893
    if-eqz v5, :cond_0

    .line 2894
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleGetGoldCard  timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2896
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to handle handleGetGoldCard."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2897
    invoke-static {p2}, Lo/cxo;->c([B)Z

    move-result v6

    .line 2898
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 2899
    if-eqz v6, :cond_1

    .line 2900
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, " support Gold!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2901
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    goto :goto_0

    .line 2903
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "not support Gold!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2905
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 2908
    :goto_0
    return-void
.end method

.method static synthetic g(Lo/dea;)Lo/ddx;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/dea;->p:Lo/ddx;

    return-object v0
.end method

.method private g(Ljava/lang/String;)V
    .locals 8

    .line 2780
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setTargetDeviceDisable()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2781
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2782
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "macAddress is NULL"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2783
    return-void

    .line 2785
    :cond_0
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 2786
    const/4 v6, 0x0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_2

    .line 2787
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2789
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2790
    goto :goto_1

    .line 2786
    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 2793
    :cond_2
    :goto_1
    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v7

    monitor-exit v5

    throw v7

    .line 2796
    :goto_2
    invoke-direct {p0}, Lo/dea;->p()V

    .line 2797
    return-void
.end method

.method static synthetic g(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->i(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method private g(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z
    .locals 9

    .line 2978
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 2979
    :try_start_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2980
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode info = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v7, v2, v3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2982
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2983
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode  update work mode in caseForAw70RunMode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2985
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setAutoDetectSwitchStatus(I)V

    .line 2987
    :cond_0
    goto :goto_0

    .line 2989
    :cond_1
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2990
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 2991
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    .line 2992
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2994
    invoke-direct {p0, v7}, Lo/dea;->k(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v5

    return v0

    .line 2996
    :cond_2
    goto :goto_1

    .line 2997
    :cond_3
    monitor-exit v5

    const/4 v0, 0x0

    return v0

    .line 2998
    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8
.end method

.method private h(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V
    .locals 7

    .line 2681
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " ===EMUI===SendConnectBroadcastToEMUI, btDeviceInfo.getDeviceConnectState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2682
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 2683
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-direct {p0, v0}, Lo/dea;->e(Ljava/util/List;)V

    .line 2684
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AndroidWear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2686
    :try_start_0
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.iconnect.action.DEVICE_BOND_STATE_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2687
    new-instance v6, Landroid/content/ComponentName;

    const-string v0, "com.huawei.iconnect"

    const-string v1, "com.huawei.iconnect.MessageIntentService"

    invoke-direct {v6, v0, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 2688
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 2689
    invoke-static {}, Lo/ddv;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2690
    const-string v0, "DEVICE_ID"

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/ddv;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_0

    .line 2692
    :cond_0
    const-string v0, "com.huawei.iconnect.extra.DEVICE_MAC_ADDRESS"

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2695
    :goto_0
    const-string v0, "android.bluetooth.device.extra.BOND_STATE"

    const/16 v1, 0xc

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2696
    const-string v0, "com.huawei.iconnect.extra.PACKAGE_NAME"

    const-string v1, "com.huawei.health"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2697
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {v0, v5}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2700
    goto :goto_1

    .line 2698
    :catch_0
    move-exception v5

    .line 2699
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SecurityException:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v5}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2705
    :goto_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "===EMUI===SendConnectBroadcastToEMUI, send BOND_BONDED broadcast, curMac = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 2707
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "===EMUI===SendConnectBroadcastToEMUI, don\'t need send broadcast for AndroidWear"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2710
    :cond_2
    :goto_2
    return-void
.end method

.method private h(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 8

    .line 2914
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "enter handleAutoDetectSwitchStatusAndWorkMode."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2916
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 2917
    if-eqz v5, :cond_0

    .line 2918
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode  timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    .line 2920
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to handle handleAutoDetectSwitchStatusAndWorkMode."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2921
    invoke-static {p1, p2}, Lo/cxo;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)[Z

    move-result-object v6

    .line 2922
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode  WorkMode = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2923
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    if-nez v0, :cond_2

    .line 2925
    invoke-direct {p0, p1}, Lo/dea;->i(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 2926
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode  WorkMode after caseForAw70BandMode = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 2928
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 2930
    invoke-direct {p0, p1}, Lo/dea;->g(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-void

    .line 2931
    :cond_3
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode  WorkMode after caseForAw70RunMode = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2933
    :cond_4
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v7

    .line 2934
    const/4 v0, 0x0

    aget-boolean v0, v6, v0

    if-eqz v0, :cond_5

    .line 2935
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode support auto detect!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2936
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAutoDetectMode(Z)V

    goto :goto_1

    .line 2938
    :cond_5
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode Not support auto detect!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2939
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAutoDetectMode(Z)V

    .line 2942
    :goto_1
    const/4 v0, 0x1

    aget-boolean v0, v6, v0

    if-eqz v0, :cond_6

    .line 2943
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode support foot wear!"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2944
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportFootWear(Z)V

    goto :goto_2

    .line 2946
    :cond_6
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "AutoDetectSwitchStatusAndWorkMode not support foot wear"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2948
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportFootWear(Z)V

    .line 2951
    :goto_2
    return-void
.end method

.method private i(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 8

    .line 2477
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v1

    invoke-static {v0, v1, p2}, Lo/cxo;->e(Landroid/content/Context;I[B)Z

    move-result v5

    .line 2478
    if-eqz v5, :cond_0

    .line 2479
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device notification type info send timeout."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2480
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 2482
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to handle BT device supported notification type."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2483
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 2484
    invoke-static {p2, v6}, Lo/cxo;->a([BLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)Z

    move-result v7

    .line 2485
    if-eqz v7, :cond_1

    .line 2487
    invoke-direct {p0, p1}, Lo/dea;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    goto :goto_0

    .line 2489
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Get device notification type info fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2491
    invoke-direct {p0, p1}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 2494
    :goto_0
    return-void
.end method

.method static synthetic i(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->h(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method private i(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z
    .locals 9

    .line 2954
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 2955
    :try_start_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2956
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode info = "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v7, v2, v3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2958
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2959
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode  update work mode in caseForAw70BandMode"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2961
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setAutoDetectSwitchStatus(I)V

    .line 2963
    :cond_0
    goto :goto_0

    .line 2965
    :cond_1
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2966
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 2967
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 2968
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getAutoDetectSwitchStatus()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 2970
    invoke-direct {p0, v7}, Lo/dea;->k(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit v5

    return v0

    .line 2972
    :cond_2
    goto :goto_1

    .line 2973
    :cond_3
    monitor-exit v5

    const/4 v0, 0x0

    return v0

    .line 2974
    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8
.end method

.method private i(Ljava/lang/String;)Z
    .locals 8

    .line 1347
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter checkActiveDevice."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1349
    invoke-direct {p0}, Lo/dea;->t()Ljava/util/List;

    move-result-object v6

    .line 1350
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_1

    .line 1351
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    .line 1352
    invoke-virtual {v5, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1353
    const/4 v0, 0x1

    return v0

    .line 1350
    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 1356
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private k(Ljava/lang/String;)I
    .locals 3

    .line 3173
    const/4 v1, 0x3

    .line 3174
    invoke-direct {p0, p1}, Lo/dea;->c(Ljava/lang/String;)I

    move-result v2

    .line 3175
    const/4 v0, -0x1

    if-eq v0, v2, :cond_0

    .line 3176
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v1

    .line 3178
    :cond_0
    return v1
.end method

.method static synthetic k(Lo/dea;)Lo/ddg;
    .locals 1

    .line 87
    iget-object v0, p0, Lo/dea;->h:Lo/ddg;

    return-object v0
.end method

.method static synthetic k(Lo/dea;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 87
    invoke-direct {p0, p1, p2}, Lo/dea;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V

    return-void
.end method

.method private k(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Z
    .locals 7

    .line 3002
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode has already connected device goingDisconnectDevice "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3005
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3006
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3007
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleAutoDetectSwitchStatusAndWorkMode find "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 3008
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 3010
    :cond_0
    goto :goto_0

    .line 3011
    :cond_1
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 3012
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->a(Ljava/lang/String;)V

    .line 3013
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/cys;->c(ZLjava/lang/String;)V

    .line 3014
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cys;->g(Ljava/lang/String;)V

    .line 3016
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method private declared-synchronized l()Ljava/lang/Object;
    .locals 2

    monitor-enter p0

    .line 223
    :try_start_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1
.end method

.method private m()V
    .locals 11

    .line 230
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getUsedDevicesFromStorage()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 232
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    const/16 v1, 0x3e8

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dct;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    .line 233
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 234
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "map is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 235
    return-void

    .line 238
    :cond_0
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 239
    :try_start_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 240
    monitor-exit v6

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 242
    :goto_0
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    .line 243
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 244
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Map$Entry;

    .line 245
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-class v2, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 247
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceConnectState(I)V

    .line 248
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v9

    monitor-enter v9

    .line 249
    :try_start_1
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 250
    monitor-exit v9

    goto :goto_2

    :catchall_1
    move-exception v10

    monitor-exit v9

    throw v10

    .line 251
    :goto_2
    goto :goto_1

    .line 254
    :cond_1
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 255
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "update has device db info with 0."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 256
    const/4 v0, 0x0

    invoke-static {v0}, Lo/ddq;->a(Z)V

    goto :goto_3

    .line 258
    :cond_2
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "update has device db info with 1."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 259
    const/4 v0, 0x1

    invoke-static {v0}, Lo/ddq;->a(Z)V

    .line 261
    :goto_3
    return-void
.end method

.method private n()V
    .locals 6

    .line 1059
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendDeviceListChangeBroadcast."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1060
    new-instance v5, Landroid/content/Intent;

    const-string v0, "com.huawei.bone.action.DEVICE_LIST_CHANGED"

    invoke-direct {v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1061
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1062
    return-void
.end method

.method private o()V
    .locals 5

    .line 207
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 209
    new-instance v2, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.TIMEZONE_CHANGED"

    invoke-direct {v2, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 210
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/dea;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 212
    new-instance v3, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.TIME_SET"

    invoke-direct {v3, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 213
    const-string v0, "android.intent.action.TIME_TICK"

    invoke-virtual {v3, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 214
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/dea;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 216
    new-instance v4, Landroid/content/IntentFilter;

    const-string v0, "android.intent.action.DATE_CHANGED"

    invoke-direct {v4, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/dea;->r:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 219
    :cond_0
    return-void
.end method

.method private p()V
    .locals 5

    .line 302
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setUsedDevicesToStorage()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 303
    iget-object v0, p0, Lo/dea;->m:Landroid/os/Handler;

    new-instance v1, Lo/dea$4;

    invoke-direct {v1, p0}, Lo/dea$4;-><init>(Lo/dea;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 328
    return-void
.end method

.method private q()Z
    .locals 8

    .line 2860
    invoke-direct {p0}, Lo/dea;->u()Ljava/util/List;

    move-result-object v5

    .line 2861
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 2862
    const/4 v6, 0x0

    :goto_0
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 2863
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 2864
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AndroidWear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2865
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "isAndroidWearDeviceConnected HAS android wear device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2866
    const/4 v0, 0x1

    return v0

    .line 2862
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 2870
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "isAndroidWearDeviceConnected NO android wear device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2871
    const/4 v0, 0x0

    return v0
.end method

.method private t()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1292
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getActiveDevicesIndex()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1293
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1294
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1295
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 1296
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1297
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "active device name "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1298
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1295
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1302
    :cond_1
    return-object v5
.end method

.method private u()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 1306
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getConnectedDevicesIndex"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1307
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1308
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1309
    const/4 v6, 0x0

    :goto_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_1

    .line 1310
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    .line 1311
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 1312
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "connected device name "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1313
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1309
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 1317
    :cond_1
    return-object v5
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;"
        }
    .end annotation

    .line 973
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 976
    :try_start_0
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 978
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 979
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 980
    invoke-direct {p0, v8}, Lo/dea;->c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v9

    .line 981
    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 982
    goto :goto_0

    .line 983
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "return getUsedDeviceList() size = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 985
    monitor-exit v5

    return-object v6

    .line 986
    :catchall_0
    move-exception v10

    monitor-exit v5

    throw v10
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    .line 590
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 591
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1}, Lo/cys;->c(Ljava/lang/String;)V

    .line 593
    :cond_0
    return-void
.end method

.method public a(Lo/ddg;)V
    .locals 5

    .line 1025
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter registerDeviceStateCallBack()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1026
    iput-object p1, p0, Lo/dea;->h:Lo/ddg;

    .line 1035
    return-void
.end method

.method public b()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 6

    .line 1005
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getOtherConnectedDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1006
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1007
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 1008
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    .line 1009
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    .line 1010
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1011
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getOtherConnectedDevice device name "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1012
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0

    .line 1007
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1016
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public b(ILjava/lang/String;ILjava/lang/String;)V
    .locals 9

    .line 401
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter connectDeviceDirectly().device is "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v4

    invoke-virtual {v4, p4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 402
    const/4 v0, 0x0

    if-ne v0, p4, :cond_0

    .line 403
    return-void

    .line 406
    :cond_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    if-nez v0, :cond_1

    .line 407
    return-void

    .line 420
    :cond_1
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 422
    const/4 v5, 0x0

    .line 424
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 425
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 427
    move-object v5, v7

    .line 428
    goto :goto_1

    .line 430
    :cond_2
    goto :goto_0

    .line 433
    :cond_3
    :goto_1
    const/4 v0, 0x0

    if-ne v0, v5, :cond_4

    .line 434
    new-instance v5, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;-><init>()V

    .line 435
    invoke-virtual {v5, p2}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 436
    invoke-virtual {v5, p4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceIdentify(Ljava/lang/String;)V

    .line 437
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 438
    invoke-virtual {v5, p3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 439
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 440
    invoke-virtual {v5, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceBTType(I)V

    .line 441
    invoke-direct {p0}, Lo/dea;->l()Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 442
    :try_start_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 443
    monitor-exit v6

    goto :goto_2

    :catchall_0
    move-exception v8

    monitor-exit v6

    throw v8

    .line 445
    :cond_4
    :goto_2
    invoke-direct {p0, v5}, Lo/dea;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;)V

    .line 448
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v6

    .line 450
    invoke-direct {p0, v6}, Lo/dea;->f(Ljava/lang/String;)I

    move-result v7

    .line 452
    const/4 v0, -0x1

    if-ne v0, v7, :cond_5

    .line 453
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "History List do not have active device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 454
    return-void

    .line 457
    :cond_5
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v8

    .line 459
    const/4 v0, 0x1

    if-eq v0, v8, :cond_6

    .line 461
    invoke-static {p4}, Lo/ddz;->f(Ljava/lang/String;)Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->resetDeviceCapability()V

    .line 463
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceActiveState(I)V

    .line 465
    invoke-direct {p0}, Lo/dea;->p()V

    .line 470
    :cond_6
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 472
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x1

    invoke-virtual {v0, v5, v1}, Lo/cys;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;Z)V

    .line 475
    :cond_7
    return-void
.end method

.method public b(ILjava/lang/String;Ljava/util/List;Lo/cxs;Ljava/lang/String;Ljava/lang/String;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/lang/String;Ljava/util/List<Ljava/lang/String;>;Lo/cxs;Ljava/lang/String;Ljava/lang/String;)V"
        }
    .end annotation

    .line 356
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter addDevice()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 358
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 359
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "addDevice goingDisconnectDevice is NOT null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 360
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    move-object/from16 v1, p6

    invoke-virtual {v0, v1}, Lo/cys;->e(Ljava/lang/String;)V

    .line 363
    invoke-direct {p0}, Lo/dea;->t()Ljava/util/List;

    move-result-object v6

    .line 364
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 365
    const/4 v8, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v8, v0, :cond_2

    .line 366
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 367
    const/4 v0, 0x0

    if-ne v0, v9, :cond_0

    .line 368
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "addDevice active device info is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 369
    goto :goto_1

    .line 371
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "addDevice active device "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object v9, v2, v3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->a(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 372
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p6

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "addDevice find Target device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 374
    invoke-interface {v7, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 365
    :cond_1
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 377
    :cond_2
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to send disconnect broadcast to EMUI."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 378
    invoke-direct {p0, v7}, Lo/dea;->b(Ljava/util/List;)V

    .line 381
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to disable corresponding device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 382
    move-object/from16 v0, p6

    invoke-direct {p0, v0}, Lo/dea;->g(Ljava/lang/String;)V

    .line 385
    :cond_3
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 387
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lo/cys;->c(ILjava/lang/String;Ljava/util/List;Lo/cxs;Ljava/lang/String;)V

    .line 390
    :cond_4
    return-void
.end method

.method public b(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 6

    .line 483
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 484
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "---sendOTACommand error, deviceCommand is null---."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 485
    return-void

    .line 488
    :cond_0
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter sendOTACommand() ota business with data = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v4

    invoke-static {v4}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 491
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ddz;->c(Ljava/lang/String;Z)V

    .line 494
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dea;->k(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    .line 496
    new-instance v5, Lo/cye;

    invoke-direct {v5}, Lo/cye;-><init>()V

    .line 499
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/cye;->c(I)V

    .line 501
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/cye;->a([B)V

    .line 503
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getDataContent()[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v5, v0}, Lo/cye;->a(I)V

    .line 505
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedAck()Z

    move-result v0

    invoke-virtual {v5, v0}, Lo/cye;->b(Z)V

    .line 507
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getPriority()I

    move-result v0

    invoke-virtual {v5, v0}, Lo/cye;->b(I)V

    .line 509
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lo/cye;->a(Ljava/lang/String;)V

    .line 511
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getNeedEncrypt()Z

    move-result v0

    invoke-virtual {v5, v0}, Lo/cye;->d(Z)V

    .line 513
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lo/cye;->e(I)V

    .line 515
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 516
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, v5}, Lo/cys;->a(Lo/cye;)V

    .line 519
    :cond_1
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/yc;)V
    .locals 7

    .line 530
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendOTAFileData enter."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 532
    iget-object v0, p0, Lo/dea;->p:Lo/ddx;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 533
    iget-object v0, p0, Lo/dea;->p:Lo/ddx;

    invoke-virtual {v0}, Lo/ddx;->d()V

    .line 534
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dea;->p:Lo/ddx;

    .line 536
    :cond_0
    new-instance v0, Lo/ddx;

    iget-object v1, p0, Lo/dea;->k:Lo/cys;

    invoke-static {p1}, Lo/ddz;->b(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v1, p1, v2}, Lo/ddx;-><init>(Lo/cys;Ljava/lang/String;I)V

    iput-object v0, p0, Lo/dea;->p:Lo/ddx;

    .line 537
    iput-object p6, p0, Lo/dea;->l:Lo/yc;

    .line 538
    const/4 v6, 0x0

    .line 539
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 540
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;

    invoke-virtual {v0, p4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;

    goto :goto_0

    .line 542
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendOTAFileData parameter is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 545
    :goto_0
    const/4 v0, 0x0

    if-ne v0, p5, :cond_2

    .line 546
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo/ddz;->c(Ljava/lang/String;Z)V

    .line 548
    :cond_2
    iget-object v0, p0, Lo/dea;->p:Lo/ddx;

    move-object v1, p2

    move-object v2, p3

    move-object v3, v6

    move v4, p5

    iget-object v5, p0, Lo/dea;->b:Lo/yc;

    invoke-virtual/range {v0 .. v5}, Lo/ddx;->c(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DataOtaParametersV2;ILo/yc;)V

    .line 549
    return-void
.end method

.method public b(Ljava/util/List;ZZ)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;ZZ)V"
        }
    .end annotation

    .line 767
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter setUsedDeviceList()."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 768
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 769
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Parameter is incorrect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 770
    return-void

    .line 774
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 781
    invoke-direct {p0, p1}, Lo/dea;->a(Ljava/util/List;)V

    goto/16 :goto_6

    .line 787
    :cond_1
    invoke-direct {p0, p1}, Lo/dea;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    .line 788
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceInfoList "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 789
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 790
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceInfoList "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 791
    goto :goto_0

    .line 792
    :cond_2
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mDeviceInfoList "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 795
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 796
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 797
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mDeviceInfoList "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 799
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 800
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 801
    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v10}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 802
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 803
    goto :goto_3

    .line 805
    :cond_3
    goto :goto_2

    .line 807
    :cond_4
    :goto_3
    goto/16 :goto_1

    .line 808
    :cond_5
    if-nez p3, :cond_6

    .line 809
    invoke-direct {p0, v6}, Lo/dea;->b(Ljava/util/List;)V

    .line 812
    :cond_6
    invoke-direct {p0, p1}, Lo/dea;->e(Ljava/util/List;)V

    .line 814
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 815
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "index = -1, not find wanted switch device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 816
    return-void

    .line 819
    :cond_7
    iget-object v0, p0, Lo/dea;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cys;->e(Landroid/content/Context;)Lo/cys;

    move-result-object v0

    if-nez p2, :cond_8

    const/4 v1, 0x1

    goto :goto_4

    :cond_8
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Lo/cys;->c(Z)V

    .line 821
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Integer;

    .line 822
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 823
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v10

    .line 825
    const/4 v0, -0x1

    invoke-static {v10, v0}, Lo/ddz;->b(Ljava/lang/String;I)V

    .line 827
    const-string v0, ""

    invoke-static {v10, v0}, Lo/ddz;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 829
    const/4 v0, 0x3

    invoke-static {v10, v0}, Lo/ddz;->d(Ljava/lang/String;I)V

    .line 831
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {p0, v9, v0, p2}, Lo/dea;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;IZ)V

    .line 832
    goto :goto_5

    .line 834
    :cond_9
    :goto_6
    return-void
.end method

.method public b(Lo/ddg;)V
    .locals 5

    .line 1043
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter unRegisterDeviceStateCallBack()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1044
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dea;->h:Lo/ddg;

    .line 1053
    return-void
.end method

.method public b(Z)V
    .locals 8

    .line 2602
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "forceConnectDevice enter"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2603
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 2604
    invoke-direct {p0}, Lo/dea;->t()Ljava/util/List;

    move-result-object v5

    .line 2605
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 2606
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "forceConnectDevice activeDeviceList size "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2607
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/Integer;

    .line 2608
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    iget-object v1, p0, Lo/dea;->i:Ljava/util/List;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lo/cys;->e(Ljava/lang/String;Z)V

    .line 2609
    goto :goto_0

    .line 2611
    :cond_0
    goto :goto_1

    .line 2612
    :cond_1
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "mBTSDKApi is null"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2614
    :goto_1
    return-void
.end method

.method public c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
    .locals 8

    .line 2623
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getDeviceCapability enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2624
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getDeviceCapability mUsedDeviceStatus size = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2625
    sget-object v0, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/ddm;

    .line 2626
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Lo/ddm;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v5}, Lo/ddm;->g()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2627
    invoke-virtual {v5}, Lo/ddm;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/dea;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v1, v0, :cond_0

    .line 2628
    invoke-virtual {v5}, Lo/ddm;->i()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v6

    .line 2629
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-virtual {v0, v6, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v7

    .line 2630
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getDeviceCapability capabilityString = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x2

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2631
    return-object v6

    .line 2634
    :cond_0
    goto :goto_0

    .line 2635
    :cond_1
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getDeviceCapability fail"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2636
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;-><init>()V

    return-object v0
.end method

.method public c(Z)V
    .locals 4

    .line 3115
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3116
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openSystemBluetoothSwitch switchState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3117
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1}, Lo/cys;->a(Z)V

    .line 3119
    :cond_0
    return-void
.end method

.method public d()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .line 2640
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAllConnectedDeviceCapability enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2641
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAllConnectedDeviceCapability mUsedDeviceStatus size = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2642
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 2643
    sget-object v0, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 2644
    invoke-virtual {v6}, Lo/ddm;->k()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2645
    invoke-virtual {v6}, Lo/ddm;->i()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2647
    :cond_0
    goto :goto_0

    .line 2648
    :cond_1
    return-object v4
.end method

.method public d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V
    .locals 10

    .line 1120
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter sendDeviceData()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1121
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 1122
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "deviceCommand is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    return-void

    .line 1126
    :cond_0
    invoke-direct {p0}, Lo/dea;->u()Ljava/util/List;

    move-result-object v5

    .line 1127
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendDeviceData connected devices "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1129
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1130
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getmIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lo/dea;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 1132
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 1134
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 1135
    const/4 v0, 0x1

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 1138
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1139
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v8

    .line 1140
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    .line 1142
    :cond_2
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v8

    .line 1143
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v9

    .line 1146
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getServiceID()I

    move-result v0

    const/16 v1, 0x17

    if-ne v0, v1, :cond_3

    .line 1147
    invoke-virtual {p1}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->getCommandID()I

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_3

    .line 1148
    invoke-direct {p0, p1, v8}, Lo/dea;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/lang/String;)V

    goto :goto_1

    .line 1150
    :cond_3
    invoke-direct {p0, p1, v9}, Lo/dea;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/lang/String;)V

    .line 1152
    :goto_1
    goto/16 :goto_2

    :cond_4
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 1153
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendDeviceData has only one device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1154
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 1155
    if-ltz v6, :cond_5

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v6, v0, :cond_6

    .line 1156
    :cond_5
    return-void

    .line 1158
    :cond_6
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v7

    .line 1159
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendDeviceData has only one device identify "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    invoke-virtual {v3, v7}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1160
    invoke-direct {p0, v7}, Lo/dea;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v1, v0, :cond_7

    .line 1161
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "sendDeviceData connected device is NOT active device"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1162
    return-void

    .line 1164
    :cond_7
    invoke-direct {p0, p1, v7}, Lo/dea;->a(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;Ljava/lang/String;)V

    .line 1167
    :cond_8
    :goto_2
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 5

    .line 2849
    invoke-direct {p0}, Lo/dea;->q()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2850
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2851
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter sendBTDeviceData by asset way with filepath: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2852
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1}, Lo/cys;->f(Ljava/lang/String;)V

    .line 2853
    return-void

    .line 2857
    :cond_0
    return-void
.end method

.method public d(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;>;)V"
        }
    .end annotation

    .line 264
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter setUsedDevicesToStorage(). sync"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 265
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 266
    return-void

    .line 269
    :cond_0
    iget-object v0, p0, Lo/dea;->m:Landroid/os/Handler;

    new-instance v1, Lo/dea$3;

    invoke-direct {v1, p0, p1}, Lo/dea$3;-><init>(Lo/dea;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 296
    return-void
.end method

.method public e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 6

    .line 990
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter getConnectedAW70Device()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 991
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 992
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_1

    .line 993
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    .line 994
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    .line 995
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-static {v0}, Lo/dbh;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 996
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "getConnectedAW70Device device name "

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 997
    iget-object v0, p0, Lo/dea;->i:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    return-object v0

    .line 992
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 1001
    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 5

    .line 2880
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 2881
    const-string v0, "02"

    const-string v1, "HWDeviceMgr"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Enter setFileCallback callback: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2882
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0, p1}, Lo/cys;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 2884
    :cond_0
    return-void
.end method

.method public f()I
    .locals 9

    .line 3025
    invoke-virtual {p0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v4

    .line 3026
    const/4 v5, 0x0

    .line 3028
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConncetedDeviceType() deviceList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3029
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 3030
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 3031
    move-object v5, v8

    .line 3032
    goto :goto_1

    .line 3034
    :cond_0
    goto :goto_0

    .line 3035
    :cond_1
    :goto_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 3036
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/dea;->d(I)I

    move-result v6

    goto :goto_2

    .line 3038
    :cond_2
    const/4 v6, -0x1

    .line 3040
    :goto_2
    const-string v0, "HWDeviceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getConncetedDeviceClassification() deviceClassification "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3041
    return v6
.end method

.method public g()Z
    .locals 4

    .line 3123
    const/4 v2, 0x1

    .line 3125
    const/4 v3, -0x1

    .line 3126
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3127
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0}, Lo/cys;->d()I

    move-result v3

    .line 3130
    :cond_0
    const/4 v0, 0x3

    if-eq v0, v3, :cond_1

    .line 3131
    const/4 v2, 0x0

    .line 3134
    :cond_1
    return v2
.end method

.method public h()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .line 2652
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAllConnectedDeviceCapabilityMap enter"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2653
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAllConnectedDeviceCapabilityMap mUsedDeviceStatus size = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2654
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2655
    sget-object v0, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 2656
    invoke-virtual {v6}, Lo/ddm;->k()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 2657
    invoke-virtual {v6}, Lo/ddm;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/ddm;->i()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2659
    :cond_0
    goto :goto_0

    .line 2660
    :cond_1
    return-object v4
.end method

.method public i()I
    .locals 1

    .line 2754
    iget-object v0, p0, Lo/dea;->k:Lo/cys;

    invoke-virtual {v0}, Lo/cys;->d()I

    move-result v0

    return v0
.end method

.method public k()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation

    .line 2666
    const-string v0, "DEVMGR_SETTING"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "getAllDeviceCapabilityMap mUsedDeviceStatus size = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    sget-object v2, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2667
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 2668
    sget-object v0, Lo/dea;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/ddm;

    .line 2669
    invoke-virtual {v6}, Lo/ddm;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6}, Lo/ddm;->i()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2670
    goto :goto_0

    .line 2671
    :cond_0
    return-object v4
.end method
