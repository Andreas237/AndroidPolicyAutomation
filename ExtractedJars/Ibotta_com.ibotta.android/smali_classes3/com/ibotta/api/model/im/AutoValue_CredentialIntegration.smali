.class final Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;
.super Lcom/ibotta/api/model/im/CredentialIntegration;
.source "AutoValue_CredentialIntegration.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;
    }
.end annotation


# instance fields
.field private final retailerId:I

.field private final status:Ljava/lang/String;

.field private final username:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/ibotta/api/model/im/CredentialIntegration;-><init>()V

    .line 19
    iput p1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->retailerId:I

    .line 20
    iput-object p2, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->status:Ljava/lang/String;

    .line 21
    iput-object p3, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->username:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 56
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/model/im/CredentialIntegration;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 57
    check-cast p1, Lcom/ibotta/api/model/im/CredentialIntegration;

    .line 58
    iget v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->retailerId:I

    invoke-virtual {p1}, Lcom/ibotta/api/model/im/CredentialIntegration;->getRetailerId()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->status:Ljava/lang/String;

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/api/model/im/CredentialIntegration;->getStatus()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->username:Ljava/lang/String;

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/api/model/im/CredentialIntegration;->getUsername()Ljava/lang/String;

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

.method public getRetailerId()I
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_id"
    .end annotation

    .line 27
    iget v0, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->retailerId:I

    return v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "username"
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->username:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 69
    iget v0, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->retailerId:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 71
    iget-object v2, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->status:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 73
    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->username:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CredentialIntegration{retailerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->retailerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration;->username:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
