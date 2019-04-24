.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private final mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field private final mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    .line 49
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 50
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 51
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    .line 52
    return-void
.end method

.method private checkOrder(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V
    .locals 5

    .line 279
    const-string v0, "IssueTrafficCardFMOperator checkOrder begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 281
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosOrder(I)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v3

    .line 283
    const/4 v0, 0x0

    if-ne v0, v3, :cond_0

    .line 284
    const-string v0, "IssueTrafficCardFMOperator issueOrder is null !"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 285
    return-void

    .line 287
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator checkOrder issueOrder.tradeState : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v3, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 288
    iget v0, v3, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 289
    const-string v0, "IssueTrafficCardFMOperator checkOrder, update ta status"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 292
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getAid()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V

    .line 294
    const/16 v0, 0xd

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setCardStatus(I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 297
    goto :goto_0

    .line 295
    :catch_0
    move-exception v4

    .line 296
    const-string v0, "IssueTrafficCardFMOperator checkOrder, WalletTaException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 299
    :cond_1
    :goto_0
    return-void
.end method

.method private createDMSD(Ljava/lang/String;)I
    .locals 7

    .line 113
    const-string v0, "IssueTrafficCardFMOperator createDMSD begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 114
    new-instance v3, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/CreateSSDTsmOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/CreateSSDTsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/CreateSSDTsmOperator;->excute()I

    move-result v4

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator createDMSD result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 117
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 118
    const/4 v4, 0x0

    goto :goto_0

    .line 119
    :cond_0
    const/4 v0, -0x1

    if-ne v0, v4, :cond_1

    .line 120
    const-string v0, "IssueTrafficCardFMOperator createDMSD, no network"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 121
    const/16 v4, 0xb

    .line 122
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    goto :goto_0

    .line 124
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 125
    const-string v6, "IssueTrafficCardFMOperator createDMSD fail"

    .line 126
    const-string v0, "fail_reason"

    invoke-interface {v5, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    const-string v0, "fail_code"

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    const v0, 0x3611a41a

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v5, v6, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 129
    const/16 v4, 0x63

    .line 130
    invoke-direct {p0, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 133
    :goto_0
    return v4
.end method

.method private generateTaCardInfo(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;
    .locals 22

    .line 138
    new-instance v0, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p1

    move/from16 v10, p2

    .line 140
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v14

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v5, p4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "_watch.conf"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v5, p4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "_icon_watch.png"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/16 v13, 0xb

    const-wide/16 v16, 0x0

    const-wide/16 v19, 0x0

    invoke-direct/range {v0 .. v20}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJILjava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V

    move-object/from16 v21, v0

    .line 141
    return-object v21
.end method

.method private getCardNum()Ljava/lang/String;
    .locals 6

    .line 252
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardNum  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 253
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 254
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    .line 253
    const/4 v2, 0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryCardInfo(ILjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;

    move-result-object v3

    .line 255
    iget v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->resultCode:I

    if-eqz v0, :cond_0

    .line 256
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 257
    const-string v5, "IssueTrafficCardFMOperator getCardNum fail"

    .line 258
    const-string v0, "fail_reason"

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    const-string v0, "fail_code"

    iget v1, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 260
    const v0, 0x3611a41d

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v4, v5, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 261
    const/4 v0, 0x0

    return-object v0

    .line 264
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryCardInfoResponse;->getCardNo()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private handleResult(I)V
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    if-eqz v0, :cond_0

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/IssueTrafficCardResultHandler;->handleResult(I)V

    .line 148
    :cond_0
    return-void
.end method

.method private installAndPersonalize(Ljava/lang/String;)I
    .locals 8

    .line 151
    const-string v0, "IssueTrafficCardFMOperator installAndPersonalize begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v3

    .line 154
    if-eqz v3, :cond_0

    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xb

    if-eq v0, v1, :cond_1

    iget v0, v3, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    .line 156
    :cond_0
    const-string v0, "IssueTrafficCardFMOperator installAndPersonalize, illegal ta card info"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 157
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 158
    const/16 v0, 0x63

    return v0

    .line 162
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getNfcosOrder(I)Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    move-result-object v4

    .line 164
    if-nez v4, :cond_2

    .line 165
    const-string v0, "IssueTrafficCardFMOperator installAndPersonalize, issueOrder == null"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 166
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 167
    const/16 v0, 0x63

    return v0

    .line 170
    :cond_2
    const-string v0, " CardEvent installAndPersonalizeApplet bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    .line 172
    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 174
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "installAndPersonalize  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 175
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    iget-object v1, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    .line 176
    invoke-static {v2}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v2

    invoke-interface {v2}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->querySeid()[B

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;->build([B[B)Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;

    move-result-object v1

    .line 175
    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->installAndPersonalizeApplet(Lcom/huawei/nfc/carrera/logic/spi/fm/request/DoIssueRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v5

    .line 178
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-nez v0, :cond_3

    .line 181
    :try_start_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    const/16 v1, 0xd

    invoke-virtual {v0, p1, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardStatus(Ljava/lang/String;I)V
    :try_end_0
    .catch Lcom/huawei/nfc/carrera/logic/ta/WalletTaException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    goto :goto_0

    .line 182
    :catch_0
    move-exception v6

    .line 183
    const-string v0, "IssueTrafficCardFMOperator installAndPersonalize, WalletTaException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 184
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 185
    const/16 v0, 0x63

    return v0

    .line 188
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 189
    :cond_3
    iget v0, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_4

    .line 190
    const-string v0, "IssueTrafficCardFMOperator installAndPersonalize, NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 191
    const/16 v0, 0xb

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 192
    const/16 v0, 0xb

    return v0

    .line 194
    :cond_4
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 195
    const-string v7, "IssueTrafficCardFMOperator installAndPersonalize fail"

    .line 196
    const-string v0, "fail_reason"

    invoke-interface {v6, v0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    const-string v0, "fail_code"

    iget v1, v5, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 198
    const-string v0, "order_id"

    iget-object v1, v4, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v6, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    const v0, 0x3611a41b

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v6, v7, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 200
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 201
    const/16 v0, 0x63

    return v0
.end method

.method private report(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .line 268
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardLostManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;

    move-result-object v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-interface/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/lostmanager/CardLostManagerApi;->reportCardOpenedAvailableStatus(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 270
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0, p1, p3, p5, p6}, Lcom/huawei/nfc/carrera/logic/util/NfcHianalyticsUtil;->onReportForCardOpened(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 271
    return-void
.end method

.method private updateApplet(Ljava/lang/String;)I
    .locals 11

    .line 206
    const-string v0, "IssueTrafficCardFMOperator updateApplet begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v6

    .line 209
    if-eqz v6, :cond_0

    iget v0, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    .line 210
    :cond_0
    const-string v0, "IssueTrafficCardFMOperator updateApplet, illegal ta card info"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 211
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 212
    const/16 v0, 0x63

    return v0

    .line 216
    :cond_1
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-direct {v7, v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;->setIssuerId(Ljava/lang/String;)V

    .line 218
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/UpdateAppletTsmOperator;->excute()I

    move-result v8

    .line 219
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator updateApplet response="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 220
    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    .line 223
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->getCardNum()Ljava/lang/String;

    move-result-object v9

    .line 224
    move-object v0, p0

    move-object v1, p1

    iget-object v3, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->issuerId:Ljava/lang/String;

    iget-object v4, v6, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->productId:Ljava/lang/String;

    move-object v5, v9

    const/4 v2, 0x2

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->generateTaCardInfo(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v10

    .line 226
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->setName(Ljava/lang/String;)V

    .line 228
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator updateApplet name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v10, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 230
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->updateCardInfo(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 231
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 232
    const/16 v0, 0x63

    return v0

    .line 234
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 235
    :cond_3
    const/4 v0, -0x1

    if-ne v0, v8, :cond_4

    .line 236
    const-string v0, "IssueTrafficCardFMOperator updateApplet, no network"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 237
    const/16 v0, 0xb

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 238
    const/16 v0, 0xb

    return v0

    .line 240
    :cond_4
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 241
    const-string v10, "IssueTrafficCardFMOperator updateApplet fail"

    .line 242
    const-string v0, "fail_reason"

    invoke-interface {v9, v0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    const-string v0, "fail_code"

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    const v0, 0x3611a41c

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v9, v10, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 245
    const/16 v0, 0x63

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 246
    const/16 v0, 0x63

    return v0
.end method


# virtual methods
.method public doRecharge()V
    .locals 11

    .line 305
    const-string v0, "IssueTrafficCardFMOperator doRecharge begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 307
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 310
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    .line 307
    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v2, v0, v3, v4, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v5

    .line 311
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "doRecharge myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    .line 313
    invoke-interface {v0, v5}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v6

    .line 314
    iget v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-nez v0, :cond_1

    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    .line 316
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator doRecharge size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 318
    const/4 v7, 0x0

    .line 319
    const/4 v8, 0x0

    .line 320
    iget-object v0, v6, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 321
    new-instance v7, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;-><init>()V

    .line 322
    iget-object v0, v10, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->order:[B

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setOrder([B)V

    .line 323
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;->setAid(Ljava/lang/String;)V

    .line 324
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "doRecharge d myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 325
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    .line 326
    invoke-interface {v0, v7}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->recharge(Lcom/huawei/nfc/carrera/logic/spi/fm/request/RechargeOrDoUnsolvedOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;

    move-result-object v8

    .line 327
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/spi/fm/response/FMBaseResponse;->resultCode:I

    if-nez v0, :cond_0

    .line 328
    const-string v0, "IssueTrafficCardFMOperator doRecharge success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 330
    :cond_0
    goto :goto_0

    .line 332
    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x2
    .end array-data
.end method

.method public issueTrafficCard()I
    .locals 10

    .line 55
    const-string v0, "IssueTrafficCardFMOperator issueTrafficCard begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 56
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v7

    .line 57
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 58
    const-string v0, "IssueTrafficCardFMOperator issueTrafficCard, empty aid"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 59
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 60
    const/16 v0, 0xa

    return v0

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v8

    .line 63
    if-nez v8, :cond_1

    .line 64
    const-string v0, "IssueTrafficCardFMOperator issueTrafficCard, empty taInfo"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 65
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 66
    const/16 v0, 0xa

    return v0

    .line 69
    :cond_1
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isCardStatusPayedNotOpened()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    invoke-direct {p0, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->checkOrder(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)V

    .line 74
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->isCardStatusPayedNotOpened()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 75
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->createDMSD(Ljava/lang/String;)I

    move-result v9

    .line 76
    if-eqz v9, :cond_3

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator issueTrafficCard, createDMSD fail result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 78
    return v9

    .line 80
    :cond_3
    const-string v0, "IssueTrafficCardFMOperator issueTrafficCard, createDMSD success"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 83
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->installAndPersonalize(Ljava/lang/String;)I

    move-result v9

    .line 84
    if-eqz v9, :cond_4

    .line 85
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator issueTrafficCard, installAndPersonalize fail result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 86
    return v9

    .line 89
    :cond_4
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->updateApplet(Ljava/lang/String;)I

    move-result v9

    .line 90
    if-eqz v9, :cond_5

    .line 91
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator issueTrafficCard, updateApplet fail result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 92
    return v9

    .line 94
    :cond_5
    goto :goto_0

    :cond_6
    iget v0, v8, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->cardStatus:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_8

    .line 96
    invoke-direct {p0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->updateApplet(Ljava/lang/String;)I

    move-result v9

    .line 97
    if-eqz v9, :cond_7

    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IssueTrafficCardFMOperator issueTrafficCard, updateApplet fail result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 99
    return v9

    .line 102
    :cond_7
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->doRecharge()V

    .line 105
    :cond_8
    :goto_0
    move-object v0, p0

    move-object v1, v7

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getIssuerId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getCardType()I

    move-result v6

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->report(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 107
    const-string v0, "IssueTrafficCardFMOperator issueTrafficCard end"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 108
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/opencard/IssueTrafficCardFMOperator;->handleResult(I)V

    .line 109
    const/4 v0, 0x0

    return v0
.end method
