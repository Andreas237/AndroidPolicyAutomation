.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final RECHARGE_MODE_FIRST:Ljava/lang/String; = "0"

.field static final RECHARGE_MODE_REPEAT:Ljava/lang/String; = "1"

.field private static final SYSTEMTYPE:Ljava/lang/String; = "Android"

.field private static final TAG:Ljava/lang/String; = "RechargeSAOperator"

.field private static final TA_DATA_CARDNUM:Ljava/lang/String; = "fpanFour"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

.field private orderId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mContext:Landroid/content/Context;

    .line 63
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 64
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    .line 65
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    .line 66
    return-void
.end method

.method private dealRechargeEmptyNum(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Ljava/lang/String;
    .locals 7

    .line 165
    const-string v0, "RechargeSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " dealRechargeEmptyNum: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v4

    .line 167
    const-string v0, "fpanFour"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;->getFpanFour()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 168
    return-object v4

    .line 170
    :cond_0
    const/4 v5, 0x1

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;->createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 172
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, v5}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;->readTrafficCardInfo(Ljava/lang/String;Ljava/lang/String;I)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    move-result-object v6

    .line 173
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    return-object v4

    .line 177
    :cond_1
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/CardInfo;->getCardNum()Ljava/lang/String;

    move-result-object v4

    .line 178
    return-object v4
.end method

.method private doRecharge(Ljava/lang/String;Ljava/lang/String;)I
    .locals 23

    .line 117
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v10

    .line 118
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v11

    .line 119
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v12

    .line 120
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v13

    .line 121
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSoftVersion()Ljava/lang/String;

    move-result-object v14

    .line 122
    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceSN()Ljava/lang/String;

    move-result-object v15

    .line 123
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getCardInfoByAid(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;

    move-result-object v16

    .line 124
    const/4 v0, 0x0

    move-object/from16 v1, v16

    if-ne v0, v1, :cond_0

    .line 126
    const v0, 0x3611a470

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "1502"

    .line 127
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setFailCode(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 128
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "RechargeSAOperator recharge failed. taInfo == null ."

    .line 129
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 130
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 132
    move-object/from16 v0, p0

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->handleResult(I)V

    .line 133
    const/16 v0, 0xa

    return v0

    .line 135
    :cond_0
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->dealRechargeEmptyNum(Lcom/huawei/nfc/carrera/logic/ta/TACardInfo;)Ljava/lang/String;

    move-result-object v17

    .line 136
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p1

    move-object v4, v11

    move-object/from16 v5, v17

    const-string v6, "Android"

    move-object v7, v14

    move-object v8, v12

    move-object v9, v13

    invoke-direct/range {v0 .. v9}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v18, v0

    .line 138
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v19

    .line 139
    invoke-virtual/range {v19 .. v19}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object/from16 v20, v0

    check-cast v20, Lcom/huawei/nfc/PluginPayAdapter;

    .line 140
    invoke-interface/range {v20 .. v20}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 141
    move-object/from16 v0, v18

    invoke-virtual {v0, v15}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setImei(Ljava/lang/String;)V

    .line 142
    move-object/from16 v0, v18

    move-object/from16 v1, p2

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;->setRechargeMode(Ljava/lang/String;)V

    .line 143
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->recharge(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/RechargeRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;

    move-result-object v21

    .line 144
    const-string v0, "RechargeSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " doRecharge response code : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->getResultCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 145
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->getResultCode()I

    move-result v0

    if-nez v0, :cond_1

    .line 147
    const-string v0, "RechargeSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " doRecharge RESULT_CODE_SUCCESS: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->getResultCode()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    move-object/from16 v0, p0

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->handleResult(I)V

    .line 150
    const/4 v0, 0x0

    return v0

    .line 153
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RechargeSAOperator, recharge err, code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 154
    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->getResultCode()I

    move-result v0

    invoke-virtual/range {v21 .. v21}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/RechargeResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->handleErr(ILjava/lang/String;)I

    move-result v22

    .line 155
    return v22
.end method

.method private getOpenCardRetryOrderId(Ljava/util/List;)Ljava/lang/String;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;>;)Ljava/lang/String;"
        }
    .end annotation

    .line 262
    const/4 v2, 0x0

    .line 263
    const/4 v3, 0x0

    .line 264
    const/4 v4, 0x0

    .line 265
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 267
    const-string v0, "1"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 269
    move-object v3, v6

    goto :goto_1

    .line 271
    :cond_0
    const-string v0, "2"

    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 273
    move-object v4, v6

    .line 275
    :cond_1
    :goto_1
    goto :goto_0

    .line 276
    :cond_2
    if-eqz v3, :cond_3

    .line 278
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderId()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 280
    :cond_3
    if-eqz v4, :cond_4

    .line 282
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderId()Ljava/lang/String;

    move-result-object v2

    .line 284
    :cond_4
    :goto_2
    return-object v2
.end method

.method private getOrderID()Ljava/lang/String;
    .locals 8

    .line 219
    const/4 v2, 0x0

    .line 220
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getQueryOrders()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getQueryOrders()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->getOpenCardRetryOrderId(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 226
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mOrder:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficOrder;->getApplyOrders()Ljava/util/List;

    move-result-object v3

    .line 227
    if-eqz v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_2

    .line 229
    :cond_1
    const-string v0, "IssueTrafficCardSAOperator issueTrafficCard, query orders err!"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 230
    const/4 v0, 0x0

    return-object v0

    .line 233
    :cond_2
    const/4 v4, 0x0

    .line 234
    const/4 v5, 0x0

    .line 235
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;

    .line 237
    const-string v0, "1"

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 239
    move-object v4, v7

    goto :goto_1

    .line 241
    :cond_3
    const-string v0, "2"

    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 243
    move-object v5, v7

    .line 245
    :cond_4
    :goto_1
    goto :goto_0

    .line 247
    :cond_5
    if-eqz v4, :cond_6

    .line 249
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderId()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .line 251
    :cond_6
    if-eqz v5, :cond_7

    .line 253
    invoke-virtual {v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/ApplyOrder;->getOrderId()Ljava/lang/String;

    move-result-object v2

    .line 257
    :cond_7
    :goto_2
    return-object v2
.end method

.method private handleErr(ILjava/lang/String;)I
    .locals 2

    .line 184
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 187
    :sswitch_0
    const/16 v1, 0xa

    .line 188
    goto :goto_1

    .line 190
    :sswitch_1
    const/16 v1, 0xb

    .line 191
    goto :goto_1

    .line 193
    :sswitch_2
    const/16 v1, 0x19

    .line 194
    goto :goto_1

    .line 197
    :sswitch_3
    const/16 v1, 0x517

    .line 198
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->reportErr(ILjava/lang/String;)V

    .line 199
    goto :goto_1

    .line 201
    :sswitch_4
    const/16 v1, 0x518

    .line 202
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->reportErr(ILjava/lang/String;)V

    .line 203
    goto :goto_1

    .line 205
    :sswitch_5
    const/16 v1, 0xe

    .line 206
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->reportErr(ILjava/lang/String;)V

    .line 207
    goto :goto_1

    .line 209
    :goto_0
    const/16 v1, 0x577

    .line 210
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->reportErr(ILjava/lang/String;)V

    .line 213
    :goto_1
    invoke-direct {p0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->handleResult(I)V

    .line 214
    return v1

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_5
        0xfa3 -> :sswitch_3
        0xfa4 -> :sswitch_4
    .end sparse-switch
.end method

.method private handleResult(I)V
    .locals 1

    .line 289
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/RechargeResultHandler;->handleResult(I)V

    .line 293
    :cond_0
    return-void
.end method

.method private reportErr(ILjava/lang/String;)V
    .locals 4

    .line 297
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RechargeSAOperator err : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 298
    const-string v0, "1502"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const v2, 0x3611a470

    invoke-static {v2, v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 299
    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 300
    invoke-virtual {v0, v3}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 301
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "orderNo"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->orderId:Ljava/lang/String;

    .line 302
    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 303
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 304
    return-void
.end method


# virtual methods
.method public recharge(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;)I
    .locals 5

    .line 70
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v2

    .line 71
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v3

    .line 72
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 74
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RechargeSAOperator recharge failed. param is illegal. aid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issuerID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " orderId = null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 76
    if-eqz p1, :cond_1

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RechargeSAOperator recharge failed. param is illegal. aid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issuerID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " orderId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 80
    :cond_1
    const v0, 0x3611a470

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "1502"

    .line 81
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setFailCode(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 82
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 83
    invoke-virtual {v0, v4}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 84
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 85
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->handleResult(I)V

    .line 86
    const/16 v0, 0xa

    return v0

    .line 88
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->orderId:Ljava/lang/String;

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->orderId:Ljava/lang/String;

    const-string v1, "1"

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->doRecharge(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public recharge(Ljava/lang/String;)I
    .locals 8

    .line 94
    const-string v0, "RechargeSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " doRecharge recharge"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v4

    .line 96
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v5

    .line 97
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->getOrderID()Ljava/lang/String;

    move-result-object v6

    .line 98
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 100
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RechargeSAOperator recharge failed. param is illegal. aid = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " issuerID = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " orderId = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " rechargeMode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 102
    invoke-static {v7}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;)V

    .line 103
    const v0, 0x3611a470

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "1502"

    .line 104
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setFailCode(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 105
    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 106
    invoke-virtual {v0, v7}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 107
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 109
    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->handleResult(I)V

    .line 110
    const/16 v0, 0xa

    return v0

    .line 112
    :cond_1
    invoke-direct {p0, v6, p1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/RechargeSAOperator;->doRecharge(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
