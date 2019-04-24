.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mAction:Ljava/lang/String;

.field private final mContext:Landroid/content/Context;

.field private final mRefId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mRefId:Ljava/lang/String;

    .line 50
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mAction:Ljava/lang/String;

    .line 51
    return-void
.end method

.method private getCurCardName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 125
    new-instance v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    .line 126
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 127
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 128
    const-string v0, ""

    return-object v0

    .line 130
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private updateTaCardInfo(I)Z
    .locals 4

    .line 141
    const/4 v2, 0x1

    .line 144
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 155
    goto :goto_0

    .line 146
    :catch_0
    move-exception v3

    .line 148
    const/4 v2, 0x0

    .line 149
    const-string v0, "updateTaCardInfo, but ta info not existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 155
    goto :goto_0

    .line 151
    :catch_1
    move-exception v3

    .line 153
    const/4 v2, 0x0

    .line 154
    const-string v0, "updateTaCardInfo, ta system error."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 157
    :goto_0
    return v2
.end method


# virtual methods
.method public modify()Z
    .locals 10

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v7

    .line 61
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 63
    const-string v0, "modify, taCardInfo not exsited."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x0

    return v0

    .line 67
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "modify, and cur card status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "modify, and cur card mAction: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 69
    const/4 v8, 0x0

    .line 70
    const-string v0, "2"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mAction:Ljava/lang/String;

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 74
    :cond_1
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_2

    .line 76
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->updateTaCardInfo(I)Z

    move-result v8

    goto :goto_0

    .line 78
    :cond_2
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 80
    const/16 v0, 0x5c

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->updateTaCardInfo(I)Z

    move-result v8

    .line 82
    :cond_3
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "modify, isModifySuccess = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 83
    if-eqz v8, :cond_8

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardLockedStatus(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 90
    :cond_4
    const-string v0, "5"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 93
    const-string v0, "modify, isModifySuccess \u6e05\u7406nullified\u5361\u7247"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 94
    new-instance v9, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mRefId:Ljava/lang/String;

    invoke-direct {v9, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 95
    invoke-virtual {v9}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleCUPCardNullifiedTask;->modifyCUPCard()Z

    move-result v8

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    const-string v0, "00"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 100
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x63

    if-ne v1, v0, :cond_6

    .line 102
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->updateTaCardInfo(I)Z

    move-result v8

    goto :goto_1

    .line 104
    :cond_6
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5c

    if-ne v1, v0, :cond_7

    .line 106
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->updateTaCardInfo(I)Z

    move-result v8

    .line 108
    :cond_7
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "modify, isModifySuccess = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 109
    if-eqz v8, :cond_8

    .line 112
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 113
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    move-object v3, v9

    iget-object v4, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    iget-object v5, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v6, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 120
    :cond_8
    :goto_2
    return v8
.end method
