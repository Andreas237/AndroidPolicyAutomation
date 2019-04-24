.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private button:Lo/egd;

.field private mKind:Ljava/lang/String;

.field private mProductId:Ljava/lang/String;

.field private mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 81
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasureGuidFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->popupFragment(Ljava/lang/Class;)V

    .line 83
    const/4 v0, 0x0

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 63
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->button:Lo/egd;

    if-ne p1, v0, :cond_0

    .line 64
    new-instance v2, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;

    invoke-direct {v2}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;-><init>()V

    .line 65
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 66
    const-string v0, "kind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mKind:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    invoke-virtual {v2, v3}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 69
    invoke-virtual {p0, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 72
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 31
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 32
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v4

    .line 34
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 35
    const-string v0, "productId"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mProductId:Ljava/lang/String;

    .line 36
    const-string v0, "kind"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mKind:Ljava/lang/String;

    .line 37
    const-string v0, "title"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mTitle:Ljava/lang/String;

    .line 38
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mProductId = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mKind = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mKind:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 40
    :cond_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .line 44
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup;

    .line 46
    sget v0, Lcom/huawei/plugindevice/R$layout;->connect_fail_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 47
    sget v0, Lcom/huawei/plugindevice/R$id;->bt_device_connect_error_confirm:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->button:Lo/egd;

    .line 48
    sget v0, Lcom/huawei/plugindevice/R$id;->device_connect_error_tips_tv:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 50
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_common_err_measure_failed_prompts:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 51
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-wide/high16 v1, 0x4000000000000000L    # 2.0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v8, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 52
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->button:Lo/egd;

    invoke-virtual {v0, p0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 55
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 57
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->mTitle:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->setTitle(Ljava/lang/String;)V

    .line 58
    return-object v5
.end method

.method public onDestroy()V
    .locals 0

    .line 76
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 77
    return-void
.end method
