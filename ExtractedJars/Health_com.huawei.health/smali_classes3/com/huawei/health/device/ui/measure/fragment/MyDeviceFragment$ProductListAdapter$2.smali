.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->initReconnect(Lo/egd;Landroid/widget/LinearLayout;Lo/ahh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

.field final synthetic val$deviceInfoForWear:Lo/ahh;

.field final synthetic val$loadinglayout:Landroid/widget/LinearLayout;

.field final synthetic val$reconnectlayout:Lo/egd;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 954
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$deviceInfoForWear:Lo/ahh;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$reconnectlayout:Lo/egd;

    iput-object p4, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$loadinglayout:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 958
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 959
    new-instance v0, Lo/egy$b;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    .line 960
    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_bt_right_btn_info:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;)V

    .line 962
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_bt_left_btn_info:I

    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$1;

    invoke-direct {v2, p0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;)V

    .line 982
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v4

    .line 992
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2202(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/egy;)Lo/egy;

    .line 993
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egy;->setCancelable(Z)V

    .line 994
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 995
    goto :goto_0

    .line 996
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$deviceInfoForWear:Lo/ahh;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$reconnectlayout:Lo/egd;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$loadinglayout:Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->access$2300(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V

    .line 997
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/acl$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/acl$a;)V

    .line 998
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 1000
    :goto_0
    return-void
.end method
