.class public Lcom/leisen/wallet/sdk/util/AppJsonUtil;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static fillBaseData(Lcom/leisen/wallet/sdk/business/BaseRequest;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/leisen/wallet/sdk/business/BaseRequest<*>;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V"
        }
    .end annotation

    .line 162
    const-string v0, "2.0.6"

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setClientVersion(Ljava/lang/String;)V

    .line 163
    invoke-static {}, Lcom/leisen/wallet/sdk/AppConfig;->getImei()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setImei(Ljava/lang/String;)V

    .line 164
    invoke-static {}, Lcom/leisen/wallet/sdk/AppConfig;->getMobileType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setMobileType(Ljava/lang/String;)V

    .line 165
    const-string v0, "1.0"

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setVersion(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p1}, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->getServiceId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setServiceId(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p1}, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->getFunCallId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setFunctionCallId(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p1}, Lcom/leisen/wallet/sdk/bean/CommonRequestParams;->getSeid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setSeid(Ljava/lang/String;)V

    .line 169
    return-void
.end method

.method public static getActivateAppletJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;ILjava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 105
    new-instance v1, Lcom/leisen/wallet/sdk/business/BaseRequest;

    invoke-direct {v1}, Lcom/leisen/wallet/sdk/business/BaseRequest;-><init>()V

    .line 106
    invoke-static {v1, p0}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->fillBaseData(Lcom/leisen/wallet/sdk/business/BaseRequest;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 108
    new-instance v2, Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;

    invoke-direct {v2}, Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;-><init>()V

    .line 109
    invoke-virtual {v2, p1}, Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;->setType(I)V

    .line 110
    invoke-virtual {v2, p2}, Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;->setAppAid(Ljava/lang/String;)V

    .line 111
    invoke-virtual {v2, p3}, Lcom/leisen/wallet/sdk/business/ActivateAppletBusinessForReq;->setTaskIndex(I)V

    .line 112
    invoke-virtual {v1, v2}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V

    .line 114
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getBaseReqJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;II)Ljava/lang/String;
    .locals 3

    .line 150
    new-instance v1, Lcom/leisen/wallet/sdk/business/BaseRequest;

    invoke-direct {v1}, Lcom/leisen/wallet/sdk/business/BaseRequest;-><init>()V

    .line 151
    invoke-static {v1, p0}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->fillBaseData(Lcom/leisen/wallet/sdk/business/BaseRequest;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 153
    new-instance v2, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;

    invoke-direct {v2}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;-><init>()V

    .line 154
    invoke-virtual {v2, p1}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;->setType(I)V

    .line 155
    invoke-virtual {v2, p2}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReq;->setTaskIndex(I)V

    .line 156
    invoke-virtual {v1, v2}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V

    .line 158
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getOperAppletJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;IILcom/leisen/wallet/sdk/bean/OperAppletReqParams;I)Ljava/lang/String;
    .locals 3

    .line 57
    new-instance v1, Lcom/leisen/wallet/sdk/business/BaseRequest;

    invoke-direct {v1}, Lcom/leisen/wallet/sdk/business/BaseRequest;-><init>()V

    .line 58
    invoke-static {v1, p0}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->fillBaseData(Lcom/leisen/wallet/sdk/business/BaseRequest;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 60
    new-instance v2, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;

    invoke-direct {v2}, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;-><init>()V

    .line 61
    invoke-virtual {v2, p1}, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->setType(I)V

    .line 62
    invoke-virtual {p3}, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->getAppletAid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->setAppAid(Ljava/lang/String;)V

    .line 63
    invoke-virtual {p3}, Lcom/leisen/wallet/sdk/bean/OperAppletReqParams;->getAppletVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->setAppletVersion(Ljava/lang/String;)V

    .line 64
    invoke-virtual {v2, p2}, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->setOperType(I)V

    .line 65
    invoke-virtual {v2, p4}, Lcom/leisen/wallet/sdk/business/AppletOperBusinessForReq;->setTaskIndex(I)V

    .line 66
    invoke-virtual {v1, v2}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V

    .line 68
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getOperGPACJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;IILjava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 82
    new-instance v1, Lcom/leisen/wallet/sdk/business/BaseRequest;

    invoke-direct {v1}, Lcom/leisen/wallet/sdk/business/BaseRequest;-><init>()V

    .line 83
    invoke-static {v1, p0}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->fillBaseData(Lcom/leisen/wallet/sdk/business/BaseRequest;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 85
    new-instance v2, Lcom/leisen/wallet/sdk/business/GPACOperBusinessForReq;

    invoke-direct {v2}, Lcom/leisen/wallet/sdk/business/GPACOperBusinessForReq;-><init>()V

    .line 86
    invoke-virtual {v2, p1}, Lcom/leisen/wallet/sdk/business/GPACOperBusinessForReq;->setType(I)V

    .line 87
    invoke-virtual {v2, p3}, Lcom/leisen/wallet/sdk/business/GPACOperBusinessForReq;->setAppAid(Ljava/lang/String;)V

    .line 88
    invoke-virtual {v2, p2}, Lcom/leisen/wallet/sdk/business/GPACOperBusinessForReq;->setOperType(I)V

    .line 89
    invoke-virtual {v2, p4}, Lcom/leisen/wallet/sdk/business/GPACOperBusinessForReq;->setTaskIndex(I)V

    .line 90
    invoke-virtual {v1, v2}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V

    .line 92
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getOperSSDJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;IILjava/lang/String;I)Ljava/lang/String;
    .locals 3

    .line 33
    new-instance v1, Lcom/leisen/wallet/sdk/business/BaseRequest;

    invoke-direct {v1}, Lcom/leisen/wallet/sdk/business/BaseRequest;-><init>()V

    .line 34
    invoke-static {v1, p0}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->fillBaseData(Lcom/leisen/wallet/sdk/business/BaseRequest;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 36
    new-instance v2, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;

    invoke-direct {v2}, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;-><init>()V

    .line 37
    invoke-virtual {v2, p1}, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->setType(I)V

    .line 38
    invoke-virtual {v2, p3}, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->setSsdAid(Ljava/lang/String;)V

    .line 39
    invoke-virtual {v2, p2}, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->setOperType(I)V

    .line 40
    invoke-virtual {v2, p4}, Lcom/leisen/wallet/sdk/business/SSDOperBusinessForReq;->setTaskIndex(I)V

    .line 41
    invoke-virtual {v1, v2}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V

    .line 43
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getReqNextJsonResult(Lcom/leisen/wallet/sdk/bean/CommonRequestParams;ILcom/leisen/wallet/sdk/business/ApduResBean;II)Ljava/lang/String;
    .locals 3

    .line 128
    new-instance v1, Lcom/leisen/wallet/sdk/business/BaseRequest;

    invoke-direct {v1}, Lcom/leisen/wallet/sdk/business/BaseRequest;-><init>()V

    .line 129
    invoke-static {v1, p0}, Lcom/leisen/wallet/sdk/util/AppJsonUtil;->fillBaseData(Lcom/leisen/wallet/sdk/business/BaseRequest;Lcom/leisen/wallet/sdk/bean/CommonRequestParams;)V

    .line 131
    new-instance v2, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;

    invoke-direct {v2}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;-><init>()V

    .line 132
    invoke-virtual {v2, p1}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->setType(I)V

    .line 133
    invoke-virtual {v2, p2}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->setRapduList(Lcom/leisen/wallet/sdk/business/ApduResBean;)V

    .line 134
    invoke-virtual {v2, p3}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->setResult(I)V

    .line 135
    invoke-virtual {v2, p4}, Lcom/leisen/wallet/sdk/business/BaseBusinessForReqNext;->setTaskIndex(I)V

    .line 136
    invoke-virtual {v1, v2}, Lcom/leisen/wallet/sdk/business/BaseRequest;->setBusiness(Lcom/leisen/wallet/sdk/business/Business;)V

    .line 138
    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
