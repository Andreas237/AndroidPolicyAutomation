.class public Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private participateTime:J

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-string v0, "SLEEP_QUALITY"

    iput-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;->type:Ljava/lang/String;

    .line 13
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;->participateTime:J

    .line 14
    return-void
.end method


# virtual methods
.method public configureParticipateTime(J)V
    .locals 0

    .line 21
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;->participateTime:J

    .line 22
    return-void
.end method

.method public fetchParticipateTime()J
    .locals 2

    .line 17
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;->participateTime:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetEvaluationResultReq{type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "participateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/unite/GetEvaluationResultReq;->participateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
