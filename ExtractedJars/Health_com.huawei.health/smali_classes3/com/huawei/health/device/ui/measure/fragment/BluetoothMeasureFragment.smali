.class public abstract Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;
.source "SourceFile"


# static fields
.field private static final START_MEASURE:I = 0x0


# instance fields
.field private mCustomTextAlertDialog:Lo/egv;

.field private mHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;-><init>()V

    .line 28
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mHandler:Landroid/os/Handler;

    return-void
.end method

.method static synthetic access$001(Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;Z)V
    .locals 0

    .line 21
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->startMeasure(Z)V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;)Landroid/os/Handler;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mHandler:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method protected startMeasure()V
    .locals 3

    .line 44
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_2

    .line 45
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mProductId:Ljava/lang/String;

    invoke-static {v0}, Lo/ahd;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mStatus:Z

    if-eqz v0, :cond_0

    .line 47
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->startMeasure()V

    goto :goto_0

    .line 49
    :cond_0
    const/4 v0, 0x1

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->startMeasure(Z)V

    goto :goto_0

    .line 52
    :cond_1
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->startMeasure()V

    goto :goto_0

    .line 58
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mCustomTextAlertDialog:Lo/egv;

    if-eqz v0, :cond_3

    .line 59
    return-void

    .line 62
    :cond_3
    new-instance v2, Lo/egv$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v2, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 63
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 64
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_bluetooth_open_request:I

    invoke-virtual {v2, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 65
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_yes:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 77
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_dialog_no:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment$3;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 89
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mCustomTextAlertDialog:Lo/egv;

    .line 90
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mCustomTextAlertDialog:Lo/egv;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/egv;->setCancelable(Z)V

    .line 91
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->mCustomTextAlertDialog:Lo/egv;

    invoke-virtual {v0}, Lo/egv;->show()V

    .line 94
    :goto_0
    return-void
.end method
