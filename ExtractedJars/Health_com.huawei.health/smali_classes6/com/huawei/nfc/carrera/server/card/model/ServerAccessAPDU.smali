.class public Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private apduContent:Ljava/lang/String;

.field private apduId:Ljava/lang/String;

.field private apduStatus:Ljava/lang/String;

.field private checker:Ljava/lang/String;

.field private command:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduId:Ljava/lang/String;

    .line 31
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduContent:Ljava/lang/String;

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduStatus:Ljava/lang/String;

    return-void
.end method

.method public static buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;
    .locals 3

    .line 83
    if-nez p0, :cond_0

    .line 85
    const/4 v0, 0x0

    return-object v0

    .line 87
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;-><init>()V

    .line 90
    const-string v0, "apduNo"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduId:Ljava/lang/String;

    .line 91
    const-string v0, "apduContent"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduContent:Ljava/lang/String;

    .line 92
    const-string v0, "apduStatus"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduStatus:Ljava/lang/String;

    .line 93
    const-string v0, "command"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->command:Ljava/lang/String;

    .line 94
    const-string v0, "checker"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->checker:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    goto :goto_0

    .line 96
    :catch_0
    move-exception v2

    .line 98
    const-string v0, "ServerAccessAPDU buildFromJson, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 99
    const/4 v1, 0x0

    .line 102
    :goto_0
    return-object v1
.end method


# virtual methods
.method public getApduContent()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduContent:Ljava/lang/String;

    return-object v0
.end method

.method public getApduId()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduId:Ljava/lang/String;

    return-object v0
.end method

.method public getApduStatus()Ljava/lang/String;
    .locals 1

    .line 73
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getChecker()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->checker:Ljava/lang/String;

    return-object v0
.end method

.method public getCommand()Ljava/lang/String;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->command:Ljava/lang/String;

    return-object v0
.end method

.method public setApduContent(Ljava/lang/String;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduContent:Ljava/lang/String;

    .line 69
    return-void
.end method

.method public setApduId(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduId:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public setApduStatus(Ljava/lang/String;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->apduStatus:Ljava/lang/String;

    .line 79
    return-void
.end method

.method public setChecker(Ljava/lang/String;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->checker:Ljava/lang/String;

    .line 119
    return-void
.end method

.method public setCommand(Ljava/lang/String;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessAPDU;->command:Ljava/lang/String;

    .line 111
    return-void
.end method
