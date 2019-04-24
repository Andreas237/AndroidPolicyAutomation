.class public Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appType:Ljava/lang/Integer;

.field private description:Ljava/lang/String;

.field private opinion:Ljava/lang/Integer;

.field private privacyId:Ljava/lang/Integer;

.field private timestamp:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppType()Ljava/lang/Integer;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->appType:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getOpinion()Ljava/lang/Integer;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->opinion:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPrivacyId()Ljava/lang/Integer;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->privacyId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTimestamp()Ljava/lang/Long;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->timestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public setAppType(Ljava/lang/Integer;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->appType:Ljava/lang/Integer;

    .line 17
    return-void
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->description:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setOpinion(Ljava/lang/Integer;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->opinion:Ljava/lang/Integer;

    .line 33
    return-void
.end method

.method public setPrivacyId(Ljava/lang/Integer;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->privacyId:Ljava/lang/Integer;

    .line 25
    return-void
.end method

.method public setTimestamp(Ljava/lang/Long;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->timestamp:Ljava/lang/Long;

    .line 49
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PrivacyRecord{appType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->appType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", privacyId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->privacyId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", opinion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->opinion:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/PrivacyRecord;->timestamp:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
