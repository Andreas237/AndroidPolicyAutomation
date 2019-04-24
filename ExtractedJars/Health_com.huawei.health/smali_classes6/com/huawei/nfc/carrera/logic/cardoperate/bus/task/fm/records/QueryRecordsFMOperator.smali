.class public Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mAid:Ljava/lang/String;

.field private mContext:Landroid/content/Context;

.field private mPriorType:I

.field private mRechargeRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;"
        }
    .end annotation
.end field

.field private mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

.field private mTradeRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;ILcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;Ljava/lang/String;)V
    .locals 1

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mRechargeRecords:Ljava/util/List;

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mTradeRecords:Ljava/util/List;

    .line 53
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mContext:Landroid/content/Context;

    .line 54
    iput p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mPriorType:I

    .line 55
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    .line 56
    iput-object p4, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    .line 57
    return-void
.end method

.method private convertStatus(I)I
    .locals 2

    .line 232
    const/4 v1, 0x3

    .line 233
    const/4 v0, 0x7

    if-ne p1, v0, :cond_0

    .line 235
    const/4 v1, 0x2

    goto :goto_0

    .line 237
    :cond_0
    const/4 v0, 0x6

    if-ne p1, v0, :cond_1

    .line 239
    const/4 v1, 0x1

    .line 242
    :cond_1
    :goto_0
    return v1
.end method

.method private formatDate2String(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 261
    if-nez p1, :cond_0

    .line 263
    const/4 v0, 0x0

    return-object v0

    .line 265
    :cond_0
    new-instance v1, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v1, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 266
    invoke-virtual {v1, p1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private parseString2Date(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;
    .locals 4

    .line 247
    new-instance v2, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v2, p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 250
    :try_start_0
    invoke-virtual {v2, p1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 252
    :catch_0
    move-exception v3

    .line 254
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryRecordsFMOperator parseString2Date ParseException, dateStr="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 255
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method queryRechargeRecords()I
    .locals 12

    .line 156
    const-string v0, "QueryRecordsFMOperator queryRechargeRecords begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mRechargeRecords:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 158
    const/16 v5, 0x8

    new-array v5, v5, [I

    fill-array-data v5, :array_0

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v2, v3, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->build(I[II[BLjava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;

    move-result-object v6

    .line 169
    :goto_0
    const-string v0, " CardEvent RECHARGE bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    .line 171
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryRechargeRecords  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 173
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    invoke-interface {v0, v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryBusinessOrders(Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;

    move-result-object v7

    .line 175
    const-string v0, " CardEvent RECHARGE bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    .line 177
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 179
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    if-eqz v0, :cond_1

    .line 181
    iget v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->resultCode:I

    const/4 v1, -0x2

    if-ne v0, v1, :cond_0

    .line 183
    const-string v0, "QueryRecordsFMOperator queryRechargeRecords, NETWORK_ERROR"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 184
    const/16 v0, 0xb

    return v0

    .line 186
    :cond_0
    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 187
    const-string v9, "QueryRecordsFMOperator queryRechargeRecords, query unfinished orders fail"

    .line 188
    const-string v0, "fail_reason"

    invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    const-string v0, "fail_code"

    iget v1, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v8, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    const v0, 0x3611a41f

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v8, v9, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 191
    const/16 v0, 0x63

    return v0

    .line 193
    :cond_1
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    if-eqz v0, :cond_4

    .line 195
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    .line 196
    const/4 v9, 0x0

    .line 197
    const/4 v10, 0x0

    .line 198
    const/4 v11, 0x0

    :goto_1
    if-ge v11, v8, :cond_2

    .line 200
    iget-object v0, v7, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryBusinessOrdersResponse;->orderList:Ljava/util/ArrayList;

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;

    .line 201
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v9, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v9, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyyMMddHHmmss"

    .line 202
    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->parseString2Date(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 201
    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->formatDate2String(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 204
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mRechargeRecords:Ljava/util/List;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;

    iget v2, v9, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->tradeState:I

    invoke-direct {p0, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->convertStatus(I)I

    move-result v2

    iget v3, v9, Lcn/com/fmsh/nfcos/client/service/huawei/NfcosBusinessOrder;->amount:I

    .line 205
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertFenToYuan(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xa

    invoke-direct {v1, v4, v2, v10, v3}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 204
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 198
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 208
    :cond_2
    const/16 v0, 0xa

    if-ge v8, v0, :cond_3

    .line 210
    const/4 v0, 0x0

    return v0

    .line 214
    :cond_3
    invoke-virtual {v6}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->getStart()I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    invoke-virtual {v6, v0}, Lcom/huawei/nfc/carrera/logic/spi/fm/request/QueryBusinessOrdersRequest;->setStart(I)V

    .line 216
    goto :goto_2

    .line 219
    :cond_4
    const/4 v0, 0x0

    return v0

    .line 221
    :goto_2
    goto/16 :goto_0

    nop

    :array_0
    .array-data 4
        0x2
        0x4
        0x5
        0xc
        0x6
        0x7
        0x8
        0xb
    .end array-data
.end method

.method public queryRecords()V
    .locals 4

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryRecordsFMOperator queryRecords begin, prior type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mPriorType:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 62
    const/4 v3, 0x0

    .line 63
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mPriorType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->queryRechargeRecords()I

    move-result v3

    .line 66
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mRechargeRecords:Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    .line 67
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->queryTradeRecords()I

    move-result v3

    .line 68
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mTradeRecords:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->queryTradeRecords()I

    move-result v3

    .line 73
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mTradeRecords:Ljava/util/List;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    .line 74
    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->queryRechargeRecords()I

    move-result v3

    .line 75
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mResultHandler:Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mRechargeRecords:Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v3, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/resulthandler/QueryRecordsListResultHandler;->handleResult(IILjava/util/List;)V

    .line 77
    :goto_0
    return-void
.end method

.method queryTradeRecords()I
    .locals 9

    .line 87
    const-string v0, "QueryRecordsFMOperator queryTradeRecords begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mTradeRecords:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 90
    const-string v0, " CardEvent queryTrade bus cardEvent START_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 91
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    .line 92
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->lockCardEvent(Ljava/lang/String;)V

    .line 93
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryTradeRecords  myAid : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createFMService(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/fm/FMService;->queryTrade(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;

    move-result-object v3

    .line 96
    const-string v0, " CardEvent queryTrade bus cardEvent END_LOCK"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    .line 98
    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/logic/ta/WalletTaManager;->unLockCardEvent(Ljava/lang/String;)V

    .line 100
    iget v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->resultCode:I

    if-eqz v0, :cond_0

    .line 102
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 103
    const-string v5, "QueryRecordsFMOperator queryTradeRecords, query trade records fail"

    .line 104
    const-string v0, "fail_reason"

    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    const-string v0, "fail_code"

    iget v1, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->FMCode:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    const v0, 0x3611a41e

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v4, v5, v1, v2}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 107
    const/16 v0, 0x63

    return v0

    .line 109
    :cond_0
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->tradeRecords:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    if-eqz v0, :cond_6

    .line 111
    const/4 v4, 0x0

    .line 112
    const/4 v5, 0x0

    .line 115
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " CardEvent queryTrade .response.tradeRecords.length : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->tradeRecords:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 116
    const/4 v8, 0x0

    :goto_0
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->tradeRecords:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    array-length v0, v0

    if-ge v8, v0, :cond_6

    .line 118
    iget-object v0, v3, Lcom/huawei/nfc/carrera/logic/spi/fm/response/QueryTradeResponse;->tradeRecords:[Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;

    aget-object v4, v0, v8

    .line 119
    const/4 v0, 0x0

    if-eq v0, v4, :cond_5

    iget v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->amount:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 120
    goto/16 :goto_3

    .line 122
    :cond_1
    const-string v0, "5943542E55534552"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mAid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MMddHHmmss"

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->parseString2Date(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    const-string v1, "MM-dd HH:mm:ss"

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->formatDate2String(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    .line 126
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeTime:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "yyyyMMddHHmmss"

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->parseString2Date(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    const-string v1, "yyyy-MM-dd HH:mm:ss"

    invoke-direct {p0, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->formatDate2String(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 129
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " CardEvent queryTrade .time : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 130
    iget v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeType:I

    const/16 v1, 0xc

    if-eq v0, v1, :cond_3

    iget v0, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->tradeType:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_4

    .line 133
    :cond_3
    const/16 v6, 0xa

    goto :goto_2

    .line 137
    :cond_4
    const/16 v6, 0xb

    .line 139
    :goto_2
    const/4 v7, 0x0

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/fm/records/QueryRecordsFMOperator;->mTradeRecords:Ljava/util/List;

    new-instance v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;

    iget v2, v4, Lcn/com/fmsh/nfcos/client/service/huawei/CardAppRecord;->amount:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/huawei/nfc/carrera/util/MoneyUtil;->convertFenToYuan(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v6, v7, v5, v2}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    :cond_5
    :goto_3
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    .line 145
    :cond_6
    const/4 v0, 0x0

    return v0
.end method
