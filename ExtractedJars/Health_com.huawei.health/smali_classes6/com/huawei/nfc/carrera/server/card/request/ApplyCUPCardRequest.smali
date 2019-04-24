.class public Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai10;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai9;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai8;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai7;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai6;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai5;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai4;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai3;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai2;,
        Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest$ApplyCUPCardRequestSai1;
    }
.end annotation


# instance fields
.field private cardInfor:Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;

.field private cplc:Ljava/lang/String;

.field private riskInfo:Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;

.field private tncStatus:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 21
    const-string v0, "ACCEPTED"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->tncStatus:Ljava/lang/String;

    .line 36
    return-void
.end method

.method public constructor <init>(Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;)V
    .locals 1

    .line 30
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    .line 21
    const-string v0, "ACCEPTED"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->tncStatus:Ljava/lang/String;

    .line 31
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->riskInfo:Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;

    .line 32
    return-void
.end method


# virtual methods
.method public getCardInfor()Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->cardInfor:Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getRiskInfo()Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->riskInfo:Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;

    return-object v0
.end method

.method public getTncStatus()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->tncStatus:Ljava/lang/String;

    return-object v0
.end method

.method public setCardInfor(Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->cardInfor:Lcom/huawei/nfc/carrera/server/card/model/CipheredCardInfo;

    .line 66
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->cplc:Ljava/lang/String;

    .line 61
    return-void
.end method

.method public setRiskInfo(Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->riskInfo:Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;

    .line 76
    return-void
.end method

.method public setTncStatus(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPCardRequest;->tncStatus:Ljava/lang/String;

    .line 71
    return-void
.end method
