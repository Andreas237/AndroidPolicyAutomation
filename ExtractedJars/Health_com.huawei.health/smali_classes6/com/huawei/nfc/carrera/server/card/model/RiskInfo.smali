.class public Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final APPLAY_CHANEL:Ljava/lang/String; = "01"

.field private static final DEVICE_WATCH:Ljava/lang/String; = "3"

.field private static final KEY_ACCOUNTID_HASH:Ljava/lang/String; = "accountIDHash"

.field private static final KEY_APPLAY_CHANNEL:Ljava/lang/String; = "applyChannel"

.field private static final KEY_CAPTUREMETHOD:Ljava/lang/String; = "captureMethod"

.field private static final KEY_DEVICENUMBER:Ljava/lang/String; = "deviceNumber"

.field private static final KEY_DEVICETYPE:Ljava/lang/String; = "deviceType"

.field private static final KEY_LANGUAGE:Ljava/lang/String; = "deviceLanguage"

.field private static final KEY_LOCATION:Ljava/lang/String; = "extensiveDeviceLocation"

.field private static final KEY_SIM_NUMBER:Ljava/lang/String; = "deviceSIMNumber"


# instance fields
.field private accountIDHash:Ljava/lang/String;

.field private applyChannel:Ljava/lang/String;

.field private captureMethod:Ljava/lang/String;

.field private deviceLanguage:Ljava/lang/String;

.field private devieceType:Ljava/lang/String;

.field private extensiveDeviceLocation:Ljava/lang/String;

.field private number:Ljava/lang/String;

.field private simCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    const-string v0, "3"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->devieceType:Ljava/lang/String;

    .line 48
    const-string v0, "01"

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->applyChannel:Ljava/lang/String;

    .line 118
    iput-object p2, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->captureMethod:Ljava/lang/String;

    .line 119
    iput-object p3, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->extensiveDeviceLocation:Ljava/lang/String;

    .line 122
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getISO3Language()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->deviceLanguage:Ljava/lang/String;

    .line 125
    invoke-direct {p0, p1}, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->getPhoneNum(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 126
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 128
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->number:Ljava/lang/String;

    .line 130
    :cond_0
    const/4 v3, 0x0

    .line 131
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/nfc/PluginPay;->getInstance(Landroid/content/Context;)Lcom/huawei/nfc/PluginPay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/nfc/PluginPay;->getAdapter()Lo/eab;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/nfc/PluginPayAdapter;

    .line 132
    const/4 v0, 0x0

    if-eq v0, v4, :cond_1

    .line 133
    invoke-interface {v4}, Lcom/huawei/nfc/PluginPayAdapter;->getUserID()Ljava/lang/String;

    move-result-object v3

    .line 136
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 139
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->accountIDHash:Ljava/lang/String;

    .line 142
    :cond_2
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 144
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->simCount:I

    goto :goto_0

    .line 148
    :cond_3
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->simCount:I

    .line 151
    :goto_0
    return-void
.end method

.method private getPhoneNum(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 192
    const/4 v2, 0x0

    .line 193
    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/telephony/TelephonyManager;

    .line 194
    if-eqz v3, :cond_1

    .line 197
    const-string v0, "android.permission.READ_PHONE_STATE"

    invoke-static {p1, v0}, Lo/dsy;->e(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 203
    :cond_0
    const-string v0, "PhoneDeviceUtil getDeviceID , wallet has no READ_PHONE_STATE permission"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;Z)V

    .line 207
    :cond_1
    :goto_0
    return-object v2
.end method


# virtual methods
.method public toJasonString()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 155
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 156
    const-string v0, "deviceType"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->devieceType:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 157
    const-string v0, "applyChannel"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->applyChannel:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 158
    const-string v0, "deviceSIMNumber"

    iget v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->simCount:I

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 159
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->deviceLanguage:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 161
    const-string v0, "deviceLanguage"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->deviceLanguage:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    :cond_0
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->extensiveDeviceLocation:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_1

    .line 165
    const-string v0, "extensiveDeviceLocation"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->extensiveDeviceLocation:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    :cond_1
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->accountIDHash:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    .line 170
    const-string v0, "accountIDHash"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->accountIDHash:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 172
    :cond_2
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->number:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_3

    .line 174
    const-string v0, "deviceNumber"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->number:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 176
    :cond_3
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->captureMethod:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_4

    .line 178
    const-string v0, "captureMethod"

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/RiskInfo;->captureMethod:Ljava/lang/String;

    invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 180
    :cond_4
    return-object v2
.end method
