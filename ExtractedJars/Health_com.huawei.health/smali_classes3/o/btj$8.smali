.class Lo/btj$8;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btj;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/btj;

.field final synthetic e:Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;


# direct methods
.method constructor <init>(Lo/btj;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V
    .locals 0

    .line 998
    iput-object p1, p0, Lo/btj$8;->d:Lo/btj;

    iput-object p2, p0, Lo/btj$8;->e:Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 1007
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCurrentFitnessPlanName onSuccess data = "

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

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1008
    iget-object v0, p0, Lo/btj$8;->d:Lo/btj;

    iget-object v1, p0, Lo/btj$8;->e:Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-virtual {v0, v1}, Lo/btj;->e(Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)V

    .line 1009
    iget-object v0, p0, Lo/btj$8;->d:Lo/btj;

    iget-object v1, p0, Lo/btj$8;->e:Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;

    invoke-static {v0, v1}, Lo/btj;->d(Lo/btj;Lcom/huawei/health/suggestion/model/UserFitnessPlanInfo;)Z

    .line 1010
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 1001
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCurrentFitnessPlanName errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1002
    const-string v0, "Suggestion_FitnessPackagePlanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCurrentFitnessPlanName errorInfo = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1003
    return-void
.end method
