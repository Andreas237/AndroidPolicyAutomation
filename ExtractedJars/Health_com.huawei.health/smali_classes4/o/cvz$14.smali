.class Lo/cvz$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->k(Landroid/content/Context;JJLo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lo/duh;

.field final synthetic d:Lo/cvz;

.field final synthetic e:J


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;JJ)V
    .locals 0

    .line 1820
    iput-object p1, p0, Lo/cvz$14;->d:Lo/cvz;

    iput-object p2, p0, Lo/cvz$14;->b:Lo/duh;

    iput-wide p3, p0, Lo/cvz$14;->e:J

    iput-wide p5, p0, Lo/cvz$14;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 1823
    iget-object v0, p0, Lo/cvz$14;->b:Lo/duh;

    if-nez v0, :cond_0

    .line 1824
    return-void

    .line 1826
    :cond_0
    if-eqz p2, :cond_4

    .line 1828
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1830
    move-object v0, p2

    :try_start_0
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 1833
    goto :goto_0

    .line 1831
    :catch_0
    move-exception v5

    .line 1832
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAnnualFitnessReport data ClassCastException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1835
    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1836
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/health/suggestion/model/WorkoutRecord;

    .line 1837
    new-instance v8, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;

    invoke-direct {v8}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;-><init>()V

    .line 1838
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/cvz$14;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 1839
    goto :goto_2

    .line 1841
    :cond_1
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    iget-wide v2, p0, Lo/cvz$14;->a:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 1842
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->saveWorkoutName(Ljava/lang/String;)V

    .line 1843
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireDuring()I

    move-result v0

    invoke-virtual {v8, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->saveDuring(I)V

    .line 1844
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireExerciseTime()J

    move-result-wide v0

    invoke-virtual {v8, v0, v1}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->saveExerciseTime(J)V

    .line 1845
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/WorkoutRecord;->acquireWorkoutDate()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/huawei/pluginachievement/report/bean/AnnualReportFitnessRaw;->saveWorkoutDate(Ljava/lang/String;)V

    .line 1847
    :cond_2
    invoke-interface {v5, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1848
    goto :goto_1

    .line 1849
    :cond_3
    :goto_2
    iget-object v0, p0, Lo/cvz$14;->b:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1850
    goto :goto_3

    .line 1851
    :cond_4
    iget-object v0, p0, Lo/cvz$14;->b:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1853
    :goto_3
    return-void
.end method
