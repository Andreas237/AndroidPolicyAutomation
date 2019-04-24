.class public Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field private mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

.field private mMeasureResultLevel:Ljava/lang/String;

.field private mMeasureValue:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 132
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->saveBloodSugarData()V

    return-void
.end method

.method private saveBloodSugarData()V
    .locals 8

    .line 146
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 147
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/afz;

    .line 148
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthDataUniversal"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    .line 150
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 151
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/afd;->d(Ljava/lang/String;)Lcom/huawei/hihealth/device/open/HealthDevice;

    move-result-object v6

    .line 152
    if-eqz v6, :cond_0

    .line 153
    new-instance v7, Lo/agi;

    invoke-virtual {v6}, Lcom/huawei/hihealth/device/open/HealthDevice;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x2711

    invoke-direct {v7, v1, v0, v2}, Lo/agi;-><init>(ILjava/lang/String;I)V

    .line 154
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "bloodSugarMeasureType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/agi;->a(I)V

    .line 155
    invoke-virtual {v7, v6, v5}, Lo/agi;->onDataChanged(Lcom/huawei/hihealth/device/open/HealthDevice;Lcom/huawei/hihealth/device/open/data/MeasureResult;)V

    .line 157
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/afd;->l(Ljava/lang/String;)V

    .line 158
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 159
    goto :goto_0

    :cond_1
    if-eqz v4, :cond_3

    .line 160
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v6

    .line 161
    if-eqz v6, :cond_2

    .line 162
    new-instance v7, Lo/agk;

    invoke-virtual {v6}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x2711

    invoke-direct {v7, v1, v0, v2}, Lo/agk;-><init>(ILjava/lang/String;I)V

    .line 163
    invoke-virtual {v7, v6, v4}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 165
    :cond_2
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/afd;->h(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 168
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method protected initView()V
    .locals 10

    .line 111
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 113
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_mearsure_result_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/TextView;

    .line 114
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_mearsure_result_time:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 115
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_measure_result_msg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 116
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mMeasureValue:Ljava/lang/String;

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getBundleFromDeviceMainActivity()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "bloodSugarMeasureTypeString"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_reference_result:I

    .line 119
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mMeasureResultLevel:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 118
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 121
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/egd;

    .line 123
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Lo/egd;->setVisibility(I)V

    .line 124
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v8, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/egd;

    .line 127
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_show_complete:I

    invoke-virtual {v9, v0}, Lo/egd;->setText(I)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v9, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 130
    :cond_0
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .line 186
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_cancel_save_data:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 13

    .line 56
    move-object/from16 v0, p3

    invoke-super {p0, p1, p2, v0}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 57
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_blood_sugar_measure_result:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    .line 58
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afz;

    .line 59
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthDataUniversal"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/hihealth/device/indoor/MeasureResultImpl;

    .line 60
    if-nez v5, :cond_2

    .line 61
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodSugarResultFragment get null result."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    if-eqz v6, :cond_1

    .line 63
    invoke-static {}, Lo/ahe;->b()Lo/ahe;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/ahe;->a(Lcom/huawei/hihealth/device/open/data/MeasureResult;)Lo/afz;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/afy;

    .line 64
    new-instance v8, Ljava/text/DecimalFormat;

    const-string v0, "#0.0"

    invoke-direct {v8, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 65
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 66
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodSugarResultUniversalFragment onCreateView mBodyDatas == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v7}, Lo/afy;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v8, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mMeasureValue:Ljava/lang/String;

    .line 69
    invoke-virtual {v7}, Lo/afy;->d()I

    move-result v0

    invoke-virtual {v7}, Lo/afy;->c()F

    move-result v1

    invoke-static {v0, v1}, Lo/afy;->e(IF)S

    move-result v9

    .line 70
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v9}, Lo/agq;->b(Landroid/content/Context;S)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mMeasureResultLevel:Ljava/lang/String;

    .line 72
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->initView()V

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodSugarResultFragment get null universal result."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 78
    :cond_2
    move-object v7, v5

    check-cast v7, Lo/afy;

    .line 79
    new-instance v8, Ljava/text/DecimalFormat;

    const-string v0, "#0.0"

    invoke-direct {v8, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v7}, Lo/afy;->c()F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v8, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mMeasureValue:Ljava/lang/String;

    .line 81
    invoke-virtual {v7}, Lo/afy;->d()I

    move-result v0

    invoke-virtual {v7}, Lo/afy;->c()F

    move-result v1

    invoke-static {v0, v1}, Lo/afy;->e(IF)S

    move-result v9

    .line 82
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v9}, Lo/agq;->b(Landroid/content/Context;S)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->mMeasureResultLevel:Ljava/lang/String;

    .line 84
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->initView()V

    .line 87
    :goto_1
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 88
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodSugerResultFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    if-eqz v7, :cond_3

    .line 91
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 92
    const-string v0, "device_name"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    invoke-virtual {v1, v7}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    const-string v0, "device_type"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    invoke-virtual {v1, v7}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    new-instance v9, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v9, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 96
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 97
    invoke-virtual {v10, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    .line 98
    const-string v0, "measure_time"

    invoke-interface {v8, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    sget-object v0, Lo/dae;->fO:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v12

    .line 101
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v12, v8, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 103
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 104
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 106
    :cond_4
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 107
    return-object v4
.end method

.method public release()V
    .locals 1

    .line 178
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->release()V

    .line 179
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->onDestroy()V

    .line 180
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 181
    return-void
.end method

.method public saveResultData()V
    .locals 0

    .line 172
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 173
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodSugarResultUniversalFragment;->saveBloodSugarData()V

    .line 174
    return-void
.end method
