.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mRefId:Ljava/lang/String;

.field private final mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

.field private final mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    .line 50
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    .line 51
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mRefId:Ljava/lang/String;

    .line 52
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

    .line 53
    return-void
.end method

.method private checkTaCardStatus()Z
    .locals 5

    .line 138
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 139
    if-nez v3, :cond_0

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

    .line 142
    const/4 v1, -0x7

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->notifyRequestResult(ILjava/lang/String;)V

    .line 143
    const/4 v0, 0x0

    return v0

    .line 146
    :cond_0
    iget v4, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 147
    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-eq v1, v0, :cond_1

    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-ne v1, v0, :cond_2

    .line 151
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

    const/4 v1, -0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->notifyRequestResult(ILjava/lang/String;)V

    .line 152
    const/4 v0, 0x0

    return v0

    .line 154
    :cond_2
    const/16 v0, 0x61

    if-eq v4, v0, :cond_3

    const/16 v0, 0x62

    if-eq v4, v0, :cond_3

    const/4 v0, 0x1

    if-eq v4, v0, :cond_3

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

    .line 158
    const/4 v1, -0x7

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->notifyRequestResult(ILjava/lang/String;)V

    .line 159
    const/4 v0, 0x0

    return v0

    .line 161
    :cond_3
    const/4 v0, 0x1

    return v0
.end method

.method private doTaStatusUpdate(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;I)V
    .locals 8

    .line 213
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V

    .line 215
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    if-eq v0, p2, :cond_0

    .line 217
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 220
    :cond_0
    const/4 v0, 0x2

    if-ne v0, p2, :cond_1

    .line 222
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    move-object v3, v7

    iget-object v4, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    iget-object v5, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v6, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    :cond_1
    goto :goto_0

    .line 227
    :catch_0
    move-exception v7

    .line 229
    const-string v0, "updateCardStatus err : "

    invoke-static {v0, v7}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 231
    :goto_0
    return-void
.end method

.method private getCurCardName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 235
    new-instance v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    .line 236
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 237
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 238
    const-string v0, "getCurCardName issuerInfo is null."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 239
    const/4 v0, 0x0

    return-object v0

    .line 241
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private reportFailReason(Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;)V
    .locals 6

    .line 122
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 123
    if-nez v4, :cond_0

    .line 125
    const-string v0, "request cup verify code failed, ta is null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 126
    return-void

    .line 129
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 130
    const-string v0, "fail_code"

    iget v1, p1, Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;->returnCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    const-string v0, "issuerId"

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    const-string v0, "productId"

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    const-string v0, "request sms err"

    const v1, 0x3611a3ff

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 134
    return-void
.end method

.method private updateTAInfo()V
    .locals 4

    .line 179
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 180
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 182
    const-string v0, "updateTAInfo, but ta info is not existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 183
    return-void

    .line 186
    :cond_0
    const/4 v3, 0x2

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exsited card status: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 188
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x62

    if-ne v1, v0, :cond_1

    .line 190
    const/16 v3, 0x60

    goto :goto_0

    .line 192
    :cond_1
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x61

    if-ne v1, v0, :cond_2

    .line 194
    const/16 v3, 0x5f

    goto :goto_0

    .line 196
    :cond_2
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 198
    const/4 v3, 0x2

    goto :goto_0

    .line 203
    :cond_3
    return-void

    .line 206
    :goto_0
    invoke-direct {p0, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->doTaStatusUpdate(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;I)V

    .line 207
    return-void
.end method

.method private updateTAInfoToDelete()V
    .locals 3

    .line 166
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 167
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 169
    const-string v0, "updateTAInfo, but ta info is not existed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 170
    return-void

    .line 173
    :cond_0
    const/4 v0, 0x3

    invoke-direct {p0, v2, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->doTaStatusUpdate(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;I)V

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->clearNullifiedCardLocalInfo(Ljava/lang/String;)V

    .line 175
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 58
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->checkTaCardStatus()Z

    move-result v0

    if-nez v0, :cond_0

    .line 60
    return-void

    .line 63
    :cond_0
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;-><init>()V

    .line 64
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->setCplc(Ljava/lang/String;)V

    .line 65
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->setRsaKeyIndex(I)V

    .line 66
    const-string v0, "260086000000068459"

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->setMerchantID(Ljava/lang/String;)V

    .line 67
    const-string v0, "260086000000068459"

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;->setCardRefId(Ljava/lang/String;)V

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-interface {v0, v4}, Lcom/huawei/wallet/bankcard/server/BankCardServerApi;->c(Lcom/huawei/nfc/carrera/server/card/request/ApplyCUPVerificationRequest;)Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;

    move-result-object v5

    .line 70
    const/16 v6, -0x63

    .line 71
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 73
    const-string v0, "request cup verify code, response is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->notifyRequestResult(ILjava/lang/String;)V

    .line 75
    return-void

    .line 77
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "request cup verify code, response response.returnCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v5, Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 78
    iget v0, v5, Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;->returnCode:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 81
    :sswitch_0
    const/4 v6, 0x0

    .line 82
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "request cup verify code, expire time: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v5, Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;->expiry:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",curTime: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v5, Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;->currTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 83
    goto :goto_1

    .line 85
    :sswitch_1
    const/4 v6, -0x1

    .line 86
    goto :goto_1

    .line 88
    :sswitch_2
    const/4 v6, -0x2

    .line 89
    goto :goto_1

    .line 92
    :sswitch_3
    const/4 v6, -0x3

    .line 93
    goto :goto_1

    .line 96
    :sswitch_4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->updateTAInfo()V

    .line 97
    const/4 v6, -0x5

    .line 98
    goto :goto_1

    .line 102
    :sswitch_5
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->updateTAInfoToDelete()V

    .line 103
    const/4 v6, -0x4

    .line 104
    goto :goto_1

    .line 106
    :sswitch_6
    const/4 v6, -0x3

    .line 107
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 108
    const-string v0, "fail_reason"

    const-string v1, "RuquestCUPVerifyCodeTask server overload 503"

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    const-string v0, "request sms err"

    const v1, 0x3611a3ff

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v7, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 111
    goto :goto_1

    .line 113
    :goto_0
    invoke-direct {p0, v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->reportFailReason(Lcom/huawei/nfc/carrera/server/card/response/ApplyVerificationResponse;)V

    .line 114
    const/16 v6, -0x63

    .line 117
    :goto_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/RuquestCUPVerifyCodeTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/verifycode/HandleVerifyCodeResultTask;->notifyRequestResult(ILjava/lang/String;)V

    .line 118
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4 -> :sswitch_6
        -0x2 -> :sswitch_3
        -0x1 -> :sswitch_2
        0x0 -> :sswitch_0
        0x53e -> :sswitch_5
        0x53f -> :sswitch_5
        0x64d -> :sswitch_4
        0xc21 -> :sswitch_3
        0xd0f -> :sswitch_5
        0xe13 -> :sswitch_1
        0xe1d -> :sswitch_4
    .end sparse-switch
.end method
