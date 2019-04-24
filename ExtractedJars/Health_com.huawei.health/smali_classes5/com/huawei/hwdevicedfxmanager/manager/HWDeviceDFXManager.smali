.class public Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static final DFX_FIREWARE_TIMEOUT:I = 0x64

.field private static final FIREWARE_VERSION_TIME_OUT:J = 0x7530L

.field private static final TAG:Ljava/lang/String; = "HWDeviceDFXManager"

.field private static mInstance:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager; = null


# instance fields
.field private coreSleepCallback:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

.field private deviceMac:Ljava/lang/String;

.field private deviceType:I

.field private deviceVersion:Ljava/lang/String;

.field private dfxITransferDFXFileUICallback:Lo/djv$d;

.field private dfxITransferSleepAndDFXFileCallback:Lo/djv$d;

.field private filePriortiy:I

.field private isFromAbout:Z

.field private isUploadAppLog:I

.field private logLevel:I

.field private mContext:Landroid/content/Context;

.field private mDFXResponseCallBack:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;>;"
        }
    .end annotation
.end field

.field private mFirmwareVersionCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private mHWDeviceConfigManager:Lo/dde;

.field private mHandler:Landroid/os/Handler;

.field private mManulCollectLog:Z

.field private mUIFirmwareVersionCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private maintenanceCallback:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

.field private maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

.field private singleThreadExecutor:Ljava/util/concurrent/ExecutorService;

.field private sleepITransferSleepAndDFXFileCallback:Lo/djv$d;

.field private taskType:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mInstance:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 90
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mContext:Landroid/content/Context;

    .line 66
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 67
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->logLevel:I

    .line 68
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    .line 69
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    .line 70
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isFromAbout:Z

    .line 76
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isUploadAppLog:I

    .line 78
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->filePriortiy:I

    .line 79
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->taskType:I

    .line 420
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$5;

    invoke-direct {v0, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$5;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mFirmwareVersionCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 521
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;

    invoke-direct {v0, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$6;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->dfxITransferSleepAndDFXFileCallback:Lo/djv$d;

    .line 551
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;

    invoke-direct {v0, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$7;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->sleepITransferSleepAndDFXFileCallback:Lo/djv$d;

    .line 718
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$8;

    invoke-direct {v0, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$8;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->dfxITransferDFXFileUICallback:Lo/djv$d;

    .line 767
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$9;

    invoke-direct {v0, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$9;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mUIFirmwareVersionCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 790
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$10;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$10;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHandler:Landroid/os/Handler;

    .line 91
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mContext:Landroid/content/Context;

    .line 92
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    .line 93
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->singleThreadExecutor:Ljava/util/concurrent/ExecutorService;

    .line 94
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 95
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-void

    .line 98
    :cond_0
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HWDeviceDFXManager new object!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mFirmwareVersionCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lo/dde;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    return-object v0
.end method

.method static synthetic access$1000(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Ljava/lang/ref/WeakReference;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mDFXResponseCallBack:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method static synthetic access$1100(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/os/Handler;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHandler:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic access$1200(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lo/djv$d;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->dfxITransferDFXFileUICallback:Lo/djv$d;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->broadcastCrowdDeviceInfoResult()V

    return-void
.end method

.method static synthetic access$400(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lo/djv$d;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->dfxITransferSleepAndDFXFileCallback:Lo/djv$d;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Lcom/huawei/datatype/DataDeviceInfo;Lo/djv;)V
    .locals 0

    .line 59
    invoke-direct {p0, p1, p2}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->handlerFirmwareVersion(Lcom/huawei/datatype/DataDeviceInfo;Lo/djv;)V

    return-void
.end method

.method static synthetic access$600(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceCallback:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->coreSleepCallback:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Landroid/content/Context;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mContext:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic access$902(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Z)Z
    .locals 0

    .line 59
    iput-boolean p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mManulCollectLog:Z

    return p1
.end method

.method private broadcastCrowdDeviceInfoResult()V
    .locals 8

    .line 326
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "broadcastCrowdDeviceInfoResult: deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+deviceVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+ deviceMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 327
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getDeviceName(I)Ljava/lang/String;

    move-result-object v5

    .line 328
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " SEND_GET_BETA_INFO = com.huawei.crowdtest.action.GET_BETA_INFO"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 330
    new-instance v6, Landroid/content/Intent;

    const-string v0, "com.huawei.crowdtest.action.GET_BETA_INFO"

    invoke-direct {v6, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 331
    new-instance v7, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;

    invoke-direct {v7}, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;-><init>()V

    .line 332
    invoke-virtual {v7, v5}, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->setProductType(Ljava/lang/String;)V

    .line 333
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->setBuildNumber(Ljava/lang/String;)V

    .line 334
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    invoke-virtual {v7, v0}, Lcom/huawei/hwdevicedfxmanager/datatype/BoneBroadcastJson;->setDeviceID(Ljava/lang/String;)V

    .line 335
    const-string v0, "Request"

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, v7}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 336
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v6}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 337
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "broadcastCrowdDeviceInfoResult: send deviceInfo!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 338
    return-void
.end method

.method private delayedOneDay(Ljava/lang/String;)Z
    .locals 9

    .line 372
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getMaintCheckTime()Ljava/lang/String;

    move-result-object v4

    .line 373
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 374
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 376
    :cond_1
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "canMaintTime: strLastTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", strCurTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 378
    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 379
    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v7

    .line 380
    sub-long v0, v7, v5

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 381
    const/4 v0, 0x1

    return v0

    .line 385
    :cond_2
    goto :goto_0

    .line 383
    :catch_0
    move-exception v5

    .line 384
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " delayedEightHour exception: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 386
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;
    .locals 5

    .line 853
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 854
    const/4 v0, 0x0

    return-object v0

    .line 856
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->a()Ljava/util/List;

    move-result-object v2

    .line 857
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 858
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    .line 859
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceActiveState()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 860
    return-object v4

    .line 862
    :cond_1
    goto :goto_0

    .line 864
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;
    .locals 4

    .line 82
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mInstance:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 83
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

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

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mInstance:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    .line 86
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mInstance:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    return-object v0
.end method

.method private handlerFirmwareVersion(Lcom/huawei/datatype/DataDeviceInfo;Lo/djv;)V
    .locals 8

    .line 432
    const/4 v0, 0x0

    if-eq v0, p1, :cond_3

    .line 433
    invoke-virtual {p1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_soft_version()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    .line 434
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mFirmwareVersionCallback deviceVersion = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 436
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 437
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mFirmwareVersionCallback getCurrentDeviceInfo() = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    return-void

    .line 440
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    .line 441
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mFirmwareVersionCallback = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 444
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->setMaintRetryResult(Z)V

    .line 445
    new-instance v6, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-direct {v6}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;-><init>()V

    .line 446
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isFromAbout:Z

    if-eqz v0, :cond_1

    .line 447
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsFromAbout(I)V

    goto :goto_0

    .line 449
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsFromAbout(I)V

    .line 452
    :goto_0
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isUploadAppLog:I

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setIsUploadAppLog(I)V

    .line 454
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setType(I)V

    .line 455
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setRecordId(Ljava/util/List;)V

    .line 456
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->logLevel:I

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setLevel(I)V

    .line 457
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->filePriortiy:I

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    .line 458
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 459
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->taskType:I

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setTaskType(I)V

    .line 463
    invoke-virtual {p1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_type()I

    move-result v7

    .line 464
    const/16 v0, 0xa

    if-ne v7, v0, :cond_2

    .line 465
    invoke-virtual {p1}, Lcom/huawei/datatype/DataDeviceInfo;->getDevice_sn()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDeviceMac(Ljava/lang/String;)V

    goto :goto_1

    .line 467
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDeviceMac(Ljava/lang/String;)V

    .line 469
    :goto_1
    invoke-virtual {v6, v7}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDeviceType(I)V

    .line 470
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setDeviceVersion(Ljava/lang/String;)V

    .line 472
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceMac=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==deviceType=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "==deviceVersion=="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceVersion:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 477
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    invoke-virtual {v0, v6, p2}, Lo/dde;->b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V

    .line 479
    :cond_3
    return-void
.end method

.method private needMaintenance()Z
    .locals 8

    .line 395
    const/4 v4, 0x0

    .line 396
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getDayDateTime()Ljava/lang/String;

    move-result-object v5

    .line 397
    invoke-direct {p0, v5}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->delayedOneDay(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 398
    invoke-virtual {p0, v5}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->setMaintCheckTime(Ljava/lang/String;)V

    .line 399
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->setMaintRetryNum(I)V

    .line 400
    const/4 v4, 0x1

    goto :goto_0

    .line 402
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getMaintRetryNum()I

    move-result v6

    .line 403
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getMaintRetryResult()Z

    move-result v7

    .line 404
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "canMaintTime() failTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", isSuccess = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    const/4 v0, 0x3

    if-ge v6, v0, :cond_1

    if-nez v7, :cond_1

    .line 406
    add-int/lit8 v6, v6, 0x1

    .line 407
    invoke-virtual {p0, v5}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->setMaintCheckTime(Ljava/lang/String;)V

    .line 408
    invoke-virtual {p0, v6}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->setMaintRetryNum(I)V

    .line 409
    const/4 v4, 0x1

    goto :goto_0

    .line 411
    :cond_1
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "canMaintTime() today has no sucess maint,but retry > 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 414
    :goto_0
    return v4
.end method


# virtual methods
.method public getCrowdFirmwareVersion()V
    .locals 6

    .line 294
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCrowdFirmwareVersion mHWDeviceConfigManager = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 295
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 296
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCrowdFirmwareVersion mHWDeviceConfigManager = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    return-void

    .line 299
    :cond_0
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 300
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 301
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mHWDeviceConfigManager.getCurrentDeviceInfo() = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    return-void

    .line 305
    :cond_1
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    .line 306
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceType = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSecDeviceID()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    .line 308
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceMac = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceMac:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 309
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$4;

    invoke-direct {v1, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$4;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    invoke-virtual {v0, v1}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 323
    return-void
.end method

.method public getCrowdTestAndMaint(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
    .locals 4

    .line 261
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mManulCollectLog:Z

    if-eqz v0, :cond_0

    .line 262
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCrowdTestAndMaint  collecting device log manually "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 263
    return-void

    .line 266
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isDeviceSuport()Z

    move-result v0

    if-nez v0, :cond_1

    .line 267
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getCrowdTestAndMaint not support!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    return-void

    .line 271
    :cond_1
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getCrowdTestAndMaint  level = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+ callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 273
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->logLevel:I

    .line 274
    iput-object p2, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceCallback:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    .line 275
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 277
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isFromAbout:Z

    .line 278
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isUploadAppLog:I

    .line 279
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->filePriortiy:I

    .line 280
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->taskType:I

    .line 281
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$3;

    invoke-direct {v1, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$3;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 286
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 287
    return-void
.end method

.method public getDeviceLog(Ljava/lang/String;Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
    .locals 4

    .line 692
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isDeviceSuport()Z

    move-result v0

    if-nez v0, :cond_1

    .line 693
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintanceFileNoRestrict \u4e0d\u652f\u6301\u8be5\u8bbe\u5907!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 695
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    .line 697
    :cond_0
    return-void

    .line 700
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mManulCollectLog:Z

    if-eqz v0, :cond_2

    .line 701
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    .line 702
    return-void

    .line 704
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mManulCollectLog:Z

    .line 705
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isFromAbout:Z

    .line 706
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isUploadAppLog:I

    .line 707
    const/4 v0, 0x3

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->filePriortiy:I

    .line 708
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->taskType:I

    .line 709
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 710
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->logLevel:I

    .line 711
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mDFXResponseCallBack:Ljava/lang/ref/WeakReference;

    .line 712
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 713
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHandler:Landroid/os/Handler;

    const/16 v1, 0x64

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 714
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mHWDeviceConfigManager:Lo/dde;

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mUIFirmwareVersionCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, p1, v1}, Lo/dde;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 715
    return-void
.end method

.method public getMaintCheckTime()Ljava/lang/String;
    .locals 2

    .line 120
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getMaintCheckTime()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 123
    :cond_0
    const-string v0, "0"

    return-object v0
.end method

.method public getMaintRetryNum()I
    .locals 2

    .line 156
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getMaintRetryNum()I

    move-result v0

    return v0

    .line 159
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getMaintRetryResult()Z
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 140
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getMaintRetryResult()Z

    move-result v0

    return v0

    .line 142
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getMaintanceFileNoRestrict(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
    .locals 4

    .line 216
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the version do not support."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    return-void
.end method

.method public getMaintenanceFile(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
    .locals 5

    .line 169
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isLimitCollectLog()Z

    move-result v0

    if-nez v0, :cond_1

    .line 170
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintenanceFile getDFXlog"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 172
    const-string v0, "time is error!!!"

    const/4 v1, 0x2

    invoke-interface {p2, v1, v0}, Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;->onFailure(ILjava/lang/String;)V

    .line 174
    :cond_0
    return-void

    .line 176
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mManulCollectLog:Z

    if-eqz v0, :cond_2

    .line 177
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintenanceFile  collecting device log manually "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 178
    return-void

    .line 180
    :cond_2
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintenanceFile  level = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",+ callback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isDeviceSuport()Z

    move-result v0

    if-nez v0, :cond_3

    .line 183
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "check device not support!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    return-void

    .line 187
    :cond_3
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    .line 190
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->needMaintenance()Z

    move-result v4

    .line 191
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "checkMaintDate() canMaint = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    if-nez v4, :cond_4

    .line 193
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkMaintDate() today has maint or retry > 3 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    return-void

    .line 198
    :cond_4
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->logLevel:I

    .line 199
    iput-object p2, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceCallback:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    .line 200
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isFromAbout:Z

    .line 201
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isUploadAppLog:I

    .line 202
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->filePriortiy:I

    .line 203
    const/4 v0, 0x2

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->taskType:I

    .line 205
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$1;

    invoke-direct {v1, p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$1;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 210
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 211
    return-void
.end method

.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 107
    const/16 v0, 0xa

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getSleepDetailFromDevice(ZIILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
    .locals 5

    .line 500
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "enter getSleepDetailFromDevice()! isNormal = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " startTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , endTime = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 502
    new-instance v4, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-direct {v4}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;-><init>()V

    .line 503
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setType(I)V

    .line 504
    if-nez p1, :cond_0

    .line 506
    const/4 v0, 0x3

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    goto :goto_0

    .line 508
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    .line 510
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 511
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setTaskType(I)V

    .line 512
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setRecordId(Ljava/util/List;)V

    .line 513
    invoke-virtual {v4, p2}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setStartTime(I)V

    .line 514
    invoke-virtual {v4, p3}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setEndTime(I)V

    .line 515
    iput-object p4, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->coreSleepCallback:Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;

    .line 517
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->sleepITransferSleepAndDFXFileCallback:Lo/djv$d;

    invoke-virtual {v0, v4, v1}, Lo/dde;->b(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lo/djv;)V

    .line 518
    return-void
.end method

.method public isDeviceSuport()Z
    .locals 8

    .line 346
    const/4 v4, 0x0

    .line 347
    invoke-static {}, Lo/czu;->e()Z

    move-result v5

    .line 351
    invoke-static {}, Lo/dgk;->d()Z

    move-result v6

    .line 352
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BuildConfig.SUPPORT_LOG_FEEDBACK false,experenceSwitch: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",isOversea: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 354
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getCurrentDeviceInfo()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v7

    .line 355
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 356
    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    .line 357
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceType is = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 359
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->deviceType:I

    invoke-static {v0}, Lo/dda;->k(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 360
    if-nez v5, :cond_0

    .line 362
    const/16 v0, 0x30

    invoke-static {v0}, Lo/czd;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v6, :cond_0

    .line 364
    const/4 v4, 0x1

    .line 368
    :cond_0
    return v4
.end method

.method public isLimitCollectLog()Z
    .locals 6

    .line 838
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 839
    const/16 v0, 0xb

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 840
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDFXlog localHour = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    const/4 v0, 0x6

    if-gt v0, v5, :cond_0

    const/16 v0, 0xa

    if-ge v5, v0, :cond_0

    .line 842
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDFXlog 6 < localHour < 10 return !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 843
    const/4 v0, 0x0

    return v0

    .line 844
    :cond_0
    const/16 v0, 0x11

    if-gt v0, v5, :cond_1

    const/16 v0, 0x16

    if-ge v5, v0, :cond_1

    .line 845
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDFXlog 17 < localHour < 22 return !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    const/4 v0, 0x0

    return v0

    .line 848
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public onDestroy()V
    .locals 1

    .line 483
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 488
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->mManulCollectLog:Z

    .line 489
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->isFromAbout:Z

    .line 490
    return-void
.end method

.method public setMaintCheckTime(Ljava/lang/String;)V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0, p1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintCheckTime(Ljava/lang/String;)V

    .line 117
    :cond_0
    return-void
.end method

.method public setMaintRetryNum(I)V
    .locals 2

    .line 150
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0, p1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryNum(I)V

    .line 153
    :cond_0
    return-void
.end method

.method public setMaintRetryResult(Z)V
    .locals 2

    .line 133
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 134
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->maintenanceUtil:Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    invoke-interface {v0, p1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 136
    :cond_0
    return-void
.end method

.method public startUploadLogFile(Z)V
    .locals 4

    .line 820
    const-string v0, "HWDeviceDFXManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startUploadLogFile"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 821
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->singleThreadExecutor:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$11;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$11;-><init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 832
    return-void
.end method
