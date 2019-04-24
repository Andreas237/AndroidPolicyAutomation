.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private payMoney:D

.field private rechargeMoney:D


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPayMoney()D
    .locals 2

    .line 42
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->payMoney:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getRechargeMoney()D
    .locals 2

    .line 34
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->rechargeMoney:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getStringForRechargeMoney()Ljava/lang/String;
    .locals 2

    .line 30
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->rechargeMoney:D

    double-to-int v0, v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setPayMoney(D)V
    .locals 2

    .line 46
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->payMoney:D

    .line 47
    return-void
.end method

.method public setRechargeMoney(D)V
    .locals 2

    .line 38
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/util/GodClassUtil;->commonFunc(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/RechargeMoney;->rechargeMoney:D

    .line 39
    return-void
.end method
