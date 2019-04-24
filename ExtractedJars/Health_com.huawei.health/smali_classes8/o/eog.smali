.class public Lo/eog;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {p1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getInstance(Landroid/content/Context;)Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    move-result-object v0

    iput-object v0, p0, Lo/eog;->a:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    .line 18
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
    .locals 4

    .line 33
    const-string v0, "UploadMaintLogInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getMaintenanceFile()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    iget-object v0, p0, Lo/eog;->a:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getMaintenanceFile(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V

    .line 35
    return-void
.end method

.method public e(Z)V
    .locals 4

    .line 25
    const-string v0, "UploadMaintLogInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startUploadLogFile()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 26
    iget-object v0, p0, Lo/eog;->a:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-virtual {v0, p1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->startUploadLogFile(Z)V

    .line 27
    return-void
.end method
