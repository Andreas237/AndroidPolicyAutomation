.class final Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;
.super Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;
.source "AutoValue_BrazeOfferTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$Builder;
    }
.end annotation


# instance fields
.field private final amount:F

.field private final description:Ljava/lang/String;

.field private final expiration:Ljava/util/Date;

.field private final id:I

.field private final name:Ljava/lang/String;

.field private final offerImage:Ljava/lang/String;

.field private final redemptionMax:S

.field private final shareUrl:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;FLjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;S)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;-><init>()V

    .line 29
    iput p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->id:I

    .line 30
    iput-object p2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->name:Ljava/lang/String;

    .line 31
    iput p3, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->amount:F

    .line 32
    iput-object p4, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->description:Ljava/lang/String;

    .line 33
    iput-object p5, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->expiration:Ljava/util/Date;

    .line 34
    iput-object p6, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->shareUrl:Ljava/lang/String;

    .line 35
    iput-object p7, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->offerImage:Ljava/lang/String;

    .line 36
    iput-short p8, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->redemptionMax:S

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;FLjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;SLcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData$1;)V
    .locals 0

    .line 9
    invoke-direct/range {p0 .. p8}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;-><init>(ILjava/lang/String;FLjava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;S)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 103
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    .line 104
    check-cast p1, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;

    .line 105
    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->id:I

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getId()I

    move-result v3

    if-ne v1, v3, :cond_6

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 106
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_0
    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->amount:F

    .line 107
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getAmount()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-ne v1, v3, :cond_6

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->description:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 108
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->expiration:Ljava/util/Date;

    if-nez v1, :cond_3

    .line 109
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getExpiration()Ljava/util/Date;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getExpiration()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->shareUrl:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 110
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getShareUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getShareUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->offerImage:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 111
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getOfferImage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getOfferImage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    :goto_4
    iget-short v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->redemptionMax:S

    .line 112
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeOfferTrackingData;->getRedemptionMax()S

    move-result p1

    if-ne v1, p1, :cond_6

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    :goto_5
    return v0

    :cond_7
    return v2
.end method

.method public getAmount()F
    .locals 1

    .line 52
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->amount:F

    return v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 41
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOfferImage()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->offerImage:Ljava/lang/String;

    return-object v0
.end method

.method public getRedemptionMax()S
    .locals 1

    .line 81
    iget-short v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->redemptionMax:S

    return v0
.end method

.method public getShareUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->shareUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 121
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->id:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 123
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->name:Ljava/lang/String;

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

    .line 125
    iget v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->amount:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 127
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->description:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 129
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->expiration:Ljava/util/Date;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 131
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->shareUrl:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 133
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->offerImage:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 135
    iget-short v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->redemptionMax:S

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 86
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrazeOfferTrackingData{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->amount:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->expiration:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", shareUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->shareUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", offerImage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->offerImage:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", redemptionMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeOfferTrackingData;->redemptionMax:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
