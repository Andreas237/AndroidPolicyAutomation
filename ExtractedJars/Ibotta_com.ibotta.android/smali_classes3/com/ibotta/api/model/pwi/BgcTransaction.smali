.class public abstract Lcom/ibotta/api/model/pwi/BgcTransaction;
.super Ljava/lang/Object;
.source "BgcTransaction.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/api/model/pwi/BgcTransaction;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getBarcodeUrl()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "barcode_url"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getCreatedTime()J
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created"
    .end annotation
.end method

.method public abstract getCustomerId()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "customer_id"
    .end annotation
.end method

.method public abstract getErrorMessage()Lcom/ibotta/api/model/pwi/PwiError;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "error_message"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getFaceValue()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "face_value"
    .end annotation
.end method

.method public abstract getGiftCardId()Ljava/lang/Long;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gift_card_id"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gift_card_meta_data"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerId()I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_id"
    .end annotation
.end method

.method public abstract getRetailerModel()Lcom/ibotta/api/model/RetailerModel;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getRetailerName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_name"
    .end annotation
.end method

.method public abstract getRewardAmount()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reward_amount"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end method

.method public abstract getSpent()Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "spent"
    .end annotation
.end method

.method public abstract getStatus()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation
.end method

.method public abstract getUpdatedBalance()D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "updated_balance"
    .end annotation
.end method

.method public abstract getUuid()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "uuid"
    .end annotation
.end method

.method public isUpdatedBalance()Z
    .locals 5

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUpdatedBalance()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double v4, v0, v2

    if-lez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public abstract toBuilder()Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
.end method
