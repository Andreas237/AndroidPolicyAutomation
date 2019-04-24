.class final Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;
.super Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
.source "AutoValue_PwiPaymentMethod.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$Builder;
    }
.end annotation


# instance fields
.field private final cardBrand:Ljava/lang/String;

.field private final cardType:Ljava/lang/String;

.field private final defaultSource:Z

.field private final expiryMonth:I

.field private final expiryYear:I

.field private final name:Ljava/lang/String;

.field private final sourceId:Ljava/lang/String;

.field private final sourceType:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->name:Ljava/lang/String;

    .line 29
    iput-object p2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardBrand:Ljava/lang/String;

    .line 30
    iput p3, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryMonth:I

    .line 31
    iput p4, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryYear:I

    .line 32
    iput-object p5, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardType:Ljava/lang/String;

    .line 33
    iput-object p6, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceId:Ljava/lang/String;

    .line 34
    iput-object p7, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceType:Ljava/lang/String;

    .line 35
    iput-boolean p8, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->defaultSource:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod$1;)V
    .locals 0

    .line 8
    invoke-direct/range {p0 .. p8}, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 97
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 98
    check-cast p1, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    .line 99
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->name:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardBrand:Ljava/lang/String;

    .line 100
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getCardBrand()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryMonth:I

    .line 101
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getExpiryMonth()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryYear:I

    .line 102
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getExpiryYear()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardType:Ljava/lang/String;

    .line 103
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getCardType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceId:Ljava/lang/String;

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getSourceId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceType:Ljava/lang/String;

    .line 105
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getSourceType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->defaultSource:Z

    .line 106
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->isDefaultSource()Z

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getCardBrand()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardBrand:Ljava/lang/String;

    return-object v0
.end method

.method public getCardType()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardType:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiryMonth()I
    .locals 1

    .line 50
    iget v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryMonth:I

    return v0
.end method

.method public getExpiryYear()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryYear:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getSourceId()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceId:Ljava/lang/String;

    return-object v0
.end method

.method public getSourceType()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceType:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 115
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 117
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardBrand:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 119
    iget v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryMonth:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 121
    iget v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryYear:I

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 123
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardType:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 125
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 127
    iget-object v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceType:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 129
    iget-boolean v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->defaultSource:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public isDefaultSource()Z
    .locals 1

    .line 75
    iget-boolean v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->defaultSource:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PwiPaymentMethod{name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", cardBrand="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardBrand:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiryMonth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryMonth:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", expiryYear="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->expiryYear:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->cardType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->sourceType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", defaultSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_PwiPaymentMethod;->defaultSource:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
