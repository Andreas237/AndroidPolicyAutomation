.class public abstract Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
.super Ljava/lang/Object;
.source "BgcTransaction.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/BgcTransaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 3
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 40
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;-><init>()V

    const/4 v1, 0x0

    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->spent(Ljava/lang/Boolean;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;

    move-result-object v0

    const-wide/16 v1, 0x0

    .line 42
    invoke-virtual {v0, v1, v2}, Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;->updatedBalance(D)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract barcodeUrl(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "barcode_url"
    .end annotation
.end method

.method public abstract build()Lcom/ibotta/api/model/pwi/BgcTransaction;
.end method

.method public abstract createdTime(J)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created"
    .end annotation
.end method

.method public abstract customerId(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "customer_id"
    .end annotation
.end method

.method public abstract errorMessage(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .param p1    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "error_message"
    .end annotation
.end method

.method public abstract faceValue(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "face_value"
    .end annotation
.end method

.method public abstract giftCardId(Ljava/lang/Long;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gift_card_id"
    .end annotation
.end method

.method public abstract giftCardMetaData(Lcom/ibotta/api/model/pwi/GiftCardMetaData;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .param p1    # Lcom/ibotta/api/model/pwi/GiftCardMetaData;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "gift_card_meta_data"
    .end annotation
.end method

.method public abstract retailerId(I)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_id"
    .end annotation
.end method

.method public abstract retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonIgnore;
    .end annotation
.end method

.method public abstract retailerName(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_name"
    .end annotation
.end method

.method public abstract rewardAmount(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "reward_amount"
    .end annotation
.end method

.method public abstract spent(Ljava/lang/Boolean;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .param p1    # Ljava/lang/Boolean;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "spent"
    .end annotation
.end method

.method public abstract status(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation
.end method

.method public abstract updatedBalance(D)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "updated_balance"
    .end annotation
.end method

.method public abstract uuid(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "uuid"
    .end annotation
.end method
