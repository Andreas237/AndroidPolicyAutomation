.class public interface abstract Lcom/huawei/nfc/carrera/server/card/CommonCardServerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract applyAPDU(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyAPDURequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyAPDUResponse;
.end method

.method public abstract applyOrder(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessApplyOrderRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessApplyOrderResponse;
.end method

.method public abstract checkCloudTransferOut(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;
.end method

.method public abstract deleteApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDeleteAppletResponse;
.end method

.method public abstract downloadAndInstallApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDownloadAndInstallAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessDownloadAndInstallAppletResponse;
.end method

.method public abstract personalizeApplet(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessPersonalizeAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessPersonalizeAppletResponse;
.end method

.method public abstract queryAppCode(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAppCodeRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAppCodeResponse;
.end method

.method public abstract queryCardProductInfoList(Lcom/huawei/nfc/carrera/server/card/request/QueryCardProductInfoRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardProductInfoResponse;
.end method

.method public abstract queryDics(Lcom/huawei/nfc/carrera/server/card/request/QueryDicsRequset;)Lcom/huawei/nfc/carrera/server/card/response/QueryDicsResponse;
.end method

.method public abstract queryIssueOrRechargeAmount(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryAmountRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryAmountResponse;
.end method

.method public abstract queryIssuerInfo(Lcom/huawei/nfc/carrera/server/card/request/QueryIssuerInfoRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryIssuerInfoResponse;
.end method

.method public abstract queryOrder(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessQueryOrderRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessQueryOrderResponse;
.end method

.method public abstract querySignData(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForActivation(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForApplyAid(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForApplyCard(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForBillList(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForNullify(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForPersonal(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForQueryCashLimit(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySignDataForSetCashLimit(Lcom/huawei/nfc/carrera/server/card/request/CardServerBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/SignDataResponse;
.end method

.method public abstract querySupportedCardListByTerminal(Lcom/huawei/nfc/carrera/server/card/request/QuerySupportedCardListByTerminalRequest;)Lcom/huawei/nfc/carrera/server/card/response/QuerySupportedCardListByTerminalResponse;
.end method

.method public abstract recharge(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessRechargeRequest;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessRechargeResponse;
.end method

.method public abstract reportCardStatus(Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.end method

.method public abstract reportDeviceStatus(Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.end method

.method public abstract reportOpenCardEvent(Lcom/huawei/nfc/carrera/server/card/request/ReportEventBaseRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.end method
