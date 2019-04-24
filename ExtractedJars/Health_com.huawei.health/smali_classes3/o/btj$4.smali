.class Lo/btj$4;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->b(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

.field final synthetic e:Lo/btj;


# direct methods
.method constructor <init>(Lo/btj;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 0

    .line 1379
    iput-object p1, p0, Lo/btj$4;->e:Lo/btj;

    iput-object p2, p0, Lo/btj$4;->d:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 6

    .line 1388
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryAllCompletedFitnessPlan onSuccess data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1389
    invoke-static {}, Lo/btj;->f()Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 1390
    :try_start_0
    iget-object v0, p0, Lo/btj$4;->e:Lo/btj;

    invoke-static {v0, p1}, Lo/btj;->a(Lo/btj;Lorg/json/JSONObject;)V

    .line 1391
    iget-object v0, p0, Lo/btj$4;->e:Lo/btj;

    iget-object v1, p0, Lo/btj$4;->d:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-static {v0, v1}, Lo/btj;->a(Lo/btj;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1392
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 1393
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1382
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryAllCompletedFitnessPlan errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1383
    iget-object v0, p0, Lo/btj$4;->d:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 1384
    return-void
.end method
