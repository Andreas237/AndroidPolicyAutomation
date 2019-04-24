.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->initReconnect(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

.field final synthetic val$deviceInfoForWear:Lo/ahh;

.field final synthetic val$view:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V
    .locals 0

    .line 887
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->val$view:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->val$deviceInfoForWear:Lo/ahh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 891
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 892
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    .line 893
    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->access$1400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;)V

    .line 895
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_bt_left_btn_info:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;)V

    .line 919
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 929
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1002(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Lo/egy;)Lo/egy;

    .line 930
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 931
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 932
    goto :goto_0

    .line 933
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->val$view:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->val$deviceInfoForWear:Lo/ahh;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V

    .line 936
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 937
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceListAdapter initReconnect onClick deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v2, v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    .line 939
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->notifyDataSetChanged()V

    .line 941
    :goto_0
    return-void
.end method
