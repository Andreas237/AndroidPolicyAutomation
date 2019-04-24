.class public Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appType:I

.field private operateTime:J

.field private scenario:I

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppType()I
    .locals 1

    .line 26
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->appType:I

    return v0
.end method

.method public getOperateTime()J
    .locals 2

    .line 18
    iget-wide v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->operateTime:J

    return-wide v0
.end method

.method public getScenario()I
    .locals 1

    .line 10
    iget v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->scenario:I

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->status:Ljava/lang/String;

    return-object v0
.end method

.method public setAppType(I)V
    .locals 0

    .line 30
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->appType:I

    .line 31
    return-void
.end method

.method public setOperateTime(J)V
    .locals 0

    .line 22
    iput-wide p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->operateTime:J

    .line 23
    return-void
.end method

.method public setScenario(I)V
    .locals 0

    .line 14
    iput p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->scenario:I

    .line 15
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->status:Ljava/lang/String;

    .line 39
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeleteOperationRecord{scenario="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->scenario:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", operateTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->operateTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appType ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->appType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", status= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
