.class public Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;
.super Lo/cwz;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwservicesmgr/remote/parser/IParser;


# static fields
.field private static final TAG:Ljava/lang/String; = "HWDeviceGPSFileWrokoutManager"

.field private static mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager; = null


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 51
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 4

    .line 60
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->mContext:Landroid/content/Context;

    .line 61
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->mContext:Landroid/content/Context;

    .line 62
    const-string v0, "HWDeviceGPSFileWrokoutManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HWDeviceGPSFileWrokoutManager() context = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->mContext:Landroid/content/Context;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    return-void
.end method

.method public static getInstance()Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;
    .locals 2

    .line 53
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 54
    new-instance v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;

    .line 56
    :cond_0
    sget-object v0, Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;->mInstance:Lcom/huawei/hwservicesmgr/remote/HWDeviceGPSFileWrokoutManager;

    return-object v0
.end method


# virtual methods
.method public getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 86
    const/16 v0, 0x3f4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public getResult(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;[B)V
    .locals 0

    .line 82
    return-void
.end method

.method public getWorkOutDetailFromDevice(ILjava/util/List;Lo/yg;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Lo/yg;)V"
        }
    .end annotation

    .line 66
    const-string v0, "HWDeviceGPSFileWrokoutManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWorkOutDetailFromDevice!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 68
    invoke-interface {v4, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 69
    new-instance v5, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-direct {v5}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;-><init>()V

    .line 70
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setType(I)V

    .line 72
    invoke-virtual {v5, p1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setGpsType(I)V

    .line 73
    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setPriority(I)V

    .line 74
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 75
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setTaskType(I)V

    .line 76
    invoke-virtual {v5, v4}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setRecordId(Ljava/util/List;)V

    .line 77
    invoke-static {}, Lo/dkv;->c()Lo/dkv;

    move-result-object v0

    invoke-virtual {v0, v5, p3}, Lo/dkv;->a(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Ljava/lang/Object;)V

    .line 78
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 91
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 92
    return-void
.end method
