.class public Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;

.field private final mContext:Landroid/content/Context;

.field private uiRefresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->mContext:Landroid/content/Context;

    .line 34
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->uiRefresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    .line 35
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;

    .line 36
    return-void
.end method

.method private handleResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;)V
    .locals 2

    .line 125
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryCardTransferAbilityTask resultCode:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->uiRefresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->uiRefresher:Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->callback:Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;

    invoke-virtual {v0, p1, p2, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/CardInfoRefresher;->handleQueryBusCardTransferAbilityResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;Lcom/huawei/nfc/carrera/logic/cardinfo/callback/QueryCardTransferAbilityCallback;)V

    .line 130
    :cond_0
    return-void
.end method


# virtual methods
.method public getCardTransferAbility(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;
    .locals 18

    .line 40
    new-instance v5, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;

    invoke-direct {v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;-><init>()V

    .line 42
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v6

    .line 43
    const/4 v0, 0x0

    if-ne v0, v6, :cond_0

    .line 44
    const-string v0, "getCardTransferAbility pluginPay is null."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 45
    return-object v5

    .line 47
    :cond_0
    invoke-virtual {v6}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/PluginPayAdapter;

    .line 49
    invoke-interface {v7}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v8

    .line 50
    const-string v9, "HuaweiWatch"

    .line 51
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v10

    .line 53
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/util/Router;->getCardAndIssuerInfoCacheApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;

    move-result-object v0

    .line 54
    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/issuerinfo/CardAndIssuerInfoCacheApi;->cacheIssuerInfoItem(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v11

    .line 56
    const/4 v12, 0x0

    .line 57
    if-eqz v11, :cond_1

    .line 59
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCard(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v12

    .line 61
    :cond_1
    if-nez v12, :cond_2

    .line 63
    return-object v5

    .line 65
    :cond_2
    invoke-virtual {v12}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v13

    .line 67
    new-instance v14, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;

    invoke-direct {v14}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;-><init>()V

    .line 68
    invoke-virtual {v14, v8}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->setUserId(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v14, v9}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->setDeviceType(Ljava/lang/String;)V

    .line 70
    invoke-virtual {v14, v10}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->setCplc(Ljava/lang/String;)V

    .line 71
    move-object/from16 v0, p1

    invoke-virtual {v14, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->setIssuerId(Ljava/lang/String;)V

    .line 72
    invoke-virtual {v14, v13}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;->setCardNumber(Ljava/lang/String;)V

    .line 74
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/server/ServerServiceFactory;->createCardServerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/server/card/CardServerApi;

    move-result-object v0

    invoke-interface {v0, v14}, Lcom/huawei/nfc/carrera/server/card/CardServerApi;->queryCardTransferAbility(Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;

    move-result-object v15

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardTransferAbility queryCardTransferAbilityResponse returnCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v15, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 77
    iget v0, v15, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->returnCode:I

    if-nez v0, :cond_3

    .line 79
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardTransferAbility queryCardTransferAbilityResponse transferAbility : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferAbility()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 80
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferAbility()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setTransferAbility(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setTransferStatus(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferEventId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setEventId(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferMaxCardmoveNum()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setMaxCardmoveNum(I)V

    .line 84
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferFeeCardmoveNum()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setFeeCardmoveNum(I)V

    .line 85
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferExpireDaysOut()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setExpireDaysOut(I)V

    .line 86
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferExpireDaysIn()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setExpireDaysIn(I)V

    .line 87
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getTransferCurrentCardmoveTimes()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setCurrentCardmoveTimes(I)V

    .line 88
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getCycle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setCycle(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getFee()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setFee(Ljava/lang/String;)V

    .line 90
    invoke-virtual {v15}, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->getPayTimePoint()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->setPayTimePoint(Ljava/lang/String;)V

    .line 92
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v1, v5}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->handleResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;)V

    goto/16 :goto_0

    .line 94
    :cond_3
    iget v0, v15, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->returnCode:I

    const/4 v1, -0x4

    if-ne v0, v1, :cond_4

    .line 96
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 97
    const-string v17, "getCardTransferAbility queryCardTransferAbilityResponse server overload 503"

    .line 98
    const-string v0, "fail_reason"

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    const v0, 0x3611a442

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 100
    move-object/from16 v0, p0

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->handleResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;)V

    .line 101
    goto :goto_0

    .line 104
    :cond_4
    iget v0, v15, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->returnCode:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    iget v0, v15, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->returnCode:I

    const/4 v1, -0x2

    if-eq v0, v1, :cond_5

    .line 107
    new-instance v16, Ljava/util/HashMap;

    invoke-direct/range {v16 .. v16}, Ljava/util/HashMap;-><init>()V

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardTransferAbility queryCardTransferAbilityResponse fail, error code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v15, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v17

    .line 109
    const-string v0, "fail_reason"

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    const v0, 0x3611a443

    move-object/from16 v1, v16

    move-object/from16 v2, v17

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 111
    move-object/from16 v0, p0

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->handleResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;)V

    .line 112
    goto :goto_0

    .line 115
    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getCardTransferAbility queryCardTransferAbility "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v15, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 116
    move-object/from16 v0, p0

    const/4 v1, -0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/cardinfo/impl/QueryBusCardTransferAbilityTask;->handleResult(ILcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;)V

    .line 120
    :goto_0
    return-object v5
.end method
