.class public Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private description:Ljava/lang/String;

.field private opinion:Ljava/lang/Integer;

.field private privacyId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getOpinion()Ljava/lang/Integer;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->opinion:Ljava/lang/Integer;

    return-object v0
.end method

.method public getPrivacyId()Ljava/lang/Integer;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->privacyId:Ljava/lang/Integer;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->description:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public setOpinion(Ljava/lang/Integer;)V
    .locals 0

    .line 22
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->opinion:Ljava/lang/Integer;

    .line 23
    return-void
.end method

.method public setPrivacyId(Ljava/lang/Integer;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->privacyId:Ljava/lang/Integer;

    .line 15
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddPrivacyRecordReq{privacyId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->privacyId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", opinion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->opinion:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/AddPrivacyRecordReq;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
