.class public Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ORDER_TYPE_OPEN_CARD:Ljava/lang/String; = "0"

.field public static final ORDER_TYPE_OPEN_CARD_AND_RECHARGE:Ljava/lang/String; = "2"

.field public static final ORDER_TYPE_RECHARGE:Ljava/lang/String; = "1"


# instance fields
.field private amount:Ljava/lang/String;

.field private currency:Ljava/lang/String;

.field private issuerId:Ljava/lang/String;

.field private orderId:Ljava/lang/String;

.field private orderTime:Ljava/lang/String;

.field private orderType:Ljava/lang/String;

.field private status:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderId:Ljava/lang/String;

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderType:Ljava/lang/String;

    .line 50
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->issuerId:Ljava/lang/String;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->status:Ljava/lang/String;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->currency:Ljava/lang/String;

    .line 65
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderTime:Ljava/lang/String;

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->amount:Ljava/lang/String;

    return-void
.end method

.method public static buildFromJson(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;
    .locals 3

    .line 144
    if-nez p0, :cond_0

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;-><init>()V

    .line 151
    const-string v0, "orderNo"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderId:Ljava/lang/String;

    .line 152
    const-string v0, "orderType"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getIntValue(Lorg/json/JSONObject;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderType:Ljava/lang/String;

    .line 153
    const-string v0, "issuerid"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->issuerId:Ljava/lang/String;

    .line 154
    const-string v0, "status"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->status:Ljava/lang/String;

    .line 155
    const-string v0, "amount"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->amount:Ljava/lang/String;

    .line 156
    const-string v0, "orderTime"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderTime:Ljava/lang/String;

    .line 157
    const-string v0, "currency"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->currency:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    goto :goto_0

    .line 159
    :catch_0
    move-exception v2

    .line 161
    const-string v0, "ServerAccessQueryOrder buildFromJson, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 162
    const/4 v1, 0x0

    .line 165
    :goto_0
    return-object v1
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getCurrency()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public getIssuerId()Ljava/lang/String;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->issuerId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderId()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderTime()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderTime:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderType()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderType:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->status:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 99
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->amount:Ljava/lang/String;

    .line 100
    return-void
.end method

.method public setCurrency(Ljava/lang/String;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->currency:Ljava/lang/String;

    .line 80
    return-void
.end method

.method public setIssuerId(Ljava/lang/String;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->issuerId:Ljava/lang/String;

    .line 130
    return-void
.end method

.method public setOrderId(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderId:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setOrderTime(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderTime:Ljava/lang/String;

    .line 90
    return-void
.end method

.method public setOrderType(Ljava/lang/String;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->orderType:Ljava/lang/String;

    .line 120
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/ServerAccessQueryOrder;->status:Ljava/lang/String;

    .line 140
    return-void
.end method
