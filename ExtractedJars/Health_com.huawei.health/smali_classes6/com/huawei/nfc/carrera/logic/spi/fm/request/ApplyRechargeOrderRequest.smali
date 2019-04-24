.class public Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;
.source "SourceFile"


# instance fields
.field private actCode:[B

.field private aid:Ljava/lang/String;

.field private amount:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/FMBaseRequest;-><init>()V

    return-void
.end method

.method public static build(I[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;
    .locals 1

    .line 66
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;

    invoke-direct {v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;-><init>()V

    .line 67
    iput p0, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->amount:I

    .line 68
    iput-object p1, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->actCode:[B

    .line 69
    iput-object p2, v0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->aid:Ljava/lang/String;

    .line 70
    return-object v0
.end method


# virtual methods
.method public getActCode()[B
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->actCode:[B

    return-object v0
.end method

.method public getAid()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->aid:Ljava/lang/String;

    return-object v0
.end method

.method public getAmount()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->amount:I

    return v0
.end method

.method public setActCode([B)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->actCode:[B

    .line 46
    return-void
.end method

.method public setAid(Ljava/lang/String;)V
    .locals 0

    .line 53
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->aid:Ljava/lang/String;

    .line 54
    return-void
.end method

.method public setAmount(I)V
    .locals 0

    .line 37
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/spi/fm/request/ApplyRechargeOrderRequest;->amount:I

    .line 38
    return-void
.end method
