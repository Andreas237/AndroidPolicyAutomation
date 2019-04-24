.class public Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/carrera/server/card/CommonCardServerApi;


# instance fields
.field protected final mContext:Landroid/content/Context;

.field private mModule:Ljava/lang/String;

.field protected final serverTotalUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    .line 67
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v2

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://nfcws.hicloud.com/Wallet/wallet/gateway.action?clientVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v2

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://nfcws.hicloud.com/Wallet/wallet/gateway.action?clientVersion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    .line 76
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 78
    invoke-direct {p0, p2}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->setModule(Ljava/lang/String;)V

    .line 80
    :cond_0
    return-void
.end method

.method private setModule(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mModule:Ljava/lang/String;

    .line 85
    return-void
.end method


# virtual methods
.method public applyAPDU(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;
    .locals 5

    .line 150
    const-string v0, "CardServer applyAPDU begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 151
    const-string v0, "get.apdu"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 152
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 153
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyAPDUTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;

    .line 154
    return-object v4
.end method

.method public applyOrder(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;
    .locals 5

    .line 109
    const-string v0, "CardServer applyOrder begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 110
    const-string v0, "create.order"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 111
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 112
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessApplyOrderTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;

    .line 113
    return-object v4
.end method

.method public checkCloudTransferOut(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;
    .locals 5

    .line 367
    const-string v0, "checkCloudTransferOut begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 368
    const-string v0, "nfc.transcard.remove.check"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 369
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 370
    const-string v0, "nfc.transcard.remove.check"

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->setHeadCommander(Ljava/lang/String;)V

    .line 371
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;

    .line 372
    return-object v4
.end method

.method public deleteApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;
    .locals 5

    .line 140
    const-string v0, "CardServer deleteApplet begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 141
    const-string v0, "delete.app"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 142
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDeleteAppletTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDeleteAppletTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 143
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDeleteAppletTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;

    .line 144
    return-object v4
.end method

.method public downloadAndInstallApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;
    .locals 5

    .line 120
    const-string v0, "CardServer downloadAndInstallApplet begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 121
    const-string v0, "download.install.app"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 122
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 123
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessDownloadAndInstallAppletTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;

    .line 124
    return-object v4
.end method

.method protected getModule()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mModule:Ljava/lang/String;

    return-object v0
.end method

.method protected getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 95
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 97
    invoke-static {}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getInstance()Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, p1, p2, v2, v1}, Lcom/huawei/nfc/carrera/server/config/AddressNameMgr;->getAddress(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 101
    :cond_0
    iget-object v3, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    .line 103
    :goto_0
    return-object v3
.end method

.method public personalizeApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;
    .locals 5

    .line 130
    const-string v0, "CardServer personalizeApplet begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 131
    const-string v0, "personalized"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 132
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 133
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessPersonalizeAppletTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;

    .line 134
    return-object v4
.end method

.method public queryAppCode(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;
    .locals 5

    .line 190
    const-string v0, "queryAppCode begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 191
    const-string v0, "query.lingnantong.appcode"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 192
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 193
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAppCodeTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;

    .line 194
    return-object v4
.end method

.method public queryCardProductInfoList(Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;
    .locals 4

    .line 211
    const-string v0, "queryCardProductInfoList begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 212
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/CardProductInfoQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CardProductInfoQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 213
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;->setIsNeedServiceTokenAuth(Z)V

    .line 214
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardProductInfoQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;

    .line 215
    const-string v0, "queryCardProductInfoList end."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 216
    return-object v3
.end method

.method public queryDics(Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;
    .locals 4

    .line 342
    const-string v0, "queryDics begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 343
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/DicsQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/DicsQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 344
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/DicsQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;

    .line 345
    const-string v0, "queryDics end."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 346
    return-object v3
.end method

.method public queryIssueOrRechargeAmount(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;
    .locals 5

    .line 180
    const-string v0, "CardServer queryIssueOrRechargeAmount begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 181
    const-string v0, "get.rechargecard"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 182
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 183
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryAmountTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;

    .line 184
    return-object v4
.end method

.method public queryIssuerInfo(Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;
    .locals 4

    .line 200
    const-string v0, "queryIssuerInfo begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 201
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 202
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;->setIsNeedServiceTokenAuth(Z)V

    .line 203
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/IssuerInfoQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;

    .line 204
    const-string v0, "queryIssuerInfo end."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 205
    return-object v3
.end method

.method public queryOrder(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;
    .locals 5

    .line 170
    const-string v0, "CardServer queryOrder begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 171
    const-string v0, "query.order"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 172
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryOrderTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryOrderTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 173
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessQueryOrderTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;

    .line 174
    return-object v4
.end method

.method public querySignData(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 4

    .line 333
    const-string v0, "querySignData begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 334
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 335
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 336
    return-object v3
.end method

.method public querySignDataForActivation(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 283
    const-string v0, "querySignDataForActivation begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 284
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "ACTIVATEACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 286
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 287
    return-object v4
.end method

.method public querySignDataForApplyAid(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 263
    const-string v0, "querySignDataForApplyAid begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 264
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "APPLYIDCARDACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 266
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 267
    return-object v4
.end method

.method public querySignDataForApplyCard(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 273
    const-string v0, "querySignDataForApplyCard begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 274
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "APPLYCARDACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 277
    return-object v4
.end method

.method public querySignDataForBillList(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 303
    const-string v0, "querySignDataForBillList begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 304
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "BILLLISTACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 307
    return-object v4
.end method

.method public querySignDataForNullify(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 253
    const-string v0, "querySignDataForNullify begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 254
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "NULLIFYACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 256
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 257
    return-object v4
.end method

.method public querySignDataForPersonal(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 293
    const-string v0, "querySignDataForPersonal begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 294
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "PERSONALIZEACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 296
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 297
    return-object v4
.end method

.method public querySignDataForQueryCashLimit(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 313
    const-string v0, "querySignDataForQueryCashLimit begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 314
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "CASHLIMITSEARCHACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 317
    return-object v4
.end method

.method public querySignDataForSetCashLimit(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
    .locals 5

    .line 323
    const-string v0, "querySignDataForSetCashLimit begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 324
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    const-string v2, "CASHLIMITACTION"

    invoke-direct {v3, v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 326
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/SignatureQueryTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;

    .line 327
    return-object v4
.end method

.method public querySupportedCardListByTerminal(Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;)Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;
    .locals 5

    .line 223
    const-string v0, "querySupportedCardListByTerminal begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 224
    const-string v0, "query.rule.issuer"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 225
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 226
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;->setIsNeedServiceTokenAuth(Z)V

    .line 227
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/QuerySupportedCardListByTerminalTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;

    .line 228
    return-object v4
.end method

.method public recharge(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;
    .locals 5

    .line 160
    const-string v0, "CardServer recharge begin"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 161
    const-string v0, "recharge"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 162
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessRechargeTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessRechargeTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 163
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessRechargeTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;

    .line 164
    return-object v4
.end method

.method public reportCardStatus(Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 5

    .line 234
    const-string v0, "reportCard Status begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 235
    const-string v0, "nfc.set.card"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 236
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusReportTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusReportTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 237
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/CardStatusReportTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    .line 238
    return-object v4
.end method

.method public reportDeviceStatus(Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 4

    .line 244
    const-string v0, "reportRepairStatus begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 245
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/impl/DeviceStatusReportTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->serverTotalUrl:Ljava/lang/String;

    invoke-direct {v2, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/DeviceStatusReportTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 246
    invoke-virtual {v2, p1}, Lcom/huawei/nfc/carrera/server/card/impl/DeviceStatusReportTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    .line 247
    return-object v3
.end method

.method public reportOpenCardEvent(Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
    .locals 5

    .line 352
    const-string v0, "reportOpenCardEvent begin."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 353
    const-string v0, "post.event.cardenroll"

    invoke-virtual {p0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getModule()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->getServerAddress(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 354
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->mContext:Landroid/content/Context;

    invoke-direct {v3, v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 355
    invoke-virtual {v3, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ReportOpenCardEventTask;->processTask(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    .line 356
    return-object v4
.end method
