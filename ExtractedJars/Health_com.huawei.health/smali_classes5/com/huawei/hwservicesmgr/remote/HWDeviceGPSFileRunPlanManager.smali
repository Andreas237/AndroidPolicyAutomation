.class public Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;
.super Lo/cwz;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# static fields
.field private static final TAG:Ljava/lang/String; = "HWDeviceGPSFileRunPlanManager"

.field private static mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager; = null


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 70
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->mContext:Landroid/content/Context;

    .line 71
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->mContext:Landroid/content/Context;

    .line 72
    const-string v0, "HWDeviceGPSFileRunPlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWDeviceGPSFileRunPlanManager() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;
    .locals 2

    .line 63
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 64
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;

    .line 66
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileRunPlanManager;

    return-object v0
.end method


# virtual methods
.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 100
    const/16 v0, 0x3f5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 92
    return-void
.end method

.method public getRunPlanDetailFromDevice(Ljava/util/List;Lo/yg;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;Lo/yg;)V"
        }
    .end annotation

    .line 77
    const-string v0, "HWDeviceGPSFileRunPlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getRunPlanDetailFromDevice!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 79
    invoke-interface {v4, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 80
    new-instance v5, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;-><init>()V

    .line 81
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setType(I)V

    .line 82
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setGpsType(I)V

    .line 83
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    .line 84
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 85
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setTaskType(I)V

    .line 86
    invoke-virtual {v5, v4}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setRecordId(Ljava/util/List;)V

    .line 87
    invoke-static {}, Lo/dkv;->c()Lo/dkv;

    move-result-object v0

    invoke-virtual {v0, v5, p2}, Lo/dkv;->a(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V

    .line 88
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 105
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 106
    return-void
.end method
