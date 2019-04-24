.class public abstract Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mAid:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    .line 42
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mAid:Ljava/lang/String;

    .line 43
    return-void
.end method


# virtual methods
.method protected abstract isNeedModifyESEStatus()Z
.end method

.method protected abstract modifyCardStatusInESE(Ljava/lang/String;Landroid/content/Context;)Z
.end method

.method protected abstract modifyLocalCardInfo(Ljava/lang/String;Landroid/content/Context;I)Z
.end method

.method modifyLocalCardStatus(Z)Z
    .locals 7

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 54
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 56
    const-string v0, "modifyLocalCardStatus, no ta info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 57
    const/4 v0, 0x0

    return v0

    .line 60
    :cond_0
    const-string v0, "modifyLocalCardStatus, (isNeedModifyESEStatus()"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->isNeedModifyESEStatus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->modifyCardStatusInESE(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v4

    .line 66
    if-nez v4, :cond_1

    .line 68
    const-string v0, "modifyCardStatusInESE, modify card status in ese failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 69
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_1
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    iget v2, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->modifyLocalCardInfo(Ljava/lang/String;Landroid/content/Context;I)Z

    move-result v4

    .line 75
    if-nez v4, :cond_2

    .line 77
    const-string v0, "modifyLocalCardStatus, update local card info failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 78
    const/4 v0, 0x0

    return v0

    .line 82
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v5

    .line 83
    if-nez v5, :cond_3

    const/4 v6, -0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v6

    .line 84
    :goto_0
    const/4 v0, -0x1

    if-ne v6, v0, :cond_4

    .line 86
    const-string v0, "reportCardStatus, mode unsupported."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 87
    const/4 v0, 0x0

    return v0

    .line 90
    :cond_4
    if-nez p1, :cond_6

    .line 95
    const/16 v0, 0xc

    if-ne v0, v6, :cond_5

    .line 97
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cmb card, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 98
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->reportCardStatus(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 102
    :cond_5
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->reportCardStatus(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 108
    :cond_6
    const/16 v0, 0xc

    if-ne v0, v6, :cond_7

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "need notify, cmb card, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 111
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget-object v2, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-interface {v0, v1, v2, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_1

    .line 115
    :cond_7
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardDeletedStatus(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 121
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method protected abstract reportCardStatus(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
.end method
