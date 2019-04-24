.class public Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;
.super Lo/cwz;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;
    }
.end annotation


# static fields
.field private static final AM16_PRODUCTID:Ljava/lang/String; = "6d5416d9-2167-41df-ab10-c492e152b44f"

.field private static final ERROR_PARAMS:I = 0x1e849

.field private static final MSG_CALIB_OPEN_TIMEOUT:I = 0x1

.field private static final MSG_GAME_OPEN_TIMEOUT:I = 0x3

.field private static final MSG_RELAX_OPEN_TIMEOUT:I = 0x2

.field private static final MSG_STRESS_OPEN_TIMEOUT:I = 0x0

.field private static final STRESS_SWITCH_OPEN_TIMEOUT_DELAY:I = 0x1388

.field private static final TAG:Ljava/lang/String; = "HWHeartRateManager"

.field private static instance:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager; = null

.field private static final lockObject:Ljava/lang/Object;

.field private static mDeviceHeartRateCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static mDevicePressCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static mDeviceStressCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static mSetHeartRateStatusCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private static mSetStressStatusCallbackList:Ljava/util/List; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwbasemgr/IBaseResponseCallback;>;"
        }
    .end annotation
.end field


# instance fields
.field private getRRITime:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private hwDeviceMgr:Lo/dea;

.field private loudspeakerMuteStatus:I

.field private mHandler:Landroid/os/Handler;

.field private mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

.field private mProductId:Ljava/lang/String;

.field private mRelaxAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field mRun:Ljava/lang/Runnable;

.field private mStressAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private mStressCalibAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private mStressHandlerThread:Landroid/os/HandlerThread;

.field private realRri:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private realTime:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private receiverDataStatus:Z

.field private rri:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private rritime:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    .line 67
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    .line 69
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceStressCallbackList:Ljava/util/List;

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    .line 71
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->lockObject:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 107
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->loudspeakerMuteStatus:I

    .line 74
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mHandler:Landroid/os/Handler;

    .line 76
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    .line 78
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    .line 79
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    .line 81
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    .line 696
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$9;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$9;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1199
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$10;

    invoke-direct {v0, p0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$10;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRun:Ljava/lang/Runnable;

    .line 108
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter HWHeartRateManager!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-static {p1}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    .line 111
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "HWHeartRateManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressHandlerThread:Landroid/os/HandlerThread;

    .line 112
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 113
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;-><init>(Landroid/os/Looper;Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    .line 115
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    return-object v0
.end method

.method static synthetic access$100()Ljava/util/List;
    .locals 1

    .line 61
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceStressCallbackList:Ljava/util/List;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$302(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Z)Z
    .locals 0

    .line 61
    iput-boolean p1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->receiverDataStatus:Z

    return p1
.end method

.method private cleanAbortCallback()V
    .locals 6

    .line 535
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    monitor-enter v4

    .line 536
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRelaxAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRelaxAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 537
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove(mRelaxAbortCallback)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 538
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRelaxAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 539
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRelaxAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 542
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressCalibAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressCalibAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 543
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove(mStressCalibAbortCallback)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 544
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressCalibAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 545
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressCalibAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 548
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 549
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remove(mStressAbortCallback)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 550
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 551
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 553
    :cond_2
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 554
    :goto_0
    return-void
.end method

.method private getCurrentConnectedDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 8

    .line 1367
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentConnectedDeviceInfo() enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1368
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v4

    .line 1369
    if-eqz v4, :cond_3

    .line 1370
    invoke-virtual {v4}, Lo/dea;->a()Ljava/util/List;

    move-result-object v5

    .line 1371
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_2

    .line 1372
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCurrentConnectedDeviceInfo() deviceInfoList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1373
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1374
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    .line 1375
    return-object v7

    .line 1377
    :cond_0
    goto :goto_0

    .line 1378
    :cond_1
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentConnectedDeviceInfo() deviceInfo\'s ActiveState not DeviceActiveState.DEVICE_ACTIVE_ENABLE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1379
    const/4 v0, 0x0

    return-object v0

    .line 1381
    :cond_2
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCurrentConnectedDeviceInfo() deviceInfoList is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    const/4 v0, 0x0

    return-object v0

    .line 1385
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;
    .locals 4

    .line 98
    sget-object v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->lockObject:Ljava/lang/Object;

    monitor-enter v2

    .line 99
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 100
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;

    .line 102
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 103
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private getRelaxAbortCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 505
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$8;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$8;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRelaxAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 530
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRelaxAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private getStressAbortCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 445
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$6;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$6;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 470
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private getStressCalibAbortCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 475
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$7;

    invoke-direct {v0, p0, p1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$7;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressCalibAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 500
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressCalibAbortCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method private getStressCalibFlag(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 679
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getStressCalibFlag"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 681
    const/4 v4, 0x1

    .line 682
    const-string v0, "calibration_flag"

    invoke-virtual {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 683
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 684
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calibrationFlagStr = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 685
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    .line 687
    :cond_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 688
    const-string v0, "type"

    const/4 v1, 0x7

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 689
    const-string v0, "calibration_flag"

    invoke-virtual {v6, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 690
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "stress calib check ret data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 691
    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 692
    return-void
.end method

.method private handRunPostureData(Ljava/util/List;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/dba;>;)V"
        }
    .end annotation

    .line 1127
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handRunPostureData enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1129
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/dba;

    .line 1130
    iget-object v7, v6, Lo/dba;->b:Ljava/util/List;

    .line 1131
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/dba;

    .line 1132
    iget-object v10, v9, Lo/dba;->e:Ljava/util/List;

    .line 1133
    new-instance v11, Lcom/huawei/datatype/RunPostureDataInfo;

    invoke-direct {v11}, Lcom/huawei/datatype/RunPostureDataInfo;-><init>()V

    .line 1134
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/daw;

    .line 1135
    invoke-virtual {v13}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 1137
    :pswitch_0
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handRunPostureData 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1138
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmCadence(I)V

    .line 1139
    goto/16 :goto_3

    .line 1142
    :pswitch_1
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handRunPostureData 4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1143
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmStepLength(I)V

    .line 1144
    goto/16 :goto_3

    .line 1147
    :pswitch_2
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmGroundContactTime(I)V

    .line 1148
    goto/16 :goto_3

    .line 1151
    :pswitch_3
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmGroundImpactAcceleration(I)V

    .line 1152
    goto/16 :goto_3

    .line 1155
    :pswitch_4
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmSwingAngle(I)V

    .line 1156
    goto :goto_3

    .line 1159
    :pswitch_5
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmForeFootStrikePattern(I)V

    .line 1160
    goto :goto_3

    .line 1163
    :pswitch_6
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmWholeFootStrikePattern(I)V

    .line 1164
    goto :goto_3

    .line 1167
    :pswitch_7
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmHindPawStrikePattern(I)V

    .line 1168
    goto :goto_3

    .line 1171
    :pswitch_8
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v11, v0}, Lcom/huawei/datatype/RunPostureDataInfo;->setmEversionExcursion(I)V

    .line 1172
    goto :goto_3

    .line 1175
    :pswitch_9
    invoke-virtual {v13}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    int-to-long v14, v0

    .line 1176
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "time = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1177
    .line 1182
    :goto_3
    goto/16 :goto_2

    .line 1183
    :cond_0
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "rpinfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1184
    invoke-interface {v4, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1185
    goto/16 :goto_1

    .line 1186
    :cond_1
    goto/16 :goto_0

    .line 1188
    :cond_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    monitor-enter v5

    .line 1189
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1190
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "notificationRunPostureInfo"

    .line 1191
    invoke-static {v4, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 1190
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1193
    :cond_3
    monitor-exit v5

    goto :goto_4

    :catchall_0
    move-exception v16

    monitor-exit v5

    throw v16

    .line 1194
    :goto_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
    .end packed-switch
.end method

.method private isClose(I)Z
    .locals 1

    .line 570
    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    const/16 v0, 0xa

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_0

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    const/16 v0, 0xb

    if-eq p1, v0, :cond_0

    const/16 v0, 0xe

    if-ne p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private listToArryOfRRI(Ljava/util/List;)[I
    .locals 3

    .line 1359
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    .line 1360
    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_0

    .line 1361
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, v1, v2

    .line 1360
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 1363
    :cond_0
    return-object v1
.end method

.method private parseRri(Lorg/json/JSONObject;)V
    .locals 7

    .line 558
    const-string v0, "rri"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 559
    const-string v0, "listrri"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 560
    const-string v0, "listtime"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 561
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 562
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 564
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    invoke-direct {p0, v5}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stringToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 565
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    invoke-direct {p0, v6}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stringToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 566
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "arrayRri size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , arraytime size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 567
    return-void
.end method

.method private processCalibAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 630
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress calib abort"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 631
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 632
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 633
    return-void
.end method

.method private processCalibOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 613
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress calib open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 614
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 616
    const-string v0, "score"

    const-string v1, "score"

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 617
    const-string v0, "max_duration"

    const-string v1, "max_duration"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 620
    goto :goto_0

    .line 618
    :catch_0
    move-exception v5

    .line 619
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processCalibOpen calib open fail,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 621
    :goto_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 623
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 624
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 626
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {p0, v0, p2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 627
    return-void
.end method

.method private processGameAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 673
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GAME_ABORT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 674
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/16 v1, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 675
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 676
    return-void
.end method

.method private processGameOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 658
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GAME_OPEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 659
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 661
    const-string v0, "max_duration"

    const-string v1, "max_duration"

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 664
    goto :goto_0

    .line 662
    :catch_0
    move-exception v5

    .line 663
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processGameOpen game open fail,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 665
    :goto_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 666
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 667
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x3

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 669
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {p0, v0, p2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 670
    return-void
.end method

.method private processRelaxAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 652
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RELAX_ABORT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 653
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/16 v1, 0xb

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 654
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 655
    return-void
.end method

.method private processRelaxOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 636
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RELAX_OPEN"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 637
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 639
    const-string v0, "max_duration"

    const-string v1, "max_duration"

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 642
    goto :goto_0

    .line 640
    :catch_0
    move-exception v5

    .line 641
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processRelaxOpen relax open fail, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 643
    :goto_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/16 v1, 0x9

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 645
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 646
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 648
    :cond_0
    const/4 v0, 0x3

    invoke-virtual {p0, v0, p2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 649
    return-void
.end method

.method private processStressAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 607
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress abort"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 608
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 609
    const/4 v0, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 610
    return-void
.end method

.method private processStressOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 591
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress open"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 592
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 594
    const-string v0, "max_duration"

    const-string v1, "max_duration"

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 597
    goto :goto_0

    .line 595
    :catch_0
    move-exception v5

    .line 596
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processStressOpen stress open fail,"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 598
    :goto_0
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 600
    const/4 v0, 0x3

    invoke-virtual {p0, v0, p2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 602
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mMyStressHandler:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;

    const/4 v1, 0x0

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$MyStressHandler;->sendEmptyMessageDelayed(IJ)Z

    .line 604
    :cond_0
    return-void
.end method

.method private sendRefreshHeartRateBroadcast(Lcom/huawei/datatype/HeartRateInfo;)V
    .locals 6

    .line 1212
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter sendRefreshHeartRateBroadcast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1214
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->getCurrentDeviceInfo(Lo/dea;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v4

    .line 1215
    if-eqz v4, :cond_0

    .line 1216
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_0

    .line 1217
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->receiverDataStatus:Z

    .line 1218
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRun:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1219
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mHandler:Landroid/os/Handler;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mRun:Ljava/lang/Runnable;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1220
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendUpdateHeartRateBroadcast."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1221
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 1222
    const-string v0, "com.huawei.bone.action.HEART_RATE_REFRESH"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1223
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1224
    const-string v0, "HEART_RATE"

    invoke-virtual {p1}, Lcom/huawei/datatype/HeartRateInfo;->getHr_info()I

    move-result v1

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1225
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/dac;->a:Ljava/lang/String;

    invoke-virtual {v0, v5, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 1227
    :cond_0
    return-void
.end method

.method private stringToList(Ljava/lang/String;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 577
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 578
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 579
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 581
    move-object v3, v2

    array-length v4, v3

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    .line 582
    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 581
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 586
    :cond_0
    return-object v1
.end method


# virtual methods
.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 1290
    const/16 v0, 0x19

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 24

    .line 875
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getResult(): "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 876
    invoke-static/range {p2 .. p2}, Lo/daz;->c([B)Z

    move-result v0

    if-nez v0, :cond_15

    .line 877
    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 878
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-ge v1, v0, :cond_14

    .line 879
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    invoke-virtual {v5, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 881
    :try_start_0
    new-instance v0, Lo/daz;

    invoke-direct {v0}, Lo/daz;-><init>()V

    invoke-virtual {v0, v5}, Lo/daz;->d(Ljava/lang/String;)Lo/dba;

    move-result-object v6

    .line 882
    iget-object v7, v6, Lo/dba;->e:Ljava/util/List;

    .line 883
    iget-object v8, v6, Lo/dba;->b:Ljava/util/List;

    .line 884
    const/4 v0, 0x1

    aget-byte v0, p2, v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1a

    .line 887
    :pswitch_0
    const/4 v9, 0x0

    .line 888
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/daw;

    .line 889
    invoke-virtual {v11}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 891
    :sswitch_0
    invoke-virtual {v11}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 892
    .line 897
    :goto_1
    goto :goto_0

    .line 899
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    monitor-enter v10
    :try_end_0
    .catch Lo/day; {:try_start_0 .. :try_end_0} :catch_1

    .line 900
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 901
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "setHeartRateReportStatus"

    invoke-static {v1, v2}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 902
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 904
    :cond_1
    monitor-exit v10

    goto :goto_2

    :catchall_0
    move-exception v12

    monitor-exit v10

    :try_start_2
    throw v12

    .line 906
    :goto_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    monitor-enter v10
    :try_end_2
    .catch Lo/day; {:try_start_2 .. :try_end_2} :catch_1

    .line 907
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 908
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 909
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 911
    :cond_2
    monitor-exit v10

    goto :goto_3

    :catchall_1
    move-exception v13

    monitor-exit v10

    :try_start_4
    throw v13

    .line 913
    :goto_3
    goto/16 :goto_1a

    .line 917
    :pswitch_1
    goto/16 :goto_1a

    .line 921
    :pswitch_2
    move-object/from16 v0, p0

    invoke-direct {v0, v8}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->handRunPostureData(Ljava/util/List;)V

    .line 922
    goto/16 :goto_1a

    .line 926
    :pswitch_3
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 927
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_4
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dba;

    .line 928
    iget-object v12, v11, Lo/dba;->b:Ljava/util/List;

    .line 929
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_5
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/dba;

    .line 931
    iget-object v15, v14, Lo/dba;->e:Ljava/util/List;

    .line 932
    new-instance v16, Lcom/huawei/datatype/HeartRateInfo;

    invoke-direct/range {v16 .. v16}, Lcom/huawei/datatype/HeartRateInfo;-><init>()V

    .line 933
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_6
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/daw;

    .line 934
    invoke-virtual/range {v18 .. v18}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    goto :goto_7

    .line 937
    :sswitch_1
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    move-object/from16 v1, v16

    invoke-virtual {v1, v0}, Lcom/huawei/datatype/HeartRateInfo;->setHr_info(I)V

    .line 938
    goto :goto_7

    .line 942
    :sswitch_2
    invoke-virtual/range {v18 .. v18}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    move-object/from16 v2, v16

    invoke-virtual {v2, v0, v1}, Lcom/huawei/datatype/HeartRateInfo;->setTime_info(J)V

    .line 943
    .line 948
    :goto_7
    goto :goto_6

    .line 949
    :cond_3
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->sendRefreshHeartRateBroadcast(Lcom/huawei/datatype/HeartRateInfo;)V

    .line 950
    move-object/from16 v0, v16

    invoke-interface {v9, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 951
    goto/16 :goto_5

    .line 953
    :cond_4
    goto/16 :goto_4

    .line 955
    :cond_5
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v10

    monitor-enter v10
    :try_end_4
    .catch Lo/day; {:try_start_4 .. :try_end_4} :catch_1

    .line 956
    :try_start_5
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 957
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "notificationHeartRateInfo"

    .line 958
    invoke-static {v9, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 957
    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 960
    :cond_6
    monitor-exit v10

    goto :goto_8

    :catchall_2
    move-exception v19

    monitor-exit v10

    :try_start_6
    throw v19

    .line 962
    :goto_8
    goto/16 :goto_1a

    .line 968
    :pswitch_4
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "orignal data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 970
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/dba;

    .line 971
    iget-object v11, v10, Lo/dba;->b:Ljava/util/List;

    .line 972
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_a
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/dba;

    .line 973
    iget-object v14, v13, Lo/dba;->e:Ljava/util/List;

    .line 974
    new-instance v15, Lcom/huawei/datatype/HeartRateInfo;

    invoke-direct {v15}, Lcom/huawei/datatype/HeartRateInfo;-><init>()V

    .line 975
    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_b
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lo/daw;

    .line 976
    invoke-virtual/range {v17 .. v17}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto/16 :goto_e

    .line 978
    :pswitch_5
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v15, v0}, Lcom/huawei/datatype/HeartRateInfo;->setHrri_info(I)V

    .line 979
    move-object/from16 v18, p0

    monitor-enter v18
    :try_end_6
    .catch Lo/day; {:try_start_6 .. :try_end_6} :catch_1

    .line 982
    :try_start_7
    invoke-virtual {v15}, Lcom/huawei/datatype/HeartRateInfo;->getHrri_info()I

    move-result v0

    if-lez v0, :cond_9

    .line 983
    invoke-virtual {v15}, Lcom/huawei/datatype/HeartRateInfo;->getHrri_info()I

    move-result v0

    const v1, 0x8000

    if-le v0, v1, :cond_7

    .line 984
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    invoke-virtual {v15}, Lcom/huawei/datatype/HeartRateInfo;->getHrri_info()I

    move-result v1

    add-int/lit16 v1, v1, -0x8000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 986
    :cond_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    invoke-virtual {v15}, Lcom/huawei/datatype/HeartRateInfo;->getHrri_info()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 989
    :goto_c
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sub-int/2addr v1, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 990
    invoke-virtual {v15}, Lcom/huawei/datatype/HeartRateInfo;->getHrri_info()I

    move-result v0

    const v1, 0x8000

    if-le v0, v1, :cond_9

    .line 992
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sub-int/2addr v1, v2

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 993
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_8

    .line 994
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    invoke-virtual {v15}, Lcom/huawei/datatype/HeartRateInfo;->getHrri_info()I

    move-result v1

    add-int/lit16 v1, v1, -0x8000

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 996
    :cond_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_9

    .line 998
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x2

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1002
    :cond_9
    monitor-exit v18

    goto :goto_d

    :catchall_3
    move-exception v20

    monitor-exit v18

    :try_start_8
    throw v20

    .line 1003
    :goto_d
    goto :goto_e

    .line 1007
    :pswitch_6
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v15, v0}, Lcom/huawei/datatype/HeartRateInfo;->setHrsqi_info(I)V

    .line 1008
    goto :goto_e

    .line 1011
    :pswitch_7
    invoke-virtual/range {v17 .. v17}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v15, v0, v1}, Lcom/huawei/datatype/HeartRateInfo;->setTime_info(J)V

    .line 1012
    move-object/from16 v18, p0

    monitor-enter v18
    :try_end_8
    .catch Lo/day; {:try_start_8 .. :try_end_8} :catch_1

    .line 1013
    move-object/from16 v0, p0

    :try_start_9
    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    invoke-virtual {v15}, Lcom/huawei/datatype/HeartRateInfo;->getTime_info()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1014
    monitor-exit v18

    goto :goto_e

    :catchall_4
    move-exception v21

    monitor-exit v18

    :try_start_a
    throw v21

    .line 1015
    .line 1020
    :goto_e
    :pswitch_8
    goto/16 :goto_b

    .line 1022
    :cond_a
    goto/16 :goto_a

    .line 1024
    :cond_b
    goto/16 :goto_9

    .line 1025
    :cond_c
    goto/16 :goto_1a

    .line 1030
    :pswitch_9
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    monitor-enter v9
    :try_end_a
    .catch Lo/day; {:try_start_a .. :try_end_a} :catch_1

    .line 1031
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_b
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 orignal data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static/range {p2 .. p2}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1032
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_13

    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_13

    .line 1033
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 1034
    const/4 v0, 0x0

    if-ne v0, v11, :cond_d

    .line 1035
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.25.5 callback == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1036
    monitor-exit v9

    return-void

    .line 1039
    :cond_d
    :try_start_c
    new-instance v12, Lorg/json/JSONObject;

    invoke-direct {v12}, Lorg/json/JSONObject;-><init>()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 1041
    :try_start_d
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_10
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/daw;

    .line 1042
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 parse tlv.value : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1043
    invoke-virtual {v14}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_2

    goto/16 :goto_11

    .line 1045
    :sswitch_3
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 parse rri_time  : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    const-string v0, "rri_time"

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1

    invoke-virtual {v12, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 1047
    goto/16 :goto_12

    .line 1050
    :sswitch_4
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 parse rri_intensity  : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1051
    const-string v0, "rri_intensity"

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v12, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1052
    goto/16 :goto_12

    .line 1054
    :sswitch_5
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 parse rri_acc_state  : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1055
    const-string v0, "rri_acc_state"

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v12, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1056
    goto/16 :goto_12

    .line 1058
    :sswitch_6
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 parse rri_motion_state  : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1059
    const-string v0, "rri_motion_state"

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v12, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1060
    goto :goto_12

    .line 1063
    :sswitch_7
    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v15

    .line 1064
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 device push err code \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1065
    const-string v0, "device test error"

    const-string v1, "registerNotificationPressCallBack"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v11, v15, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    .line 1066
    monitor-exit v9

    return-void

    .line 1068
    :goto_11
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_e
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 parse default  : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v14}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1071
    :goto_12
    goto/16 :goto_10

    .line 1073
    :cond_e
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.25.5 create rrl_list : init create "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1074
    new-instance v13, Lorg/json/JSONArray;

    invoke-direct {v13}, Lorg/json/JSONArray;-><init>()V

    .line 1075
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_13
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Lo/dba;

    .line 1076
    iget-object v0, v15, Lo/dba;->b:Ljava/util/List;

    move-object/from16 v16, v0

    .line 1077
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_14
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Lo/dba;

    .line 1078
    move-object/from16 v0, v18

    iget-object v0, v0, Lo/dba;->e:Ljava/util/List;

    move-object/from16 v19, v0

    .line 1079
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.25.5 struct : init create "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1080
    new-instance v20, Lorg/json/JSONObject;

    invoke-direct/range {v20 .. v20}, Lorg/json/JSONObject;-><init>()V

    .line 1081
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    :goto_15
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lo/daw;

    .line 1082
    invoke-virtual/range {v22 .. v22}, Lo/daw;->d()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    sparse-switch v0, :sswitch_data_3

    goto/16 :goto_16

    .line 1084
    :sswitch_8
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 parse rri_value : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v22 .. v22}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1085
    const-string v0, "rri_value"

    invoke-virtual/range {v22 .. v22}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v20

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1086
    goto :goto_17

    .line 1088
    :sswitch_9
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 rri_sqi: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v22 .. v22}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1089
    const-string v0, "rri_sqi"

    invoke-virtual/range {v22 .. v22}, Lo/daw;->b()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    move-object/from16 v2, v20

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 1090
    goto :goto_17

    .line 1092
    :goto_16
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "5.25.5 parse default  : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1095
    :goto_17
    goto/16 :goto_15

    .line 1096
    :cond_f
    move-object/from16 v0, v20

    invoke-virtual {v13, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 1097
    goto/16 :goto_14

    .line 1098
    :cond_10
    goto/16 :goto_13

    .line 1099
    :cond_11
    const-string v0, "rri_list"

    invoke-virtual {v12, v0, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1100
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "5.25.5 RRI result ----"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v12}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    invoke-virtual {v12}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "registerNotificationPressCallBack"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_e
    .catch Lorg/json/JSONException; {:try_start_e .. :try_end_e} :catch_0
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    .line 1106
    goto :goto_18

    .line 1103
    :catch_0
    move-exception v13

    .line 1104
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_f
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v13}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1105
    const-string v0, "param is error"

    const-string v1, "registerNotificationPressCallBack"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const v1, 0x1e849

    invoke-interface {v11, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1107
    :goto_18
    goto/16 :goto_f

    :cond_12
    goto :goto_19

    .line 1109
    :cond_13
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no set call back about 5.25.5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    .line 1111
    :goto_19
    monitor-exit v9

    goto :goto_1a

    :catchall_5
    move-exception v23

    monitor-exit v9

    :try_start_10
    throw v23
    :try_end_10
    .catch Lo/day; {:try_start_10 .. :try_end_10} :catch_1

    .line 1112
    .line 1119
    :goto_1a
    :pswitch_a
    goto :goto_1b

    .line 1117
    :catch_1
    move-exception v6

    .line 1118
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lo/day;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1119
    goto :goto_1b

    .line 1121
    :cond_14
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u63a5\u6536\u547d\u4ee4\u9519\u8bef!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1124
    :cond_15
    :goto_1b
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_4
        :pswitch_9
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_2
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x7f -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x3 -> :sswitch_1
        0x4 -> :sswitch_2
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_7
        :pswitch_8
        :pswitch_8
        :pswitch_5
        :pswitch_6
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        0x1 -> :sswitch_3
        0x6 -> :sswitch_4
        0x7 -> :sswitch_5
        0x8 -> :sswitch_6
        0x7f -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x4 -> :sswitch_8
        0x5 -> :sswitch_9
    .end sparse-switch
.end method

.method public getWearDeviceConnectStatus(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 1300
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWearDeviceConnectStatus "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1301
    sget-object v4, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 1302
    :try_start_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->a()Ljava/util/List;

    move-result-object v5

    .line 1303
    const/4 v6, 0x0

    .line 1304
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWearDeviceConnectStatus() deviceList.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1305
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 1306
    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 1307
    move-object v6, v8

    .line 1308
    goto :goto_1

    .line 1310
    :cond_0
    goto :goto_0

    .line 1311
    :cond_1
    :goto_1
    const/4 v7, 0x0

    .line 1312
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 1313
    invoke-virtual {v6}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v7

    .line 1315
    :cond_2
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWearDeviceConnectStatus()  "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1316
    .line 1317
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getWearDeviceConnectStatus"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 1316
    const v1, 0x186a0

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1318
    monitor-exit v4

    goto :goto_2

    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9

    .line 1319
    :goto_2
    return-void
.end method

.method public isLoudspeakerMuteOpenOrCloseHeartRate(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 16

    .line 1232
    sget-object v4, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 1234
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Enter isLoudspeakerMuteOpenOrCloseHeartRate isLoudspeakerMute = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ";openOrClose = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1236
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->getCurrentDeviceInfo(Lo/dea;)Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 1238
    move/from16 v0, p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 1239
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->receiverDataStatus:Z

    if-eqz v0, :cond_0

    move-object/from16 v0, p0

    iget v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->loudspeakerMuteStatus:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1240
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->getInstance()Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/RemoteServiceMgr;->callbackIsNull()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v0

    if-nez v0, :cond_0

    .line 1241
    monitor-exit v4

    return-void

    .line 1246
    :cond_0
    :try_start_1
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 1247
    const/16 v0, 0x19

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 1248
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 1250
    invoke-static/range {p2 .. p2}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 1251
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v8

    .line 1252
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v9

    .line 1254
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1255
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1256
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1257
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1259
    if-eqz v5, :cond_1

    .line 1260
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_1

    .line 1261
    const/4 v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v11

    .line 1262
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v12

    .line 1263
    invoke-static/range {p1 .. p1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v13

    .line 1265
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1266
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1267
    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1271
    :cond_1
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 1272
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 1274
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v6}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 1275
    move/from16 v0, p1

    move-object/from16 v1, p0

    iput v0, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->loudspeakerMuteStatus:I

    .line 1277
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    monitor-enter v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1278
    const/4 v0, 0x0

    move-object/from16 v1, p3

    if-eq v0, v1, :cond_2

    .line 1279
    :try_start_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    move-object/from16 v1, p3

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1281
    :cond_2
    monitor-exit v11

    goto :goto_0

    :catchall_0
    move-exception v14

    monitor-exit v11

    :try_start_3
    throw v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 1282
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v15

    monitor-exit v4

    throw v15

    .line 1285
    :goto_1
    return-void
.end method

.method public onDestroy()V
    .locals 6

    .line 1390
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroy"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1391
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 1392
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressHandlerThread:Landroid/os/HandlerThread;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1393
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    .line 1394
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mStressHandlerThread:Landroid/os/HandlerThread;

    .line 1396
    :cond_0
    sget-object v4, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 1397
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "install  null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1398
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->instance:Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1399
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1400
    :goto_0
    return-void
.end method

.method public registerNotificationHRCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 820
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v1

    .line 821
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 822
    monitor-exit v1

    return-void

    .line 824
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 825
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 826
    :goto_0
    return-void
.end method

.method public registerNotificationPressCallBack(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 856
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerNotificationPressCallBack----start----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 857
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    monitor-enter v4

    .line 858
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 859
    monitor-exit v4

    return-void

    .line 861
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 862
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerNotificationPressCallBack  Null =callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 863
    monitor-exit v4

    return-void

    .line 865
    :cond_1
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerNotificationPressCallBack  add sucess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 866
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDevicePressCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 868
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 869
    :goto_0
    return-void
.end method

.method public registerNotificationStressCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 6

    .line 838
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerNotificationStressCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceStressCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    monitor-enter v4

    .line 840
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceStressCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    .line 841
    monitor-exit v4

    return-void

    .line 843
    :cond_0
    :try_start_1
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceStressCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 844
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 845
    :goto_0
    return-void
.end method

.method public setHeartRateReportStatus(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 169
    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    .line 170
    const/4 v0, 0x2

    invoke-virtual {p0, v0, v1, p2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->isLoudspeakerMuteOpenOrCloseHeartRate(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 171
    return-void
.end method

.method public setHeartRateResponse(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 11

    .line 787
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "response of HeartRate info = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 788
    sget-object v4, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 789
    :try_start_0
    new-instance v5, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v5}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 790
    const/16 v0, 0x19

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 791
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 794
    const-string v0, "heart_rate_response"

    :try_start_1
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v0, v1}, Lo/czx;->b(J)Ljava/lang/String;

    move-result-object v6

    .line 796
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v7

    .line 798
    const/16 v0, 0x7f

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 800
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 801
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 802
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 803
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 806
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 808
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v5}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 809
    const-string v0, "success"

    const-string v1, "setHeartRateResponse"

    .line 810
    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 809
    const v1, 0x186a0

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 813
    goto :goto_0

    .line 811
    :catch_0
    move-exception v6

    .line 812
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 814
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v10

    monitor-exit v4

    throw v10

    .line 815
    :goto_1
    return-void
.end method

.method public setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 10

    .line 1323
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isR1OpenOrCloseStress  openOrClose = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1326
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    .line 1328
    move-object v4, p0

    monitor-enter v4

    .line 1329
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->listToArryOfRRI(Ljava/util/List;)[I

    move-result-object v5

    .line 1330
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    invoke-direct {p0, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->listToArryOfRRI(Ljava/util/List;)[I

    move-result-object v6

    .line 1331
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "arrayRri size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v5

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , arraytime size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v6

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1332
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    invoke-virtual {v0, v5, v6}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->processRRData([I[I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1333
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7

    .line 1335
    :cond_0
    :goto_0
    move-object v4, p0

    monitor-enter v4

    .line 1336
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "clear rri list"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1337
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rri:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1338
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->rritime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1339
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRRITime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1340
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1341
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1342
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v8

    monitor-exit v4

    throw v8

    .line 1343
    :goto_1
    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1344
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->isLoudspeakerMuteOpenOrCloseHeartRate(IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_2

    .line 1345
    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1346
    const/4 v0, 0x0

    if-eq v0, p2, :cond_2

    .line 1347
    const v0, 0x186a0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1350
    :cond_2
    :goto_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    monitor-enter v4

    .line 1351
    const/4 v0, 0x0

    if-eq v0, p2, :cond_3

    .line 1352
    :try_start_2
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetStressStatusCallbackList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1354
    :cond_3
    monitor-exit v4

    goto :goto_3

    :catchall_2
    move-exception v9

    monitor-exit v4

    throw v9

    .line 1355
    :goto_3
    return-void
.end method

.method public setRunPostureReportStatus(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 121
    sget-object v4, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 122
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 123
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPostureReportStatus null == hwDeviceMgr"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const v0, 0x186a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "setRunPostureReportStatus"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 125
    monitor-exit v4

    return-void

    .line 127
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0}, Lo/dea;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 128
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 129
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no device is connected."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    const v0, 0x186a1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "setRunPostureReportStatus"

    invoke-static {v0, v1}, Lcom/huawei/hwservicesmgr/remote/utils/RemoteUtils;->generateRetMap(Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-interface {v1, v2, v0}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    monitor-exit v4

    return-void

    .line 133
    :cond_1
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setRunPostureReportStatus enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 135
    new-instance v6, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v6}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 136
    const/16 v0, 0x17

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 137
    const/16 v0, 0xf

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 138
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setmIdentify(Ljava/lang/String;)V

    .line 140
    const-string v0, "status"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    .line 141
    invoke-static {v7}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v8

    .line 142
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->e(I)Ljava/lang/String;

    move-result-object v9

    .line 143
    const/4 v0, 0x1

    invoke-static {v0}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v10

    .line 145
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 151
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 153
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->hwDeviceMgr:Lo/dea;

    invoke-virtual {v0, v6}, Lo/dea;->d(Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;)V

    .line 154
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    monitor-enter v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 155
    const/4 v0, 0x0

    move-object/from16 v1, p2

    if-eq v0, v1, :cond_2

    .line 156
    :try_start_3
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mSetHeartRateStatusCallbackList:Ljava/util/List;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 158
    :cond_2
    monitor-exit v12

    goto :goto_0

    :catchall_0
    move-exception v13

    monitor-exit v12

    :try_start_4
    throw v13
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 159
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_1
    move-exception v14

    monitor-exit v4

    throw v14

    .line 160
    :goto_1
    return-void
.end method

.method public setStressReportStatus(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 177
    const/4 v0, 0x0

    move-object/from16 v1, p1

    if-eq v0, v1, :cond_0

    .line 178
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setStressReportStatus parameters = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 180
    :cond_0
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setStressReportStatus parameters is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    return-void

    .line 183
    :goto_0
    const-string v0, "productId"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    .line 184
    const-string v0, "type"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 185
    move-object/from16 v0, p0

    invoke-direct {v0, v4}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->isClose(I)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "6d5416d9-2167-41df-ab10-c492e152b44f"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 186
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->parseRri(Lorg/json/JSONObject;)V

    .line 188
    :cond_1
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->cleanAbortCallback()V

    .line 190
    packed-switch v4, :pswitch_data_0

    goto/16 :goto_3

    .line 192
    :pswitch_0
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$1;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processStressOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 221
    goto/16 :goto_3

    .line 223
    :pswitch_1
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    .line 225
    const-string v0, "duration"

    const-string v1, "duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v5, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 226
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x2

    invoke-virtual {v0, v2, v5, v1}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 227
    move-object/from16 v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 228
    goto/16 :goto_3

    .line 230
    :pswitch_2
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getStressAbortCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processStressAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 231
    goto/16 :goto_3

    .line 233
    :pswitch_3
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$2;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$2;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processCalibOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 262
    goto/16 :goto_3

    .line 264
    :pswitch_4
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stress calib close"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 265
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 266
    const-string v0, "duration"

    const-string v1, "duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v6, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 267
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v2, 0x5

    invoke-virtual {v0, v2, v6, v1}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 268
    move-object/from16 v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 269
    goto/16 :goto_3

    .line 271
    :pswitch_5
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getStressCalibAbortCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processCalibAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 272
    goto/16 :goto_3

    .line 274
    :pswitch_6
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STRESS_CALIBRATION_CHECK"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getStressCalibFlag(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 277
    goto/16 :goto_3

    .line 279
    :pswitch_7
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "STRESS_CALIBRATION_RESET"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 280
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 281
    goto/16 :goto_3

    .line 283
    :pswitch_8
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$3;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$3;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processRelaxOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 311
    goto/16 :goto_3

    .line 313
    :pswitch_9
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "RELAX_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 314
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    .line 315
    const-string v0, "duration"

    const-string v1, "duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v7, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 316
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0xa

    invoke-virtual {v0, v2, v7, v1}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 317
    move-object/from16 v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 318
    goto/16 :goto_3

    .line 320
    :pswitch_a
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getRelaxAbortCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processRelaxAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 321
    goto/16 :goto_3

    .line 323
    :pswitch_b
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$4;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$4;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    invoke-direct {v1, v2, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processGameOpen(Lorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 351
    goto/16 :goto_3

    .line 353
    :pswitch_c
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "GAME_CLOSE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    .line 355
    const-string v0, "duration"

    const-string v1, "duration"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 356
    const-string v0, "score"

    const-string v1, "score"

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 357
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/16 v2, 0xd

    invoke-virtual {v0, v2, v8, v1}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getStressResult(ILorg/json/JSONObject;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 358
    move-object/from16 v0, p0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->setR1OpenOrCloseStress(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 359
    goto/16 :goto_3

    .line 361
    :pswitch_d
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$5;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager$5;-><init>(Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->processGameAbort(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 386
    goto/16 :goto_3

    .line 389
    :pswitch_e
    invoke-direct/range {p0 .. p0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->getCurrentConnectedDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v9

    .line 391
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    .line 392
    const-string v0, "type"

    const/16 v1, 0xf

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 393
    const/4 v0, 0x0

    if-eq v0, v9, :cond_4

    .line 394
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "productType: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 396
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dea;->a(Landroid/content/Context;)Lo/dea;

    move-result-object v0

    invoke-virtual {v0}, Lo/dea;->c()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v11

    .line 397
    const/4 v0, 0x0

    if-ne v0, v11, :cond_2

    .line 399
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mDeviceCapability is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 402
    :cond_2
    invoke-virtual {v9}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_3

    const/4 v0, 0x0

    if-eq v0, v11, :cond_3

    invoke-virtual {v11}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 403
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check connected success!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 404
    const-string v0, "result_code"

    const/4 v1, 0x0

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    goto :goto_1

    .line 406
    :cond_3
    const-string v0, "result_code"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 408
    :goto_1
    goto :goto_2

    .line 409
    :cond_4
    const-string v0, "result_code"

    const/4 v1, 0x1

    invoke-virtual {v10, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 411
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 412
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stressAlgorithmCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v10}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_3

    .line 417
    :pswitch_f
    const-string v0, "listrri"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 418
    const-string v0, "listtime"

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 419
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 420
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 422
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-direct {v1, v11}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stringToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 423
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-direct {v1, v12}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->stringToList(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 426
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realRri:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->listToArryOfRRI(Ljava/util/List;)[I

    move-result-object v13

    .line 427
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->realTime:Ljava/util/List;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->listToArryOfRRI(Ljava/util/List;)[I

    move-result-object v14

    .line 428
    const-string v0, "HWHeartRateManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "arrayRri size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v13

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , arraytime size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    array-length v3, v14

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    array-length v0, v13

    if-nez v0, :cond_5

    .line 431
    const/4 v15, 0x1

    new-array v15, v15, [I

    fill-array-data v15, :array_0

    .line 432
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    invoke-virtual {v0, v15, v15}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->processRRData([I[I)V

    .line 433
    goto :goto_3

    .line 434
    :cond_5
    invoke-static {}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->getInstance()Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;

    move-result-object v0

    invoke-virtual {v0, v13, v14}, Lcom/huawei/hwservicesmgr/remote/HWStressDataProvider;->processRRData([I[I)V

    .line 436
    .line 441
    :cond_6
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
        :pswitch_e
        :pswitch_f
    .end packed-switch

    :array_0
    .array-data 4
        0x0
    .end array-data
.end method

.method public unRegisterNotificationHRCallback(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 3

    .line 829
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v1

    .line 830
    :try_start_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 831
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWHeartRateManager;->mDeviceHeartRateCallbackList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 833
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 834
    :goto_0
    return-void
.end method
