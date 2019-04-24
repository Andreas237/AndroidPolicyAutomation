.class public Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appId:Ljava/lang/String;

.field private deviceId:Ljava/lang/String;

.field private iversion:I

.field private siteId:I

.field private source:I

.field private token:Ljava/lang/String;

.field private tokenType:I

.field private ts:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getIversion()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->iversion:I

    return v0
.end method

.method public getSiteId()I
    .locals 1

    .line 66
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->siteId:I

    return v0
.end method

.method public getSource()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->source:I

    return v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->token:Ljava/lang/String;

    return-object v0
.end method

.method public getTokenType()I
    .locals 1

    .line 34
    iget v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->tokenType:I

    return v0
.end method

.method public getTs()J
    .locals 2

    .line 26
    iget-wide v0, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->ts:J

    return-wide v0
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->appId:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->deviceId:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public setIversion(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->iversion:I

    .line 79
    return-void
.end method

.method public setSiteId(I)V
    .locals 0

    .line 70
    iput p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->siteId:I

    .line 71
    return-void
.end method

.method public setSource(I)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->source:I

    .line 87
    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->token:Ljava/lang/String;

    .line 47
    return-void
.end method

.method public setTokenType(I)V
    .locals 0

    .line 38
    iput p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->tokenType:I

    .line 39
    return-void
.end method

.method public setTs(J)V
    .locals 0

    .line 30
    iput-wide p1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->ts:J

    .line 31
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EventInfo{ts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->ts:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tokenType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->tokenType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", token=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->token:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 96
    invoke-static {}, Lo/cxk;->c()Lo/cxk;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->deviceId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", siteId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->siteId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iversion=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->iversion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", source=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/hwdevicedfxmanager/upload/EventInfo;->source:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    return-object v0
.end method
