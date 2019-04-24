.class public Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "WifiWeightResultFragment"


# instance fields
.field private isSaveWeight:Z

.field private mBetweenGoalTv:Landroid/widget/TextView;

.field private mBodyFatValueTv:Landroid/widget/TextView;

.field private mCompleteBtn:Lo/egd;

.field private mProductId:Ljava/lang/String;

.field private mProductInfo:Lo/afj;

.field private mRemeasureBtn:Lo/egd;

.field private mTargetWeightValue:D

.field private mWeightAndFatRateData:Lo/agg;

.field private mWeightUnitTv:Landroid/widget/TextView;

.field private mWeightValueTv:Landroid/widget/TextView;

.field private weight:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 56
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductId:Ljava/lang/String;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductInfo:Lo/afj;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    .line 67
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->isSaveWeight:Z

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->goBackToLastPage()V

    return-void
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)D
    .locals 2

    .line 53
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    return-wide v0
.end method

.method static synthetic access$102(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;D)D
    .locals 0

    .line 53
    iput-wide p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    return-wide p1
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->showWeightData()V

    return-void
.end method

.method static synthetic access$300(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)Landroid/app/Activity;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method private getUserTargetWeightValue()V
    .locals 4

    .line 153
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)V

    const/4 v2, 0x0

    const/4 v3, 0x5

    invoke-interface {v0, v2, v3, v1}, Lo/clt;->d(IILo/clz;)V

    .line 184
    return-void
.end method

.method private goBackToLastPage()V
    .locals 7

    .line 263
    new-instance v4, Lo/dcy;

    invoke-direct {v4}, Lo/dcy;-><init>()V

    .line 264
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mainActivity:Landroid/app/Activity;

    const/16 v1, 0x272f

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "health_wifi_notify_TIMESTAMP"

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    .line 265
    invoke-virtual {v3}, Lo/agg;->o()Ljava/lang/String;

    move-result-object v3

    .line 264
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 268
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    invoke-virtual {v0}, Lo/agg;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 269
    sget-object v0, Lo/act;->a:Lo/act;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    invoke-virtual {v1}, Lo/agg;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Ljava/lang/String;)Lo/acu;

    move-result-object v5

    .line 270
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v5}, Lo/act;->c(Lo/acu;)V

    .line 271
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 272
    const-string v0, "com.huawei.health"

    invoke-virtual {v6, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 273
    const-string v0, "healthdata"

    const-string v1, "MyHealthData_jump_mainActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 274
    const-string v0, "base_health_data_type_key"

    const/4 v1, 0x1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 275
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.BaseHealthDataActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 276
    const-string v0, "weight_user_id"

    sget-object v1, Lo/act;->a:Lo/act;

    invoke-virtual {v1}, Lo/act;->b()Lo/acu;

    move-result-object v1

    invoke-virtual {v1}, Lo/acu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 277
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 278
    goto :goto_0

    .line 279
    :cond_0
    new-instance v5, Landroid/content/Intent;

    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 280
    const-string v0, "com.huawei.health"

    invoke-virtual {v5, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 281
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.ui.main.stories.health.activity.healthdata.ClaimMeasureDataActivity"

    invoke-virtual {v5, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 282
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mainActivity:Landroid/app/Activity;

    invoke-virtual {v0, v5}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 283
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current data is suspected data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 285
    :goto_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->isSaveWeight:Z

    .line 286
    return-void
.end method

.method private initData()V
    .locals 2

    .line 113
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductId:Ljava/lang/String;

    .line 114
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/agg;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    .line 115
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductInfo:Lo/afj;

    .line 116
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductInfo:Lo/afj;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductInfo:Lo/afj;

    iget-object v0, v0, Lo/afj;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 117
    :cond_0
    return-void

    .line 119
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductId:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->setTitle(Ljava/lang/String;)V

    .line 120
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->showWeightData()V

    .line 121
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->sendEventToKaKa()V

    .line 122
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getUserTargetWeightValue()V

    .line 123
    return-void
.end method

.method private initView()V
    .locals 2

    .line 95
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_weight_mearsure_result_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightValueTv:Landroid/widget/TextView;

    .line 96
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_weight_mearsure_result_value_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightUnitTv:Landroid/widget/TextView;

    .line 97
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_body_fat_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBodyFatValueTv:Landroid/widget/TextView;

    .line 98
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_measure_result_msg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBetweenGoalTv:Landroid/widget/TextView;

    .line 99
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mCompleteBtn:Lo/egd;

    .line 100
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mRemeasureBtn:Lo/egd;

    .line 102
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mCompleteBtn:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_show_complete:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 103
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mCompleteBtn:Lo/egd;

    new-instance v1, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$1;

    invoke-direct {v1, p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;)V

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mRemeasureBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 110
    return-void
.end method

.method private parseData(Lo/agg;)Lo/agz;
    .locals 15

    .line 209
    new-instance v5, Lo/agz;

    invoke-direct {v5}, Lo/agz;-><init>()V

    .line 210
    invoke-virtual/range {p1 .. p1}, Lo/agg;->a()F

    move-result v0

    float-to-double v0, v0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->weight:D

    .line 211
    invoke-virtual/range {p1 .. p1}, Lo/agg;->c()F

    move-result v0

    float-to-double v6, v0

    .line 212
    new-instance v8, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v8, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 213
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->weight:D

    invoke-virtual {v8, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v9

    .line 214
    invoke-virtual {v5, v9}, Lo/agz;->e(Ljava/lang/String;)V

    .line 217
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, v6

    if-nez v0, :cond_0

    .line 218
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_weight_defualt_value:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    .line 219
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_device_measure_weight_bodyfat_zero_result:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/agz;->d(I)V

    goto :goto_0

    .line 221
    :cond_0
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v11

    .line 222
    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 223
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double v0, v6, v0

    invoke-virtual {v11, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v10

    .line 224
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_device_measure_bottom_inside_circle_msg_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Lo/agz;->d(I)V

    .line 226
    :goto_0
    invoke-virtual {v5, v10}, Lo/agz;->a(Ljava/lang/String;)V

    .line 227
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "parseData mTargetWeightValue is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 229
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->weight:D

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    sub-double/2addr v0, v2

    double-to-float v11, v0

    .line 230
    const/4 v12, 0x0

    .line 231
    const/4 v13, 0x0

    .line 232
    const/4 v14, 0x0

    .line 233
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 234
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v12

    .line 235
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_lb_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    goto :goto_1

    .line 238
    :cond_1
    invoke-static {v11}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v8, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v12

    .line 239
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_kg_string:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v12, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    .line 243
    :goto_1
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->weight:D

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    cmpl-double v0, v0, v2

    if-lez v0, :cond_2

    .line 244
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_measure_result_less_target_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v13, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    goto :goto_2

    .line 245
    :cond_2
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->weight:D

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    cmpg-double v0, v0, v2

    if-gez v0, :cond_3

    .line 246
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_measure_result_more_target_msg:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v13, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    goto :goto_2

    .line 247
    :cond_3
    iget-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->weight:D

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mTargetWeightValue:D

    cmpl-double v0, v0, v2

    if-nez v0, :cond_4

    .line 248
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_measure_result_equal_target_msg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    .line 250
    :cond_4
    :goto_2
    invoke-virtual {v5, v14}, Lo/agz;->c(Ljava/lang/String;)V

    .line 251
    return-object v5
.end method

.method private sendEventToKaKa()V
    .locals 11

    .line 188
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductInfo:Lo/afj;

    invoke-virtual {v0}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v4, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 189
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deviceName is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 191
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 192
    const-string v0, "device_name"

    invoke-interface {v5, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    const-string v0, "device_type"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mProductInfo:Lo/afj;

    iget-object v1, v1, Lo/afj;->e:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    new-instance v6, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 196
    new-instance v7, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v7, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v8

    .line 198
    const-string v0, "measure_time"

    invoke-interface {v5, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    sget-object v0, Lo/dae;->fN:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v9

    .line 201
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v9, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 203
    const/16 v0, 0x4ba

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    .line 204
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v10, v5}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 205
    return-void
.end method

.method private showWeightData()V
    .locals 7

    .line 127
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "refreshWeightDataView"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 128
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->parseData(Lo/agg;)Lo/agz;

    move-result-object v5

    .line 129
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 130
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightValueTv:Landroid/widget/TextView;

    iget-wide v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->weight:D

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightUnitTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_weight_value_unit_eng:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 133
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightValueTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBodyFatValueTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBodyFatValueTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBetweenGoalTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    sget-object v0, Lo/act;->a:Lo/act;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    invoke-virtual {v1}, Lo/agg;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/act;->c(Ljava/lang/String;)Lo/acu;

    move-result-object v6

    .line 140
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mWeightAndFatRateData:Lo/agg;

    invoke-virtual {v0}, Lo/agg;->d()Z

    move-result v0

    if-nez v0, :cond_2

    .line 141
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-virtual {v6}, Lo/acu;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 142
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBetweenGoalTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 144
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBetweenGoalTv:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 147
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->mBetweenGoalTv:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 149
    :goto_1
    return-void
.end method


# virtual methods
.method public onBackPressed()Z
    .locals 1

    .line 256
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->goBackToLastPage()V

    .line 257
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 70
    const-string v0, "WifiWeightResultFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 72
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 75
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 76
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_weight_measure_result:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->initView()V

    .line 78
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->initData()V

    .line 79
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 80
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 82
    :cond_0
    return-object v2
.end method

.method public onStop()V
    .locals 1

    .line 87
    iget-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->isSaveWeight:Z

    if-eqz v0, :cond_0

    .line 88
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->popupFragment(Ljava/lang/Class;)V

    .line 89
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightResultFragment;->isSaveWeight:Z

    .line 91
    :cond_0
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onStop()V

    .line 92
    return-void
.end method
