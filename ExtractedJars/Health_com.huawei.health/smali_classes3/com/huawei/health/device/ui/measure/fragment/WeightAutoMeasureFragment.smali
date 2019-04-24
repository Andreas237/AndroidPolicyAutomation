.class public Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;
.super Lcom/huawei/health/device/ui/BaseFragment;
.source "SourceFile"


# static fields
.field private static final CLASS_NAME:Ljava/lang/String;

.field private static final DEVICE_AVAILABLE:Ljava/lang/String; = "com.huawei.health.action.DEVICE_AVAILABLE"


# instance fields
.field private betweenGoalTv:Landroid/widget/TextView;

.field private bodyFatResultTv:Landroid/widget/TextView;

.field private healthData:Lo/afz;

.field private iconImage:Landroid/widget/ImageView;

.field private isMeasured:Z

.field private mCallback:Lo/abx;

.field private mController:Lo/aeu;

.field private mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

.field private mHiUserInfo:Lo/acu;

.field private mTargetWeightValue:D

.field private nameTv:Landroid/widget/TextView;

.field private productId:Ljava/lang/String;

.field private reMeasureBtn:Lo/egd;

.field private saveBtn:Lo/egd;

.field private weight:F

.field private weightResultTv:Landroid/widget/TextView;

.field private weightResultUnitTv:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 58
    const-class v0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->CLASS_NAME:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/device/ui/BaseFragment;-><init>()V

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->isMeasured:Z

    .line 74
    const-wide/high16 v0, 0x404e000000000000L    # 60.0

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mTargetWeightValue:D

    .line 78
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$1;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mCallback:Lo/abx;

    .line 366
    new-instance v0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$2;

    invoke-direct {v0, p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment$2;-><init>(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)V

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    return-void
.end method

.method static synthetic access$000(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$100(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;Lo/acl;Lo/afz;)V
    .locals 0

    .line 57
    invoke-direct {p0, p1, p2}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->handleDataChangedInUiThread(Lo/acl;Lo/afz;)V

    return-void
.end method

.method static synthetic access$200(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$300()Ljava/lang/String;
    .locals 1

    .line 57
    sget-object v0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->CLASS_NAME:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$400(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$500(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$600(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$700(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)Landroid/app/Activity;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic access$800(Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->saveWeightData()V

    return-void
.end method

.method private getTargetWeight(Lo/agz;)Ljava/lang/String;
    .locals 9

    .line 282
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->CLASS_NAME:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " parseData mTargetWeightValue is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mTargetWeightValue:D

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 283
    new-instance v5, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v5, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 284
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weight:F

    float-to-double v0, v0

    iget-wide v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mTargetWeightValue:D

    sub-double/2addr v0, v2

    double-to-float v6, v0

    .line 285
    const/4 v7, 0x0

    .line 286
    const/4 v8, 0x0

    .line 287
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 288
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Lo/cxh;->e(D)D

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v7

    .line 289
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$plurals;->IDS_device_show_set_target_recommend_distance_eng:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    .line 292
    :cond_0
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v0

    float-to-double v0, v0

    invoke-virtual {v5, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v7

    .line 293
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_show_set_target_recommend_distance:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 295
    :goto_0
    const/4 v0, 0x0

    if-eq v0, p1, :cond_1

    .line 296
    invoke-virtual {p1, v8}, Lo/agz;->c(Ljava/lang/String;)V

    .line 298
    :cond_1
    return-object v8
.end method

.method private handleDataChangedInUiThread(Lo/acl;Lo/afz;)V
    .locals 4

    .line 145
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->CLASS_NAME:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "handleDataChangedInUiThread"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 147
    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->healthData:Lo/afz;

    .line 148
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->isMeasured:Z

    .line 149
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->initViewData()V

    .line 151
    :cond_0
    return-void
.end method

.method private initData()V
    .locals 9

    .line 206
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    .line 207
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "HealthData"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lo/afz;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->healthData:Lo/afz;

    .line 208
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "productId"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    .line 209
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->isMeasured:Z

    .line 210
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 211
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v2

    .line 212
    invoke-virtual {v2}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v3, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 213
    invoke-static {}, Lo/agl;->e()Lo/agl;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/agl;->c(Ljava/lang/String;)V

    .line 214
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 215
    const-string v0, "device_name"

    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    const-string v0, "device_type"

    iget-object v1, v2, Lo/afj;->e:Lo/acl$a;

    invoke-virtual {v1}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    new-instance v5, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 219
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyyMMddHHmmss"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 220
    invoke-virtual {v6, v5}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v7

    .line 221
    const-string v0, "measure_time"

    invoke-interface {v4, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    const/16 v0, 0x4ba

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    .line 224
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v8, v4}, Lo/dth;->c(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)I

    .line 226
    :cond_0
    return-void
.end method

.method private initView()V
    .locals 2

    .line 305
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_weight_mearsure_result_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weightResultTv:Landroid/widget/TextView;

    .line 307
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_weight_mearsure_result_value_unit:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weightResultUnitTv:Landroid/widget/TextView;

    .line 308
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_sugar_measure_result_msg:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->betweenGoalTv:Landroid/widget/TextView;

    .line 309
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_remeasure:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->reMeasureBtn:Lo/egd;

    .line 310
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->tv_body_fat_value:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->bodyFatResultTv:Landroid/widget/TextView;

    .line 311
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->weight_user_icon:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->iconImage:Landroid/widget/ImageView;

    .line 312
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->weight_user_name:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->nameTv:Landroid/widget/TextView;

    .line 313
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->reMeasureBtn:Lo/egd;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/egd;->setVisibility(I)V

    .line 314
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    sget v1, Lcom/huawei/plugindevice/R$id;->bt_device_measure_result_save:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egd;

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->saveBtn:Lo/egd;

    .line 315
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->saveBtn:Lo/egd;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measureactivity_result_save:I

    invoke-virtual {v0, v1}, Lo/egd;->setText(I)V

    .line 316
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->saveBtn:Lo/egd;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mDeviceMeasureOnClick:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lo/egd;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 317
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->initViewData()V

    .line 319
    :cond_0
    return-void
.end method

.method private initViewData()V
    .locals 6

    .line 325
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->healthData:Lo/afz;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 326
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->healthData:Lo/afz;

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->parseData(Lo/afz;)Lo/agz;

    move-result-object v5

    .line 327
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 328
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 329
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weightResultTv:Landroid/widget/TextView;

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weight:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    const/4 v3, 0x1

    const/4 v4, 0x1

    invoke-static {v1, v2, v3, v4}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 330
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weightResultUnitTv:Landroid/widget/TextView;

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_weight_value_unit_eng:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    .line 332
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weightResultTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 334
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->betweenGoalTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 335
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->bodyFatResultTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 336
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->bodyFatResultTv:Landroid/widget/TextView;

    invoke-virtual {v5}, Lo/agz;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 339
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 340
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->nameTv:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 341
    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->iconImage:Landroid/widget/ImageView;

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->setUserNameAndPhoto(Landroid/content/Context;Lo/acu;Landroid/widget/ImageView;)V

    .line 342
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->sendUserInfo()V

    .line 344
    :cond_2
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v5

    .line 345
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v5}, Lo/afj;->n()Lo/afj$a;

    move-result-object v1

    iget-object v1, v1, Lo/afj$a;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->setTitle(Ljava/lang/String;)V

    .line 346
    return-void
.end method

.method private parseData(Lo/afz;)Lo/agz;
    .locals 8

    .line 239
    instance-of v0, p1, Lo/agg;

    if-eqz v0, :cond_0

    .line 240
    move-object v2, p1

    check-cast v2, Lo/agg;

    .line 241
    new-instance v3, Lo/agz;

    invoke-direct {v3}, Lo/agz;-><init>()V

    .line 242
    invoke-virtual {v2}, Lo/agg;->a()F

    move-result v0

    iput v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weight:F

    .line 243
    invoke-virtual {v2}, Lo/agg;->c()F

    move-result v0

    float-to-double v4, v0

    .line 244
    new-instance v6, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v6, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 245
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->weight:F

    float-to-double v0, v0

    invoke-virtual {v6, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v7

    .line 246
    invoke-virtual {v3, v7}, Lo/agz;->e(Ljava/lang/String;)V

    .line 247
    invoke-direct {p0, v3, v4, v5}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->setFatRat(Lo/agz;D)V

    .line 248
    invoke-direct {p0, v3}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getTargetWeight(Lo/agz;)Ljava/lang/String;

    .line 249
    return-object v3

    .line 251
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private saveWeightData()V
    .locals 9

    .line 380
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 381
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v4

    .line 383
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v4}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 384
    invoke-virtual {v4}, Lo/afj;->n()Lo/afj$a;

    move-result-object v0

    iget-object v5, v0, Lo/afj$a;->c:Ljava/lang/String;

    .line 385
    invoke-virtual {v4}, Lo/afj;->k()Lo/acl$a;

    move-result-object v0

    invoke-virtual {v0}, Lo/acl$a;->name()Ljava/lang/String;

    move-result-object v6

    .line 386
    const-string v0, "device_name"

    invoke-interface {v3, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    const-string v0, "device_type"

    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    :cond_0
    sget-object v0, Lo/dae;->fW:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 390
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v3, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 393
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->saveBtn:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    .line 394
    return-void

    .line 398
    :cond_1
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0}, Lo/act;->d()Lo/acu;

    move-result-object v6

    .line 399
    sget-object v0, Lo/act;->a:Lo/act;

    invoke-virtual {v0, v6}, Lo/act;->c(Lo/acu;)V

    .line 402
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->b(Ljava/lang/String;)Lo/acl;

    move-result-object v7

    .line 403
    if-eqz v7, :cond_2

    .line 404
    new-instance v8, Lo/agk;

    invoke-virtual {v7}, Lo/acl;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x2716

    invoke-direct {v8, v1, v0, v2}, Lo/agk;-><init>(ILjava/lang/String;I)V

    .line 405
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->healthData:Lo/afz;

    invoke-virtual {v8, v7, v0}, Lo/agk;->onDataChanged(Lo/acl;Lo/afz;)V

    .line 407
    :cond_2
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 408
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 410
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    const-string v2, "com.huawei.health.action.DEVICE_AVAILABLE"

    invoke-virtual {v0, v1, v2}, Lo/afd;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 411
    return-void
.end method

.method private sendUserInfo()V
    .locals 4

    .line 352
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 353
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    invoke-virtual {v0}, Lo/acu;->h()F

    move-result v2

    .line 354
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_0

    .line 355
    float-to-double v0, v2

    iput-wide v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mTargetWeightValue:D

    .line 357
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 358
    const-string v0, "height"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->d()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 359
    const-string v0, "sex"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->c()B

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 360
    const-string v0, "age"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mHiUserInfo:Lo/acu;

    invoke-virtual {v1}, Lo/acu;->b()I

    move-result v1

    invoke-virtual {v3, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 361
    new-instance v0, Lo/ahi$a;

    const-string v1, "weight_measure_set_user"

    invoke-direct {v0, v1, v3}, Lo/ahi$a;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-static {v0}, Lo/ahi;->e(Lo/ahi$a;)V

    .line 362
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->setTargetText()V

    .line 364
    :cond_1
    return-void
.end method

.method private setFatRat(Lo/agz;D)V
    .locals 6

    .line 256
    const-wide/16 v0, 0x0

    cmpl-double v0, v0, p2

    if-nez v0, :cond_0

    .line 257
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_measure_weight_defualt_value:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 258
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_device_measure_weight_bodyfat_zero_result:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/agz;->d(I)V

    goto :goto_0

    .line 260
    :cond_0
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v5

    .line 261
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 262
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double v0, p2, v0

    invoke-virtual {v5, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    .line 263
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$color;->hw_device_measure_bottom_inside_circle_msg_color:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lo/agz;->d(I)V

    .line 265
    :goto_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setFatRat FR:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 266
    invoke-virtual {p1, v4}, Lo/agz;->a(Ljava/lang/String;)V

    .line 267
    return-void
.end method

.method private setTargetText()V
    .locals 2

    .line 272
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getTargetWeight(Lo/agz;)Ljava/lang/String;

    move-result-object v1

    .line 273
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->betweenGoalTv:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 274
    return-void
.end method

.method private setUserPhoto(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V
    .locals 2

    .line 453
    const-string v0, "default"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 454
    invoke-static {p1, p2}, Lo/dbk;->d(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 455
    if-eqz v1, :cond_0

    .line 456
    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 458
    :cond_0
    goto :goto_0

    .line 459
    :cond_1
    sget v0, Lcom/huawei/plugindevice/R$drawable;->ic_device_user_icon:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 461
    :goto_0
    return-void
.end method


# virtual methods
.method protected handleFailedEventInUiThread(Lo/acl;I)V
    .locals 4

    .line 174
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->CLASS_NAME:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "handleFailedEventInUiThread"

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    return-void
.end method

.method protected handleStatusChangedInUiThread(Lo/acl;I)V
    .locals 4

    .line 159
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    sget-object v2, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->CLASS_NAME:Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleStatusChangedInUiThread status:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x3

    if-eq v0, p2, :cond_0

    const/16 v0, 0x9

    if-eq v0, p2, :cond_0

    const/4 v0, 0x6

    if-ne v0, p2, :cond_1

    .line 164
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->isMeasured:Z

    .line 166
    :cond_1
    return-void
.end method

.method public onBackPressed()Z
    .locals 1

    .line 415
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->saveBtn:Lo/egd;

    invoke-virtual {v0}, Lo/egd;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 416
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_cancel_save_data:I

    invoke-super {p0, v0}, Lcom/huawei/health/device/ui/BaseFragment;->showCustomAlertDialog(I)Z

    move-result v0

    return v0

    .line 418
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 179
    invoke-super {p0, p1}, Lcom/huawei/health/device/ui/BaseFragment;->onCreate(Landroid/os/Bundle;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/aeu;->e(Landroid/content/Context;)Lo/aeu;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mController:Lo/aeu;

    .line 181
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mController:Lo/aeu;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mCallback:Lo/abx;

    invoke-virtual {v0, v1}, Lo/aeu;->a(Lo/abx;)V

    .line 182
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->initData()V

    .line 183
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 193
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/health/device/ui/BaseFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/ViewGroup;

    .line 194
    sget v0, Lcom/huawei/plugindevice/R$layout;->device_weight_auto_measure:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    .line 195
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->initView()V

    .line 196
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 197
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->child:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 199
    :cond_0
    return-object v2
.end method

.method public onDestroy()V
    .locals 2

    .line 423
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->onDestroy()V

    .line 424
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->productId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->mainActivity:Landroid/app/Activity;

    invoke-static {v0}, Lo/aeu;->e(Landroid/content/Context;)Lo/aeu;

    move-result-object v0

    invoke-virtual {v0}, Lo/aeu;->e()V

    .line 426
    return-void
.end method

.method public release()V
    .locals 1

    .line 187
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->release()V

    .line 188
    invoke-virtual {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 189
    return-void
.end method

.method public saveResultData()V
    .locals 0

    .line 229
    invoke-super {p0}, Lcom/huawei/health/device/ui/BaseFragment;->saveResultData()V

    .line 230
    invoke-direct {p0}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->saveWeightData()V

    .line 231
    return-void
.end method

.method public setUserNameAndPhoto(Landroid/content/Context;Lo/acu;Landroid/widget/ImageView;)V
    .locals 1

    .line 436
    invoke-virtual {p2}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 437
    invoke-virtual {p2}, Lo/acu;->l()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p3}, Lcom/huawei/health/device/ui/measure/fragment/WeightAutoMeasureFragment;->setUserPhoto(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    goto :goto_0

    .line 439
    :cond_0
    invoke-virtual {p2}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_1

    .line 440
    sget v0, Lcom/huawei/plugindevice/R$drawable;->ic_device_user_icon:I

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 442
    :cond_1
    invoke-virtual {p2}, Lo/acu;->n()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lo/dbk;->b(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 445
    :goto_0
    return-void
.end method
