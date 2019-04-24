.class public Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private amountRecharge:Ljava/lang/String;

.field private denomination:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->denomination:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->amountRecharge:Ljava/lang/String;

    return-void
.end method

.method public static buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;
    .locals 3

    .line 54
    if-nez p0, :cond_0

    .line 56
    const/4 v0, 0x0

    return-object v0

    .line 58
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;-><init>()V

    .line 61
    const-string v0, "denomination"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->denomination:Ljava/lang/String;

    .line 62
    const-string v0, "amountRecharge"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->amountRecharge:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    goto :goto_0

    .line 64
    :catch_0
    move-exception v2

    .line 66
    const-string v0, "ServerAccessRechargeAmount buildFromJson, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 67
    const/4 v1, 0x0

    .line 70
    :goto_0
    return-object v1
.end method


# virtual methods
.method public getAmountRecharge()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->amountRecharge:Ljava/lang/String;

    return-object v0
.end method

.method public getDenomination()Ljava/lang/String;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->denomination:Ljava/lang/String;

    return-object v0
.end method

.method public setAmountRecharge(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->amountRecharge:Ljava/lang/String;

    .line 50
    return-void
.end method

.method public setDenomination(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessRechargeAmount;->denomination:Ljava/lang/String;

    .line 40
    return-void
.end method
