.class public Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;
.source "SourceFile"


# instance fields
.field private issueAmountList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;>;"
        }
    .end annotation
.end field

.field private rechargeAmountList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessBaseResponse;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->issueAmountList:Ljava/util/List;

    .line 24
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->rechargeAmountList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getIssueAmountList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;>;"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->issueAmountList:Ljava/util/List;

    return-object v0
.end method

.method public getRechargeAmountList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;>;"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->rechargeAmountList:Ljava/util/List;

    return-object v0
.end method

.method public setIssueAmountList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;>;)V"
        }
    .end annotation

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->issueAmountList:Ljava/util/List;

    .line 34
    return-void
.end method

.method public setRechargeAmountList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;>;)V"
        }
    .end annotation

    .line 43
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;->rechargeAmountList:Ljava/util/List;

    .line 44
    return-void
.end method
