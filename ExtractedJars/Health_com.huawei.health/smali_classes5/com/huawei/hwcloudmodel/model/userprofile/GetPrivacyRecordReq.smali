.class public Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private privacyId:Ljava/lang/Integer;

.field private recordCount:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPrivacyId()Ljava/lang/Integer;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;->privacyId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRecordCount()Ljava/lang/Integer;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;->recordCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public setPrivacyId(Ljava/lang/Integer;)V
    .locals 0

    .line 13
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;->privacyId:Ljava/lang/Integer;

    .line 14
    return-void
.end method

.method public setRecordCount(Ljava/lang/Integer;)V
    .locals 0

    .line 21
    iput-object p1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;->recordCount:Ljava/lang/Integer;

    .line 22
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetPrivacyRecordReq{privacyId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;->privacyId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recordCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwcloudmodel/model/userprofile/GetPrivacyRecordReq;->recordCount:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
