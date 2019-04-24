.class public Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private evaluationResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;>;)V"
        }
    .end annotation

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;->evaluationResults:Ljava/util/List;

    .line 14
    return-void
.end method


# virtual methods
.method public configureEvaluationResults(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;>;)V"
        }
    .end annotation

    .line 21
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;->evaluationResults:Ljava/util/List;

    .line 22
    return-void
.end method

.method public fetchEvaluationResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;>;"
        }
    .end annotation

    .line 17
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;->evaluationResults:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddEvaluationResultReq{evaluationResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddEvaluationResultReq;->evaluationResults:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
