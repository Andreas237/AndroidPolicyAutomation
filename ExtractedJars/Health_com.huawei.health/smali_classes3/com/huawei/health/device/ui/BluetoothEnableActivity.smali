.class public Lcom/huawei/health/device/ui/BluetoothEnableActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 23
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 26
    new-instance v3, Lo/egy$b;

    invoke-direct {v3, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 28
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v3, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 29
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/BluetoothEnableActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/BluetoothEnableActivity$2;-><init>(Lcom/huawei/health/device/ui/BluetoothEnableActivity;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 47
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/BluetoothEnableActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/BluetoothEnableActivity$1;-><init>(Lcom/huawei/health/device/ui/BluetoothEnableActivity;)V

    invoke-virtual {v3, v0, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 58
    invoke-virtual {v3}, Lo/egy$b;->a()Lo/egy;

    move-result-object v2

    .line 59
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lo/egy;->setCancelable(Z)V

    .line 60
    invoke-virtual {v2}, Lo/egy;->show()V

    .line 61
    return-void
.end method
