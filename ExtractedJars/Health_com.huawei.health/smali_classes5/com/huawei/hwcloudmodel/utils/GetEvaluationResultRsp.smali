.class public Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private evaluationResults:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;>;"
        }
    .end annotation
.end field

.field private hasMore:Ljava/lang/Boolean;

.field private timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

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

    .line 22
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->evaluationResults:Ljava/util/List;

    .line 23
    return-void
.end method

.method public configureHasMore(Ljava/lang/Boolean;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->hasMore:Ljava/lang/Boolean;

    .line 31
    return-void
.end method

.method public configureTimeStamp(J)V
    .locals 0

    .line 38
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->timestamp:J

    .line 39
    return-void
.end method

.method public fetchEvaluationResults()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->evaluationResults:Ljava/util/List;

    return-object v0
.end method

.method public fetchHasMore()Ljava/lang/Boolean;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->hasMore:Ljava/lang/Boolean;

    return-object v0
.end method

.method public fetchTimeStamp()J
    .locals 2

    .line 34
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->timestamp:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetEvaluationResultRsp{evaluationResults="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->evaluationResults:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "hasMore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->hasMore:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "timeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/utils/GetEvaluationResultRsp;->timestamp:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
