.class public Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;
.super Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;
.source "SourceFile"


# instance fields
.field private factory:Lo/agd;

.field private measuringProgressBar:Landroid/widget/ProgressBar;

.field private measuringProgressBarBg:Landroid/widget/ImageView;

.field searchDeviceTVPromptMsg:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;-><init>()V

    return-void
.end method

.method private init()V
    .locals 3

    .line 84
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 85
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_search_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->searchDeviceTVPromptMsg:Landroid/widget/TextView;

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_unit_center_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 87
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_top_progress_bar_bg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->measuringProgressBarBg:Landroid/widget/ImageView;

    .line 88
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_top_progress_bar:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->measuringProgressBar:Landroid/widget/ProgressBar;

    .line 89
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->searchDeviceTVPromptMsg:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_connecting_21:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 90
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->searchDeviceTVPromptMsg:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 91
    const/4 v0, 0x4

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 92
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->setProgressBar()V

    .line 94
    :cond_0
    return-void
.end method

.method private setProgressBar()V
    .locals 4

    .line 103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->measuringProgressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 104
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->measuringProgressBarBg:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->measuringProgressBar:Landroid/widget/ProgressBar;

    .line 106
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$drawable;->hw_device_meausure_progress:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 108
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$anim;->common_ui_circle_rotate:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v3

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->measuringProgressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setAnimation(Landroid/view/animation/Animation;)V

    .line 110
    return-void
.end method


# virtual methods
.method protected handleDataChangedInUiThread(Lo/acl;Lo/afz;Z)V
    .locals 6

    .line 113
    if-eqz p2, :cond_1

    .line 114
    if-eqz p3, :cond_1

    .line 115
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->factory:Lo/agd;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mKind:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v4

    .line 116
    if-nez v4, :cond_0

    .line 117
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    return-void

    .line 120
    :cond_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 121
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    const-string v0, "HealthData"

    invoke-virtual {v5, v0, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 124
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 125
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 128
    :cond_1
    return-void
.end method

.method protected handleDataChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;Z)V
    .locals 6

    .line 132
    if-eqz p2, :cond_1

    .line 133
    if-eqz p3, :cond_1

    .line 134
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->factory:Lo/agd;

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mKind:Ljava/lang/String;

    invoke-static {v0}, Lo/agd;->a(Ljava/lang/String;)Lcom/huawei/health/device/ui/BaseFragment;

    move-result-object v4

    .line 135
    if-nez v4, :cond_0

    .line 136
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 137
    return-void

    .line 139
    :cond_0
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 140
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    const-string v0, "HealthData"

    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v1

    invoke-virtual {v1, p2}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 143
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 144
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 147
    :cond_1
    return-void
.end method

.method protected handleFailedEventInUiThread(Lo/acl;I)V
    .locals 1

    .line 195
    invoke-static {p2}, Lo/adz;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 196
    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->showErrorDialog(Ljava/lang/String;)V

    .line 197
    return-void
.end method

.method protected handleStatusChangedInUiThread(Lo/acl;I)V
    .locals 6

    .line 151
    instance-of v0, p1, Lo/acg;

    if-eqz v0, :cond_2

    .line 152
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is bleDevice"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 154
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IHealthDeviceCallback.STATUS_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->searchDeviceTVPromptMsg:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_measuring:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 156
    :cond_0
    const/4 v0, 0x5

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    if-nez p2, :cond_2

    .line 159
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not IHealthDeviceCallback.STATUS_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->stopTimer()V

    .line 161
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;-><init>()V

    .line 162
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 163
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    const-string v0, "kind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mKind:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->setArguments(Landroid/os/Bundle;)V

    .line 167
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 171
    :cond_2
    :goto_0
    return-void
.end method

.method protected handleStatusChangedInUiThreadUniversal(Lcom/huawei/hihealth/device/open/HealthDevice;I)V
    .locals 6

    .line 175
    const/4 v0, 0x2

    if-ne p2, v0, :cond_0

    .line 176
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "IHealthDeviceCallback.STATUS_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->searchDeviceTVPromptMsg:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_measuring:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 178
    :cond_0
    const/4 v0, 0x5

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    if-nez p2, :cond_2

    .line 181
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not IHealthDeviceCallback.STATUS_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->stopTimer()V

    .line 183
    new-instance v4, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;

    invoke-direct {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;-><init>()V

    .line 184
    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    .line 185
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 186
    const-string v0, "kind"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mKind:Ljava/lang/String;

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 187
    const-string v0, "title"

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 188
    invoke-virtual {v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceConnectFailedFragment;->setArguments(Landroid/os/Bundle;)V

    .line 189
    invoke-virtual {p0, v4}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->switchFragment(Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 191
    :cond_2
    :goto_0
    return-void
.end method

.method public onBackPressed()Z
    .locals 4

    .line 73
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasuringProgressFragment onBackPressed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_activity_quit_dialog_in_mea:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 80
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onCreate(Landroid/os/Bundle;)V

    .line 81
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 42
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/ViewGroup;

    .line 43
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mProductId:Ljava/lang/String;

    .line 44
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "kind"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mKind:Ljava/lang/String;

    .line 45
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_show_realtime_result:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->child:Landroid/view/View;

    .line 46
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->init()V

    .line 47
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 48
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 49
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->child:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mCustomTitleBar:Lo/emr;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/plugindevice/R$string;->IDS_device_selection_start_measure:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/emr;->setTitleText(Ljava/lang/String;)V

    .line 52
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->mCustomTitleBar:Lo/emr;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;)V

    invoke-virtual {v0, v1}, Lo/emr;->setLeftButtonOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    return-object v3
.end method

.method public onStart()V
    .locals 1

    .line 97
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->onStart()V

    .line 98
    new-instance v0, Lo/agd;

    invoke-direct {v0}, Lo/agd;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->factory:Lo/agd;

    .line 99
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->startMeasure()V

    .line 100
    return-void
.end method

.method public saveResultData()V
    .locals 4

    .line 63
    invoke-super {p0}, Lcom/huawei/health/device/ui/measure/fragment/BluetoothMeasureFragment;->saveResultData()V

    .line 65
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasuringPro  finish "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 66
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->popupFragment(Ljava/lang/Class;)V

    .line 67
    return-void
.end method

.method public showErrorDialog(Ljava/lang/String;)V
    .locals 6

    .line 200
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onBackPressed showErrorDialog()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 203
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 204
    new-instance v5, Lo/egy$b;

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-direct {v5, v0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 206
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_error_pressure_result_error:I

    invoke-virtual {v5, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    .line 207
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_confirm:I

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;)V

    invoke-virtual {v5, v0, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 216
    invoke-virtual {v5}, Lo/egy$b;->a()Lo/egy;

    move-result-object v4

    .line 217
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lo/egy;->setCancelable(Z)V

    .line 218
    invoke-virtual {v4}, Lo/egy;->show()V

    .line 220
    :cond_0
    return-void
.end method
