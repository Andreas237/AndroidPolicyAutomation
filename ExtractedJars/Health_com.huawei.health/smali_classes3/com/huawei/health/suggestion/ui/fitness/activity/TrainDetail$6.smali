.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->b(Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

.field final synthetic d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)V
    .locals 0

    .line 1822
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1826
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->O(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F

    .line 1827
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v1, v0

    if-nez v0, :cond_0

    .line 1828
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have download progress:   1 == mDownleded "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1829
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F

    .line 1831
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v1, v2, v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;F)F

    .line 1832
    const-string v0, "TrainDetail"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "have download progress: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->R(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " --left: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->S(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1835
    :try_start_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->G(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lo/bsp;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->D(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v3}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->A(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireVersion()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lo/bsp;->c(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Z)Z

    .line 1836
    const-string v0, "TrainDetail"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----refreshProgessButton----"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v2}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->P(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "The true is down"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1839
    goto :goto_1

    .line 1837
    :catch_0
    move-exception v4

    .line 1838
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1841
    :goto_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->d:Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Lcom/huawei/pluginFitnessAdvice/FitWorkout;)Ljava/util/ArrayList;

    move-result-object v4

    .line 1842
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    .line 1843
    const-string v0, "TrainDetail"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "-----\u5b50\u7ebf\u7a0b\u8f6c\u6362\u6570\u636e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1844
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    const/4 v1, 0x1

    invoke-static {v0, v1, v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->e(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;ZLjava/util/ArrayList;)V

    goto :goto_2

    .line 1846
    :cond_2
    const-string v0, "TrainDetail"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fitness data error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1847
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    new-instance v1, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6$2;

    invoke-direct {v1, p0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6$2;-><init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$6;)V

    invoke-virtual {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 1855
    :goto_2
    return-void
.end method
