.class public Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    return-void
.end method

.method private init()V
    .locals 7

    .line 63
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_search_prompt:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/TextView;

    .line 68
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 69
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_unit_center_tv:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 72
    const/4 v0, 0x4

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 74
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_top_progress_bar:I

    .line 75
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ProgressBar;

    .line 76
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->device_measure_top_progress_bar_bg:I

    .line 77
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 78
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 79
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$drawable;->hw_device_meausure_progress:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 83
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$anim;->common_ui_circle_rotate:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v6

    .line 84
    invoke-virtual {v4, v6}, Landroid/widget/ProgressBar;->setAnimation(Landroid/view/animation/Animation;)V

    .line 87
    :cond_0
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 4

    .line 31
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasuringProgressFragment onBackPressed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_activity_quit_dialog_in_mea:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 47
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 48
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_show_realtime_result:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->child:Landroid/view/View;

    .line 49
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->init()V

    .line 50
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 51
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 53
    :cond_0
    return-object v2
.end method

.method public onDestroy()V
    .locals 0

    .line 59
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 60
    return-void
.end method

.method public saveResultData()V
    .locals 1

    .line 39
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 40
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->onDestroy()V

    .line 41
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasuringProgressFragment;->popupFragment(Ljava/lang/Class;)V

    .line 42
    return-void
.end method
