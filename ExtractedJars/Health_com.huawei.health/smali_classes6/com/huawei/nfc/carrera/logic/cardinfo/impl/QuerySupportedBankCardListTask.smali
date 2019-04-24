.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedBankCardListTask;
.super Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;-><init>(Landroid/content/Context;)V

    .line 16
    return-void
.end method


# virtual methods
.method protected getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;
    .locals 3

    .line 20
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 22
    const/4 v0, 0x0

    return-object v0

    .line 24
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;-><init>()V

    .line 25
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->setNfcBankName(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->setMode(I)V

    .line 27
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getSupportType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->setSupportCardType(I)V

    .line 28
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;->setIssuerId(Ljava/lang/String;)V

    .line 29
    return-object v2
.end method

.method protected bridge synthetic getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedBankCardListTask;->getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportNFCBankInfo;

    move-result-object v0

    return-object v0
.end method
