.class Lio/branch/referral/DeviceInfo;
.super Ljava/lang/Object;
.source "DeviceInfo.java"


# static fields
.field private static thisInstance_:Lio/branch/referral/DeviceInfo;


# instance fields
.field private final UIMode_:Ljava/lang/String;

.field private final appVersion_:Ljava/lang/String;

.field private final brandName_:Ljava/lang/String;

.field private final countryCode_:Ljava/lang/String;

.field private final hardwareID_:Ljava/lang/String;

.field private final isHardwareIDReal_:Z

.field private final isWifiConnected_:Z

.field private final languageCode_:Ljava/lang/String;

.field private final localIpAddr_:Ljava/lang/String;

.field private final modelName_:Ljava/lang/String;

.field private final osName_:Ljava/lang/String;

.field private final osVersion_:I

.field private final packageName_:Ljava/lang/String;

.field private final screenDensity_:I

.field private final screenHeight_:I

.field private final screenWidth_:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(ZLio/branch/referral/SystemObserver;Z)V
    .locals 0

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    .line 101
    invoke-virtual {p2, p1}, Lio/branch/referral/SystemObserver;->getUniqueID(Z)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    goto :goto_0

    .line 103
    :cond_0
    invoke-virtual {p2, p1}, Lio/branch/referral/SystemObserver;->getUniqueID(Z)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    .line 105
    :goto_0
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->hasRealHardwareId()Z

    move-result p1

    iput-boolean p1, p0, Lio/branch/referral/DeviceInfo;->isHardwareIDReal_:Z

    .line 106
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getPhoneBrand()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->brandName_:Ljava/lang/String;

    .line 107
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getPhoneModel()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->modelName_:Ljava/lang/String;

    .line 109
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getScreenDisplay()Landroid/util/DisplayMetrics;

    move-result-object p1

    .line 110
    iget p3, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    iput p3, p0, Lio/branch/referral/DeviceInfo;->screenDensity_:I

    .line 111
    iget p3, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    iput p3, p0, Lio/branch/referral/DeviceInfo;->screenHeight_:I

    .line 112
    iget p1, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    iput p1, p0, Lio/branch/referral/DeviceInfo;->screenWidth_:I

    .line 114
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getWifiConnected()Z

    move-result p1

    iput-boolean p1, p0, Lio/branch/referral/DeviceInfo;->isWifiConnected_:Z

    .line 115
    invoke-static {}, Lio/branch/referral/SystemObserver;->getLocalIPAddress()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->localIpAddr_:Ljava/lang/String;

    .line 117
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getOS()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->osName_:Ljava/lang/String;

    .line 118
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getOSVersion()I

    move-result p1

    iput p1, p0, Lio/branch/referral/DeviceInfo;->osVersion_:I

    .line 120
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getPackageName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->packageName_:Ljava/lang/String;

    .line 121
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getAppVersion()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->appVersion_:Ljava/lang/String;

    .line 122
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getISO2CountryCode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->countryCode_:Ljava/lang/String;

    .line 123
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getISO2LanguageCode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->languageCode_:Ljava/lang/String;

    .line 125
    invoke-virtual {p2}, Lio/branch/referral/SystemObserver;->getUIMode()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lio/branch/referral/DeviceInfo;->UIMode_:Ljava/lang/String;

    return-void
.end method

.method private getDefaultBrowserAgent(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    .line 255
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_0

    .line 257
    :try_start_0
    invoke-static {p1}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v0
.end method

.method public static getInstance()Lio/branch/referral/DeviceInfo;
    .locals 1

    .line 95
    sget-object v0, Lio/branch/referral/DeviceInfo;->thisInstance_:Lio/branch/referral/DeviceInfo;

    return-object v0
.end method

.method public static getInstance(ZLio/branch/referral/SystemObserver;Z)Lio/branch/referral/DeviceInfo;
    .locals 1

    .line 83
    sget-object v0, Lio/branch/referral/DeviceInfo;->thisInstance_:Lio/branch/referral/DeviceInfo;

    if-nez v0, :cond_0

    .line 84
    new-instance v0, Lio/branch/referral/DeviceInfo;

    invoke-direct {v0, p0, p1, p2}, Lio/branch/referral/DeviceInfo;-><init>(ZLio/branch/referral/SystemObserver;Z)V

    sput-object v0, Lio/branch/referral/DeviceInfo;->thisInstance_:Lio/branch/referral/DeviceInfo;

    .line 86
    :cond_0
    sget-object p0, Lio/branch/referral/DeviceInfo;->thisInstance_:Lio/branch/referral/DeviceInfo;

    return-object p0
.end method


# virtual methods
.method public getAppVersion()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->appVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public getHardwareID()Ljava/lang/String;
    .locals 2

    .line 245
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    :goto_0
    return-object v0
.end method

.method public getOsName()Ljava/lang/String;
    .locals 1

    .line 249
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->osName_:Ljava/lang/String;

    return-object v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 228
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->packageName_:Ljava/lang/String;

    return-object v0
.end method

.method public isHardwareIDReal()Z
    .locals 1

    .line 241
    iget-boolean v0, p0, Lio/branch/referral/DeviceInfo;->isHardwareIDReal_:Z

    return v0
.end method

.method public updateRequestWithDeviceParams(Lorg/json/JSONObject;)V
    .locals 2

    .line 135
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->HardwareID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->IsHardwareIDReal:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lio/branch/referral/DeviceInfo;->isHardwareIDReal_:Z

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 139
    :cond_0
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->brandName_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 140
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Brand:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->brandName_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 142
    :cond_1
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->modelName_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 143
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Model:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->modelName_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 146
    :cond_2
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ScreenDpi:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->screenDensity_:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 147
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ScreenHeight:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->screenHeight_:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 148
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ScreenWidth:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->screenWidth_:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 149
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->WiFi:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lio/branch/referral/DeviceInfo;->isWifiConnected_:Z

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 150
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->UIMode:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->UIMode_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 152
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->osName_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 153
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->OS:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->osName_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    :cond_3
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->OSVersion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->osVersion_:I

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 156
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->countryCode_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 157
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Country:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->countryCode_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    :cond_4
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->languageCode_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 160
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Language:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->languageCode_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 162
    :cond_5
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->localIpAddr_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 163
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->LocalIP:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->localIpAddr_:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_6
    return-void
.end method

.method public updateRequestWithUserData(Landroid/content/Context;Lio/branch/referral/PrefHelper;Lorg/json/JSONObject;)V
    .locals 2

    .line 178
    :try_start_0
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lio/branch/referral/DeviceInfo;->isHardwareIDReal_:Z

    if-eqz v0, :cond_0

    .line 179
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->AndroidID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->hardwareID_:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 181
    :cond_0
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->UnidentifiedDevice:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 184
    :goto_0
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->brandName_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 185
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Brand:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->brandName_:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 187
    :cond_1
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->modelName_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 188
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Model:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->modelName_:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    :cond_2
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ScreenDpi:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->screenDensity_:I

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 191
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ScreenHeight:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->screenHeight_:I

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 192
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->ScreenWidth:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->screenWidth_:I

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 194
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->osName_:Ljava/lang/String;

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 195
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->OS:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->osName_:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 197
    :cond_3
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->OSVersion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lio/branch/referral/DeviceInfo;->osVersion_:I

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 198
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->countryCode_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 199
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Country:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->countryCode_:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    :cond_4
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->languageCode_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 202
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->Language:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->languageCode_:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 204
    :cond_5
    iget-object v0, p0, Lio/branch/referral/DeviceInfo;->localIpAddr_:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 205
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->LocalIP:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/branch/referral/DeviceInfo;->localIpAddr_:Ljava/lang/String;

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    if-eqz p2, :cond_7

    .line 207
    invoke-virtual {p2}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v0

    const-string v1, "bnc_no_value"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 208
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->DeviceFingerprintID:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/branch/referral/PrefHelper;->getDeviceFingerPrintID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 210
    :cond_7
    invoke-virtual {p2}, Lio/branch/referral/PrefHelper;->getIdentity()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    const-string v1, "bnc_no_value"

    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 212
    sget-object v0, Lio/branch/referral/Defines$Jsonkey;->DeveloperIdentity:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {v0}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lio/branch/referral/PrefHelper;->getIdentity()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 214
    :cond_8
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->AppVersion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lio/branch/referral/DeviceInfo;->getInstance()Lio/branch/referral/DeviceInfo;

    move-result-object v0

    invoke-virtual {v0}, Lio/branch/referral/DeviceInfo;->getAppVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 215
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->SDK:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    const-string v0, "android"

    invoke-virtual {p3, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 216
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->SdkVersion:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    const-string v0, "2.19.5"

    invoke-virtual {p3, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 217
    sget-object p2, Lio/branch/referral/Defines$Jsonkey;->UserAgent:Lio/branch/referral/Defines$Jsonkey;

    invoke-virtual {p2}, Lio/branch/referral/Defines$Jsonkey;->getKey()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p1}, Lio/branch/referral/DeviceInfo;->getDefaultBrowserAgent(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
