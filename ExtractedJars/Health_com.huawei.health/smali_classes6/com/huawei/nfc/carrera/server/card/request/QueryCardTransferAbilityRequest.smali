.class public Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;
.source "SourceFile"


# instance fields
.field private cardNumber:Ljava/lang/String;

.field private cplc:Ljava/lang/String;

.field private deviceType:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private userId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;-><init>()V

    return-void
.end method


# virtual methods
.method public getCardNumber()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->cardNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->cplc:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceType()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->deviceType:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public setCardNumber(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->cardNumber:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setCplc(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->cplc:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setDeviceType(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->deviceType:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->issuerId:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->userId:Ljava/lang/String;

    .line 38
    return-void
.end method
