.class public Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final TYPE_CONSUME:Ljava/lang/String; = "2"

.field public static final TYPE_RECHARGE:Ljava/lang/String; = "1"


# instance fields
.field private amount:Ljava/lang/String;

.field private status:Ljava/lang/String;

.field private time:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 90
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->amount:Ljava/lang/String;

    .line 96
    iput-object p2, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->type:Ljava/lang/String;

    .line 97
    iput-object p3, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->time:Ljava/lang/String;

    .line 98
    return-void
.end method

.method public static build(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 101
    new-instance v4, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;-><init>()V

    .line 103
    const-string v0, "transaction_amount"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->amount:Ljava/lang/String;

    .line 104
    const-string v0, "transaction_time"

    invoke-static {p0, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->time:Ljava/lang/String;

    .line 105
    const-string v0, "transaction_type"

    invoke-static {p0, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->type:Ljava/lang/String;

    .line 106
    const-string v0, "transaction_status"

    invoke-static {p0, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->status:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 110
    goto :goto_0

    .line 107
    :catch_0
    move-exception v5

    .line 108
    const-string v0, "TradeRecord"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "TradeRecord build JSONException"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    throw v5

    .line 111
    :goto_0
    return-object v4
.end method


# virtual methods
.method public getAmount()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->amount:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->time:Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setAmount(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->amount:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public setStatus(Ljava/lang/String;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->status:Ljava/lang/String;

    .line 46
    return-void
.end method

.method public setTime(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->time:Ljava/lang/String;

    .line 42
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TradeRecord;->type:Ljava/lang/String;

    .line 38
    return-void
.end method
