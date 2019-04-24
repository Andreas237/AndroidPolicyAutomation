.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "CleanAllLocalBankCardsTask"


# instance fields
.field private final mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;)V
    .locals 1

    .line 49
    const-string v0, "WIPEOUT"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    .line 51
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;

    .line 52
    return-void
.end method

.method private cleanCUPCard(Ljava/util/List;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;)Z"
        }
    .end annotation

    .line 134
    const/4 v4, 0x0

    .line 135
    const/4 v5, 0x0

    .line 136
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->requestSwipeCupCard()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const-string v1, "WIPEOUT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->registerCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 141
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 142
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 144
    iget-object v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-interface {v6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    goto :goto_0

    .line 146
    :cond_0
    const-string v0, "CleanAllLocalBankCardsTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " cleanCUPCard waitOperationResult "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    invoke-virtual {p0, v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->waitOperationResult(Ljava/util/List;)Z

    move-result v4

    .line 150
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const-string v1, "WIPEOUT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->unregisterCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 153
    invoke-virtual {p0, v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->checkAndCleanCupTAData(Ljava/util/List;)Z

    move-result v5

    .line 155
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cleanCUPCard result  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; remove : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 156
    if-eqz v4, :cond_2

    if-eqz v5, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private deleteCommonCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Z
    .locals 5

    .line 191
    const/4 v2, 0x1

    .line 194
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p2, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 205
    goto :goto_0

    .line 196
    :catch_0
    move-exception v3

    .line 198
    const/4 v2, 0x0

    .line 199
    const-string v0, "checkCardNullifiedStatus, set card nullified in ta failed, WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 205
    goto :goto_0

    .line 201
    :catch_1
    move-exception v3

    .line 203
    const/4 v2, 0x0

    .line 204
    const-string v0, "checkCardNullifiedStatus, set card nullified in ta failed, WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 208
    :goto_0
    if-eqz v2, :cond_0

    const/4 v0, 0x3

    if-eq p4, v0, :cond_0

    .line 210
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 213
    :cond_0
    new-instance v3, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/BankCardNullifiedModifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-direct {v3, p1, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/BankCardNullifiedModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 214
    invoke-virtual {v3, p5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->modifyLocalCardStatus(Z)Z

    move-result v4

    .line 215
    return v4
.end method

.method private notifyDeleteResult(Z)V
    .locals 2

    .line 223
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "notifyDeleteResult isSuccess"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 227
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeleteLocalCardsCallback;->handleDeletelocalcardCallback(Z)V

    .line 229
    :cond_0
    return-void
.end method

.method private requestSwipeCupCard()Z
    .locals 4

    .line 166
    const-string v0, "requestSwipeCupCard   begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 167
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;-><init>()V

    .line 168
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->setMerchantID(Ljava/lang/String;)V

    .line 169
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->setRsaKeyIndex(I)V

    .line 170
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->cplc:Ljava/lang/String;

    .line 172
    const-string v0, "10"

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->event:Ljava/lang/String;

    .line 173
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->a(Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v3

    .line 174
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    iget v0, v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 176
    const-string v0, "requestSwipeCupCard success."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 177
    const/4 v0, 0x1

    return v0

    .line 180
    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 15

    .line 57
    const-string v0, "CleanAllLocalCardsTask run"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v6

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v7

    .line 62
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 64
    :cond_0
    const-string v0, "delete all bank card task, but no local card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 65
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->notifyDeleteResult(Z)V

    .line 66
    return-void

    .line 70
    :cond_1
    const/4 v8, 0x1

    .line 73
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 79
    iget v0, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 81
    const-string v0, "DeleteAllLocalBankCardsTask, bus card no need to handle"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 82
    goto :goto_0

    .line 85
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, v12, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v13

    .line 87
    if-nez v13, :cond_3

    .line 89
    const-string v0, "clean local card info, no issuer info failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 90
    const/4 v8, 0x0

    .line 91
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xd

    if-eq v1, v0, :cond_4

    .line 95
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_5

    const-string v0, "A0000003330101020063020000000301"

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    const/4 v14, 0x1

    goto :goto_1

    :cond_5
    const/4 v14, 0x0

    .line 96
    :goto_1
    if-eqz v14, :cond_7

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cup card existed, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanDigest()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 99
    const/4 v0, 0x0

    if-ne v0, v10, :cond_6

    .line 101
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 103
    :cond_6
    invoke-interface {v10, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    goto/16 :goto_0

    .line 107
    :cond_7
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xb

    if-eq v1, v0, :cond_8

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xc

    if-ne v1, v0, :cond_9

    .line 109
    :cond_8
    const/4 v9, 0x1

    .line 112
    :cond_9
    move-object v0, p0

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanDigest()Ljava/lang/String;

    move-result-object v2

    move-object v3, v7

    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardStatus()I

    move-result v4

    move v5, v9

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->deleteCommonCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v0

    if-nez v0, :cond_a

    .line 115
    const/4 v8, 0x0

    .line 117
    :cond_a
    goto/16 :goto_0

    .line 118
    :cond_b
    const/4 v11, 0x1

    .line 121
    const/4 v0, 0x0

    if-eq v0, v10, :cond_c

    .line 123
    const-string v0, "===123===\u53d1\u8d77\u64e6\u9664\u94f6\u884c\u5361 "

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 124
    invoke-direct {p0, v10}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->cleanCUPCard(Ljava/util/List;)Z

    move-result v11

    .line 127
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "deleteLocalCards run isCleanLocalCardSuccess : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; cleanCUPCardResult : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 129
    if-eqz v8, :cond_d

    if-eqz v11, :cond_d

    const/4 v0, 0x1

    goto :goto_2

    :cond_d
    const/4 v0, 0x0

    :goto_2
    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CleanAllLocalBankCardsTask;->notifyDeleteResult(Z)V

    .line 130
    return-void
.end method
