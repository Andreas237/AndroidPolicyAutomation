.class public Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo$RfConfServerinfoSAI7;,
        Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo$RfConfServerinfoSAI6;,
        Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo$RfConfServerinfoSAI5;,
        Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo$RfConfServerinfoSAI4;,
        Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo$RfConfServerinfoSAI3;,
        Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo$RfConfServerinfoSAI2;,
        Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo$RfConfServerinfoSAI1;
    }
.end annotation


# instance fields
.field private issuerId:Ljava/lang/String;

.field private model:Ljava/lang/String;

.field private rfURL:Ljava/lang/String;

.field private romVersion:Ljava/lang/String;

.field private timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getModel()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->model:Ljava/lang/String;

    return-object v0
.end method

.method public getRfURL()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->rfURL:Ljava/lang/String;

    return-object v0
.end method

.method public getRomVersion()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->romVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()J
    .locals 2

    .line 72
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->timestamp:J

    return-wide v0
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->issuerId:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setModel(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->model:Ljava/lang/String;

    .line 38
    return-void
.end method

.method public setRfURL(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->rfURL:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setRomVersion(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->romVersion:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setTimeStamp(J)V
    .locals 0

    .line 77
    iput-wide p1, p0, Lcom/huawei/nfc/carrera/server/card/response/RFConfServerInfo;->timestamp:J

    .line 78
    return-void
.end method
