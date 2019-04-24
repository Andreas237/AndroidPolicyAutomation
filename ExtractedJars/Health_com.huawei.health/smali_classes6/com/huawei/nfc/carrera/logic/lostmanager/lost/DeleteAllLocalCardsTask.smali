.class public Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;
.super Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final DELETE_TYPE_LOST:I = 0x1

.field public static final DELETE_TYPE_REPAIR:I = 0x0

.field public static final REPAIR_DEVICE_STATUS_DEL_CARDS:I = 0x2

.field public static final REPAIR_DEVICE_STATUS_ERR:I = 0x1

.field private static final TAG:Ljava/lang/String; = "DeleteAllLocalCardsTask"


# instance fields
.field private final mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;

.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;)V
    .locals 1

    .line 72
    const-string v0, "WIPEOUT"

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CUPTsmLibDataWaiter;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 73
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    .line 74
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;

    .line 75
    return-void
.end method

.method private cleanCUPCard(Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;>;)Z"
        }
    .end annotation

    .line 154
    const/4 v4, 0x0

    .line 155
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->requestSwipeCupCard()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const-string v1, "WIPEOUT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->registerCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 160
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 161
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 163
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    goto :goto_0

    .line 165
    :cond_0
    const-string v0, "DeleteAllLocalCardsTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " cleanCUPCard waitOperationResult "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->waitOperationResult(Ljava/util/List;)Z

    move-result v4

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const-string v1, "WIPEOUT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->unregisterCUPOperationListener(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/response/CUPOperationListener;)V

    .line 169
    invoke-virtual {p0, v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->checkAndCleanCupTAData(Ljava/util/List;)Z

    .line 171
    :cond_1
    return v4
.end method

.method private deleteCommonCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z
    .locals 5

    .line 217
    const/4 v2, 0x1

    .line 220
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, p2, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 231
    goto :goto_0

    .line 222
    :catch_0
    move-exception v3

    .line 224
    const/4 v2, 0x0

    .line 225
    const-string v0, "checkCardNullifiedStatus, set card nullified in ta failed, WalletTaCardNotExistException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 231
    goto :goto_0

    .line 227
    :catch_1
    move-exception v3

    .line 229
    const/4 v2, 0x0

    .line 230
    const-string v0, "checkCardNullifiedStatus, set card nullified in ta failed, WalletTaSystemErrorException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 234
    :goto_0
    if-eqz v2, :cond_0

    const/4 v0, 0x3

    if-eq p4, v0, :cond_0

    .line 236
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 239
    :cond_0
    new-instance v3, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardNullifiedModifier;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-direct {v3, p1, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardNullifiedModifier;-><init>(Ljava/lang/String;Landroid/content/Context;)V

    .line 240
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/CardStatusBaseModifier;->modifyLocalCardStatus(Z)Z

    move-result v4

    .line 241
    return v4
.end method

.method private notifyRepairResult(Z)V
    .locals 2

    .line 249
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mCallback:Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;

    invoke-interface {v0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/callback/HandleDeviceRepairCallback;->handleDeviceRepairCallback(Z)V

    .line 253
    :cond_0
    return-void
.end method

.method private requestSwipeCupCard()Z
    .locals 4

    .line 181
    const-string v0, "requestSwipeCupCard   begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 182
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;-><init>()V

    .line 183
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->setMerchantID(Ljava/lang/String;)V

    .line 184
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->setRsaKeyIndex(I)V

    .line 185
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->cplc:Ljava/lang/String;

    .line 187
    const-string v0, "10"

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;->event:Ljava/lang/String;

    .line 188
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->a(Lcom/huawei/nfc/carrera/server/card/request/WipeAllCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v3

    .line 189
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    iget v0, v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 191
    const-string v0, "requestSwipeCupCard success."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 192
    const/4 v0, 0x1

    return v0

    .line 195
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private sendDeviceStatusNormal()V
    .locals 3

    .line 203
    const-string v0, "sendDeviceStatusNormal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 204
    new-instance v2, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    const-string v1, "0"

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 206
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportDeviceStatusTask;->run()V

    .line 207
    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v2

    .line 81
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v3

    .line 82
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    const-string v0, "dev repair task, but no local card."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 86
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->sendDeviceStatusNormal()V

    .line 87
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->notifyRepairResult(Z)V

    .line 89
    return-void

    .line 93
    :cond_1
    const/4 v4, 0x1

    .line 94
    const/4 v5, 0x0

    .line 95
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    iget-object v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v8

    .line 99
    if-nez v8, :cond_2

    .line 101
    const-string v0, "clean local card info, no issuer info failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 102
    const/4 v4, 0x0

    .line 103
    goto :goto_0

    .line 108
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xd

    if-eq v1, v0, :cond_3

    .line 109
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_4

    const-string v0, "A0000003330101020063020000000301"

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    const/4 v9, 0x1

    goto :goto_1

    :cond_4
    const/4 v9, 0x0

    .line 110
    :goto_1
    if-eqz v9, :cond_6

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cup card existed, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getDpanDigest()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 113
    const/4 v0, 0x0

    if-ne v0, v5, :cond_5

    .line 115
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 117
    :cond_5
    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    goto/16 :goto_0

    .line 122
    :cond_6
    iget-object v10, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 132
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-direct {p0, v10, v0, v3, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->deleteCommonCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v4

    .line 133
    goto/16 :goto_0

    .line 135
    :cond_7
    const/4 v6, 0x1

    .line 137
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    .line 139
    const-string v0, "===123===\u8bbe\u5907\u6302\u5931\uff0c\u4e14\u6709\u94f6\u884c\u5361\uff0c\u64e6\u9664\u94f6\u884c\u5361\u64cd\u4f5c"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 140
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->cleanCUPCard(Ljava/util/List;)Z

    move-result v6

    .line 143
    :cond_8
    if-eqz v4, :cond_9

    if-eqz v6, :cond_9

    .line 145
    const-string v0, "===123===\u64e6\u9664\u6210\u529f\u540e\uff0c\u4e0a\u62a5\u6b63\u786e\u72b6\u6001"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 147
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->sendDeviceStatusNormal()V

    .line 149
    :cond_9
    if-eqz v4, :cond_a

    if-eqz v6, :cond_a

    const/4 v0, 0x1

    goto :goto_2

    :cond_a
    const/4 v0, 0x0

    :goto_2
    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/lostmanager/lost/DeleteAllLocalCardsTask;->notifyRepairResult(Z)V

    .line 150
    return-void
.end method
