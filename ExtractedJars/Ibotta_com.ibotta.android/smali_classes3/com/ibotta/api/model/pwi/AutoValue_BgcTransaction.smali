.class final Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;
.super Lcom/ibotta/api/model/pwi/BgcTransaction;
.source "AutoValue_BgcTransaction.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;
    }
.end annotation


# instance fields
.field private final barcodeUrl:Ljava/lang/String;

.field private final createdTime:J

.field private final customerId:Ljava/lang/String;

.field private final errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

.field private final faceValue:Ljava/lang/String;

.field private final giftCardId:Ljava/lang/Long;

.field private final giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

.field private final retailerId:I

.field private final retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private final retailerName:Ljava/lang/String;

.field private final rewardAmount:Ljava/lang/String;

.field private final spent:Ljava/lang/Boolean;

.field private final status:Ljava/lang/String;

.field private final updatedBalance:D

.field private final uuid:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/ibotta/api/model/pwi/GiftCardMetaData;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;DLcom/ibotta/api/model/RetailerModel;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Lcom/ibotta/api/model/pwi/GiftCardMetaData;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p13    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p17    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    move-object v0, p0

    .line 45
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/BgcTransaction;-><init>()V

    move-object v1, p1

    .line 46
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->barcodeUrl:Ljava/lang/String;

    move-wide v1, p2

    .line 47
    iput-wide v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->createdTime:J

    move-object v1, p4

    .line 48
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->customerId:Ljava/lang/String;

    move-object v1, p5

    .line 49
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->faceValue:Ljava/lang/String;

    move-object v1, p6

    .line 50
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardId:Ljava/lang/Long;

    move-object v1, p7

    .line 51
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move v1, p8

    .line 52
    iput v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerId:I

    move-object v1, p9

    .line 53
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerName:Ljava/lang/String;

    move-object v1, p10

    .line 54
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->rewardAmount:Ljava/lang/String;

    move-object v1, p11

    .line 55
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->spent:Ljava/lang/Boolean;

    move-object v1, p12

    .line 56
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->status:Ljava/lang/String;

    move-object/from16 v1, p13

    .line 57
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    move-object/from16 v1, p14

    .line 58
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->uuid:Ljava/lang/String;

    move-wide/from16 v1, p15

    .line 59
    iput-wide v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->updatedBalance:D

    move-object/from16 v1, p17

    .line 60
    iput-object v1, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/ibotta/api/model/pwi/GiftCardMetaData;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;DLcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$1;)V
    .locals 0

    .line 12
    invoke-direct/range {p0 .. p17}, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/ibotta/api/model/pwi/GiftCardMetaData;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;DLcom/ibotta/api/model/RetailerModel;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 185
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/pwi/BgcTransaction;

    const/4 v2, 0x0

    if-eqz v1, :cond_8

    .line 186
    check-cast p1, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 187
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->barcodeUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getBarcodeUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getBarcodeUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_0
    iget-wide v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->createdTime:J

    .line 188
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getCreatedTime()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->customerId:Ljava/lang/String;

    .line 189
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getCustomerId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->faceValue:Ljava/lang/String;

    .line 190
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getFaceValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardId:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 191
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardId()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardId()Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Long;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_1
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    if-nez v1, :cond_3

    .line 192
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_2
    iget v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerId:I

    .line 193
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerId()I

    move-result v3

    if-ne v1, v3, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerName:Ljava/lang/String;

    .line 194
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->rewardAmount:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 195
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->spent:Ljava/lang/Boolean;

    .line 196
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->status:Ljava/lang/String;

    .line 197
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getStatus()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    if-nez v1, :cond_5

    .line 198
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getErrorMessage()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getErrorMessage()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_4
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->uuid:Ljava/lang/String;

    .line 199
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    iget-wide v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->updatedBalance:D

    .line 200
    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUpdatedBalance()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_7

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-nez v1, :cond_6

    .line 201
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    :goto_5
    return v0

    :cond_8
    return v2
.end method

.method public getBarcodeUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "barcode_url"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 67
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->barcodeUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getCreatedTime()J
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created"
    .end annotation

    .line 73
    iget-wide v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->createdTime:J

    return-wide v0
.end method

.method public getCustomerId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "customer_id"
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorMessage()Lcom/ibotta/api/model/pwi/PwiError;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "error_message"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 137
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    return-object v0
.end method

.method public getFaceValue()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "face_value"
    .end annotation

    .line 85
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->faceValue:Ljava/lang/String;

    return-object v0
.end method

.method public getGiftCardId()Ljava/lang/Long;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gift_card_id"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardId:Ljava/lang/Long;

    return-object v0
.end method

.method public getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gift_card_meta_data"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_id"
    .end annotation

    .line 105
    iget v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerId:I

    return v0
.end method

.method public getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object v0
.end method

.method public getRetailerName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_name"
    .end annotation

    .line 111
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerName:Ljava/lang/String;

    return-object v0
.end method

.method public getRewardAmount()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reward_amount"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 118
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->rewardAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getSpent()Ljava/lang/Boolean;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "spent"
    .end annotation

    .line 124
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->spent:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .line 130
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdatedBalance()D
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "updated_balance"
    .end annotation

    .line 149
    iget-wide v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->updatedBalance:D

    return-wide v0
.end method

.method public getUuid()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "uuid"
    .end annotation

    .line 143
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 8

    .line 210
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->barcodeUrl:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const v2, 0xf4243

    xor-int/2addr v0, v2

    mul-int v0, v0, v2

    .line 212
    iget-wide v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->createdTime:J

    const/16 v5, 0x20

    ushr-long v6, v3, v5

    xor-long/2addr v3, v6

    long-to-int v4, v3

    xor-int/2addr v0, v4

    mul-int v0, v0, v2

    .line 214
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->customerId:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 216
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->faceValue:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 218
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardId:Ljava/lang/Long;

    if-nez v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->hashCode()I

    move-result v3

    :goto_1
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 220
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 222
    iget v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerId:I

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 224
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerName:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 226
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->rewardAmount:Ljava/lang/String;

    if-nez v3, :cond_3

    const/4 v3, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 228
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->spent:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->hashCode()I

    move-result v3

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 230
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->status:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 232
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    if-nez v3, :cond_4

    const/4 v3, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 234
    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->uuid:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    xor-int/2addr v0, v3

    mul-int v0, v0, v2

    .line 236
    iget-wide v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->updatedBalance:D

    invoke-static {v3, v4}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    ushr-long/2addr v3, v5

    iget-wide v5, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->updatedBalance:D

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    xor-long/2addr v3, v5

    long-to-int v4, v3

    xor-int/2addr v0, v4

    mul-int v0, v0, v2

    .line 238
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_5
    xor-int/2addr v0, v1

    return v0
.end method

.method public toBuilder()Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 2

    .line 244
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;-><init>(Lcom/ibotta/api/model/pwi/BgcTransaction;Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BgcTransaction{barcodeUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->barcodeUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->createdTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", customerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->customerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", faceValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->faceValue:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", giftCardId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardId:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", giftCardMetaData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", retailerName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", rewardAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->rewardAmount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", spent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->spent:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", uuid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->uuid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", updatedBalance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->updatedBalance:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", retailerModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
