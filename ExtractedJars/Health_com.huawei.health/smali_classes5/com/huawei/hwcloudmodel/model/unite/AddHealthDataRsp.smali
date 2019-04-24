.class public Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;
.super Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;
.source "SourceFile"


# instance fields
.field private timestamp:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/huawei/hwcloudmodel/model/CloudCommonReponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->timestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 0

    .line 15
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->timestamp:Ljava/lang/Long;

    .line 16
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddHealthDataRsp{timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/unite/AddHealthDataRsp;->timestamp:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
