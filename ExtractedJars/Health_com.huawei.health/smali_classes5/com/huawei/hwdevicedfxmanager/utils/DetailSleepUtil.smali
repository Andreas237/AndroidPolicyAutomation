.class public Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;


# static fields
.field public static final CORE_SLEEP_PATH:Ljava/lang/String;

.field private static DATA_FILE_NAME:Ljava/lang/String;

.field private static STATE_FILE_NAME:Ljava/lang/String;

.field private static TAG:Ljava/lang/String;

.field private static instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;


# instance fields
.field private executorService:Ljava/util/concurrent/ExecutorService;

.field private fileName:Ljava/lang/String;

.field private isStateFileWrite:Z

.field private final lockObject:Ljava/lang/Object;

.field private logRunnable:Ljava/lang/Runnable;

.field private mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field private mDataFilePath:Ljava/lang/String;

.field private mStateFilePath:Ljava/lang/String;

.field private mTransferDataContent:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private mTransferDataContentPath:Ljava/lang/String;

.field private mTransferStateContent:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<[B>;"
        }
    .end annotation
.end field

.field private mTransferStateContentPath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 30
    const-string v0, "DetailSleepUtil"

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    .line 31
    const-string v0, "sleep_data.bin"

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->DATA_FILE_NAME:Ljava/lang/String;

    .line 32
    const-string v0, "sleep_state.bin"

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->STATE_FILE_NAME:Ljava/lang/String;

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/huaweisystem/CoreSleepLog"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->CORE_SLEEP_PATH:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 6

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->isStateFileWrite:Z

    .line 38
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->lockObject:Ljava/lang/Object;

    .line 44
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->fileName:Ljava/lang/String;

    .line 48
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mDataFilePath:Ljava/lang/String;

    .line 49
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mStateFilePath:Ljava/lang/String;

    .line 199
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;

    invoke-direct {v0, p0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;-><init>(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->logRunnable:Ljava/lang/Runnable;

    .line 59
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DetailSleepUtil constructor():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContentPath:Ljava/lang/String;

    .line 61
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContentPath:Ljava/lang/String;

    .line 62
    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 63
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->isStateFileWrite:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 65
    :goto_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContent:Ljava/util/ArrayList;

    .line 66
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContent:Ljava/util/ArrayList;

    .line 67
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    .line 68
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/lang/Object;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->lockObject:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic access$100()Ljava/lang/String;
    .locals 1

    .line 29
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$200(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Z
    .locals 1

    .line 29
    iget-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->isStateFileWrite:Z

    return v0
.end method

.method static synthetic access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    .locals 0

    .line 29
    iput-boolean p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->isStateFileWrite:Z

    return p1
.end method

.method static synthetic access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContent:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContent:Ljava/util/ArrayList;

    return-object v0
.end method

.method private getFileName()Ljava/lang/String;
    .locals 6

    .line 396
    const-string v4, "CoreSleep"

    .line 397
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->fileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 398
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getFileName()  deviceVersion targetPath "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 399
    return-object v5
.end method

.method public static getMainInstance()Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;
    .locals 2

    .line 52
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 53
    new-instance v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-direct {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;-><init>()V

    sput-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    .line 55
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->instance:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    return-object v0
.end method

.method private initCoreSleepDataSaveDir(Ljava/lang/String;)V
    .locals 6

    .line 420
    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 421
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    .line 422
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->DATA_FILE_NAME:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 423
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mDataFilePath:Ljava/lang/String;

    goto :goto_0

    .line 424
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->STATE_FILE_NAME:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 425
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mStateFilePath:Ljava/lang/String;

    .line 428
    :cond_1
    :goto_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initCoreSleepDataSaveDir filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mDataFilePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mDataFilePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mStateFilePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mStateFilePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 430
    return-void
.end method

.method private writeFileToSD(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/ArrayList<[B>;)V"
        }
    .end annotation

    .line 326
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeFileToSD() enter......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 328
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "writeFileToSD() leave build type not debug return......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 329
    return-void
.end method


# virtual methods
.method public cutFolder(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 439
    return-void
.end method

.method public deleteTenDayFile()V
    .locals 0

    .line 161
    return-void
.end method

.method public filtertFile(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    .locals 0

    .line 83
    return-object p1
.end method

.method public getDayDateTime()Ljava/lang/String;
    .locals 1

    .line 156
    const-string v0, ""

    return-object v0
.end method

.method public getDeviceName(I)Ljava/lang/String;
    .locals 1

    .line 88
    const-string v0, "Huawei"

    return-object v0
.end method

.method public getMaintCheckTime()Ljava/lang/String;
    .locals 1

    .line 97
    const-string v0, "0"

    return-object v0
.end method

.method public getMaintRetryNum()I
    .locals 1

    .line 147
    const/4 v0, 0x0

    return v0
.end method

.method public getMaintRetryResult()Z
    .locals 1

    .line 138
    const/4 v0, 0x0

    return v0
.end method

.method public getmTransferDataContentPath()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContentPath:Ljava/lang/String;

    return-object v0
.end method

.method public getmTransferStateContentPath()Ljava/lang/String;
    .locals 1

    .line 78
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContentPath:Ljava/lang/String;

    return-object v0
.end method

.method public initMaintenanceFile()V
    .locals 5

    .line 404
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter initMaintenanceFile():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 405
    invoke-direct {p0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getFileName()Ljava/lang/String;

    move-result-object v4

    .line 406
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "filePath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 408
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->DATA_FILE_NAME:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    iput-object v4, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContentPath:Ljava/lang/String;

    goto :goto_0

    .line 410
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->STATE_FILE_NAME:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 411
    iput-object v4, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContentPath:Ljava/lang/String;

    .line 417
    :cond_1
    :goto_0
    return-void
.end method

.method public initMaintenanceParame(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 152
    return-void
.end method

.method public maintParametersCommand()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 6

    .line 443
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 444
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 445
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 447
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x6

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 448
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 449
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 451
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getMaintenanceParameters  deviceCommand = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 452
    return-object v4
.end method

.method public onDestroyMaintenance()V
    .locals 4

    .line 434
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDestroyMaintenance"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 435
    return-void
.end method

.method public save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 6

    .line 187
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "save2File enter............"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 189
    :try_start_0
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 190
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mCallback = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mCallback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 192
    :goto_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->executorService:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->logRunnable:Ljava/lang/Runnable;

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 194
    return-void
.end method

.method public setMaintCheckTime(Ljava/lang/String;)V
    .locals 0

    .line 93
    return-void
.end method

.method public setMaintRetryNum(I)V
    .locals 0

    .line 143
    return-void
.end method

.method public setMaintRetryResult(Z)V
    .locals 6

    .line 106
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mTransferStateContent = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContent:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    if-eqz p1, :cond_3

    .line 108
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContentPath:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 109
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContentPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    move-result v4

    .line 110
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDeleteDataSuccess :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContentPath:Ljava/lang/String;

    .line 114
    :cond_0
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContentPath:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 115
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContentPath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z

    move-result v4

    .line 116
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDeleteStateSuccess :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContentPath:Ljava/lang/String;

    .line 120
    :cond_1
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContent:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 121
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContent:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 124
    :cond_2
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContent:Ljava/util/ArrayList;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 125
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContent:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 128
    :cond_3
    iget-object v4, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->lockObject:Ljava/lang/Object;

    monitor-enter v4

    .line 129
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->isStateFileWrite:Z

    .line 130
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "----------isStateFileWrite = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->isStateFileWrite:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 132
    :goto_0
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->fileName:Ljava/lang/String;

    .line 133
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Leave setMaintRetryResult fileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->fileName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    return-void
.end method

.method public transferFileEndProcess()Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;
    .locals 6

    .line 457
    new-instance v4, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;

    invoke-direct {v4}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;-><init>()V

    .line 458
    const/16 v0, 0xa

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setServiceID(I)V

    .line 459
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setCommandID(I)V

    .line 461
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Lo/czx;->d(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 462
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    array-length v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataLen(I)V

    .line 463
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwdevicemgr/dmsdatatype/datatype/DeviceCommand;->setDataContent([B)V

    .line 465
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transferFileEndProcess  deviceCommand !!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 466
    return-object v4
.end method

.method public writeLogToFile(Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Date;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<[B>;Ljava/lang/String;Ljava/util/Date;)V"
        }
    .end annotation

    .line 165
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeLogToFile file_name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 167
    const/4 v0, 0x0

    if-eq v0, p1, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 168
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "writeLogToFile file_name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " file size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v4, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_2

    .line 170
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->DATA_FILE_NAME:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferDataContent:Ljava/util/ArrayList;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 172
    :cond_0
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->STATE_FILE_NAME:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 173
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->mTransferStateContent:Ljava/util/ArrayList;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 178
    :cond_2
    const-string v0, ""

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->fileName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->fileName:Ljava/lang/String;

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 179
    :cond_3
    sget-object v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->TAG:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ",+file_name = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iput-object p2, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->fileName:Ljava/lang/String;

    .line 181
    invoke-virtual {p0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->initMaintenanceFile()V

    .line 183
    :cond_4
    return-void
.end method
