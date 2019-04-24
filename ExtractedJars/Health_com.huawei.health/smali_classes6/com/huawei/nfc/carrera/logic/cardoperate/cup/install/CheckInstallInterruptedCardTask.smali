.class public Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final INSTALL_INTERRUPTED_CARD_VALID_TIME:J = 0x35b60L


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final resultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    .line 61
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->resultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;

    .line 62
    return-void
.end method

.method private checkServiceData(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 10

    .line 92
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->queryPersonalizedInfo(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;

    move-result-object v7

    .line 93
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 96
    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 98
    iget-object v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->aid:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->virtualCardRefID:Ljava/lang/String;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const-string v0, ""

    iget-object v1, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->virtualCardRefID:Ljava/lang/String;

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->virtualCardRefID:Ljava/lang/String;

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v8, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    .line 101
    :goto_0
    if-eqz v8, :cond_2

    .line 103
    const-string v0, "query aid success, but result illegal."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 104
    return-void

    .line 106
    :cond_2
    iget-object v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->aid:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->doTaUpdate(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;Ljava/lang/String;)V

    .line 107
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->remove(Ljava/lang/String;)Z

    .line 108
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->aid:Ljava/lang/String;

    move-object v3, v9

    iget-object v4, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    iget-object v5, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v6, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 111
    return-void

    .line 114
    :cond_3
    iget v0, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->returnCode:I

    const/4 v1, -0x3

    if-ne v1, v0, :cond_4

    .line 116
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 117
    const-string v0, "fail_reason"

    const-string v1, "card has not been downloaded."

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->returnCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    const v0, 0x3611a443

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v8, v1, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 120
    const-string v0, "card has not been downloaded."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 121
    goto :goto_1

    .line 125
    :cond_4
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 126
    const-string v0, "fail_reason"

    const-string v1, "checkServiceData fail"

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    const-string v0, "fail_code"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v7, Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;->returnCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    const-string v0, "checkServiceData fail"

    const v1, 0x3611a443

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v1, v8, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 130
    :goto_1
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->checkTimeOutAndCleanTempData(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 132
    :cond_5
    return-void
.end method

.method private checkTaskFinished()V
    .locals 1

    .line 282
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->resultTask:Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/HandleCheckCUPCardResultTask;->notifyCheckFinished()V

    .line 283
    return-void
.end method

.method private checkTimeOutAndCleanTempData(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 8

    .line 173
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 174
    if-nez v4, :cond_1

    .line 176
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long v5, v0, v2

    .line 177
    const-wide/32 v0, 0x35b60

    cmp-long v0, v5, v0

    if-lez v0, :cond_0

    .line 179
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card downloaded timeout, refID1 : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 180
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->updateTaCardStatusToErr(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_1

    .line 181
    return-void

    .line 183
    :cond_0
    goto :goto_0

    .line 186
    :cond_1
    const/4 v5, 0x0

    .line 189
    :try_start_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 190
    const-string v0, "time_stamp"

    const-wide/16 v1, 0x0

    invoke-static {v5, v0, v1, v2}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getLongValue(Lorg/json/JSONObject;Ljava/lang/String;J)J

    move-result-wide v6

    .line 191
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v6

    const-wide/32 v2, 0x35b60

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    .line 193
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card downloaded timeout, refID2 : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 194
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->updateTaCardStatusToErr(Ljava/lang/String;I)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 195
    return-void

    .line 197
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/BankCardOperateLogic;->checkCUPInterruptedCard(ZLcom/huawei/nfc/carrera/logic/cardoperate/response/CheckCUPCardCallback;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 202
    goto :goto_0

    .line 199
    :catch_0
    move-exception v6

    .line 201
    const-string v0, "parsPushConsumeMsg, get json exception."

    :try_start_3
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    .line 208
    :goto_0
    goto :goto_1

    .line 205
    :catch_1
    move-exception v4

    .line 207
    const-string v0, "CheckInstallInterruptedCardTask card is already update,no need check."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 209
    :goto_1
    return-void
.end method

.method private doTaUpdate(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;Ljava/lang/String;)V
    .locals 10

    .line 214
    iget v7, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 215
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x62

    if-eq v1, v0, :cond_0

    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x61

    if-eq v1, v0, :cond_0

    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5e

    if-ne v1, v0, :cond_1

    .line 219
    :cond_0
    const/4 v0, 0x1

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    goto :goto_0

    .line 223
    :cond_1
    const/4 v0, 0x2

    iput v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    .line 225
    :goto_0
    iput-object p2, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    .line 226
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->updataTaCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Z

    move-result v8

    .line 227
    if-eqz v8, :cond_4

    .line 230
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    if-eq v7, v0, :cond_2

    .line 232
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 236
    :cond_2
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_3

    .line 238
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 239
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget-object v2, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v9, v2}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedNotActiveStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    goto :goto_1

    .line 242
    :cond_3
    iget v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_4

    .line 244
    iget-object v0, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->getCurCardName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 245
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    move-object v3, v9

    iget-object v4, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->fpanFour:Ljava/lang/String;

    iget-object v5, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v6, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardGroupType:I

    const/4 v2, 0x0

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 247
    move-object v0, p0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget-object v2, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    iget-object v3, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget-object v4, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget v5, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardType:I

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->reportBiCardStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 250
    :cond_4
    :goto_1
    return-void
.end method

.method private getCurCardName(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 254
    new-instance v1, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;-><init>(Landroid/content/Context;)V

    .line 255
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v2

    .line 256
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 257
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 259
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private queryPersonalizedInfo(Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;
    .locals 4

    .line 293
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;-><init>()V

    .line 294
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->cplc:Ljava/lang/String;

    .line 295
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->setRsaKeyIndex(I)V

    .line 296
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->setMerchantID(Ljava/lang/String;)V

    .line 297
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 298
    iput-object p1, v2, Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;->cardRefId:Ljava/lang/String;

    .line 299
    new-instance v0, Lcom/huawei/wallet/bankcard/server/BankCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/wallet/bankcard/server/BankCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/huawei/wallet/bankcard/server/BankCardServer;->e(Lcom/huawei/nfc/carrera/server/card/request/QueryAidRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryAidResponse;

    move-result-object v3

    .line 301
    return-object v3
.end method

.method private reportBiCardStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    .line 265
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    invoke-interface {v0, p2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheCardProductInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v2

    .line 267
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 269
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    const-string v1, ""

    invoke-static {v0, p3, v1, p4, p5}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 273
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    iget-object v1, v2, Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;->productName:Ljava/lang/String;

    invoke-static {v0, p3, v1, p4, p5}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 275
    :goto_0
    return-void
.end method

.method private updataTaCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Z
    .locals 5

    .line 312
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->dpanDigest:Ljava/lang/String;

    iget-object v2, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->aid:Ljava/lang/String;

    iget v3, p1, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateTaCardInfoForCUP(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v4

    .line 315
    return v4
.end method

.method private updateTaCardStatusToErr(Ljava/lang/String;I)V
    .locals 5

    .line 136
    const/16 v0, 0x5d

    if-eq p2, v0, :cond_0

    const/16 v0, 0x5e

    if-eq p2, v0, :cond_0

    const/4 v0, 0x1

    if-eq p2, v0, :cond_0

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 140
    :goto_0
    if-eqz v2, :cond_2

    .line 142
    return-void

    .line 145
    :cond_2
    const/16 v0, 0x60

    if-eq p2, v0, :cond_3

    const/16 v0, 0x5f

    if-ne p2, v0, :cond_4

    .line 147
    :cond_3
    const/16 v3, 0x5d

    goto :goto_1

    .line 151
    :cond_4
    const/16 v3, 0x5e

    .line 156
    :goto_1
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1, v3}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaCardNotExistException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException$WalletTaSystemErrorException; {:try_start_0 .. :try_end_0} :catch_1

    .line 165
    goto :goto_2

    .line 158
    :catch_0
    move-exception v4

    .line 160
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "card info has been already deleted! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 165
    goto :goto_2

    .line 162
    :catch_1
    move-exception v4

    .line 164
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateCardStatus err! refID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 166
    :goto_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/CardInfoManagerApi;->refreshCardList()V

    .line 167
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardList()Ljava/util/ArrayList;

    move-result-object v2

    .line 68
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 70
    :cond_0
    const-string v0, "check cup card, but ta card info is empty."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 71
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->checkTaskFinished()V

    .line 72
    return-void

    .line 75
    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    .line 77
    iget v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x62

    if-eq v1, v0, :cond_2

    iget v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x61

    if-eq v1, v0, :cond_2

    iget v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x60

    if-eq v1, v0, :cond_2

    iget v0, v4, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0x5f

    if-eq v1, v0, :cond_2

    const/4 v5, 0x1

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    .line 81
    :goto_1
    if-eqz v5, :cond_3

    .line 83
    goto :goto_0

    .line 85
    :cond_3
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->checkServiceData(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 86
    goto :goto_0

    .line 87
    :cond_4
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/cup/install/CheckInstallInterruptedCardTask;->checkTaskFinished()V

    .line 88
    return-void
.end method
