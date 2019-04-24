.class final Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;
.super Lcom/ibotta/api/call/auth/RefreshTokenResponse;
.source "AutoValue_RefreshTokenResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$Builder;
    }
.end annotation


# instance fields
.field private final authenticationToken:Ljava/lang/String;

.field private final authenticationTokenExpiration:Ljava/util/Date;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/util/Date;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/api/call/auth/RefreshTokenResponse;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationToken:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationTokenExpiration:Ljava/util/Date;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/util/Date;Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2}, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;-><init>(Ljava/lang/String;Ljava/util/Date;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 47
    :cond_0
    instance-of v1, p1, Lcom/ibotta/api/call/auth/RefreshTokenResponse;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 48
    check-cast p1, Lcom/ibotta/api/call/auth/RefreshTokenResponse;

    .line 49
    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationToken:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/api/call/auth/RefreshTokenResponse;->getAuthenticationToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationTokenExpiration:Ljava/util/Date;

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/api/call/auth/RefreshTokenResponse;->getAuthenticationTokenExpiration()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

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

.method public getAuthenticationToken()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "authentication_token"
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthenticationTokenExpiration()Ljava/util/Date;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "authentication_token_expiration"
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationTokenExpiration:Ljava/util/Date;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 59
    iget-object v0, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 61
    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationTokenExpiration:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RefreshTokenResponse{authenticationToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", authenticationTokenExpiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/call/auth/AutoValue_RefreshTokenResponse;->authenticationTokenExpiration:Ljava/util/Date;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
