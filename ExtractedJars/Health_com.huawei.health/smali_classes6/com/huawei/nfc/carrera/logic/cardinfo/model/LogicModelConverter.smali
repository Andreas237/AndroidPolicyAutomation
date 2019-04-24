.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/LogicModelConverter;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static convertFromTACardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;
    .locals 3

    .line 29
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;-><init>()V

    .line 30
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->setDefault(Z)V

    .line 31
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->setAid(Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->setReferenceId(Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->setProductId(Ljava/lang/String;)V

    .line 36
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->setFpanFour(Ljava/lang/String;)V

    .line 37
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    invoke-virtual {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->setStatusUpdateTime(J)V

    .line 38
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardListItem;->setCardGroup(I)V

    .line 40
    return-object v2
.end method

.method public static convertToUniCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Lcom/huawei/wallet/model/unicard/UniCardInfo;
    .locals 3

    .line 45
    new-instance v2, Lcom/huawei/wallet/model/unicard/UniCardInfo;

    invoke-direct {v2}, Lcom/huawei/wallet/model/unicard/UniCardInfo;-><init>()V

    .line 46
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isDefaultCard:Z

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a(Z)V

    .line 47
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e(Ljava/lang/String;)V

    .line 48
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->h(Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a(Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b(Ljava/lang/String;)V

    .line 51
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a(I)V

    .line 52
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->statusUpdateTime:J

    invoke-virtual {v2, v0, v1}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->a(J)V

    .line 53
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->e(I)V

    .line 54
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    invoke-virtual {v2, v0}, Lcom/huawei/wallet/model/unicard/UniCardInfo;->b(I)V

    .line 55
    return-object v2
.end method
