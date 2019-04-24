.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "QueryRecordsSAOperator"


# instance fields
.field private mContext:Landroid/content/Context;

.field private mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

.field private mPriorType:I

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

.field private mTradeRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;"
        }
    .end annotation
.end field

.field private mUnfinishedRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;)V
    .locals 1

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mUnfinishedRecords:Ljava/util/List;

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mTradeRecords:Ljava/util/List;

    .line 59
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mContext:Landroid/content/Context;

    .line 60
    iput p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mPriorType:I

    .line 61
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    .line 62
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 63
    return-void
.end method

.method private handleCommenErr(ILjava/lang/String;)I
    .locals 2

    .line 171
    const/16 v1, 0x63

    .line 172
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 175
    :pswitch_0
    const/16 v1, 0xa

    .line 176
    goto :goto_1

    .line 178
    :pswitch_1
    const/16 v1, 0xb

    .line 179
    goto :goto_1

    .line 181
    :pswitch_2
    const/16 v1, 0x19

    .line 182
    goto :goto_1

    .line 184
    :goto_0
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->reportErr(ILjava/lang/String;)V

    .line 187
    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private queryTradeRecords()I
    .locals 10

    .line 92
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mTradeRecords:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletInfoApiFactory;->createAppletCardInfoReader(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 94
    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getProductId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/AppletCardInfoReadApi;->readTrafficCardTransactionRecord(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;

    move-result-object v3

    .line 95
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    if-eqz v0, :cond_0

    .line 97
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getResultCode()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/SpiResultCodeTranslator;->geteSEErrorCode(I)I

    move-result v0

    return v0

    .line 100
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/result/AppletCardResult;->getData()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/util/List;

    .line 101
    if-eqz v4, :cond_3

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 105
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;

    .line 108
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->getRecordAmount()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 110
    goto :goto_0

    .line 113
    :cond_1
    const/16 v5, 0xb

    .line 114
    const/4 v6, 0x0

    .line 115
    const-string v0, "1"

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->getRecordType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 117
    const/16 v5, 0xa

    .line 118
    const/4 v6, 0x0

    .line 120
    :cond_2
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->getRecordTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyyMMddHHmmss"

    const-string v2, "yyyy-MM-dd HH:mm:ss"

    invoke-static {v0, v1, v2}, Lcom/huawei/wallet/utils/TimeUtil;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 121
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mTradeRecords:Ljava/util/List;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/appletcardinfo/model/TransactionRecord;->getAmountByYuanUint()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v5, v6, v9, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    goto :goto_0

    .line 124
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method private queryUnfinishedOrders()I
    .locals 19

    .line 129
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mUnfinishedRecords:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 130
    const/4 v6, 0x0

    .line 131
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v7

    .line 132
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v8

    .line 133
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v9

    .line 134
    invoke-virtual {v7}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v10

    .line 136
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v3}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v3

    move-object v4, v9

    move-object v5, v10

    invoke-direct/range {v0 .. v5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v11, v0

    .line 138
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v12

    .line 139
    invoke-virtual {v12}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/huawei/nfc/PluginPayAdapter;

    .line 140
    invoke-interface {v13}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setAccountUserId(Ljava/lang/String;)V

    .line 141
    const-string v0, "1"

    invoke-virtual {v11, v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;->setOrderStatus(Ljava/lang/String;)V

    .line 142
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v11}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryOrder(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryOrderRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;

    move-result-object v14

    .line 144
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    if-nez v0, :cond_2

    .line 146
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getOrderList()Ljava/util/List;

    move-result-object v15

    .line 147
    if-eqz v15, :cond_1

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 149
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;

    .line 151
    const/16 v18, 0x3

    .line 153
    const-string v0, "903"

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 155
    const/16 v18, 0x1

    .line 158
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mUnfinishedRecords:Ljava/util/List;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getOrderTime()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/QueryOrder;->getAmount()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xa

    move/from16 v5, v18

    invoke-direct {v1, v4, v5, v2, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    goto :goto_0

    .line 161
    :cond_1
    goto :goto_1

    .line 164
    :cond_2
    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v14}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryOrderResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->handleCommenErr(ILjava/lang/String;)I

    move-result v6

    .line 166
    :goto_1
    return v6
.end method

.method private reportErr(ILjava/lang/String;)V
    .locals 5

    .line 192
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 193
    const-string v0, "fail_reason"

    invoke-interface {v4, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    const-string v0, "fail_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    const-string v0, "issuerID"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    const-string v0, "QueryRecordsSAOperator"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "907125867"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ApplyPayOrderOperator err : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 198
    return-void
.end method


# virtual methods
.method public queryRecords()V
    .locals 5

    .line 67
    const-string v0, "QueryRecordsSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QueryRecordsSAOperator queryRecords begin, prior type="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mPriorType:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mPriorType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 71
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->queryUnfinishedOrders()I

    move-result v4

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mUnfinishedRecords:Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    .line 73
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->queryTradeRecords()I

    move-result v4

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mTradeRecords:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v4, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    goto :goto_0

    .line 76
    :cond_0
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mPriorType:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    .line 78
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->queryUnfinishedOrders()I

    move-result v4

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mUnfinishedRecords:Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    goto :goto_0

    .line 83
    :cond_1
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->queryTradeRecords()I

    move-result v4

    .line 84
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mTradeRecords:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v4, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    .line 85
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->queryUnfinishedOrders()I

    move-result v4

    .line 86
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryRecordsSAOperator;->mUnfinishedRecords:Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v4, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    .line 88
    :goto_0
    return-void
.end method
