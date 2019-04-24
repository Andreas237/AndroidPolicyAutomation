.class public Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final KEY_APP_ID:Ljava/lang/String; = "appid"

.field static final KEY_NONCE_STR:Ljava/lang/String; = "noncestr"

.field static final KEY_PACKAGE_VALUE:Ljava/lang/String; = "packageValue"

.field static final KEY_PARTNER_ID:Ljava/lang/String; = "partnerid"

.field static final KEY_PREPAY_ID:Ljava/lang/String; = "prepayid"

.field static final KEY_SIGN:Ljava/lang/String; = "sign"

.field static final KEY_TIME_STAMP:Ljava/lang/String; = "timestamp"


# instance fields
.field private appId:Ljava/lang/String;

.field private nonceStr:Ljava/lang/String;

.field private packageValue:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private prepayId:Ljava/lang/String;

.field private sign:Ljava/lang/String;

.field private timeStamp:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;
    .locals 4

    .line 49
    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 51
    const/4 v0, 0x0

    return-object v0

    .line 54
    :cond_0
    new-instance v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;

    invoke-direct {v2}, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;-><init>()V

    .line 57
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 58
    const-string v0, "appid"

    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->appId:Ljava/lang/String;

    .line 59
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->appId:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    .line 61
    const/4 v0, 0x0

    return-object v0

    .line 63
    :cond_1
    const-string v0, "noncestr"

    :try_start_1
    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->nonceStr:Ljava/lang/String;

    .line 64
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->nonceStr:Ljava/lang/String;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    if-nez v0, :cond_2

    .line 66
    const/4 v0, 0x0

    return-object v0

    .line 68
    :cond_2
    const-string v0, "packageValue"

    :try_start_2
    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->packageValue:Ljava/lang/String;

    .line 69
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->packageValue:Ljava/lang/String;
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    if-nez v0, :cond_3

    .line 71
    const/4 v0, 0x0

    return-object v0

    .line 73
    :cond_3
    const-string v0, "prepayid"

    :try_start_3
    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->prepayId:Ljava/lang/String;

    .line 74
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->prepayId:Ljava/lang/String;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_0

    if-nez v0, :cond_4

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 78
    :cond_4
    const-string v0, "sign"

    :try_start_4
    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->sign:Ljava/lang/String;

    .line 79
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->sign:Ljava/lang/String;
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_0

    if-nez v0, :cond_5

    .line 81
    const/4 v0, 0x0

    return-object v0

    .line 83
    :cond_5
    const-string v0, "timestamp"

    :try_start_5
    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->timeStamp:Ljava/lang/String;

    .line 84
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->timeStamp:Ljava/lang/String;
    :try_end_5
    .catch Lorg/json/JSONException; {:try_start_5 .. :try_end_5} :catch_0

    if-nez v0, :cond_6

    .line 86
    const/4 v0, 0x0

    return-object v0

    .line 88
    :cond_6
    const-string v0, "partnerid"

    :try_start_6
    invoke-static {v3, v0}, Lcom/huawei/nfc/carrera/util/json/JsonUtil;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->partnerId:Ljava/lang/String;

    .line 89
    iget-object v0, v2, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->partnerId:Ljava/lang/String;
    :try_end_6
    .catch Lorg/json/JSONException; {:try_start_6 .. :try_end_6} :catch_0

    if-nez v0, :cond_7

    .line 91
    const/4 v0, 0x0

    return-object v0

    .line 98
    :cond_7
    goto :goto_0

    .line 94
    :catch_0
    move-exception v3

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PayInfo, JSONException"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v3}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;Z)V

    .line 97
    const/4 v0, 0x0

    return-object v0

    .line 100
    :goto_0
    return-object v2
.end method


# virtual methods
.method public getAppId()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getNonceStr()Ljava/lang/String;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->nonceStr:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageValue()Ljava/lang/String;
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->packageValue:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->partnerId:Ljava/lang/String;

    return-object v0
.end method

.method public getPrepayId()Ljava/lang/String;
    .locals 1

    .line 135
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->prepayId:Ljava/lang/String;

    return-object v0
.end method

.method public getSign()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->sign:Ljava/lang/String;

    return-object v0
.end method

.method public getTimeStamp()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->timeStamp:Ljava/lang/String;

    return-object v0
.end method

.method public setAppId(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->appId:Ljava/lang/String;

    .line 111
    return-void
.end method

.method public setNonceStr(Ljava/lang/String;)V
    .locals 0

    .line 120
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->nonceStr:Ljava/lang/String;

    .line 121
    return-void
.end method

.method public setPackageValue(Ljava/lang/String;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->packageValue:Ljava/lang/String;

    .line 131
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->partnerId:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public setPrepayId(Ljava/lang/String;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->prepayId:Ljava/lang/String;

    .line 141
    return-void
.end method

.method public setSign(Ljava/lang/String;)V
    .locals 0

    .line 150
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->sign:Ljava/lang/String;

    .line 151
    return-void
.end method

.method public setTimeStamp(Ljava/lang/String;)V
    .locals 0

    .line 160
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/wxpay/WXPayInfo;->timeStamp:Ljava/lang/String;

    .line 161
    return-void
.end method
