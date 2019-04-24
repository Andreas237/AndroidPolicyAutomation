.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private balance:Ljava/lang/String;

.field private eventId:Ljava/lang/String;

.field private extend:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private transferVerifyFlag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->eventId:Ljava/lang/String;

    .line 29
    iput-object p8, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->balance:Ljava/lang/String;

    .line 30
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->setIssuerId(Ljava/lang/String;)V

    .line 31
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->setCplc(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->setAppletAid(Ljava/lang/String;)V

    .line 33
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 34
    invoke-virtual {p0, p6}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p0, p7}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->setCardId(Ljava/lang/String;)V

    .line 36
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getBalance()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->balance:Ljava/lang/String;

    return-object v0
.end method

.method public getEventId()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->eventId:Ljava/lang/String;

    return-object v0
.end method

.method public getExtend()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->extend:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public getTransferVerifyFlag()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->transferVerifyFlag:Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->appCode:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setBalance(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->balance:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public setEventId(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->eventId:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setExtend(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->extend:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->partnerId:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public setTransferVerifyFlag(Ljava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->transferVerifyFlag:Ljava/lang/String;

    .line 86
    return-void
.end method
