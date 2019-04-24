.class public Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final CARD_INSTALL_STATUS:Ljava/lang/String; = "1"

.field public static final CARD_UNINSTALL_STATUS:Ljava/lang/String; = "0"

.field public static final CARD_VALIDITY_DATE_STATUS_AFTER:I = 0x2

.field public static final CARD_VALIDITY_DATE_STATUS_BEFORE:I = 0x1

.field public static final CARD_VALIDITY_DATE_STATUS_NORMAL:I = 0x0

.field public static final CARD_VALIDITY_DATE_STATUS_UNKNOWN:I = -0x1

.field private static final TAG:Ljava/lang/String; = "TrafficCardInfo"


# instance fields
.field private activationStatus:Ljava/lang/String;

.field private balance:Ljava/lang/String;

.field private cardNo:Ljava/lang/String;

.field private expireDate:Ljava/lang/String;

.field private installStatus:Ljava/lang/String;

.field private startdate:Ljava/lang/String;

.field private validityTermStatus:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static build(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 77
    new-instance v4, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;

    invoke-direct {v4}, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;-><init>()V

    .line 80
    :try_start_0
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 81
    const-string v0, "card_number"

    invoke-static {v5, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->cardNo:Ljava/lang/String;

    .line 82
    const-string v0, "balance"

    invoke-static {v5, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->balance:Ljava/lang/String;

    .line 83
    const-string v0, "validity"

    invoke-static {v5, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->expireDate:Ljava/lang/String;

    .line 84
    const-string v0, "activation_status"

    invoke-static {v5, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->activationStatus:Ljava/lang/String;

    .line 85
    const-string v0, "install_status"

    invoke-static {v5, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->installStatus:Ljava/lang/String;

    .line 86
    const-string v0, "startdate"

    invoke-static {v5, v0}, Lcom/huawei/nfc/util/JSONHelperNotEncrypted;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->startdate:Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    return-object v4

    .line 88
    :catch_0
    move-exception v6

    .line 89
    const-string v0, "TrafficCardInfo"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "TrafficCardInfo build JSONException e : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-object v4
.end method


# virtual methods
.method public getActivationStatus()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->activationStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getBalance()Ljava/lang/String;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->balance:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCardNo()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->cardNo:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getExpireDate()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->expireDate:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getInstallStatus()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->installStatus:Ljava/lang/String;

    return-object v0
.end method

.method public getStartdate()Ljava/lang/String;
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->startdate:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getValidityTermStatus()I
    .locals 1

    .line 106
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->validityTermStatus:I

    return v0
.end method

.method public setActivationStatus(Ljava/lang/String;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->activationStatus:Ljava/lang/String;

    .line 140
    return-void
.end method

.method public setBalance(Ljava/lang/String;)V
    .locals 1

    .line 127
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->balance:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public setCardNo(Ljava/lang/String;)V
    .locals 1

    .line 123
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->cardNo:Ljava/lang/String;

    .line 124
    return-void
.end method

.method public setExpireDate(Ljava/lang/String;)V
    .locals 1

    .line 131
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->expireDate:Ljava/lang/String;

    .line 132
    return-void
.end method

.method public setInstallStatus(Ljava/lang/String;)V
    .locals 0

    .line 143
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->installStatus:Ljava/lang/String;

    .line 144
    return-void
.end method

.method public setStartdate(Ljava/lang/String;)V
    .locals 1

    .line 147
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->startdate:Ljava/lang/String;

    .line 148
    return-void
.end method

.method public setValidityTermStatus(I)V
    .locals 1

    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/ese/model/TrafficCardInfo;->validityTermStatus:I

    .line 136
    return-void
.end method
