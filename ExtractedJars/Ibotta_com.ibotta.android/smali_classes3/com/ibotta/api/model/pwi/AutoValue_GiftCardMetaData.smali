.class final Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;
.super Lcom/ibotta/api/model/pwi/GiftCardMetaData;
.source "AutoValue_GiftCardMetaData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;
    }
.end annotation


# instance fields
.field private final cardNumber:Ljava/lang/String;

.field private final imageUrl:Ljava/lang/String;

.field private final pin:Ljava/lang/String;

.field private final termsAndConditions:Ljava/lang/String;

.field private final usageInstructions:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->cardNumber:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->pin:Ljava/lang/String;

    .line 26
    iput-object p3, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->imageUrl:Ljava/lang/String;

    .line 27
    iput-object p4, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->termsAndConditions:Ljava/lang/String;

    .line 28
    iput-object p5, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->usageInstructions:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$1;)V
    .locals 0

    .line 10
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 80
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 81
    check-cast p1, Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    .line 82
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->cardNumber:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getCardNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->pin:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 83
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getPin()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getPin()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->imageUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getImageUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->termsAndConditions:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getTermsAndConditions()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->usageInstructions:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getUsageInstructions()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getUsageInstructions()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_5
    return v2
.end method

.method public getCardNumber()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "card_number"
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->cardNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "image_url"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getPin()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pin"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 41
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->pin:Ljava/lang/String;

    return-object v0
.end method

.method public getTermsAndConditions()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "terms_and_conditions"
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->termsAndConditions:Ljava/lang/String;

    return-object v0
.end method

.method public getUsageInstructions()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "usage_instructions"
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->usageInstructions:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 95
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->cardNumber:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 97
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->pin:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 99
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->imageUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 101
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->termsAndConditions:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 103
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->usageInstructions:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    xor-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GiftCardMetaData{cardNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->cardNumber:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", pin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->pin:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", imageUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->imageUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", termsAndConditions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->termsAndConditions:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", usageInstructions="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;->usageInstructions:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
