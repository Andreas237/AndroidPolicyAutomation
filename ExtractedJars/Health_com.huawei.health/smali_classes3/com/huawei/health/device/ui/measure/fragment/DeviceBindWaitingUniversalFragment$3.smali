.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)V
    .locals 0

    .line 468
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 470
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Lcom/huawei/hihealth/device/open/IDeviceEventHandler;)Z

    move-result v3

    .line 471
    if-nez v3, :cond_0

    .line 472
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment$BindUniversalCallback;->onScanFailed(I)V

    .line 474
    :cond_0
    return-void
.end method
