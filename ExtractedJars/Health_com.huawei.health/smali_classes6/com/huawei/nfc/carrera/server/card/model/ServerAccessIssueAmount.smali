.class public Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private amountEnroll:Ljava/lang/String;

.field private amountRecharge:Ljava/lang/String;

.field private denomination:Ljava/lang/String;

.field private priceEnroll:Ljava/lang/String;

.field private priceRecharge:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->denomination:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceEnroll:Ljava/lang/String;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountEnroll:Ljava/lang/String;

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceRecharge:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountRecharge:Ljava/lang/String;

    return-void
.end method

.method public static buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;
    .locals 3

    .line 99
    if-nez p0, :cond_0

    .line 101
    const/4 v0, 0x0

    return-object v0

    .line 103
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;-><init>()V

    .line 106
    const-string v0, "denomination"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->denomination:Ljava/lang/String;

    .line 107
    const-string v0, "priceRecharge"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceRecharge:Ljava/lang/String;

    .line 108
    const-string v0, "amountRecharge"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountRecharge:Ljava/lang/String;

    .line 109
    const-string v0, "priceEnroll"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceEnroll:Ljava/lang/String;

    .line 110
    const-string v0, "amountEnroll"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountEnroll:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    goto :goto_0

    .line 112
    :catch_0
    move-exception v2

    .line 114
    const-string v0, "ServerAccessIssueAmount buildFromJson, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 115
    const/4 v1, 0x0

    .line 118
    :goto_0
    return-object v1
.end method


# virtual methods
.method public getAmountEnroll()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountEnroll:Ljava/lang/String;

    return-object v0
.end method

.method public getAmountRecharge()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountRecharge:Ljava/lang/String;

    return-object v0
.end method

.method public getDenomination()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->denomination:Ljava/lang/String;

    return-object v0
.end method

.method public getPriceEnroll()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceEnroll:Ljava/lang/String;

    return-object v0
.end method

.method public getPriceRecharge()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceRecharge:Ljava/lang/String;

    return-object v0
.end method

.method public setAmountEnroll(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountEnroll:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public setAmountRecharge(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->amountRecharge:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setDenomination(Ljava/lang/String;)V
    .locals 0

    .line 54
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->denomination:Ljava/lang/String;

    .line 55
    return-void
.end method

.method public setPriceEnroll(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceEnroll:Ljava/lang/String;

    .line 65
    return-void
.end method

.method public setPriceRecharge(Ljava/lang/String;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessIssueAmount;->priceRecharge:Ljava/lang/String;

    .line 85
    return-void
.end method
