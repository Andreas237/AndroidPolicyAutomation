.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aby;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->processingLogicEvent(IILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

.field final synthetic val$configMode:I


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;I)V
    .locals 0

    .line 671
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    iput p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;->val$configMode:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Lo/acl;)V
    .locals 0

    .line 675
    return-void
.end method

.method public onScanFailed(I)V
    .locals 0

    .line 679
    return-void
.end method

.method public onStateChanged(I)V
    .locals 5

    .line 682
    const-string v0, "WiFiDeviceBindResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bindDevice onStateChanged code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 683
    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    .line 684
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 685
    const/4 v0, 0x6

    iput v0, v4, Landroid/os/Message;->what:I

    .line 686
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;->val$configMode:I

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 687
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 688
    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    if-ne p1, v0, :cond_1

    .line 689
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    .line 690
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 691
    const/4 v0, 0x5

    iput v0, v4, Landroid/os/Message;->what:I

    .line 692
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;->val$configMode:I

    iput v0, v4, Landroid/os/Message;->arg1:I

    .line 693
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;)Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment$MyHandler;->sendMessage(Landroid/os/Message;)Z

    .line 695
    :cond_1
    :goto_0
    return-void
.end method
