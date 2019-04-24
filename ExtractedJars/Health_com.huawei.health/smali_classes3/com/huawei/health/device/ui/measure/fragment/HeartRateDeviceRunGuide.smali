.class public Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field private isFromFitnessAdvice:Z

.field private mTitle:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 22
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 24
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->isFromFitnessAdvice:Z

    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 2

    .line 110
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 111
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 112
    const-string v0, "isBindSuccess"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 113
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->popupFragment(Ljava/lang/Class;)V

    goto :goto_0

    .line 115
    :cond_0
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->popupFragment(Ljava/lang/Class;)V

    .line 118
    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 29
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 30
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    .line 31
    const-string v0, "title"

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->mTitle:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 37
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "HeartRateDeviceRunGuide onCreateView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 39
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_jabrabindsuccess_totrack:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v5

    .line 40
    sget v0, Lcom/huawei/plugindevice/R$id;->bind_success_info:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/ImageView;

    .line 41
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/cxa;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 42
    sget v0, Lcom/huawei/plugindevice/R$drawable;->device_jabra_bind_success_info_hw:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 44
    :cond_0
    sget v0, Lcom/huawei/plugindevice/R$drawable;->device_jabra_bind_success_info:I

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 47
    :goto_0
    sget v0, Lcom/huawei/plugindevice/R$id;->bind_success_toStack:I

    invoke-virtual {v5, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/egd;

    .line 48
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v8

    .line 49
    const/4 v0, 0x0

    if-eq v0, v8, :cond_1

    .line 50
    const-string v0, "isFromFitnessAdvice"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->isFromFitnessAdvice:Z

    .line 52
    :cond_1
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->isFromFitnessAdvice:Z

    if-eqz v0, :cond_2

    .line 53
    const/4 v0, 0x4

    invoke-virtual {v7, v0}, Lo/egd;->setVisibility(I)V

    .line 56
    :cond_2
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;)V

    invoke-virtual {v7, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 100
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 101
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 103
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->mTitle:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide;->setTitle(Ljava/lang/String;)V

    .line 104
    return-object v4
.end method
