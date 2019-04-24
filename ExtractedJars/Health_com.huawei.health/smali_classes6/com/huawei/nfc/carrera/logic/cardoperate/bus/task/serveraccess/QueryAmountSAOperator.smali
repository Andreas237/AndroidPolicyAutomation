.class Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final FLAG_ISSUE_RECHARGE:Ljava/lang/String; = "1"

.field static final FLAG_RECHARGE:Ljava/lang/String; = "2"

.field private static final TAG:Ljava/lang/String; = "QueryAmountSAOperator"


# instance fields
.field private context:Landroid/content/Context;

.field private flag:Ljava/lang/String;

.field private issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->flag:Ljava/lang/String;

    .line 46
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->context:Landroid/content/Context;

    .line 47
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 48
    return-void
.end method

.method private reportErr(ILjava/lang/String;)V
    .locals 8

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAmountSAOperator err : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 153
    const/4 v6, -0x1

    .line 154
    const-string v7, "-1"

    .line 155
    const-string v0, "1"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->flag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 157
    const v6, 0x3611a46f

    .line 158
    const-string v7, "1200"

    .line 160
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1200"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "query issue money,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_0

    .line 164
    :cond_0
    const-string v0, "2"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->flag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    const v6, 0x3611a470

    .line 167
    const-string v7, "1502"

    .line 169
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1503"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "query recharge money failed,server,"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/huawei/nfc/carrera/logic/cardoperate/opencardlogupload/LogUploadOperator;->init(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 173
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v7, v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->build(ILjava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 174
    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultCode(I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 175
    invoke-virtual {v0, v5}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->setResultDesc(Ljava/lang/String;)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    const-string v1, "mode"

    iget-object v2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    .line 176
    invoke-virtual {v2}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getMode()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->appendExtraInfo(Ljava/lang/String;I)Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;

    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/util/logger/CloudEyeLogger;->upload()V

    .line 178
    return-void
.end method

.method private translateErrorCode(I)I
    .locals 1

    .line 137
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 141
    :pswitch_0
    const/16 v0, 0xb

    return v0

    .line 143
    :pswitch_1
    const/16 v0, 0xe

    return v0

    .line 145
    :goto_0
    const/16 v0, 0x63

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method queryAmount()Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;
    .locals 23

    .line 52
    new-instance v7, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;

    invoke-direct {v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;-><init>()V

    .line 53
    const/16 v0, 0x63

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 55
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;

    move-result-object v8

    .line 56
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->queryCplc()Ljava/lang/String;

    move-result-object v9

    .line 57
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getDeviceModel()Ljava/lang/String;

    move-result-object v10

    .line 58
    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/logic/ese/impl/ESEInfoManager;->getBusChipManu()Ljava/lang/String;

    move-result-object v11

    .line 60
    new-instance v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->flag:Ljava/lang/String;

    move-object v3, v9

    move-object/from16 v4, p0

    iget-object v4, v4, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->issuerInfo:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;->getAid()Ljava/lang/String;

    move-result-object v4

    move-object v5, v10

    move-object v6, v11

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v0

    .line 62
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAmount request"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v12}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 63
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/SPIServiceFactory;->createServerAccessService(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;

    move-result-object v0

    invoke-interface {v0, v12}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/ServerAccessService;->queryAmount(Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/QueryAmountRequest;)Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;

    move-result-object v13

    .line 64
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getResultCode()I

    move-result v0

    if-nez v0, :cond_8

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAmount response.getResultCode()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 67
    const-string v0, "QueryAmountSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryAmount flag"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->flag:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    const-string v0, "1"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->flag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 70
    const-string v0, "QueryAmountSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryAmountRequest.FLAG_ISSUE_RECHARGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getIssueAmountList()Ljava/util/List;

    move-result-object v14

    .line 72
    if-eqz v14, :cond_3

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 75
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->getPriceEnroll()Ljava/lang/String;

    move-result-object v15

    .line 76
    const/4 v0, 0x0

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->getAmountEnroll()Ljava/lang/String;

    move-result-object v16

    .line 77
    move-object/from16 v0, v16

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, v15

    goto :goto_0

    :cond_0
    move-object/from16 v0, v16

    :goto_0
    move-object/from16 v16, v0

    .line 78
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setIssueActAmount(Ljava/lang/String;)V

    .line 79
    invoke-virtual {v7, v15}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setIssueStdAmount(Ljava/lang/String;)V

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAmount priceEnroll "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " amountEnroll "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 81
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    move-object/from16 v17, v1

    .line 82
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    move-object/from16 v18, v1

    .line 83
    const/16 v19, 0x0

    .line 84
    const/16 v20, 0x0

    .line 85
    const/16 v21, 0x0

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v22

    :goto_1
    move/from16 v0, v21

    move/from16 v1, v22

    if-ge v0, v1, :cond_2

    .line 87
    move/from16 v0, v21

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->getPriceRecharge()Ljava/lang/String;

    move-result-object v19

    .line 88
    move/from16 v0, v21

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/IssueAmount;->getAmountRecharge()Ljava/lang/String;

    move-result-object v20

    .line 89
    move-object/from16 v0, v20

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, v19

    goto :goto_2

    :cond_1
    move-object/from16 v0, v20

    :goto_2
    move-object/from16 v20, v0

    .line 90
    aput-object v20, v17, v21

    .line 91
    aput-object v19, v18, v21

    .line 85
    add-int/lit8 v21, v21, 0x1

    goto :goto_1

    .line 93
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "queryAmount rechargeActList "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " rechargeStdList "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 94
    move-object/from16 v0, v18

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setRechargeStdAmounts([Ljava/lang/String;)V

    .line 95
    move-object/from16 v0, v17

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setRechargeActAmounts([Ljava/lang/String;)V

    .line 96
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 98
    :cond_3
    goto/16 :goto_5

    .line 99
    :cond_4
    const-string v0, "2"

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->flag:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 101
    const-string v0, "QueryAmountSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "QueryAmountRequest.FLAG_RECHARGE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getRechargeAmountList()Ljava/util/List;

    move-result-object v14

    .line 103
    if-eqz v14, :cond_7

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 105
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    new-array v15, v0, [Ljava/lang/String;

    .line 106
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    move-object/from16 v16, v1

    .line 107
    const/16 v17, 0x0

    .line 108
    const/16 v18, 0x0

    .line 109
    const/16 v19, 0x0

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v20

    :goto_3
    move/from16 v0, v19

    move/from16 v1, v20

    if-ge v0, v1, :cond_6

    .line 111
    move/from16 v0, v19

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->getDenomination()Ljava/lang/String;

    move-result-object v17

    .line 112
    move/from16 v0, v19

    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/model/RechargeAmount;->getAmountRecharge()Ljava/lang/String;

    move-result-object v18

    .line 113
    move-object/from16 v0, v18

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v0, v17

    goto :goto_4

    :cond_5
    move-object/from16 v0, v18

    :goto_4
    move-object/from16 v18, v0

    .line 114
    aput-object v18, v15, v19

    .line 115
    aput-object v17, v16, v19

    .line 116
    const-string v0, "QueryAmountSAOperator"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "QueryAmountRequest. amountRecharge : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v18

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; priceRecharge "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    add-int/lit8 v19, v19, 0x1

    goto :goto_3

    .line 118
    :cond_6
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setRechargeStdAmounts([Ljava/lang/String;)V

    .line 119
    invoke-virtual {v7, v15}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setRechargeActAmounts([Ljava/lang/String;)V

    .line 120
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 122
    :cond_7
    goto :goto_5

    .line 126
    :cond_8
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getResultCode()I

    move-result v0

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->translateErrorCode(I)I

    move-result v0

    invoke-virtual {v7, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/TrafficActivityInfo;->setReturnCd(I)V

    .line 127
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "QueryAmountSAOperator err, code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getResultCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", desc : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 128
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 127
    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 129
    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getResultCode()I

    move-result v0

    invoke-virtual {v13}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/response/QueryAmountResponse;->getResultDesc()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/logic/cardoperate/bus/task/serveraccess/QueryAmountSAOperator;->reportErr(ILjava/lang/String;)V

    .line 132
    :cond_9
    :goto_5
    return-object v7
.end method
