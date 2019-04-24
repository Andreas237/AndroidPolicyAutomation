.class Lo/btj$12;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->a(Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bui;

.field final synthetic b:Lo/btj;


# direct methods
.method constructor <init>(Lo/btj;Lo/bui;)V
    .locals 0

    .line 1230
    iput-object p1, p0, Lo/btj$12;->b:Lo/btj;

    iput-object p2, p0, Lo/btj$12;->a:Lo/bui;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 9

    .line 1239
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1240
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createFitnessPackagePlan data = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1241
    iget-object v0, p0, Lo/btj$12;->b:Lo/btj;

    invoke-static {v0, v4}, Lo/btj;->d(Lo/btj;Ljava/lang/String;)V

    .line 1243
    const-string v0, "userFitnessPlanInfo"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1244
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    const-class v1, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {v0, v5, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    .line 1245
    iget-object v0, p0, Lo/btj$12;->b:Lo/btj;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/btj;->c(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    move-result-object v7

    .line 1246
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 1247
    invoke-virtual {v7}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->saveCardPicture(Ljava/lang/String;)V

    .line 1249
    :cond_0
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v6}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 1251
    iget-object v0, p0, Lo/btj$12;->b:Lo/btj;

    invoke-static {v0}, Lo/btj;->d(Lo/btj;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquirePlanId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1253
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    const-string v1, "currentPlan"

    invoke-interface {v0, v1, v8}, Lo/bsp;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1254
    iget-object v0, p0, Lo/btj$12;->b:Lo/btj;

    invoke-virtual {v6}, Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;->acquireRemindTime()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/btj;->e(I)V

    .line 1255
    iget-object v0, p0, Lo/btj$12;->a:Lo/bui;

    iget-object v1, p0, Lo/btj$12;->b:Lo/btj;

    invoke-static {v1}, Lo/btj;->e(Lo/btj;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, v6}, Lo/bui;->d(Landroid/os/Handler;Ljava/lang/Object;)V

    .line 1256
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1233
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createFitnessPackagePlan errorCode = "

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

    .line 1234
    iget-object v0, p0, Lo/btj$12;->b:Lo/btj;

    iget-object v1, p0, Lo/btj$12;->a:Lo/bui;

    invoke-static {v0, p1, p2, v1}, Lo/btj;->e(Lo/btj;ILjava/lang/String;Lo/bui;)V

    .line 1235
    return-void
.end method
