.class public Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final KEY_CARD_PRO_ID:Ljava/lang/String; = "cardProductId"

.field private static final KEY_CARD_REF_ID:Ljava/lang/String; = "cardReferenceId"

.field private static final KEY_LAST_DIGITS:Ljava/lang/String; = "lastDigits"


# instance fields
.field private cardProductId:Ljava/lang/String;

.field private cardReferenceId:Ljava/lang/String;

.field private lastDigits:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    const-string v0, "cardReferenceId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardReferenceId:Ljava/lang/String;

    .line 37
    const-string v0, "cardProductId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardProductId:Ljava/lang/String;

    .line 38
    const-string v0, "lastDigits"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->lastDigits:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method public getCardProductId()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardProductId:Ljava/lang/String;

    return-object v0
.end method

.method public getCardReferenceId()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardReferenceId:Ljava/lang/String;

    return-object v0
.end method

.method public getLastDigits()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->lastDigits:Ljava/lang/String;

    return-object v0
.end method

.method public setCardProductId(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardProductId:Ljava/lang/String;

    .line 66
    return-void
.end method

.method public setCardReferenceId(Ljava/lang/String;)V
    .locals 0

    .line 70
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardReferenceId:Ljava/lang/String;

    .line 71
    return-void
.end method

.method public setLastDigits(Ljava/lang/String;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->lastDigits:Ljava/lang/String;

    .line 76
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CardMetadata [cardReferenceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardReferenceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardProductId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->cardProductId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastDigits="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/server/card/model/CardMetadata;->lastDigits:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
