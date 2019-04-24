.class public Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field private textView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 75
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_ui_activity_quit_dialog_in_mea:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 31
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureRealTimeResult onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 33
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 35
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 40
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 41
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_show_realtime_result:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 42
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 43
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_search_prompt:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 44
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "content"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    .line 45
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 47
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_top_inside_center_tv:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->textView:Landroid/widget/TextView;

    .line 49
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_top_progress_bar:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ProgressBar;

    .line 50
    sget v0, Lcom/huawei/plugindevice/R$id;->device_measure_top_progress_bar_bg:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 51
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 52
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 53
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$drawable;->hw_device_meausure_progress:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 55
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$anim;->common_ui_circle_rotate:I

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v9

    .line 56
    invoke-virtual {v7, v9}, Landroid/widget/ProgressBar;->setAnimation(Landroid/view/animation/Animation;)V

    .line 57
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureRealTimeResult onCreateView:null == child"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :goto_0
    return-object v4
.end method

.method public saveResultData()V
    .locals 1

    .line 80
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 81
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->onDestroy()V

    .line 82
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 83
    return-void
.end method

.method public setTextValue(I)V
    .locals 2

    .line 66
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->textView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureRealTimeResult;->textView:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    :cond_0
    return-void
.end method
