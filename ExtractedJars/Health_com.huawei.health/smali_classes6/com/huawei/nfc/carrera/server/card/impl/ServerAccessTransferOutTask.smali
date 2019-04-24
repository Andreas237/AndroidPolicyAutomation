.class public Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;
.super Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask<Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;>;"
    }
.end annotation


# static fields
.field private static final HEAD_COMMANDER:Ljava/lang/String; = "cardmove.out"

.field public static final HEAD_COMMANDER_CLOUD_TRANSFER:Ljava/lang/String; = "nfc.transcard.backup"

.field public static final HEAD_COMMANDER_CLOUD_TRANSFER_CHECK:Ljava/lang/String; = "nfc.transcard.remove.check"

.field public static final HEAD_COMMANDER_CLOUD_TRANSFER_INIT:Ljava/lang/String; = "nfc.transcard.reviveinit"


# instance fields
.field private mHeadCommander:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/huawei/nfc/carrera/server/card/impl/http/HttpConnTask;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 42
    const-string v0, "cardmove.out"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->mHeadCommander:Ljava/lang/String;

    .line 53
    return-void
.end method

.method private checkFullNullParam(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 343
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 344
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 345
    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 346
    const/4 v0, 0x1

    invoke-static {p4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 347
    const/4 v0, 0x1

    invoke-static {p5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 348
    const/4 v0, 0x1

    invoke-static {p6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 349
    const/4 v0, 0x1

    invoke-static {p7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 350
    const/4 v0, 0x1

    invoke-static {p8, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 352
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 354
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private checkNullParam(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 329
    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 330
    const/4 v0, 0x1

    invoke-static {p2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 331
    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 332
    const/4 v0, 0x1

    invoke-static {p4, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 333
    const/4 v0, 0x1

    invoke-static {p5, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 334
    const/4 v0, 0x1

    invoke-static {p6, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 336
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 338
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 153
    if-nez p1, :cond_0

    .line 155
    const-string v0, "ServerAccessTransferOutTask createDataStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 156
    const/4 v0, 0x0

    return-object v0

    .line 159
    :cond_0
    const/4 v2, 0x0

    .line 162
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 163
    const-string v0, "header"

    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 165
    const-string v0, "eventid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getEventId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 166
    const-string v0, "issuerid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    const-string v0, "cplc"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getCplc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    const-string v0, "appletAid"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 169
    const-string v0, "seChipManuFacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 170
    const-string v0, "deviceModel"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 171
    const-string v0, "cardNo"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getCardId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 173
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getBalance()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 175
    const-string v0, "balance"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getBalance()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    const-string v0, "cardBalance"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getBalance()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 179
    :cond_1
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getOrderId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 181
    const-string v0, "orderNo"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 184
    :cond_2
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getTransferVerifyFlag()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 186
    const-string v0, "flag"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getTransferVerifyFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    :cond_3
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSn()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 192
    const-string v0, "imei"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    const-string v0, "sn"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSn()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 196
    :cond_4
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 198
    const-string v0, "phoneNumber"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPhoneNumber()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    :cond_5
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 203
    const-string v0, "phoneManufacturer"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 206
    :cond_6
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_7

    .line 208
    const-string v0, "reserved"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getReserved()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 211
    :cond_7
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getExtend()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_8

    .line 213
    const-string v0, "extend"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getExtend()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    :cond_8
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_9

    .line 218
    const-string v0, "appCode"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 220
    :cond_9
    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_a

    .line 222
    const-string v0, "partnerId"

    invoke-virtual {p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 233
    :cond_a
    goto :goto_0

    .line 229
    :catch_0
    move-exception v3

    .line 231
    const-string v0, "ServerAccessTransferOutTask createDataStr, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 232
    const/4 v2, 0x0

    .line 235
    :goto_0
    return-object v2
.end method

.method private reportRequestMessage(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Lorg/json/JSONObject;
    .locals 4

    .line 97
    const/4 v2, 0x0

    .line 100
    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 101
    const-string v0, "srcTransactionID"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 102
    const-string v0, "eventid"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getEventId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    const-string v0, "issuerid"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 104
    const-string v0, "appletAid"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 105
    const-string v0, "seChipManuFacturer"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 106
    const-string v0, "deviceModel"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 108
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getOrderId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 110
    const-string v0, "orderNo"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getOrderId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getTransferVerifyFlag()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 115
    const-string v0, "flag"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getTransferVerifyFlag()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 118
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 120
    const-string v0, "phoneManufacturer"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPhoneManufacturer()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 123
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getReserved()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 125
    const-string v0, "reserved"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getReserved()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 128
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getExtend()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 130
    const-string v0, "extend"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getExtend()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppCode()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_5

    .line 135
    const-string v0, "appCode"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_6

    .line 139
    const-string v0, "partnerId"

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getPartnerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    :cond_6
    goto :goto_0

    .line 142
    :catch_0
    move-exception v3

    .line 144
    const-string v0, "ServerAccessTransferOutTask reportRequestMessage, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 145
    const/4 v2, 0x0

    .line 148
    :goto_0
    return-object v2
.end method


# virtual methods
.method protected prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Ljava/lang/String;
    .locals 12

    .line 58
    if-nez p1, :cond_0

    .line 60
    const-string v0, "ServerAccessTransferOutTask prepareRequestStr, invalid param"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 65
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getTransferVerifyFlag()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getTransferVerifyFlag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 67
    move-object v0, p0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getCplc()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getCardId()Ljava/lang/String;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->checkNullParam(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 69
    const-string v0, "ServerAccessTransferOutTask prepareRequestStr, invalid param check"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 70
    const/4 v0, 0x0

    return-object v0

    .line 75
    :cond_1
    move-object v0, p0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getEventId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getIssuerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getCplc()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getAppletAid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSeChipManuFacturer()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getDeviceModel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getCardId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getBalance()Ljava/lang/String;

    move-result-object v8

    invoke-direct/range {v0 .. v8}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->checkFullNullParam(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 77
    const-string v0, "ServerAccessTransferOutTask prepareRequestStr, invalid full param check"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 78
    const/4 v0, 0x0

    return-object v0

    .line 83
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getSrcTransactionID()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->mHeadCommander:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getIsNeedServiceTokenAuth()Z

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createHeaderStr(Ljava/lang/String;Ljava/lang/String;Z)Lorg/json/JSONObject;

    move-result-object v9

    .line 86
    invoke-direct {p0, v9, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->createDataStr(Lorg/json/JSONObject;Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Lorg/json/JSONObject;

    move-result-object v10

    .line 88
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->reportRequestMessage(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Lorg/json/JSONObject;

    move-result-object v11

    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessTransferOutTask prepareRequestStr, commander= cardmove.out reportRequestMessageJson= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getMerchantID()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;->getRsaKeyIndex()I

    move-result v1

    iget-object v2, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->mContext:Landroid/content/Context;

    invoke-static {v0, v1, v10, v2}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->createRequestStr(Ljava/lang/String;ILorg/json/JSONObject;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic prepareRequestStr(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 20
    move-object v0, p1

    check-cast v0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;

    invoke-virtual {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->prepareRequestStr(Lcom/huawei/nfc/carrera/server/card/request/ServerAccessTransferOutRequest;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;
    .locals 3

    .line 241
    new-instance v2, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;-><init>()V

    .line 242
    iput p1, v2, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->returnCode:I

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessTransferOutTask readErrorResponse, commander= cardmove.out errorCode= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 244
    return-object v2
.end method

.method public bridge synthetic readErrorResponse(I)Ljava/lang/Object;
    .locals 1

    .line 20
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->readErrorResponse(I)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;

    move-result-object v0

    return-object v0
.end method

.method protected readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;
    .locals 10

    .line 250
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 251
    new-instance v3, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;

    invoke-direct {v3}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;-><init>()V

    .line 252
    iput p1, v3, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->returnCode:I

    .line 253
    invoke-virtual {v3, p2}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->setResultDesc(Ljava/lang/String;)V

    .line 275
    const/4 v0, 0x0

    if-ne v0, p1, :cond_5

    .line 279
    const-string v0, "transactionid"

    :try_start_0
    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->setTransactionId(Ljava/lang/String;)V

    .line 280
    const-string v0, " transactionid="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "transactionid"

    invoke-static {p3, v1}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    const/4 v4, 0x0

    .line 288
    const-string v0, "apduList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    const-string v0, "apduList"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 292
    :cond_0
    const-string v0, "nextStep"

    invoke-virtual {p3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 294
    const-string v0, "nextStep"

    invoke-static {p3, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->setNextStep(Ljava/lang/String;)V

    .line 295
    const-string v0, " nextStep="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "nextStep"

    invoke-static {p3, v1}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v4, :cond_4

    .line 299
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 300
    const/4 v6, 0x0

    .line 301
    const/4 v7, 0x0

    .line 302
    const/4 v8, 0x0

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v9

    :goto_0
    if-ge v8, v9, :cond_3

    .line 304
    invoke-virtual {v4, v8}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    .line 305
    invoke-static {v7}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    move-result-object v6

    .line 306
    const/4 v0, 0x0

    if-eq v0, v6, :cond_2

    .line 308
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 302
    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 311
    :cond_3
    invoke-virtual {v3, v5}, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->setApduList(Ljava/util/List;)V

    .line 312
    const-string v0, " apduList="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 319
    :cond_4
    goto :goto_1

    .line 315
    :catch_0
    move-exception v4

    .line 317
    const-string v0, "ServerAccessTransferOutTask readSuccessResponse, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 318
    const/16 v0, -0x63

    iput v0, v3, Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;->returnCode:I

    .line 322
    :cond_5
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ServerAccessTransferOutTask readSuccessResponse, commander= cardmove.out returnCode= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " returnDesc= "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " dataObject: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->i(Ljava/lang/String;)V

    .line 323
    return-object v3
.end method

.method public bridge synthetic readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    .line 20
    invoke-virtual {p0, p1, p2, p3}, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->readSuccessResponse(ILjava/lang/String;Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/response/ServerAccessTransferOutResponse;

    move-result-object v0

    return-object v0
.end method

.method public setHeadCommander(Ljava/lang/String;)V
    .locals 0

    .line 46
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/impl/ServerAccessTransferOutTask;->mHeadCommander:Ljava/lang/String;

    .line 47
    return-void
.end method
