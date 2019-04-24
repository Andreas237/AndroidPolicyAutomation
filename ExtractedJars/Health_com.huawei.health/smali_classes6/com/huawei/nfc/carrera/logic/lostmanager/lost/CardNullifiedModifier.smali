.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardNullifiedModifier;
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

    .line 129
    const/4 v0, 0x1

    return v0
.end method

.method protected modifyCardStatusInESE(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 9

    .line 38
    invoke-static {p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez v2, :cond_0

    .line 42
    const/4 v0, 0x1

    return v0

    .line 44
    :cond_0
    invoke-static {p2}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 47
    const/4 v0, 0x0

    return v0

    .line 50
    :cond_1
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v3

    .line 51
    if-nez v3, :cond_2

    .line 53
    const/4 v0, 0x0

    return v0

    .line 57
    :cond_2
    const/16 v0, 0xe

    if-ne v3, v0, :cond_5

    .line 60
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, p2, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/SynESETsmOperator;->excute()I

    move-result v6

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "synESETsmOperator result is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 67
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-direct {v7, p2, p1, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 68
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteSSDTsmOperator;->excute()I

    move-result v8

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeleteSSDTsmOperator result is :"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 70
    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    const/4 v0, 0x1

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 74
    :cond_4
    const/4 v0, 0x0

    return v0

    .line 78
    :cond_5
    const/16 v0, 0x14

    if-ne v3, v0, :cond_6

    .line 80
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {v5, p2, v4, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;-><init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/UninstallTrafficCardResultHandler;Z)V

    .line 81
    const-string v0, "2"

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/UninstallTrafficCardSAOperator;->uninstall(Ljava/lang/String;)Z

    move-result v0

    return v0

    .line 85
    :cond_6
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, p2, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/DeleteAppletTsmOperator;->excute()I

    move-result v6

    .line 87
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "modifyCardStatusInESE, excute tsm delete, result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 89
    const/4 v0, 0x0

    if-ne v0, v6, :cond_7

    const/4 v0, 0x1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method protected modifyLocalCardInfo(Ljava/lang/String;Landroid/content/Context;I)Z
    .locals 3

    .line 97
    const/4 v1, 0x0

    .line 100
    :try_start_0
    invoke-static {p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 101
    const/4 v1, 0x1

    .line 111
    goto :goto_0

    .line 103
    :catch_0
    move-exception v2

    .line 105
    const/4 v1, 0x1

    .line 106
    const-string v0, "modifyLocalCardInfo, remove card in ta, WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 111
    goto :goto_0

    .line 108
    :catch_1
    move-exception v2

    .line 110
    const-string v0, "modifyLocalCardInfo, remove card in ta, WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 113
    :goto_0
    if-eqz v1, :cond_0

    .line 115
    invoke-static {p2}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 117
    :cond_0
    return v1
.end method

.method protected reportCardStatus(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 123
    invoke-static {p3}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    return-void
.end method
