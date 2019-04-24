.class Lo/btj$1;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->a(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

.field final synthetic d:Lo/btj;


# direct methods
.method constructor <init>(Lo/btj;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 0

    .line 1403
    iput-object p1, p0, Lo/btj$1;->d:Lo/btj;

    iput-object p2, p0, Lo/btj$1;->b:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 5

    .line 1412
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data = "

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

    .line 1413
    const-string v0, "userFitnessPlanInfo"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1414
    iget-object v0, p0, Lo/btj$1;->d:Lo/btj;

    iget-object v1, p0, Lo/btj$1;->b:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-static {v0, v4, v1}, Lo/btj;->c(Lo/btj;Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 1415
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1406
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "errorCode = "

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

    .line 1407
    iget-object v0, p0, Lo/btj$1;->b:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-interface {v0, p1, p2}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 1408
    return-void
.end method
