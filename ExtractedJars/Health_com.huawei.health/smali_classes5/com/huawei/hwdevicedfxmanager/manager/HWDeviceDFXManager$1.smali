.class Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->getMaintenanceFile(ILcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$1;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 208
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$1;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$100(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lo/dde;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager$1;->this$0:Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;

    invoke-static {v1}, Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;->access$000(Lcom/huawei/hwdevicedfxmanager/manager/HWDeviceDFXManager;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dde;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 209
    return-void
.end method
