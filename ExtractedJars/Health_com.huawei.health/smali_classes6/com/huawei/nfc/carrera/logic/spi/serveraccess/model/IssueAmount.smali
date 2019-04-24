.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private amountEnroll:Ljava/lang/String;

.field private amountRecharge:Ljava/lang/String;

.field private denomination:Ljava/lang/String;

.field private priceEnroll:Ljava/lang/String;

.field private priceRecharge:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->denomination:Ljava/lang/String;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceEnroll:Ljava/lang/String;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountEnroll:Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceRecharge:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountRecharge:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->denomination:Ljava/lang/String;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceEnroll:Ljava/lang/String;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountEnroll:Ljava/lang/String;

    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceRecharge:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountRecharge:Ljava/lang/String;

    .line 44
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->denomination:Ljava/lang/String;

    .line 45
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceEnroll:Ljava/lang/String;

    .line 46
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceRecharge:Ljava/lang/String;

    .line 47
    return-void
.end method


# virtual methods
.method public getAmountEnroll()Ljava/lang/String;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountEnroll:Ljava/lang/String;

    return-object v0
.end method

.method public getAmountRecharge()Ljava/lang/String;
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountRecharge:Ljava/lang/String;

    return-object v0
.end method

.method public getDenomination()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->denomination:Ljava/lang/String;

    return-object v0
.end method

.method public getPriceEnroll()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceEnroll:Ljava/lang/String;

    return-object v0
.end method

.method public getPriceRecharge()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceRecharge:Ljava/lang/String;

    return-object v0
.end method

.method public setAmountEnroll(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountEnroll:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public setAmountRecharge(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->amountRecharge:Ljava/lang/String;

    .line 97
    return-void
.end method

.method public setDenomination(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->denomination:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public setPriceEnroll(Ljava/lang/String;)V
    .locals 0

    .line 66
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceEnroll:Ljava/lang/String;

    .line 67
    return-void
.end method

.method public setPriceRecharge(Ljava/lang/String;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->priceRecharge:Ljava/lang/String;

    .line 87
    return-void
.end method
