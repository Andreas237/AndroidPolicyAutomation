.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private actualIssuePayment:I

.field private actualPayment:I

.field private actualRechargePayment:I

.field private currencyCode:I

.field private isBeijingAppMode:Z

.field private moveCode:Ljava/lang/String;

.field private orderType:I

.field private payType:I

.field private phoneNum:Ljava/lang/String;

.field private reserved:Ljava/lang/String;

.field private theoreticalIssuePayment:I

.field private theoreticalPayment:I

.field private theoreticalRechargePayment:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 80
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;-><init>(III)V

    .line 81
    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->isBeijingAppMode:Z

    .line 85
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->orderType:I

    .line 86
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualPayment:I

    .line 87
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalPayment:I

    .line 88
    return-void
.end method

.method public constructor <init>(ILcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;)V
    .locals 2

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->isBeijingAppMode:Z

    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->orderType:I

    .line 93
    if-eqz p2, :cond_0

    .line 95
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getPayMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualPayment:I

    .line 96
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getRechargeMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalPayment:I

    goto :goto_0

    .line 100
    :cond_0
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualPayment:I

    .line 101
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalPayment:I

    .line 103
    :goto_0
    return-void
.end method


# virtual methods
.method public getActualIssuePayment()I
    .locals 1

    .line 176
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualIssuePayment:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getActualPayment()I
    .locals 1

    .line 199
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualPayment:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getActualRechargePayment()I
    .locals 1

    .line 224
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualRechargePayment:I

    return v0
.end method

.method public getCurrencyCode()I
    .locals 1

    .line 166
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->currencyCode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getMoveCode()Ljava/lang/String;
    .locals 1

    .line 147
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->moveCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderType()I
    .locals 1

    .line 204
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->orderType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPayType()I
    .locals 1

    .line 156
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->payType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPhoneNum()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->phoneNum:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getReserved()Ljava/lang/String;
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->reserved:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getTheoreticalIssuePayment()I
    .locals 1

    .line 185
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalIssuePayment:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTheoreticalPayment()I
    .locals 1

    .line 194
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalPayment:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getTheoreticalRechargePayment()I
    .locals 1

    .line 216
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalRechargePayment:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public isBeijingAppMode()Z
    .locals 1

    .line 212
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->isBeijingAppMode:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public setActualIssuePayment(I)V
    .locals 1

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualIssuePayment:I

    .line 181
    return-void
.end method

.method public setActualPayment(I)V
    .locals 0

    .line 236
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualPayment:I

    .line 237
    return-void
.end method

.method public setActualRechargePayment(I)V
    .locals 0

    .line 228
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualRechargePayment:I

    .line 229
    return-void
.end method

.method public setBeijingAppMode(Z)V
    .locals 1

    .line 208
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->isBeijingAppMode:Z

    .line 209
    return-void
.end method

.method public setCurrencyCode(I)V
    .locals 1

    .line 171
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->currencyCode:I

    .line 172
    return-void
.end method

.method public setIssuePayment(II)V
    .locals 1

    .line 107
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualIssuePayment:I

    .line 108
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalIssuePayment:I

    .line 109
    return-void
.end method

.method public setMoveCode(Ljava/lang/String;)V
    .locals 1

    .line 151
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->moveCode:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setOrderType(I)V
    .locals 0

    .line 232
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->orderType:I

    .line 233
    return-void
.end method

.method public setPayType(I)V
    .locals 1

    .line 161
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->payType:I

    .line 162
    return-void
.end method

.method public setPhoneNum(Ljava/lang/String;)V
    .locals 1

    .line 133
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->phoneNum:Ljava/lang/String;

    .line 134
    return-void
.end method

.method public setRechargePayment(II)V
    .locals 1

    .line 113
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualRechargePayment:I

    .line 114
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalRechargePayment:I

    .line 115
    return-void
.end method

.method public setRechargePayment(Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;)V
    .locals 2

    .line 119
    if-eqz p1, :cond_0

    .line 121
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getPayMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->actualRechargePayment:I

    .line 122
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->getRechargeMoney()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertYuanToFen(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalRechargePayment:I

    .line 124
    :cond_0
    return-void
.end method

.method public setReserved(Ljava/lang/String;)V
    .locals 1

    .line 143
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->reserved:Ljava/lang/String;

    .line 144
    return-void
.end method

.method public setTheoreticalIssuePayment(I)V
    .locals 1

    .line 189
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalIssuePayment:I

    .line 190
    return-void
.end method

.method public setTheoreticalPayment(I)V
    .locals 0

    .line 240
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalPayment:I

    .line 241
    return-void
.end method

.method public setTheoreticalRechargePayment(I)V
    .locals 0

    .line 220
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/ApplyOrderInfo;->theoreticalRechargePayment:I

    .line 221
    return-void
.end method
