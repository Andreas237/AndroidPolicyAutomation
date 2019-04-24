.class public Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# instance fields
.field private mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 150
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->saveBloodPressureData()V

    return-void
.end method

.method private static getMeasureResuleValueString(Landroid/content/Context;II)Ljava/lang/String;
    .locals 4

    .line 200
    const-string v2, ""

    .line 201
    int-to-short v0, p1

    int-to-short v1, p2

    invoke-static {v0, v1}, Lo/agb;->d(SS)I

    move-result v3

    .line 202
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 206
    :pswitch_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_pressure_result_level_low:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 207
    goto :goto_0

    .line 211
    :pswitch_1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_pressure_result_level_normal:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 212
    goto :goto_0

    .line 216
    :pswitch_2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_high:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 217
    goto :goto_0

    .line 221
    :pswitch_3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_pressure_result_level_mild:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 222
    goto :goto_0

    .line 226
    :pswitch_4
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_pressure_result_level_moderate:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 227
    goto :goto_0

    .line 231
    :pswitch_5
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_show_bloodpressure_level_high:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 232
    .line 239
    :goto_0
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private initView(Lo/age;)V
    .locals 15

    .line 93
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureResultFragment initView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    move-object/from16 v4, p1

    .line 96
    invoke-virtual {v4}, Lo/age;->a()S

    move-result v5

    .line 97
    invoke-virtual {v4}, Lo/age;->c()S

    move-result v6

    .line 98
    invoke-virtual {v4}, Lo/age;->b()S

    move-result v7

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->mainActivity:Landroid/app/Activity;

    .line 101
    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_reference_result:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->mainActivity:Landroid/app/Activity;

    .line 102
    invoke-static {v2, v5, v6}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->getMeasureResuleValueString(Landroid/content/Context;II)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 101
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 105
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureResultFragment showPressureResultView() null == child"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    return-void

    .line 108
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->measure_pressure_result_systolic_pressure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    .line 109
    int-to-double v0, v5

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->measure_pressure_result_diastolic_pressure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    .line 112
    int-to-double v0, v6

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 114
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->measure_pressure_result_heart_rate:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    .line 115
    int-to-double v0, v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_pressure_result_level:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    .line 118
    invoke-virtual {v12, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/egd;

    .line 122
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lo/egd;->setVisibility(I)V

    .line 123
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v13, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lo/egd;

    .line 126
    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lo/egd;->setVisibility(I)V

    .line 127
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v14, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    return-void
.end method

.method private saveBloodPressureData()V
    .locals 6

    .line 167
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/afz;

    .line 168
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "productId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v4

    .line 169
    if-eqz v4, :cond_0

    .line 170
    new-instance v5, Lo/agk;

    invoke-virtual {v4}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x2712

    invoke-direct {v5, v1, v0, v2}, Lo/agk;-><init>(ILjava/lang/String;I)V

    .line 171
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;)V

    invoke-virtual {v5, v0}, Lo/agk;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 192
    invoke-virtual {v5, v4, v3}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 194
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "productId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 195
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 147
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_cancel_save_data:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 14

    .line 50
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    invoke-super {p0, p1, v0, v1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 51
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_blood_pressure_measure_result:I

    move-object/from16 v1, p2

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    .line 53
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v5

    .line 55
    if-eqz v5, :cond_0

    .line 56
    move-object v0, v5

    check-cast v0, Lo/age;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->initView(Lo/age;)V

    goto :goto_0

    .line 58
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "BloodPressureResultFragment onCreateView serializable = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 62
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressureResultFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    if-eqz v6, :cond_1

    .line 65
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v7, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 67
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "BloodPressureResultFragment deviceName is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 70
    const-string v0, "device_name"

    invoke-interface {v8, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    const-string v0, "device_type"

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    invoke-virtual {v1, v6}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-virtual {v1}, Lo/afj;->k()Lo/acl$a;

    move-result-object v1

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    new-instance v9, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v9, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 74
    new-instance v10, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v10, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v10, v9}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v11

    .line 76
    const-string v0, "measure_time"

    invoke-interface {v8, v0, v11}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    sget-object v0, Lo/dae;->fQ:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v12

    .line 79
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v12, v8, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 81
    const/16 v0, 0x640

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    .line 82
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v13, v8}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 84
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 85
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 88
    return-object v4
.end method

.method public release()V
    .locals 1

    .line 138
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->release()V

    .line 139
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->onDestroy()V

    .line 140
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 141
    return-void
.end method

.method public saveResultData()V
    .locals 0

    .line 132
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 133
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureResultFragment;->saveBloodPressureData()V

    .line 134
    return-void
.end method
