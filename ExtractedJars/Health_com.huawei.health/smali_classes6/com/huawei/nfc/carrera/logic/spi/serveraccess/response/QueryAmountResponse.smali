.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;
.source "SourceFile"


# instance fields
.field private issueAmountList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;>;"
        }
    .end annotation
.end field

.field private rechargeAmountList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/BaseResponse;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->issueAmountList:Ljava/util/List;

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->rechargeAmountList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getIssueAmountList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;>;"
        }
    .end annotation

    .line 27
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->issueAmountList:Ljava/util/List;

    return-object v0
.end method

.method public getRechargeAmountList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;>;"
        }
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->rechargeAmountList:Ljava/util/List;

    return-object v0
.end method

.method public setIssueAmountList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;>;)V"
        }
    .end annotation

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->issueAmountList:Ljava/util/List;

    .line 33
    return-void
.end method

.method public setRechargeAmountList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;>;)V"
        }
    .end annotation

    .line 42
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->rechargeAmountList:Ljava/util/List;

    .line 43
    return-void
.end method
