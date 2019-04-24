.class Lo/cwi$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ceu;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;->b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bru;

.field final synthetic c:Lo/cwi;

.field final synthetic d:Lcom/huawei/health/suggestion/model/RunWorkout;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cwi;Lo/bru;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;)V
    .locals 0

    .line 338
    iput-object p1, p0, Lo/cwi$8;->c:Lo/cwi;

    iput-object p2, p0, Lo/cwi$8;->b:Lo/bru;

    iput-object p3, p0, Lo/cwi$8;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/cwi$8;->d:Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 5

    .line 341
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportInfo:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 342
    iget-object v0, p0, Lo/cwi$8;->b:Lo/bru;

    invoke-interface {v0, p1}, Lo/bru;->b(Landroid/os/Bundle;)V

    .line 343
    const-string v0, "sportState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 344
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->n(Lo/cwi;)I

    move-result v0

    if-eq v0, v4, :cond_0

    .line 345
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/yy;->a(I)V

    .line 347
    :cond_0
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0, v4}, Lo/cwi;->a(Lo/cwi;I)I

    .line 348
    return-void
.end method

.method public d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 7

    .line 352
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/cwi;->c(Lo/cwi;I)V

    .line 353
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_RUN_END_2050006:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v0, v2, v1}, Lcom/huawei/operation/OpAnalyticsUtil;->setEventWithActionType(ILjava/lang/String;)V

    .line 354
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 355
    const-string v0, "actiontype"

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    invoke-static {}, Lcom/huawei/operation/OpAnalyticsUtil;->getInstance()Lcom/huawei/operation/OpAnalyticsUtil;

    move-result-object v0

    sget-object v1, Lcom/huawei/operation/OperationKey;->HEALTH_APP_PVUV_85050001:Lcom/huawei/operation/OperationKey;

    invoke-virtual {v1}, Lcom/huawei/operation/OperationKey;->value()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lcom/huawei/operation/OpAnalyticsUtil;->setEvent2nd(Ljava/lang/String;Ljava/util/LinkedHashMap;)I

    .line 357
    if-nez p1, :cond_0

    .line 358
    iget-object v0, p0, Lo/cwi$8;->b:Lo/bru;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/bru;->a(Lcom/huawei/health/suggestion/model/Summary;)V

    .line 359
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSummary: null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 360
    return-void

    .line 362
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v5

    .line 363
    if-eqz v5, :cond_1

    .line 364
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackType is abnormal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 365
    return-void

    .line 368
    :cond_1
    new-instance v6, Lcom/huawei/health/suggestion/model/Summary;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/Summary;-><init>()V

    .line 369
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setSportId(Ljava/lang/String;)V

    .line 370
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setDistance(F)V

    .line 371
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setDuring(I)V

    .line 372
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setCalorie(F)V

    .line 373
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setExerciseTime(J)V

    .line 374
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBestPace()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setBestPace(I)V

    .line 375
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setStartTime(J)V

    .line 376
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setEndTime(J)V

    .line 377
    iget-object v0, p0, Lo/cwi$8;->e:Ljava/lang/String;

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setPlanId(Ljava/lang/String;)V

    .line 378
    iget-object v0, p0, Lo/cwi$8;->d:Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutId(Ljava/lang/String;)V

    .line 379
    iget-object v0, p0, Lo/cwi$8;->d:Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutDate(Ljava/lang/String;)V

    .line 380
    iget-object v0, p0, Lo/cwi$8;->d:Lcom/huawei/health/suggestion/model/RunWorkout;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/RunWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutName(Ljava/lang/String;)V

    .line 382
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->i(Lo/cwi;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 383
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 384
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_maxMET()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setMaxMet(I)V

    .line 385
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_achieve_percent()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setFinishRate(I)V

    .line 386
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->f(Lo/cwi;)Lcom/huawei/exercise/modle/RunPlanRecordInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/exercise/modle/RunPlanRecordInfo;->getRun_plan_record_info_load_peak()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/Summary;->setTrainingLoadPeak(I)V

    .line 388
    :cond_2
    iget-object v0, p0, Lo/cwi$8;->b:Lo/bru;

    invoke-interface {v0, v6}, Lo/bru;->a(Lcom/huawei/health/suggestion/model/Summary;)V

    goto :goto_0

    .line 390
    :cond_3
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0, v6}, Lo/cwi;->a(Lo/cwi;Lcom/huawei/health/suggestion/model/Summary;)Lcom/huawei/health/suggestion/model/Summary;

    .line 391
    iget-object v0, p0, Lo/cwi$8;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 393
    :goto_0
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSummary:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/Summary;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 394
    return-void
.end method
