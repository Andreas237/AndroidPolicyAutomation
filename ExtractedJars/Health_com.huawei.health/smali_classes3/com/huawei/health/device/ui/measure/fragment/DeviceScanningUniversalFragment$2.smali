.class Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 152
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0}, Lo/afd;->a()V

    .line 153
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/huawei/health/device/ui/DeviceMainActivity;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/DeviceMainActivity;->d(Ljava/util/ArrayList;)V

    .line 155
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;-><init>()V

    .line 156
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 157
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 158
    if-ltz p3, :cond_1

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p3, v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getDeviceName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$700(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Ljava/lang/String;)V

    .line 160
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hihealth/device/open/HealthDevice;

    invoke-virtual {v1}, Lcom/huawei/hihealth/device/open/HealthDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v2, "SHA-256"

    invoke-virtual {v0, v1, v2}, Lo/afq;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 161
    const-string v0, "productId"

    invoke-virtual {v5, v0, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    const-string v0, "scan_kind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    const-string v0, "position"

    invoke-virtual {v5, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 164
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceScanningFragment productId is *****"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 165
    goto :goto_0

    .line 167
    :cond_0
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    const-string v0, "position"

    invoke-virtual {v5, v0, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 169
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanningFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :cond_1
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanningFragment position is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 173
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceScanningFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindWaitingUniversalFragment;->setArguments(Landroid/os/Bundle;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-static {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 177
    return-void
.end method
