.class final Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;
.super Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
.source "AutoValue_BgcPaymentAccount.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;
    }
.end annotation


# instance fields
.field private final createdAt:J

.field private final ephemeralKey:Ljava/lang/String;

.field private final stripeToken:Ljava/lang/String;

.field private final updatedAt:J


# direct methods
.method private constructor <init>(Ljava/lang/String;JJLjava/lang/String;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->stripeToken:Ljava/lang/String;

    .line 22
    iput-wide p2, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->createdAt:J

    .line 23
    iput-wide p4, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->updatedAt:J

    .line 24
    iput-object p6, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->ephemeralKey:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;JJLjava/lang/String;Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$1;)V
    .locals 0

    .line 9
    invoke-direct/range {p0 .. p6}, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;-><init>(Ljava/lang/String;JJLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 66
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 67
    check-cast p1, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;

    .line 68
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->stripeToken:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;->getStripeToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->createdAt:J

    .line 69
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;->getCreatedAt()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->updatedAt:J

    .line 70
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;->getUpdatedAt()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->ephemeralKey:Ljava/lang/String;

    .line 71
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcPaymentAccount;->getEphemeralKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getCreatedAt()J
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "created"
    .end annotation

    .line 36
    iget-wide v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->createdAt:J

    return-wide v0
.end method

.method public getEphemeralKey()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "key"
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->ephemeralKey:Ljava/lang/String;

    return-object v0
.end method

.method public getStripeToken()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "stripe_token"
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->stripeToken:Ljava/lang/String;

    return-object v0
.end method

.method public getUpdatedAt()J
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "updated"
    .end annotation

    .line 42
    iget-wide v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->updatedAt:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 7

    .line 80
    iget-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->stripeToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 82
    iget-wide v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->createdAt:J

    const/16 v4, 0x20

    ushr-long v5, v2, v4

    xor-long/2addr v2, v5

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 84
    iget-wide v2, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->updatedAt:J

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 86
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->ephemeralKey:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BgcPaymentAccount{stripeToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->stripeToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", createdAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->createdAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->updatedAt:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", ephemeralKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;->ephemeralKey:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
