.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedTrafficCardListTask;
.super Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask<Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;>;"
    }
.end annotation


# instance fields
.field private final picManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 29
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedCardListTask;-><init>(Landroid/content/Context;)V

    .line 30
    invoke-static {p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedTrafficCardListTask;->picManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 31
    return-void
.end method


# virtual methods
.method protected getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;
    .locals 7

    .line 36
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 38
    const/4 v0, 0x0

    return-object v0

    .line 40
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedTrafficCardListTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 41
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v5

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 42
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedTrafficCardListTask;->picManager:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;

    .line 43
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/pic/CardPicRescManager;->getCardLogo(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    .line 44
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v3

    .line 42
    invoke-static {v0, v1, v5, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->build(Landroid/graphics/Bitmap;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    move-result-object v6

    .line 45
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;->setAid(Ljava/lang/String;)V

    .line 46
    return-object v6
.end method

.method protected bridge synthetic getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Ljava/lang/Object;
    .locals 1

    .line 22
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QuerySupportedTrafficCardListTask;->getSupportedCard(Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/SupportedTrafficCardListItem;

    move-result-object v0

    return-object v0
.end method
