.class Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)V
    .locals 0

    .line 359
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 362
    if-ltz p3, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p3, v0, :cond_0

    .line 363
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lo/ajd;

    .line 364
    invoke-virtual {v2}, Lo/ajd;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/ajw;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lo/ajd;->h(Ljava/lang/String;)V

    .line 365
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 366
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 367
    const-string v0, "outhName"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$900(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 368
    const-string v0, "outhPd"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 369
    const-string v0, "add_device_info"

    invoke-virtual {v3, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 370
    const-string v0, "config_mode"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;)I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 371
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;-><init>()V

    .line 372
    invoke-virtual {v4, v3}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceBindResultFragment;->setArguments(Landroid/os/Bundle;)V

    .line 373
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;

    invoke-static {v0, v4}, Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/WiFiDeviceScanFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 375
    :cond_0
    return-void
.end method
