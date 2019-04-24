.class Lo/cwi$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ceu;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwi;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;Lo/bru;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cwi;

.field final synthetic d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

.field final synthetic e:Lo/bru;


# direct methods
.method constructor <init>(Lo/cwi;Lo/bru;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 0

    .line 745
    iput-object p1, p0, Lo/cwi$11;->b:Lo/cwi;

    iput-object p2, p0, Lo/cwi$11;->e:Lo/bru;

    iput-object p3, p0, Lo/cwi$11;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 4

    .line 748
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sportInfo:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 749
    iget-object v0, p0, Lo/cwi$11;->e:Lo/bru;

    invoke-interface {v0, p1}, Lo/bru;->b(Landroid/os/Bundle;)V

    .line 750
    return-void
.end method

.method public d(Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;)V
    .locals 6

    .line 754
    iget-object v0, p0, Lo/cwi$11;->b:Lo/cwi;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/cwi;->c(Lo/cwi;I)V

    .line 755
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 756
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSummary: null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 757
    iget-object v0, p0, Lo/cwi$11;->e:Lo/bru;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/bru;->a(Lcom/huawei/health/suggestion/model/Summary;)V

    .line 758
    return-void

    .line 760
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestAbnormalTrack()I

    move-result v4

    .line 761
    if-eqz v4, :cond_1

    .line 762
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "trackType is abnormal = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 763
    iget-object v0, p0, Lo/cwi$11;->e:Lo/bru;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/bru;->a(Lcom/huawei/health/suggestion/model/Summary;)V

    .line 764
    return-void

    .line 766
    :cond_1
    new-instance v5, Lcom/huawei/health/suggestion/model/Summary;

    invoke-direct {v5}, Lcom/huawei/health/suggestion/model/Summary;-><init>()V

    .line 767
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

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Summary;->setSportId(Ljava/lang/String;)V

    .line 768
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalDistance()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Summary;->setDistance(F)V

    .line 769
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalTime()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    long-to-int v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Summary;->setDuring(I)V

    .line 770
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestTotalCalories()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Summary;->setCalorie(F)V

    .line 771
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setExerciseTime(J)V

    .line 772
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestBestPace()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Summary;->setBestPace(I)V

    .line 773
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestStartTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setStartTime(J)V

    .line 774
    invoke-virtual {p1}, Lcom/huawei/healthcloud/plugintrack/model/MotionPathSimplify;->requestEndTime()J

    move-result-wide v0

    invoke-virtual {v5, v0, v1}, Lcom/huawei/health/suggestion/model/Summary;->setEndTime(J)V

    .line 776
    iget-object v0, p0, Lo/cwi$11;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutId(Ljava/lang/String;)V

    .line 778
    iget-object v0, p0, Lo/cwi$11;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/health/suggestion/model/Summary;->setWorkoutName(Ljava/lang/String;)V

    .line 779
    iget-object v0, p0, Lo/cwi$11;->e:Lo/bru;

    invoke-interface {v0, v5}, Lo/bru;->a(Lcom/huawei/health/suggestion/model/Summary;)V

    .line 780
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onSummary:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/Summary;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 781
    return-void
.end method
