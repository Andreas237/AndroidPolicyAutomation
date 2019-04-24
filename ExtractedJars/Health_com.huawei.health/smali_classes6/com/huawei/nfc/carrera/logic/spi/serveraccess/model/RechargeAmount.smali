.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private amountRecharge:Ljava/lang/String;

.field private denomination:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->denomination:Ljava/lang/String;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->amountRecharge:Ljava/lang/String;

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->denomination:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->amountRecharge:Ljava/lang/String;

    .line 30
    return-void
.end method


# virtual methods
.method public getAmountRecharge()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->amountRecharge:Ljava/lang/String;

    return-object v0
.end method

.method public getDenomination()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->denomination:Ljava/lang/String;

    return-object v0
.end method

.method public setAmountRecharge(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->amountRecharge:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public setDenomination(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->denomination:Ljava/lang/String;

    .line 40
    return-void
.end method
