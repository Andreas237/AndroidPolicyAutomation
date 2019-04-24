.class public Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;
.source "SourceFile"


# instance fields
.field private balance:I

.field private cardNo:Ljava/lang/String;

.field private time4Validity:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->cardNo:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getBalance()I
    .locals 1

    .line 30
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->balance:I

    return v0
.end method

.method public getCardNo()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->cardNo:Ljava/lang/String;

    return-object v0
.end method

.method public getTime4Validity()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->time4Validity:Ljava/lang/String;

    return-object v0
.end method

.method public setBalance(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->balance:I

    .line 36
    return-void
.end method

.method public setCardNo(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->cardNo:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public setTime4Validity(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->time4Validity:Ljava/lang/String;

    .line 56
    return-void
.end method
