.class Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final KEY_DEVICE_STATUS:Ljava/lang/String; = "device_status"


# instance fields
.field protected mContext:Landroid/content/Context;

.field protected reportStatusDBManager:Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    .line 54
    new-instance v0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->reportStatusDBManager:Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;

    .line 55
    return-void
.end method


# virtual methods
.method protected removeDBStatusItem(Ljava/lang/String;)V
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->reportStatusDBManager:Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/lostmanager/report/dbmanager/ReportStatusDBManager;->removeOneReportStatusInfo(Ljava/lang/String;)V

    .line 135
    return-void
.end method

.method protected removeDeviceStatus()V
    .locals 2

    .line 172
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "device_status"

    invoke-virtual {v0, v1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->remove(Ljava/lang/String;)Z

    .line 173
    return-void
.end method

.method protected reportStatusToServer(Ljava/lang/String;)Z
    .locals 4

    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sendRequestToServer : type : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 148
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;-><init>()V

    .line 149
    const-string v0, "260086000000068459"

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->setMerchantID(Ljava/lang/String;)V

    .line 150
    const/4 v0, -0x1

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->setRsaKeyIndex(I)V

    .line 151
    invoke-static {}, Lcom/huawei/wallet/utils/Generator;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->reportDeviceInfo:Ljava/lang/String;

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "request.reportDeviceInfo : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, v2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->reportDeviceInfo:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 154
    iput-object p1, v2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->status:Ljava/lang/String;

    .line 156
    new-instance v0, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->reportDeviceStatus(Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v3

    .line 157
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    .line 159
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "send repair result to server result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 160
    iget v0, v3, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 162
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method protected reportStatusToServer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Z
    .locals 8

    .line 71
    new-instance v4, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;-><init>()V

    .line 72
    invoke-virtual {v4, p1}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setAid(Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->queryCplc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setCplc(Ljava/lang/String;)V

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceModel()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setTerminal(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v4, p3}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setUserID(Ljava/lang/String;)V

    .line 76
    invoke-virtual {v4, p2}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setStatus(Ljava/lang/String;)V

    .line 77
    const-string v0, "260086000000068459"

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setMerchantID(Ljava/lang/String;)V

    .line 78
    const/4 v0, -0x1

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setRsaKeyIndex(I)V

    .line 79
    invoke-static {}, Lcom/huawei/wallet/utils/Generator;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setSrcTransactionID(Ljava/lang/String;)V

    .line 80
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEApiFactory;->createESEInfoManagerApi(Landroid/content/Context;)Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/nfc/carrera/logic/ese/ESEInfoManagerApi;->getDeviceSN()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setImei(Ljava/lang/String;)V

    .line 81
    invoke-virtual {v4, p4}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setDpanid(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v4, p5}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setCardName(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v4, p6}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setCardNumber(Ljava/lang/String;)V

    .line 84
    move/from16 v0, p9

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setIfNotify(Z)V

    .line 86
    const-string v0, "0"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v1}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setWalletVersion(Ljava/lang/String;)V

    .line 89
    invoke-virtual {v4, p7}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setIssuerId(Ljava/lang/String;)V

    .line 90
    move/from16 v0, p8

    invoke-virtual {v4, v0}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->setCardType(I)V

    .line 94
    :cond_0
    invoke-virtual {v4}, Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;->getCardType()I

    move-result v0

    const/16 v1, 0xb

    if-ne v1, v0, :cond_1

    .line 96
    new-instance v5, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    const-string v1, "TransportationCard"

    invoke-direct {v5, v0, v1}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 100
    :cond_1
    new-instance v5, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;

    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-direct {v5, v0}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;-><init>(Landroid/content/Context;)V

    .line 103
    :goto_0
    invoke-virtual {v5, v4}, Lcom/huawei/nfc/carrera/server/card/impl/CommonCardServer;->reportCardStatus(Lcom/huawei/nfc/carrera/server/card/request/CardStatusReportRequest;)Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;

    move-result-object v6

    .line 105
    const/4 v0, 0x0

    if-ne v0, v6, :cond_2

    .line 107
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 108
    const-string v0, "fail_reason"

    const-string v1, "reportStatusToServer, get illegal response."

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    const v0, 0x3611a441

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v7, v1, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 110
    const/4 v0, 0x0

    return v0

    .line 113
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "reportStatusToServer, response code: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, v6, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 114
    iget v0, v6, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_3

    .line 116
    const/4 v0, 0x1

    return v0

    .line 120
    :cond_3
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 121
    const-string v0, "fail_reason"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "reportStatusToServer, get error response code : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, v6, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;->returnCode:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    const v0, 0x3611a441

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v7, v1, v2, v3}, Lcom/huawei/nfc/carrera/util/LogX;->e(ILjava/util/Map;Ljava/lang/String;ZZ)V

    .line 123
    const/4 v0, 0x0

    return v0
.end method

.method protected updateDeviceStatus(Ljava/lang/String;)V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/lostmanager/report/ReportStatusBaseTask;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;

    move-result-object v0

    const-string v1, "device_status"

    invoke-virtual {v0, v1, p1}, Lcom/huawei/nfc/carrera/storage/sp/NFCPreferences;->putString(Ljava/lang/String;Ljava/lang/String;)Z

    .line 168
    return-void
.end method
