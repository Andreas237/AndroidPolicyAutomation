.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ems$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->setAddButton(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

.field final synthetic val$source:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Ljava/lang/String;)V
    .locals 0

    .line 378
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;->val$source:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSingleTap(I)V
    .locals 3

    .line 381
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 383
    :sswitch_0
    const-string v0, "me"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;->val$source:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 384
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-direct {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;-><init>()V

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;->val$source:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/BaseFragment;Ljava/lang/String;)V

    goto :goto_0

    .line 386
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$4;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-direct {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;-><init>()V

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$1500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 389
    .line 393
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
