.class public Lcom/huawei/nfc/carrera/server/card/impl/DeviceStatusReportTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask<Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;>;"
    }
.end annotation


# static fields
.field private static final REPORT_LOST_STATUS_COMMANDER:Ljava/lang/String; = "retry.device.claimmiss"

.field private static final REPORT_REPAIR_STATUS_COMMANDER:Ljava/lang/String; = "device.claimmiss"


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/BaseReportTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 46
    return-void
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;)Lorg/json/JSONObject;
    .locals 6

    .line 87
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 89
    const/4 v0, 0x0

    return-object v0

    .line 92
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "createDataStr headerStr : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;Z)V

    .line 93
    const/4 v4, 0x0

    .line 96
    :try_start_0
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    .line 97
    const-string v0, "header"

    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 99
    const-string v0, "requestId"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 101
    const-string v0, "dType"

    const-string v1, "cplc"

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->reportDeviceInfo:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 104
    const-string v0, "deviceID"

    iget-object v1, p2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->reportDeviceInfo:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    :cond_1
    iget-object v0, p2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->status:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 108
    const-string v0, "status"

    iget-object v1, p2, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->status:Ljava/lang/String;

    invoke-virtual {v4, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    :cond_2
    goto :goto_0

    .line 111
    :catch_0
    move-exception v5

    .line 113
    const-string v0, "createDataStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 114
    const/4 v4, 0x0

    .line 117
    :goto_0
    return-object v4
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;)Ljava/lang/String;
    .locals 6

    .line 51
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    :cond_0
    const-string v0, "prepareRequestStr, params invalid."

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->d(Ljava/lang/String;)V

    .line 54
    const/4 v0, 0x0

    return-object v0

    .line 57
    :cond_1
    const-string v0, "2"

    iget-object v1, p1, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "4"

    iget-object v1, p1, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->status:Ljava/lang/String;

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 60
    :cond_2
    const-string v3, "retry.device.claimmiss"

    goto :goto_0

    .line 64
    :cond_3
    const-string v3, "device.claimmiss"

    .line 69
    :goto_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v3, v1}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v4

    .line 72
    invoke-direct {p0, v4, p1}, Lcom/huawei/nfc/carrera/server/card/impl/DeviceStatusReportTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;)Lorg/json/JSONObject;

    move-result-object v5

    .line 74
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/DeviceStatusReportTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v5, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 29
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/DeviceStatusReportTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/DeviceStatusReportRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
