.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private issueCardOrderCnt:I

.field private rechargeOrderCnt:I

.field private refundOrderCnt:I

.field private totalOrderCnt:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->totalOrderCnt:I

    .line 37
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->rechargeOrderCnt:I

    .line 38
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->issueCardOrderCnt:I

    .line 39
    iput p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->refundOrderCnt:I

    .line 40
    return-void
.end method


# virtual methods
.method public getBundle()Landroid/os/Bundle;
    .locals 3

    .line 91
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 92
    const-string v0, "issueCardOrderCnt"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getIssueCardOrderCnt()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 93
    const-string v0, "totalOrderCnt"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getTotalOrderCnt()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 94
    const-string v0, "rechargeOrderCnt"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getRechargeOrderCnt()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 95
    const-string v0, "refundOrderCnt"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->getRefundOrderCnt()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 96
    return-object v2
.end method

.method public getIssueCardOrderCnt()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->issueCardOrderCnt:I

    return v0
.end method

.method public getRechargeOrderCnt()I
    .locals 1

    .line 54
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->rechargeOrderCnt:I

    return v0
.end method

.method public getRefundOrderCnt()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->refundOrderCnt:I

    return v0
.end method

.method public getTotalOrderCnt()I
    .locals 1

    .line 44
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->totalOrderCnt:I

    return v0
.end method

.method public setIssueCardOrderCnt(I)V
    .locals 0

    .line 69
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->issueCardOrderCnt:I

    .line 70
    return-void
.end method

.method public setRechargeOrderCnt(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->rechargeOrderCnt:I

    .line 60
    return-void
.end method

.method public setRefundOrderCnt(I)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->refundOrderCnt:I

    .line 80
    return-void
.end method

.method public setTotalOrderCnt(I)V
    .locals 0

    .line 49
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->totalOrderCnt:I

    .line 50
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "OrderHandleResultInfo [totalOrderCnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->totalOrderCnt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rechargeOrderCnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->rechargeOrderCnt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", issueCardOrderCnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->issueCardOrderCnt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", refundOrderCnt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/OrderHandleResultInfo;->refundOrderCnt:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
