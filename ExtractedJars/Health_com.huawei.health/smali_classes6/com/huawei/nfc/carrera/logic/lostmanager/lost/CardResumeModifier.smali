.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardResumeModifier;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 32
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 33
    return-void
.end method


# virtual methods
.method protected isNeedModifyESEStatus()Z
    .locals 1

    .line 107
    const/4 v0, 0x0

    return v0
.end method

.method protected modifyCardStatusInESE(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 1

    .line 39
    const/4 v0, 0x1

    return v0
.end method

.method protected modifyLocalCardInfo(Ljava/lang/String;Landroid/content/Context;I)Z
    .locals 4

    .line 46
    const/16 v0, 0x5c

    if-eq v0, p3, :cond_0

    const/16 v0, 0x63

    if-eq v0, p3, :cond_0

    .line 49
    const-string v0, "modifyLocalCardInfo, the card is not locked."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 50
    const/4 v0, 0x1

    return v0

    .line 54
    :cond_0
    const/4 v2, 0x0

    .line 57
    const/16 v0, 0x5c

    if-ne v0, p3, :cond_1

    .line 59
    :try_start_0
    invoke-static {p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V

    .line 62
    :cond_1
    const/16 v0, 0x63

    if-ne v0, p3, :cond_2

    .line 64
    invoke-static {p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 67
    :cond_2
    const/4 v2, 0x1

    .line 76
    goto :goto_0

    .line 69
    :catch_0
    move-exception v3

    .line 71
    const-string v0, "modifyLocalCardInfo, unlock card in ta failed, WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 76
    goto :goto_0

    .line 73
    :catch_1
    move-exception v3

    .line 75
    const-string v0, "modifyLocalCardInfo, unlock card in ta failed, WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 79
    :goto_0
    if-eqz v2, :cond_3

    .line 81
    invoke-static {p2}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 84
    :cond_3
    return v2
.end method

.method protected reportCardStatus(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 11

    .line 90
    invoke-static {p3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v7

    .line 91
    new-instance v8, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    invoke-direct {v8, p3}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    .line 92
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 94
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-virtual {v8, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v9

    .line 95
    const/4 v0, 0x0

    if-eq v0, v9, :cond_0

    .line 97
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v10

    .line 98
    invoke-static {p3}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, v10

    .line 99
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardGroupType()I

    move-result v6

    .line 98
    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 102
    :cond_0
    return-void
.end method
