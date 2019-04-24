.class public Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field private mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

.field private mMeasureResultLevel:Ljava/lang/String;

.field private mMeasureValue:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 121
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->saveBloodSugarData()V

    return-void
.end method

.method private saveBloodSugarData()V
    .locals 6

    .line 134
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 135
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v4

    .line 136
    if-eqz v4, :cond_0

    .line 137
    new-instance v5, Lo/agk;

    invoke-virtual {v4}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x2711

    invoke-direct {v5, v1, v0, v2}, Lo/agk;-><init>(ILjava/lang/String;I)V

    .line 138
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;)V

    invoke-virtual {v5, v0}, Lo/agk;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 159
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/afz;

    check-cast v0, Lo/afz;

    invoke-virtual {v5, v4, v0}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 161
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/afd;->h(Ljava/lang/String;)V

    .line 162
    return-void
.end method


# virtual methods
.method protected initView()V
    .locals 10

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 102
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_mearsure_result_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_mearsure_result_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 104
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_measure_result_msg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mMeasureValue:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "bloodSugarMeasureTypeString"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_reference_result:I

    .line 108
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mMeasureResultLevel:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 107
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 110
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/egd;

    .line 112
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/egd;->setVisibility(I)V

    .line 113
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v8, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/egd;

    .line 116
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_show_complete:I

    invoke-virtual {v9, v0}, Lo/egd;->setText(I)V

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v9, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    :cond_0
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .line 180
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_cancel_save_data:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 13

    .line 57
    move-object/from16 v0, p3

    invoke-super {p0, p1, p2, v0}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 58
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_blood_sugar_measure_result:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    .line 59
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afz;

    .line 60
    if-nez v5, :cond_0

    .line 61
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodSugarResultFragment get null result."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 64
    :cond_0
    move-object v6, v5

    check-cast v6, Lo/afy;

    .line 65
    new-instance v7, Ljava/text/DecimalFormat;

    const-string v0, "#0.0"

    invoke-direct {v7, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v6}, Lo/afy;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v7, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mMeasureValue:Ljava/lang/String;

    .line 67
    invoke-virtual {v6}, Lo/afy;->d()I

    move-result v0

    invoke-virtual {v6}, Lo/afy;->c()F

    move-result v1

    invoke-static {v0, v1}, Lo/afy;->e(IF)S

    move-result v8

    .line 68
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v8}, Lo/agq;->b(Landroid/content/Context;S)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->mMeasureResultLevel:Ljava/lang/String;

    .line 70
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->initView()V

    .line 73
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 74
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodSugerResultFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    if-eqz v6, :cond_1

    .line 77
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 78
    const-string v0, "device_name"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    invoke-virtual {v1, v6}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    const-string v0, "device_type"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    invoke-virtual {v1, v6}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    new-instance v8, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v8, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 82
    new-instance v9, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v9, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v9, v8}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v10

    .line 84
    const-string v0, "measure_time"

    invoke-interface {v7, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    sget-object v0, Lo/dae;->fO:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v11

    .line 87
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v11, v7, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 89
    const/16 v0, 0x6a4

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    .line 90
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v12, v7}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 92
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 93
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 95
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 96
    return-object v4
.end method

.method public release()V
    .locals 1

    .line 172
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->release()V

    .line 173
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->onDestroy()V

    .line 174
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 175
    return-void
.end method

.method public saveResultData()V
    .locals 0

    .line 166
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 167
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultFragment;->saveBloodSugarData()V

    .line 168
    return-void
.end method
