.class public interface abstract Lcom/huawei/nfc/carrera/server/card/CardServerApi;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract queryCardApplet(Lcom/huawei/nfc/carrera/server/card/request/QueryCardAppletRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardAppletResponse;
.end method

.method public abstract queryCardNotice(Lcom/huawei/nfc/carrera/server/card/request/QueryCardNoticeRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardNoticeResponse;
.end method

.method public abstract queryCardStatus(Lcom/huawei/nfc/carrera/server/card/request/CardStatusQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardStatusQueryResponse;
.end method

.method public abstract queryCardTransferAbility(Lcom/huawei/nfc/carrera/server/card/request/QueryCardTransferAbilityRequest;)Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;
.end method

.method public abstract queryCreateSSDTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryDeleteAppletTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryDeleteSSDTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryInfoInitTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryInfoSynTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryInstallTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryLockAppletTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryRFConfURL(Lcom/huawei/nfc/carrera/server/card/request/QueryRFConfURLResquest;)Lcom/huawei/nfc/carrera/server/card/response/QueryRFConfURLResponse;
.end method

.method public abstract queryUnLockEseTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryUnockAppletTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract queryUpdateTsmParam(Lcom/huawei/nfc/carrera/server/card/request/TsmParamQueryRequest;)Lcom/huawei/nfc/carrera/server/card/response/TsmParamQueryResponse;
.end method

.method public abstract reportPushInfo(Lcom/huawei/nfc/carrera/server/card/request/PushInfoReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.end method
