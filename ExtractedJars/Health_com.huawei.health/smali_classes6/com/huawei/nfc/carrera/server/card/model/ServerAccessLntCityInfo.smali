.class public Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private appCode:Ljava/lang/String;

.field private cityName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static build(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 41
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;-><init>()V

    .line 43
    const-string v0, "app_code"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 45
    const-string v0, "app_code"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->setAppCode(Ljava/lang/String;)V

    .line 47
    :cond_0
    const-string v0, "city_name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 49
    const-string v0, "city_name"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->setCityName(Ljava/lang/String;)V

    .line 52
    :cond_1
    return-object v1
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->appCode:Ljava/lang/String;

    return-object v0
.end method

.method public getCityName()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->cityName:Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->appCode:Ljava/lang/String;

    .line 28
    return-void
.end method

.method public setCityName(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessLntCityInfo;->cityName:Ljava/lang/String;

    .line 36
    return-void
.end method
