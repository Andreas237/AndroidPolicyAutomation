.class abstract Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TSM_OPERATE_RESULT_FAILED:I = -0x4

.field public static final TSM_OPERATE_RESULT_FAILED_CONN_UNAVAILABLE:I = -0x2

.field public static final TSM_OPERATE_RESULT_FAILED_CPLC_ERRO:I = -0x3

.field public static final TSM_OPERATE_RESULT_FAILED_NO_NETWORK:I = -0x1

.field public static final TSM_OPERATE_RESULT_FAILED_UNKNOWN_ERROR:I = -0x63

.field public static final TSM_OPERATE_RESULT_SUCCESS:I = 0x0


# instance fields
.field private issuerId:Ljava/lang/String;

.field private final mAction:Ljava/lang/String;

.field protected mContext:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mContext:Landroid/content/Context;

    .line 80
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mAction:Ljava/lang/String;

    .line 81
    return-void
.end method

.method private createCommandRequest(Ljava/lang/String;Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;)Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;
    .locals 2

    .line 171
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->funcID:Ljava/lang/String;

    iget-object v1, p2, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->servicID:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->build(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;

    move-result-object v0

    return-object v0
.end method

.method private createTsmParamQueryRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;
    .locals 7

    .line 159
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;

    const-string v2, "260086000000068459"

    invoke-static {}, Lcom/huawei/wallet/utils/Generator;->e()Ljava/lang/String;

    move-result-object v4

    move-object v1, p1

    const/4 v3, -0x1

    move-object v5, p3

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private translateReturnCode(I)I
    .locals 6

    .line 182
    const/16 v4, -0x63

    .line 183
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    .line 185
    const/4 v4, -0x1

    goto :goto_0

    .line 187
    :cond_0
    const/4 v0, -0x2

    if-ne v0, p1, :cond_1

    .line 189
    const/4 v4, -0x2

    goto :goto_0

    .line 193
    :cond_1
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 194
    const-string v0, "fail_action"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mAction:Ljava/lang/String;

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    const-string v0, "fail_code"

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 196
    const-string v0, "Tsm quire param err!"

    const v1, 0x3611a42d

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v5, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 199
    :goto_0
    return v4
.end method


# virtual methods
.method public excute()I
    .locals 13

    .line 86
    const-string v0, "tsm excute start."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v4

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excute, query params cplc : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 90
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 91
    const/4 v0, -0x3

    return v0

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceSN()Ljava/lang/String;

    move-result-object v5

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v6

    .line 95
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "excute, query params imei : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ; model : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 96
    const/4 v0, 0x1

    invoke-static {v5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    invoke-static {v6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 97
    :cond_1
    const/4 v0, -0x4

    return v0

    .line 100
    :cond_2
    invoke-direct {p0, v4, v5, v6}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->createTsmParamQueryRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;

    move-result-object v7

    .line 101
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm 3.create TsmParamQueryRequest: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 103
    invoke-virtual {p0, v7}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->queryOperateParams(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    move-result-object v8

    .line 104
    const/4 v0, 0x0

    if-ne v0, v8, :cond_3

    .line 106
    const-string v0, "tsm excute, query params failed."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 107
    const/16 v0, -0x63

    return v0

    .line 109
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm 4.return TsmParamQueryResponse: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v8}, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 111
    const/16 v9, -0x63

    .line 112
    iget v0, v8, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 114
    iget v0, v8, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->returnCode:I

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->translateReturnCode(I)I

    move-result v0

    return v0

    .line 117
    :cond_4
    iget-object v0, v8, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->funcID:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v8, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;->servicID:Ljava/lang/String;

    .line 118
    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 120
    :cond_5
    const-string v0, "TsmBaseOperator"

    const-string v1, "tsm funcID or serviceID illegal."

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    return v9

    .line 129
    :cond_6
    invoke-direct {p0, v4, v8}, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->createCommandRequest(Ljava/lang/String;Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;)Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;

    move-result-object v10

    .line 131
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm 5.create CommandRequest: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/huawei/nfc/carrera/logic/spi/tsm/laser/LaserTSMServiceImpl;->excuteTsmCommand(Lcom/huawei/nfc/carrera/logic/spi/tsm/request/CommandRequest;)I

    move-result v11

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "tsm 6.return TsmParamQueryResponse: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 135
    const v0, 0x186a0

    if-ne v0, v11, :cond_7

    .line 137
    const/4 v9, 0x0

    goto :goto_0

    .line 141
    :cond_7
    new-instance v12, Ljava/util/HashMap;

    invoke-direct {v12}, Ljava/util/HashMap;-><init>()V

    .line 142
    const-string v0, "fail_action"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->mAction:Ljava/lang/String;

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    const-string v0, "fail_code"

    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v12, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    const-string v0, "tsm excute err!"

    const v1, 0x3611a42e

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v12, v0, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 147
    :goto_0
    return v9
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method abstract queryOperateParams(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardoperate/tsm/TsmBaseOperator;->issuerId:Ljava/lang/String;

    .line 217
    return-void
.end method
