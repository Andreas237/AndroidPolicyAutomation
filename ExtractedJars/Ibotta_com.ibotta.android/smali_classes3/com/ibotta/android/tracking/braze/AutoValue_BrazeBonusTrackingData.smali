.class final Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;
.super Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;
.source "AutoValue_BrazeBonusTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;
    }
.end annotation


# instance fields
.field private final amount:F

.field private final description:Ljava/lang/String;

.field private final details:Ljava/lang/String;

.field private final expiration:Ljava/util/Date;

.field private final featured:Z

.field private final id:I

.field private final name:Ljava/lang/String;

.field private final otherReward:Ljava/lang/String;

.field private final route:Ljava/lang/String;

.field private final tokenUrl:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;)V
    .locals 0
    .param p2    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
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
    .param p8    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p10    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-direct {p0}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;-><init>()V

    .line 33
    iput p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->id:I

    .line 34
    iput-object p2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->name:Ljava/lang/String;

    .line 35
    iput p3, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->amount:F

    .line 36
    iput-object p4, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->tokenUrl:Ljava/lang/String;

    .line 37
    iput-object p5, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->route:Ljava/lang/String;

    .line 38
    iput-object p6, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->description:Ljava/lang/String;

    .line 39
    iput-object p7, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->details:Ljava/lang/String;

    .line 40
    iput-object p8, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->expiration:Ljava/util/Date;

    .line 41
    iput-boolean p9, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->featured:Z

    .line 42
    iput-object p10, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->otherReward:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$1;)V
    .locals 0

    .line 9
    invoke-direct/range {p0 .. p10}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;-><init>(ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 123
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    .line 124
    check-cast p1, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;

    .line 125
    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->id:I

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getId()I

    move-result v3

    if-ne v1, v3, :cond_8

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 126
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_0
    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->amount:F

    .line 127
    invoke-static {v1}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getAmount()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v3

    if-ne v1, v3, :cond_8

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->tokenUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 128
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getTokenUrl()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getTokenUrl()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->route:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 129
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getRoute()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getRoute()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_2
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->description:Ljava/lang/String;

    if-nez v1, :cond_4

    .line 130
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_3
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->details:Ljava/lang/String;

    if-nez v1, :cond_5

    .line 131
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getDetails()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getDetails()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_4
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->expiration:Ljava/util/Date;

    if-nez v1, :cond_6

    .line 132
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getExpiration()Ljava/util/Date;

    move-result-object v1

    if-nez v1, :cond_8

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getExpiration()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :goto_5
    iget-boolean v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->featured:Z

    .line 133
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->isFeatured()Z

    move-result v3

    if-ne v1, v3, :cond_8

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->otherReward:Ljava/lang/String;

    if-nez v1, :cond_7

    .line 134
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getOtherReward()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;->getOtherReward()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    :goto_6
    return v0

    :cond_9
    return v2
.end method

.method public getAmount()F
    .locals 1

    .line 58
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->amount:F

    return v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getDetails()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->details:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()Ljava/util/Date;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->expiration:Ljava/util/Date;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 53
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOtherReward()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->otherReward:Ljava/lang/String;

    return-object v0
.end method

.method public getRoute()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->route:Ljava/lang/String;

    return-object v0
.end method

.method public getTokenUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->tokenUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 143
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->id:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 145
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->name:Ljava/lang/String;

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

    .line 147
    iget v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->amount:F

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 149
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->tokenUrl:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 151
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->route:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 153
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->description:Ljava/lang/String;

    if-nez v2, :cond_3

    const/4 v2, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 155
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->details:Ljava/lang/String;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 157
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->expiration:Ljava/util/Date;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/Date;->hashCode()I

    move-result v2

    :goto_5
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 159
    iget-boolean v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->featured:Z

    if-eqz v2, :cond_6

    const/16 v2, 0x4cf

    goto :goto_6

    :cond_6
    const/16 v2, 0x4d5

    :goto_6
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 161
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->otherReward:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    xor-int/2addr v0, v3

    return v0
.end method

.method public isFeatured()Z
    .locals 1

    .line 93
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->featured:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 104
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrazeBonusTrackingData{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", amount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->amount:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", tokenUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->tokenUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", route="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->route:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->description:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", details="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->details:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->expiration:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", featured="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->featured:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", otherReward="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;->otherReward:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
