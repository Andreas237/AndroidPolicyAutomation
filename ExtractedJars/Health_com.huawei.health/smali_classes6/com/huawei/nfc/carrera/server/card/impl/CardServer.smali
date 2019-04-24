.class public Lcom/huawei/nfc/carrera/server/card/impl/CardServer;
.super Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/server/card/CardServerApi;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    .line 42
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 47
    return-void
.end method

.method private getTransportationCardServerAddress(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 51
    const-string v0, "TransportationCard"

    invoke-virtual {p0, p1, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public queryCardApplet(Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;
    .locals 4

    .line 195
    const-string v0, "queryCardApplet begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 196
    const-string v0, "nfc.se.get.ssdaid"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->getTransportationCardServerAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 197
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 198
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardAppletTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;

    .line 199
    return-object v3
.end method

.method public queryCardNotice(Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;
    .locals 4

    .line 185
    const-string v0, "queryCardNotice begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 186
    const-string v0, "query.issuer.notice"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->getTransportationCardServerAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 187
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 188
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardNoticeTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;

    .line 189
    return-object v3
.end method

.method public queryCardStatus(Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;
    .locals 4

    .line 57
    const-string v0, "queryCardStatus begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 58
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 59
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;

    .line 60
    return-object v3
.end method

.method public queryCardTransferAbility(Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;
    .locals 4

    .line 205
    const-string v0, "queryCardTransferAbility begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 206
    const-string v0, "if.cardmove.permitted"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->getTransportationCardServerAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 207
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardTransferAbilityTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardTransferAbilityTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 208
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryCardTransferAbilityTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;

    .line 209
    return-object v3
.end method

.method public queryCreateSSDTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 136
    const-string v0, "queryCreateSSDTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 137
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.create.SSD"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 140
    return-object v4
.end method

.method public queryDeleteAppletTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 76
    const-string v0, "queryDeleteAppletTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 77
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.del.APP"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 80
    return-object v4
.end method

.method public queryDeleteSSDTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 86
    const-string v0, "queryDeleteSSDTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 87
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.del.SSD"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 90
    return-object v4
.end method

.method public queryInfoInitTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 117
    const-string v0, "queryInfoInitTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 118
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.NotifyInfoInit"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 121
    return-object v4
.end method

.method public queryInfoSynTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 156
    const-string v0, "queryInfoSynTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 157
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.NotifyEseInfoSync"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 160
    return-object v4
.end method

.method public queryInstallTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 66
    const-string v0, "queryInstallTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 67
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.install.APP"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 70
    return-object v4
.end method

.method public queryLockAppletTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 97
    const-string v0, "queryLockAppletTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 98
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.lock.APP"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 101
    return-object v4
.end method

.method public queryRFConfURL(Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;)Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;
    .locals 4

    .line 176
    const-string v0, "queryRFConfURL begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 177
    const-string v0, "query.rule.rf"

    invoke-direct {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->getTransportationCardServerAddress(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 178
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 179
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QueryRFConfURLTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;

    .line 180
    return-object v3
.end method

.method public queryUnLockEseTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 166
    const-string v0, "queryUnLockEseTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 167
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.se.unlock"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 170
    return-object v4
.end method

.method public queryUnockAppletTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 107
    const-string v0, "queryUnockAppletTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 108
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.unlock.APP"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 111
    return-object v4
.end method

.method public queryUpdateTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
    .locals 5

    .line 146
    const-string v0, "queryUpdateTsmParam begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 147
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "nfc.get.transit.temp.update.APP"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/TsmParamQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;

    .line 150
    return-object v4
.end method

.method public reportPushInfo(Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 4

    .line 127
    const-string v0, "reportPushInfo begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 128
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/PushInfoReportTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/PushInfoReportTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 129
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/PushInfoReportTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    .line 130
    return-object v3
.end method
