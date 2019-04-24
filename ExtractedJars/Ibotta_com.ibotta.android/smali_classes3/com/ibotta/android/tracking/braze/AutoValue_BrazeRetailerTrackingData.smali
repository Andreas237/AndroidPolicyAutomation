.class final Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;
.super Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;
.source "AutoValue_BrazeRetailerTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;
    }
.end annotation


# instance fields
.field private final auxiliaryLoyaltyEnabled:Z

.field private final id:I

.field private final name:Ljava/lang/String;

.field private final shortDescription:Ljava/lang/String;

.field private final verificationTypeApiName:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
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

    .line 21
    invoke-direct {p0}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;-><init>()V

    .line 22
    iput p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->id:I

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->name:Ljava/lang/String;

    .line 24
    iput-boolean p3, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->auxiliaryLoyaltyEnabled:Z

    .line 25
    iput-object p4, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->verificationTypeApiName:Ljava/lang/String;

    .line 26
    iput-object p5, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->shortDescription:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$1;)V
    .locals 0

    .line 8
    invoke-direct/range {p0 .. p5}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;-><init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 73
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    .line 74
    check-cast p1, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;

    .line 75
    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->id:I

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getId()I

    move-result v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->name:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    iget-boolean v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->auxiliaryLoyaltyEnabled:Z

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->isAuxiliaryLoyaltyEnabled()Z

    move-result v3

    if-ne v1, v3, :cond_4

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->verificationTypeApiName:Ljava/lang/String;

    if-nez v1, :cond_2

    .line 78
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getVerificationTypeApiName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getVerificationTypeApiName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->shortDescription:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 79
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getShortDescription()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;->getShortDescription()Ljava/lang/String;

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

.method public getId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->id:I

    return v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 37
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getShortDescription()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->shortDescription:Ljava/lang/String;

    return-object v0
.end method

.method public getVerificationTypeApiName()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->verificationTypeApiName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 88
    iget v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->id:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 90
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->name:Ljava/lang/String;

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

    .line 92
    iget-boolean v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->auxiliaryLoyaltyEnabled:Z

    if-eqz v2, :cond_1

    const/16 v2, 0x4cf

    goto :goto_1

    :cond_1
    const/16 v2, 0x4d5

    :goto_1
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 94
    iget-object v2, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->verificationTypeApiName:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->shortDescription:Ljava/lang/String;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_3
    xor-int/2addr v0, v3

    return v0
.end method

.method public isAuxiliaryLoyaltyEnabled()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->auxiliaryLoyaltyEnabled:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BrazeRetailerTrackingData{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", auxiliaryLoyaltyEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->auxiliaryLoyaltyEnabled:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", verificationTypeApiName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->verificationTypeApiName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", shortDescription="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;->shortDescription:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
