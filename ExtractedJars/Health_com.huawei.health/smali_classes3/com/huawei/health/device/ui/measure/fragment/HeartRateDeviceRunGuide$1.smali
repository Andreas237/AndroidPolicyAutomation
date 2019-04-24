.class Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 59
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 62
    new-instance v5, Lo/egy$b;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 64
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v5, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 65
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;)V

    invoke-virtual {v5, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 78
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;)V

    invoke-virtual {v5, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 85
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 86
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 87
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-static {}, Lo/aca;->e()Lo/aca;

    move-result-object v0

    invoke-virtual {v0}, Lo/aca;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/abw;

    .line 91
    if-nez v4, :cond_1

    .line 92
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginDeviceAdapter can not be null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    return-void

    .line 95
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-interface {v4, v0}, Lo/abw;->d(Landroid/content/Context;)V

    .line 98
    :goto_0
    return-void
.end method
