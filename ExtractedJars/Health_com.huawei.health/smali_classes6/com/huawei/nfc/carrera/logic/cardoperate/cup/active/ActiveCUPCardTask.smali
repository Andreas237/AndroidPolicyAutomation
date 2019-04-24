.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask$SetCardDefaultCallbackImpl;
    }
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mRefId:Ljava/lang/String;

.field private final mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;

.field private final mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

.field private final mVerifyCode:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/wallet/bankcard/server/BankCardServerApi;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    .line 62
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    .line 63
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mVerifyCode:Ljava/lang/String;

    .line 64
    iput-object p5, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;

    .line 65
    return-void
.end method

.method private doActivityCUPCard()I
    .locals 8

    .line 93
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;-><init>()V

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->setCplc(Ljava/lang/String;)V

    .line 95
    const/4 v0, -0x1

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->setRsaKeyIndex(I)V

    .line 96
    const-string v0, "260086000000068459"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->setMerchantID(Ljava/lang/String;)V

    .line 97
    const-string v0, "260086000000068459"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->setCardRefId(Ljava/lang/String;)V

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mVerifyCode:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;->setOptValue(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mServerApi:Lcom/huawei/wallet/bankcard/server/BankCardServerApi;

    invoke-interface {v0, v3}, Lcom/huawei/wallet/bankcard/server/BankCardServerApi;->b(Lcom/huawei/nfc/carrera/server/card/request/VerifiyCUPRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v4

    .line 101
    const/16 v5, -0x63

    .line 102
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 104
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 105
    const-string v7, "response is null"

    .line 106
    const-string v0, "fail_code"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    const v0, 0x3611a400

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v6, v7, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 108
    goto/16 :goto_1

    .line 111
    :cond_0
    iget v0, v4, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 116
    :sswitch_0
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->updateCardStatus()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 118
    const/4 v5, 0x0

    goto :goto_1

    .line 122
    :cond_1
    const/16 v5, -0x63

    .line 124
    goto :goto_1

    .line 126
    :sswitch_1
    const/4 v5, -0x1

    .line 127
    goto :goto_1

    .line 129
    :sswitch_2
    const/4 v5, -0x6

    .line 130
    goto :goto_1

    .line 132
    :sswitch_3
    const/4 v5, -0x3

    .line 133
    goto :goto_1

    .line 135
    :sswitch_4
    const/4 v5, -0x4

    .line 136
    goto :goto_1

    .line 140
    :sswitch_5
    const/16 v5, -0x9

    .line 141
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->updataTaInfoToDelete()V

    .line 142
    goto :goto_1

    .line 144
    :sswitch_6
    const/4 v5, -0x6

    .line 145
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 146
    const-string v7, "ActiveCUPCardTask doActivityCUPCard server overload 503"

    .line 147
    const-string v0, "fail_reason"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    const v0, 0x3611a442

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v6, v7, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 149
    goto :goto_1

    .line 151
    :goto_0
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->reprotFailReason(Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;)V

    .line 152
    const/16 v5, -0x63

    .line 156
    :goto_1
    return v5

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4 -> :sswitch_6
        -0x2 -> :sswitch_2
        -0x1 -> :sswitch_1
        0x0 -> :sswitch_0
        0x53e -> :sswitch_5
        0x53f -> :sswitch_5
        0x64d -> :sswitch_0
        0xd0f -> :sswitch_5
        0xe1c -> :sswitch_4
        0xe1d -> :sswitch_0
        0xe1e -> :sswitch_3
    .end sparse-switch
.end method

.method private getCurCardName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 253
    new-instance v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    .line 254
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 255
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 256
    const-string v0, "getCurCardName issuerInfo is null."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 257
    const/4 v0, 0x0

    return-object v0

    .line 259
    :cond_0
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private reportBiCardStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 317
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v2

    .line 319
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 321
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    const-string v1, ""

    invoke-static {v0, p3, v1, p4, p5}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    iget-object v1, v2, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    invoke-static {v0, p3, v1, p4, p5}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 327
    :goto_0
    return-void
.end method

.method private reprotFailReason(Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;)V
    .locals 6

    .line 161
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v4

    .line 162
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 164
    const-string v0, "active failed, but no ta info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 165
    return-void

    .line 168
    :cond_0
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 169
    const-string v0, "fail_code"

    iget v1, p1, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    const-string v0, "issuerId"

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    const-string v0, "productId"

    iget-object v1, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    const-string v0, "active card err"

    const v1, 0x3611a400

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 173
    return-void
.end method

.method private updataTaInfoToDelete()V
    .locals 3

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 178
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 180
    const-string v0, "active failed, but no ta info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 181
    return-void

    .line 183
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->updateCardStatus(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 186
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->clearNullifiedCardLocalInfo(Ljava/lang/String;)V

    .line 188
    :cond_1
    return-void
.end method

.method private updateCardName(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .line 295
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardName(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 296
    const/4 v0, 0x1

    return v0

    .line 298
    :catch_0
    move-exception v2

    .line 300
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update card status after active card, WalletTaCardNotExistException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 301
    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 300
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 306
    goto :goto_0

    .line 303
    :catch_1
    move-exception v2

    .line 305
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update card status after active card, WalletTaSystemErrorException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 307
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method private updateCardStatus()Z
    .locals 13

    .line 192
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v7

    .line 193
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 195
    const-string v0, "active success, but no ta info."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 196
    const/4 v0, 0x0

    return v0

    .line 200
    :cond_0
    const/4 v8, 0x2

    .line 201
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 204
    :sswitch_0
    const/16 v8, 0x60

    .line 205
    goto :goto_1

    .line 207
    :sswitch_1
    const/16 v8, 0x5f

    .line 208
    goto :goto_1

    .line 210
    :sswitch_2
    const/4 v8, 0x2

    .line 211
    goto :goto_1

    .line 213
    :sswitch_3
    const/16 v8, 0x5d

    .line 214
    goto :goto_1

    .line 216
    :sswitch_4
    const/4 v0, 0x1

    return v0

    .line 218
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 221
    :goto_1
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 222
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update card status available: cardName"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    invoke-direct {p0, v0, v9}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->updateCardName(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v10

    .line 224
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update card status available: isUpdateNameSucess"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 225
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    invoke-direct {p0, v0, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->updateCardStatus(Ljava/lang/String;I)Z

    move-result v11

    .line 226
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update card status available: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 227
    if-eqz v11, :cond_2

    .line 230
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    if-eq v0, v8, :cond_1

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 235
    :cond_1
    const/4 v0, 0x2

    if-ne v0, v8, :cond_2

    .line 237
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    iget-object v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    new-instance v2, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask$SetCardDefaultCallbackImpl;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask$SetCardDefaultCallbackImpl;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->setCardDefault(Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/SetCardDefaultCallback;)V

    .line 241
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 242
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    move-object v3, v12

    iget-object v4, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    iget-object v5, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v6, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 244
    move-object v0, p0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    iget-object v2, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    iget-object v3, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget-object v4, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v5, v7, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->reportBiCardStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 248
    :cond_2
    return v11

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x2 -> :sswitch_4
        0x5e -> :sswitch_3
        0x61 -> :sswitch_1
        0x62 -> :sswitch_0
    .end sparse-switch
.end method

.method private updateCardStatus(Ljava/lang/String;I)Z
    .locals 3

    .line 271
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 272
    const/4 v0, 0x1

    return v0

    .line 274
    :catch_0
    move-exception v2

    .line 276
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update card status after active card, WalletTaCardNotExistException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 277
    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 276
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 282
    goto :goto_0

    .line 279
    :catch_1
    move-exception v2

    .line 281
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "update card status after active card, WalletTaSystemErrorException: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 283
    :goto_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mRefId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v2

    .line 71
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 73
    const-string v0, "prepare before active, card download err."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;

    const/4 v1, -0x7

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->notifyActiveResult(I)V

    goto :goto_0

    .line 76
    :cond_0
    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-eq v1, v0, :cond_1

    iget v0, v2, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5d

    if-ne v1, v0, :cond_2

    .line 81
    :cond_1
    const-string v0, "prepare before active, card download err."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->notifyActiveResult(I)V

    goto :goto_0

    .line 86
    :cond_2
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->doActivityCUPCard()I

    move-result v3

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/ActiveCUPCardTask;->mResultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;

    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/active/HandleActiveCardResultTask;->notifyActiveResult(I)V

    .line 89
    :goto_0
    return-void
.end method
