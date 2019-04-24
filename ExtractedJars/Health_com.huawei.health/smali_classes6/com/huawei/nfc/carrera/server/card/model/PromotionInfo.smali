.class public Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x5fa0448b6a40174fL


# instance fields
.field private discountType:Ljava/lang/String;

.field private fullCutType:Ljava/lang/String;

.field private payType:Ljava/lang/String;

.field private promotionId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->promotionId:Ljava/lang/String;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->payType:Ljava/lang/String;

    .line 34
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->discountType:Ljava/lang/String;

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->fullCutType:Ljava/lang/String;

    .line 104
    return-void
.end method

.method public static build(Lorg/json/JSONObject;)Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;
    .locals 3

    .line 81
    if-nez p0, :cond_0

    .line 83
    const/4 v0, 0x0

    return-object v0

    .line 85
    :cond_0
    new-instance v1, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;

    invoke-direct {v1}, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;-><init>()V

    .line 88
    const-string v0, "promotionId"

    :try_start_0
    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->setPromotionId(Ljava/lang/String;)V

    .line 89
    const-string v0, "payType"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->setPayType(Ljava/lang/String;)V

    .line 90
    const-string v0, "discountType"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->setDiscountType(Ljava/lang/String;)V

    .line 91
    const-string v0, "fullCutType"

    invoke-static {p0, v0}, Lcom/huawei/nfc/carrera/server/card/impl/JSONHelper;->getStringValue(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->setFullCutType(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 97
    goto :goto_0

    .line 93
    :catch_0
    move-exception v2

    .line 95
    const-string v0, "QueryServiceModeTask buildFromJson, JSONException"

    invoke-static {v0}, Lcom/huawei/nfc/carrera/util/LogX;->e(Ljava/lang/String;)V

    .line 96
    const/4 v1, 0x0

    .line 99
    :goto_0
    return-object v1
.end method


# virtual methods
.method public getDiscountType()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->discountType:Ljava/lang/String;

    return-object v0
.end method

.method public getFullCutType()Ljava/lang/String;
    .locals 1

    .line 72
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->fullCutType:Ljava/lang/String;

    return-object v0
.end method

.method public getPayType()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->payType:Ljava/lang/String;

    return-object v0
.end method

.method public getPromotionId()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->promotionId:Ljava/lang/String;

    return-object v0
.end method

.method public setDiscountType(Ljava/lang/String;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->discountType:Ljava/lang/String;

    .line 68
    return-void
.end method

.method public setFullCutType(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->fullCutType:Ljava/lang/String;

    .line 78
    return-void
.end method

.method public setPayType(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->payType:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setPromotionId(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;->promotionId:Ljava/lang/String;

    .line 48
    return-void
.end method
