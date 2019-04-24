.class public Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private participateTime:J

.field private result:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-string v0, "SLEEP_QUALITY"

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->type:Ljava/lang/String;

    .line 14
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->participateTime:J

    .line 15
    iput-object p3, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->result:Ljava/lang/String;

    .line 16
    return-void
.end method


# virtual methods
.method public configureParticipateTime(J)V
    .locals 0

    .line 31
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->participateTime:J

    .line 32
    return-void
.end method

.method public configureResult(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->result:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public configureType(Ljava/lang/String;)V
    .locals 0

    .line 23
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->type:Ljava/lang/String;

    .line 24
    return-void
.end method

.method public fetchParticipateTime()J
    .locals 2

    .line 27
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->participateTime:J

    return-wide v0
.end method

.method public fetchResult()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->result:Ljava/lang/String;

    return-object v0
.end method

.method public fetchType()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->type:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UserEvaluationResult{participateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->participateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", participateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->participateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/UserEvaluationResult;->result:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
