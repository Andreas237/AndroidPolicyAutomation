.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->showAuthorizeAlertDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 0

    .line 495
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 498
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 499
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/dnm;

    move-result-object v0

    const-string v1, "DeviceBindWaitingFragment"

    const/4 v2, 0x7

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v0, v2, v3, v1, v4}, Lo/dnm;->e(IZLjava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 501
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V

    .line 502
    return-void
.end method
