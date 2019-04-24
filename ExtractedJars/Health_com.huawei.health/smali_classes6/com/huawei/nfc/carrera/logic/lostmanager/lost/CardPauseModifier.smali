.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardPauseModifier;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 23
    return-void
.end method


# virtual methods
.method protected isNeedModifyESEStatus()Z
    .locals 1

    .line 84
    const/4 v0, 0x0

    return v0
.end method

.method protected modifyCardStatusInESE(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 1

    .line 29
    const/4 v0, 0x1

    return v0
.end method

.method protected modifyLocalCardInfo(Ljava/lang/String;Landroid/content/Context;I)Z
    .locals 4

    .line 36
    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    const/4 v0, 0x2

    if-eq v0, p3, :cond_0

    .line 38
    const-string v0, "modifyLocalCardInfo, the card is not installed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 39
    const/4 v0, 0x1

    return v0

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "modifyLocalCardInfo, the card cur status is "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 44
    const/4 v2, 0x0

    .line 47
    const/4 v0, 0x1

    if-ne v0, p3, :cond_1

    .line 49
    :try_start_0
    invoke-static {p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/16 v1, 0x5c

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V

    .line 52
    :cond_1
    const/4 v0, 0x2

    if-ne v0, p3, :cond_2

    .line 54
    invoke-static {p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/16 v1, 0x63

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 56
    :cond_2
    const/4 v2, 0x1

    .line 65
    goto :goto_0

    .line 58
    :catch_0
    move-exception v3

    .line 60
    const-string v0, "modifyLocalCardInfo, lock card in ta failed, WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 65
    goto :goto_0

    .line 62
    :catch_1
    move-exception v3

    .line 64
    const-string v0, "modifyLocalCardInfo, lock card in ta failed, WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 67
    :goto_0
    if-eqz v2, :cond_3

    .line 69
    invoke-static {p2}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 72
    :cond_3
    return v2
.end method

.method protected reportCardStatus(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    .locals 1

    .line 78
    invoke-static {p3}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardLockedStatus(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    return-void
.end method
