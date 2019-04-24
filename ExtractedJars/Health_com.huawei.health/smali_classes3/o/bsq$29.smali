.class Lo/bsq$29;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->b(ILo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/model/AccountInfo;

.field final synthetic d:Lo/bsq;

.field final synthetic e:Lo/bui;


# direct methods
.method constructor <init>(Lo/bsq;Lcom/huawei/health/suggestion/model/AccountInfo;Lo/bui;)V
    .locals 0

    .line 2924
    iput-object p1, p0, Lo/bsq$29;->d:Lo/bsq;

    iput-object p2, p0, Lo/bsq$29;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    iput-object p3, p0, Lo/bsq$29;->e:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 8

    .line 2940
    invoke-static {p1}, Lo/bso;->e(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/TrainStatistics;

    move-result-object v4

    .line 2942
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "trainStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$29;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 2943
    invoke-static {v5}, Lo/bso;->a(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/TrainStatistics;

    move-result-object v6

    .line 2945
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireDuration()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireDuration()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 2946
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireDuration()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveDuration(J)V

    .line 2949
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireCalorie()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireCalorie()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 2950
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireCalorie()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveCalorie(J)V

    .line 2953
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireTotalTimes()J

    move-result-wide v0

    invoke-virtual {v4}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireTotalTimes()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 2954
    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/TrainStatistics;->acquireTotalTimes()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/suggestion/model/TrainStatistics;->saveTotalTimes(J)V

    .line 2957
    :cond_2
    invoke-static {v4}, Lo/bso;->c(Lcom/huawei/health/suggestion/model/TrainStatistics;)Ljava/lang/String;

    move-result-object v7

    .line 2958
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "trainStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$29;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lo/cag;->b(Ljava/lang/String;Ljava/lang/String;)I

    .line 2960
    iget-object v0, p0, Lo/bsq$29;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$29;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2961
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 7

    .line 2927
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "trainStatistics_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bsq$29;->b:Lcom/huawei/health/suggestion/model/AccountInfo;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cag;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2928
    const/4 v5, 0x0

    .line 2930
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "userTrainStatisticsBean"

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 2933
    goto :goto_0

    .line 2931
    :catch_0
    move-exception v6

    .line 2932
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2934
    :goto_0
    invoke-static {v5}, Lo/bso;->e(Lorg/json/JSONObject;)Lcom/huawei/health/suggestion/model/TrainStatistics;

    move-result-object v6

    .line 2935
    iget-object v0, p0, Lo/bsq$29;->e:Lo/bui;

    iget-object v1, p0, Lo/bsq$29;->d:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 2936
    return-void
.end method
