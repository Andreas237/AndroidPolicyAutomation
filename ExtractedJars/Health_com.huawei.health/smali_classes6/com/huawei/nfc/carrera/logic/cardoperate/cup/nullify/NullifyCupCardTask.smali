.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mRefID:Ljava/lang/String;

.field private final mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;

.field private final mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    .line 64
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    .line 65
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    .line 66
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;

    .line 67
    return-void
.end method

.method private checkNullifyCardResponse(Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;)I
    .locals 7

    .line 168
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 170
    const-string v0, "checkNullifyCardResponse, response is illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 171
    const/16 v0, -0x63

    return v0

    .line 175
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nullify cup card return code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p1, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 176
    iget v0, p1, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;->returnCode:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 181
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->updateTaCardInfo()Z

    move-result v5

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "===123===isUpdateSuccess"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 183
    if-eqz v5, :cond_1

    .line 185
    const/4 v4, 0x0

    goto :goto_1

    .line 189
    :cond_1
    const/16 v4, -0x63

    .line 191
    goto :goto_1

    .line 193
    :sswitch_1
    const/4 v4, -0x3

    .line 194
    goto :goto_1

    .line 196
    :sswitch_2
    const/4 v4, -0x4

    .line 197
    goto :goto_1

    .line 199
    :sswitch_3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->doTaDelete()V

    .line 200
    const/4 v4, 0x0

    .line 201
    goto :goto_1

    .line 203
    :sswitch_4
    const/4 v4, -0x8

    .line 204
    goto :goto_1

    .line 206
    :sswitch_5
    const/4 v4, -0x3

    .line 207
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 208
    const-string v0, "fail_reason"

    const-string v1, "NullifyCupCardTask checkNullifyCardResponse server overload 503"

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    const-string v0, "nullify card err"

    const v1, 0x3611a3fe

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v6, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 211
    goto :goto_1

    .line 213
    :goto_0
    iget v0, p1, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;->returnCode:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->reprotFailReason(I)V

    .line 214
    const/16 v4, -0x63

    .line 217
    :goto_1
    return v4

    :sswitch_data_0
    .sparse-switch
        -0xa -> :sswitch_4
        -0x4 -> :sswitch_5
        -0x2 -> :sswitch_2
        -0x1 -> :sswitch_1
        0x0 -> :sswitch_0
        0x53e -> :sswitch_3
        0x53f -> :sswitch_0
        0xd0f -> :sswitch_0
    .end sparse-switch
.end method

.method private cleanDownlaodInfo()V
    .locals 4

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 89
    if-eqz v3, :cond_0

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->remove(Ljava/lang/String;)Z

    .line 93
    :cond_0
    return-void
.end method

.method private doTaDelete()V
    .locals 3

    .line 237
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->removeCard(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 246
    goto :goto_0

    .line 239
    :catch_0
    move-exception v2

    .line 241
    const-string v0, "TaInfo has been allready deleted."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 246
    goto :goto_0

    .line 243
    :catch_1
    move-exception v2

    .line 245
    const-string v0, "Delete TaInfo Err."

    invoke-static {v0, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 247
    :goto_0
    return-void
.end method

.method private handleResult(I)V
    .locals 2

    .line 256
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 258
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/HandleNullifyCardResultTask;->notifyNullifyResult(I)V

    .line 260
    :cond_0
    return-void
.end method

.method private nullifyCUPCard()Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;
    .locals 4

    .line 142
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v2

    .line 143
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;-><init>()V

    .line 146
    const/16 v0, -0xa

    iput v0, v1, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;->returnCode:I

    .line 147
    return-object v1

    .line 149
    :cond_0
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;-><init>()V

    .line 150
    iput-object v2, v3, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->cplc:Ljava/lang/String;

    .line 151
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setRsaKeyIndex(I)V

    .line 152
    const-string v0, "260086000000068459"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setMerchantID(Ljava/lang/String;)V

    .line 153
    const-string v0, "260086000000068459"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    iput-object v0, v3, Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;->cardRefId:Ljava/lang/String;

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-interface {v0, v3}, Lcom/huawei/wallet/bankcard/server/BankCardServerApi;->a(Lcom/huawei/nfc/carrera/server/card/request/NullifyCUPCardRequest;)Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;

    move-result-object v1

    .line 156
    return-object v1
.end method

.method private reprotFailReason(I)V
    .locals 6

    .line 222
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 223
    if-eqz v4, :cond_0

    .line 225
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 226
    const-string v0, "fail_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    const-string v0, "issuerID"

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    const-string v0, "productID"

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    const-string v0, "nullify card err"

    const v1, 0x3611a3fe

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 231
    :cond_0
    return-void
.end method

.method private updateTaCardInfo()Z
    .locals 6

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 98
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 100
    const/4 v0, 0x0

    return v0

    .line 103
    :cond_0
    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x3

    if-ne v1, v0, :cond_1

    .line 105
    const/4 v0, 0x1

    return v0

    .line 108
    :cond_1
    const/4 v4, 0x1

    .line 111
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 122
    goto :goto_0

    .line 113
    :catch_0
    move-exception v5

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TaCardInfo allready deleted! Refid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 116
    const/4 v4, 0x0

    .line 122
    goto :goto_0

    .line 118
    :catch_1
    move-exception v5

    .line 120
    const/4 v4, 0x0

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NullifyCupCardTask TaCardInfo err! Refid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v5, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/Throwable;Z)V

    .line 125
    :goto_0
    if-eqz v4, :cond_2

    .line 127
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->clearNullifiedCardLocalInfo(Ljava/lang/String;)V

    .line 131
    :cond_2
    return v4
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nullify card, refId: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->mRefID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 79
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->nullifyCUPCard()Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;

    move-result-object v2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "nullify cup card result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v2, Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 81
    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->checkNullifyCardResponse(Lcom/huawei/nfc/carrera/server/card/response/NullifyCardResponse;)I

    move-result v3

    .line 82
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->cleanDownlaodInfo()V

    .line 83
    invoke-direct {p0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/nullify/NullifyCupCardTask;->handleResult(I)V

    .line 84
    return-void
.end method
