.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;->handleMessageWhenReferenceNotNull(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;

.field final synthetic val$obj:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)V
    .locals 0

    .line 603
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;->val$obj:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 606
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;->val$obj:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 607
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;->val$obj:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 608
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;->val$obj:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x6

    invoke-virtual {v0, v1, v2}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 609
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment$ConnectHandler$1;->val$obj:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingFragment;->popupFragment(Ljava/lang/Class;)V

    .line 611
    :cond_0
    return-void
.end method
