.class Lo/cwi$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;)V
    .locals 0

    .line 552
    iput-object p1, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 642
    const/4 v0, 0x0

    return-object v0
.end method

.method public a(ILjava/lang/String;)V
    .locals 1

    .line 611
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->c(I)V

    .line 612
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 632
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0, p1}, Lo/cwi;->c(Lo/cwi;Ljava/lang/String;)V

    .line 633
    return-void
.end method

.method public b(Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V
    .locals 5

    .line 570
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start runworkout enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 571
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0, p1}, Lo/cwi;->d(Lo/cwi;Ljava/lang/String;)Ljava/lang/String;

    .line 572
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0, p2}, Lo/cwi;->c(Lo/cwi;Lcom/huawei/health/suggestion/model/RunWorkout;)Lcom/huawei/health/suggestion/model/RunWorkout;

    .line 573
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0, p3}, Lo/cwi;->e(Lo/cwi;Lo/bru;)Lo/bru;

    .line 574
    if-nez p4, :cond_0

    .line 575
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 576
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    iget-object v1, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v1}, Lo/cwi;->e(Lo/cwi;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v2}, Lo/cwi;->b(Lo/cwi;)Lcom/huawei/health/suggestion/model/RunWorkout;

    move-result-object v2

    iget-object v3, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v3}, Lo/cwi;->c(Lo/cwi;)Lo/bru;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/cwi;->b(Lo/cwi;Ljava/lang/String;Lcom/huawei/health/suggestion/model/RunWorkout;Lo/bru;Landroid/content/Context;)V

    .line 577
    return-void

    .line 579
    :cond_0
    invoke-static {}, Lo/yy;->b()Lo/yy;

    move-result-object v0

    new-instance v1, Lo/cwi$10$2;

    invoke-direct {v1, p0, p4}, Lo/cwi$10$2;-><init>(Lo/cwi$10;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lo/yy;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 596
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 621
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->a(Ljava/lang/String;)V

    .line 622
    return-void
.end method

.method public b()Z
    .locals 1

    .line 606
    const/4 v0, 0x0

    return v0
.end method

.method public c()V
    .locals 3

    .line 563
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 564
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 565
    return-void
.end method

.method public c(Landroid/os/Bundle;)V
    .locals 3

    .line 556
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->p(Lo/cwi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v2

    .line 557
    iput-object p1, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 558
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 559
    return-void
.end method

.method public c([ILjava/lang/String;)V
    .locals 1

    .line 616
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->c([I)V

    .line 617
    return-void
.end method

.method public d()V
    .locals 0

    .line 647
    return-void
.end method

.method public e()V
    .locals 0

    .line 651
    return-void
.end method

.method public e(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bru;Landroid/content/Context;)V
    .locals 4

    .line 600
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start runworkout enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-object v0, p0, Lo/cwi$10;->c:Lo/cwi;

    invoke-static {v0, p1, p2, p3}, Lo/cwi;->a(Lo/cwi;Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bru;Landroid/content/Context;)V

    .line 602
    return-void
.end method

.method public e([Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 626
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "playStateSound url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 627
    invoke-static {}, Lo/cbl;->b()Lo/cbl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cbl;->c([Ljava/lang/String;)V

    .line 628
    return-void
.end method

.method public k()Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;
    .locals 7

    .line 658
    new-instance v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;

    invoke-direct {v4}, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;-><init>()V

    .line 659
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    invoke-virtual {v0}, Lo/dgu;->d()Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;

    move-result-object v5

    .line 660
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 661
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getClassifyMethod()I

    move-result v6

    .line 662
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 663
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->maxThreshold:I

    .line 664
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->anaerobicThreshold:I

    .line 665
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->aerobicThreshold:I

    .line 666
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFatBurnThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->fatBurnThreshold:I

    .line 667
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getWarmUpThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->warmUpThreshold:I

    .line 668
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getFitnessThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->minThreshold:I

    goto :goto_0

    .line 670
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getMaxThreshold()I

    move-result v0

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getRestHeartRate()I

    move-result v1

    sub-int/2addr v0, v1

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->maxThreshold:I

    .line 671
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicAdvanceThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->anaerobicThreshold:I

    .line 672
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAnaerobicBaseThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->aerobicThreshold:I

    .line 673
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getLacticAcidThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->fatBurnThreshold:I

    .line 674
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicAdvanceThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->warmUpThreshold:I

    .line 675
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/fitnessdatatype/HeartZoneConf;->getAerobicBaseThreshold()I

    move-result v0

    iput v0, v4, Lcom/huawei/health/suggestion/model/fitness/FitHRZoneConfig;->minThreshold:I

    .line 677
    :goto_0
    goto :goto_1

    .line 678
    :cond_1
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHeartRateZone null != dataThroshold"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 680
    :goto_1
    return-object v4
.end method
