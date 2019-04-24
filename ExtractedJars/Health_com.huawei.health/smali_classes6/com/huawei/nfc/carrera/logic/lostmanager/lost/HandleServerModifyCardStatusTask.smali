.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private callback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;

.field private cplcFromServer:Ljava/lang/String;

.field private dpanidFromServer:Ljava/lang/String;

.field private mAid:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private serverAction:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;)V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    .line 69
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    .line 70
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->cplcFromServer:Ljava/lang/String;

    .line 71
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    .line 72
    iput-object p6, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->callback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;

    .line 73
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->dpanidFromServer:Ljava/lang/String;

    .line 74
    return-void
.end method

.method private handleResult(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->callback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 198
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->callback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;

    invoke-interface {v0, p1, p2, p3}, Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleServerCardLostMsgCallback;->handleServerMsgResult(ZLjava/lang/String;Ljava/lang/String;)V

    .line 200
    :cond_0
    return-void
.end method

.method private updateCardToNullified(Ljava/lang/String;)Z
    .locals 4

    .line 168
    const/4 v2, 0x1

    .line 171
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 183
    goto :goto_0

    .line 174
    :catch_0
    move-exception v3

    .line 176
    const/4 v2, 0x0

    .line 177
    const-string v0, "checkCardNullifiedStatus, set card nullified in ta failed, WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 183
    goto :goto_0

    .line 179
    :catch_1
    move-exception v3

    .line 181
    const/4 v2, 0x0

    .line 182
    const-string v0, "checkCardNullifiedStatus, set card nullified in ta failed, WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 185
    :goto_0
    return v2
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 83
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->dpanidFromServer:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->dpanidFromServer:Ljava/lang/String;

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 85
    :cond_0
    const-string v0, "HandleServerModifyCardStatusTask, taCardInfo not existed or dpanid mismatch"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->cplcFromServer:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->handleResult(ZLjava/lang/String;Ljava/lang/String;)V

    .line 87
    return-void

    .line 91
    :cond_1
    const-string v0, "5"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->updateCardToNullified(Ljava/lang/String;)Z

    move-result v4

    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HandleServerModifyCardStatusTask,  isUpdateSuccess = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 96
    if-eqz v4, :cond_2

    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x3

    if-eq v1, v0, :cond_2

    .line 99
    const-string v0, "HandleServerModifyCardStatusTask,  refreshCardList ="

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 104
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v4

    .line 105
    if-nez v4, :cond_3

    .line 107
    const-string v0, "HandleServerModifyCardStatusTask, issuer info not existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 108
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->cplcFromServer:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->handleResult(ZLjava/lang/String;Ljava/lang/String;)V

    .line 109
    return-void

    .line 111
    :cond_3
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xd

    if-eq v1, v0, :cond_4

    .line 112
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_5

    const-string v0, "A0000003330101020063020000000301"

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v5, 0x1

    goto :goto_0

    :cond_5
    const/4 v5, 0x0

    .line 113
    :goto_0
    if-eqz v5, :cond_7

    .line 115
    const-string v0, "HandleServerModifyCardStatusTask, cup card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 116
    new-instance v6, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanDigest()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    invoke-direct {v6, v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 117
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPCardModifier;->modify()Z

    move-result v7

    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HandleServerModifyCardStatusTask, isCardLocalModifiedSuccess ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 119
    if-eqz v7, :cond_6

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 124
    :cond_6
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->cplcFromServer:Ljava/lang/String;

    invoke-direct {p0, v7, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->handleResult(ZLjava/lang/String;Ljava/lang/String;)V

    .line 125
    return-void

    .line 129
    :cond_7
    const/4 v6, 0x0

    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HandleServerModifyCardStatusTask, serverAction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 131
    const-string v0, "2"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    .line 132
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 134
    :cond_8
    new-instance v6, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardPauseModifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardPauseModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 136
    :cond_9
    const-string v0, "5"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 138
    new-instance v6, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/BankCardNullifiedModifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/BankCardNullifiedModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 140
    :cond_a
    const-string v0, "00"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->serverAction:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 142
    new-instance v6, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardResumeModifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mContext:Landroid/content/Context;

    invoke-direct {v6, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardResumeModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    .line 146
    :cond_b
    const-string v0, "unknown server action."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 149
    :goto_1
    const/4 v7, 0x0

    .line 150
    const/4 v0, 0x0

    if-eq v0, v6, :cond_c

    .line 152
    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->modifyLocalCardStatus(Z)Z

    move-result v7

    .line 155
    :cond_c
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->mAid:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->cplcFromServer:Ljava/lang/String;

    invoke-direct {p0, v7, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/HandleServerModifyCardStatusTask;->handleResult(ZLjava/lang/String;Ljava/lang/String;)V

    .line 156
    return-void
.end method
