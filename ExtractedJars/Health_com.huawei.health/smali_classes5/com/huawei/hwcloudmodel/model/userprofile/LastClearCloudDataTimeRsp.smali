.class public Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private lastRecord:Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getLastRecord()Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeRsp;->lastRecord:Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;

    return-object v0
.end method

.method public setLastRecord(Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeRsp;->lastRecord:Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;

    .line 14
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LastClearCloudDataTimeRsp{lastRecord="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/LastClearCloudDataTimeRsp;->lastRecord:Lcom/huawei/hwcloudmodel/model/userprofile/DeleteOperationRecord;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
