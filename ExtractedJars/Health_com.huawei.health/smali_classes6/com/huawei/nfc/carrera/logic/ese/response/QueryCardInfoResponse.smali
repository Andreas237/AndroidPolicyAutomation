.class public Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;
.super Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;
.source "SourceFile"


# instance fields
.field public cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 12
    return-void
.end method

.method public constructor <init>(ILcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;-><init>()V

    .line 16
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->resultCode:I

    .line 17
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    .line 18
    return-void
.end method


# virtual methods
.method public setBalance(Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBalanceResponse;)V
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBalanceResponse;->balance:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->setBalance(Ljava/lang/String;)V

    .line 43
    :cond_0
    return-void
.end method

.method public setCardNo(Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardNumResponse;)V
    .locals 2

    .line 22
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardNumResponse;->cardNum:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->setCardNo(Ljava/lang/String;)V

    .line 26
    :cond_0
    return-void
.end method

.method public setCardValidity(Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;)V
    .locals 2

    .line 30
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 32
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->expireDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->setExpireDate(Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->cardInfo:Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    iget v1, p1, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardValidityDateResponse;->validityTermStatus:I

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->setValidityTermStatus(I)V

    .line 35
    :cond_0
    return-void
.end method

.method public setResultCdforFailed(Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;)Z
    .locals 1

    .line 53
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;->isSuccess()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 55
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_0
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardBaseResponse;->resultCode:I

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/response/QueryCardInfoResponse;->resultCode:I

    .line 58
    const/4 v0, 0x1

    return v0
.end method
