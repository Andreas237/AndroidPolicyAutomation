.class Lo/btj$5;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->a(Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/btj;

.field final synthetic d:Lo/bui;


# direct methods
.method constructor <init>(Lo/btj;Lo/bui;)V
    .locals 0

    .line 1338
    iput-object p1, p0, Lo/btj$5;->c:Lo/btj;

    iput-object p2, p0, Lo/btj$5;->d:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 7

    .line 1347
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryMyDoingFitnessPkgPlan data = "

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

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1348
    const-string v0, "userFitnessPlanInfo"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1349
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "noPlan"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1350
    :cond_0
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cloud has not doing plan"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1351
    const/4 v5, -0x1

    .line 1352
    const-string v6, "cloud has no doing plan data"

    .line 1353
    iget-object v0, p0, Lo/btj$5;->c:Lo/btj;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 1354
    iget-object v0, p0, Lo/btj$5;->d:Lo/bui;

    iget-object v1, p0, Lo/btj$5;->c:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5, v6}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 1355
    goto :goto_0

    .line 1356
    :cond_1
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {v0, v4, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 1357
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    invoke-interface {v0, v1, v4}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1358
    iget-object v0, p0, Lo/btj$5;->c:Lo/btj;

    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireRemindTime()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/btj;->e(I)V

    .line 1359
    iget-object v0, p0, Lo/btj$5;->c:Lo/btj;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/btj;->e(J)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1360
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryMyDoingFitnessPkgPlan cancel today remind"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    iget-object v0, p0, Lo/btj$5;->c:Lo/btj;

    invoke-virtual {v0}, Lo/btj;->i()V

    .line 1363
    :cond_2
    iget-object v0, p0, Lo/btj$5;->d:Lo/bui;

    iget-object v1, p0, Lo/btj$5;->c:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v5}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1365
    :goto_0
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1341
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryMyDoingFitnessPkgPlan errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1342
    iget-object v0, p0, Lo/btj$5;->c:Lo/btj;

    iget-object v1, p0, Lo/btj$5;->d:Lo/bui;

    invoke-static {v0, p1, p2, v1}, Lo/btj;->e(Lo/btj;ILjava/lang/String;Lo/bui;)V

    .line 1343
    return-void
.end method
