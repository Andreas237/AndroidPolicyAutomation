.class public Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# static fields
.field private static final DEVICE_AVAILABLE:Ljava/lang/String; = "com.huawei.health.action.DEVICE_AVAILABLE"


# instance fields
.field private mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

.field private mProductId:Ljava/lang/String;

.field private mTargetWeightValue:D

.field private mType:I

.field private weight:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 58
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 60
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    .line 252
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)D
    .locals 2

    .line 58
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    return-wide v0
.end method

.method static synthetic access$002(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;D)D
    .locals 0

    .line 58
    iput-wide p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    return-wide p1
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)V
    .locals 0

    .line 58
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->saveWeightData()V

    return-void
.end method

.method private parseData(Lo/afz;)Lo/agz;
    .locals 16

    .line 155
    move-object/from16 v5, p1

    check-cast v5, Lo/agg;

    .line 157
    new-instance v6, Lo/agz;

    invoke-direct {v6}, Lo/agz;-><init>()V

    .line 158
    invoke-virtual {v5}, Lo/agg;->a()F

    move-result v0

    float-to-double v0, v0

    move-object/from16 v2, p0

    iput-wide v0, v2, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->weight:D

    .line 159
    invoke-virtual {v5}, Lo/agg;->c()F

    move-result v0

    float-to-double v7, v0

    .line 160
    new-instance v9, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v9, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 161
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->weight:D

    invoke-virtual {v9, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v10

    .line 163
    invoke-virtual {v6, v10}, Lo/agz;->e(Ljava/lang/String;)V

    .line 166
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v7

    if-nez v0, :cond_0

    .line 167
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_weight_defualt_value:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v11

    .line 168
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_device_measure_weight_bodyfat_zero_result:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/agz;->d(I)V

    goto :goto_0

    .line 170
    :cond_0
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v12

    .line 171
    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 172
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double v0, v7, v0

    invoke-virtual {v12, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v11

    .line 173
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_device_measure_bottom_inside_circle_msg_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Lo/agz;->d(I)V

    .line 175
    :goto_0
    invoke-virtual {v6, v11}, Lo/agz;->a(Ljava/lang/String;)V

    .line 177
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightResultFragment parseData mTargetWeightValue is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-wide v3, v3, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->weight:D

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    sub-double/2addr v0, v2

    double-to-float v12, v0

    .line 180
    const/4 v13, 0x0

    .line 181
    const/4 v14, 0x0

    .line 182
    const/4 v15, 0x0

    .line 183
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 184
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v13

    .line 185
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_lb_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v13, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    goto :goto_1

    .line 188
    :cond_1
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v9, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v13

    .line 189
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_kg_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v13, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    .line 193
    :goto_1
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->weight:D

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 194
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_measure_result_less_target_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v14, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    goto :goto_2

    .line 195
    :cond_2
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->weight:D

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    .line 196
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_measure_result_more_target_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v14, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    goto :goto_2

    .line 197
    :cond_3
    move-object/from16 v0, p0

    iget-wide v0, v0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->weight:D

    move-object/from16 v2, p0

    iget-wide v2, v2, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mTargetWeightValue:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_4

    .line 198
    invoke-virtual/range {p0 .. p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_measure_result_equal_target_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v15

    .line 200
    :cond_4
    :goto_2
    invoke-virtual {v6, v15}, Lo/agz;->c(Ljava/lang/String;)V

    .line 202
    return-object v6
.end method

.method private saveWeightData()V
    .locals 11

    .line 267
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightResultFragment click saveWeightBtn and save data.."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 268
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 269
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v5

    .line 270
    if-eqz v5, :cond_0

    .line 271
    new-instance v6, Lo/agk;

    invoke-virtual {v5}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x2716

    invoke-direct {v6, v1, v0, v2}, Lo/agk;-><init>(ILjava/lang/String;I)V

    .line 272
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/afz;

    check-cast v0, Lo/afz;

    invoke-virtual {v6, v5, v0}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 274
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    invoke-virtual {v0}, Lo/afj;->g()Ljava/lang/String;

    move-result-object v7

    .line 275
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    invoke-virtual {v0, v7}, Lo/afd;->a(Ljava/lang/String;)Lo/afx;

    move-result-object v8

    .line 276
    invoke-virtual {v8}, Lo/afx;->e()Lo/afv;

    move-result-object v9

    .line 277
    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    .line 278
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mType:I

    invoke-virtual {v10, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 280
    if-eqz v9, :cond_0

    .line 281
    const/4 v0, 0x0

    invoke-virtual {v9, v5, v0, v10}, Lo/afv;->a(Lo/acl;Lo/abx;Landroid/os/Bundle;)Z

    .line 285
    :cond_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mType:I

    invoke-virtual {v0, v4, v1}, Lo/afd;->e(Ljava/lang/String;I)V

    .line 286
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 287
    invoke-virtual {v6}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c()Ljava/lang/Class;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 288
    new-instance v7, Landroid/content/Intent;

    invoke-direct {v7}, Landroid/content/Intent;-><init>()V

    .line 289
    const-string v0, "com.huawei.health"

    invoke-virtual {v7, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 290
    const-string v0, "healthdata"

    const-string v1, "MyHealthData_jump_mainActivity"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 291
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 292
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.BaseHealthDataActivity"

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 293
    const-string v0, "type"

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mType:I

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 294
    const-string v0, "weight_user_id"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->b()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 295
    invoke-virtual {v6, v7}, Lcom/huawei/health/device/ui/DeviceMainActivity;->startActivity(Landroid/content/Intent;)V

    .line 296
    invoke-virtual {v6}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 297
    goto :goto_0

    .line 298
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/device/ui/DeviceMainActivity;->finish()V

    .line 301
    :goto_0
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mProductId:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_AVAILABLE"

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    return-void
.end method


# virtual methods
.method protected initView(Ljava/lang/Object;)V
    .locals 12

    .line 208
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 210
    instance-of v0, p1, Lo/agz;

    if-eqz v0, :cond_2

    .line 213
    move-object v4, p1

    check-cast v4, Lo/agz;

    .line 214
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_weight_mearsure_result_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 215
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_weight_mearsure_result_value_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 216
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_measure_result_msg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    .line 218
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 219
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->weight:D

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 220
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_weight_value_unit_eng:I

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 223
    :cond_0
    invoke-virtual {v4}, Lo/agz;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    :goto_0
    invoke-virtual {v4}, Lo/agz;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 228
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_body_fat_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    .line 229
    invoke-virtual {v4}, Lo/agz;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    invoke-virtual {v4}, Lo/agz;->d()I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 234
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/egd;

    .line 235
    const/16 v0, 0x8

    invoke-virtual {v9, v0}, Lo/egd;->setVisibility(I)V

    .line 236
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v9, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 238
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lo/egd;

    .line 239
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_show_complete:I

    invoke-virtual {v10, v0}, Lo/egd;->setText(I)V

    .line 240
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v10, v0}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 242
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->b()Lo/acu;

    move-result-object v11

    .line 243
    invoke-virtual {v11}, Lo/acu;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 244
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 246
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 250
    :cond_2
    :goto_1
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .line 321
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_cancel_save_data:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    .line 70
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightResultFragment onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 72
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mType:I

    .line 73
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;)V

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 101
    const-wide/16 v0, 0x1f4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 104
    goto :goto_0

    .line 102
    :catch_0
    move-exception v4

    .line 103
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException e.getMessage() =="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :goto_0
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 15

    .line 109
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-super {p0, v0, v1, v2}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/view/ViewGroup;

    .line 110
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_weight_measure_result:I

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    .line 112
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/afz;

    .line 113
    if-nez v5, :cond_0

    .line 114
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightResultFragment ShowWeightResult get null result."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 116
    :cond_0
    invoke-direct {p0, v5}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->parseData(Lo/afz;)Lo/agz;

    move-result-object v6

    .line 117
    invoke-virtual {p0, v6}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->initView(Ljava/lang/Object;)V

    .line 120
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 122
    iput-object v6, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->mProductId:Ljava/lang/String;

    .line 124
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightResultFragment productId is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    if-eqz v6, :cond_1

    .line 127
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v7

    .line 128
    invoke-virtual {v7}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v8, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 129
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "WeightResultFragment deviceName is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 132
    const-string v0, "device_name"

    invoke-interface {v9, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    const-string v0, "device_type"

    iget-object v1, v7, Lo/afj;->e:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    new-instance v10, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v10, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 136
    new-instance v11, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 137
    invoke-virtual {v11, v10}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v12

    .line 138
    const-string v0, "measure_time"

    invoke-interface {v9, v0, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    sget-object v0, Lo/dae;->fN:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v13

    .line 141
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v13, v9, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 143
    const v0, 0x83f86

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v14

    .line 144
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v14, v9}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 147
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 148
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->child:Landroid/view/View;

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    :cond_2
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->setTitle(Ljava/lang/String;)V

    .line 151
    return-object v4
.end method

.method public release()V
    .locals 1

    .line 312
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->release()V

    .line 313
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->onDestroy()V

    .line 314
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 316
    return-void
.end method

.method public saveResultData()V
    .locals 0

    .line 306
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 307
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightResultFragment;->saveWeightData()V

    .line 308
    return-void
.end method
