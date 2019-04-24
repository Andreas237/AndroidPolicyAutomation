.class final Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;
.super Lcom/ibotta/android/state/user/auth/ApiAuth;
.source "AutoValue_ApiAuth.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;
    }
.end annotation


# instance fields
.field private final authRefreshToken:Ljava/lang/String;

.field private final authToken:Ljava/lang/String;

.field private final authTokenExpiration:J


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/state/user/auth/ApiAuth;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authToken:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authRefreshToken:Ljava/lang/String;

    .line 18
    iput-wide p3, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authTokenExpiration:J

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$1;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 50
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/state/user/auth/ApiAuth;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 51
    check-cast p1, Lcom/ibotta/android/state/user/auth/ApiAuth;

    .line 52
    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authToken:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authRefreshToken:Ljava/lang/String;

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthRefreshToken()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authTokenExpiration:J

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthTokenExpiration()J

    move-result-wide v5

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getAuthRefreshToken()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authRefreshToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthToken()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authToken:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthTokenExpiration()J
    .locals 2

    .line 33
    iget-wide v0, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authTokenExpiration:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    .line 63
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authToken:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 65
    iget-object v2, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authRefreshToken:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 67
    iget-wide v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authTokenExpiration:J

    const/16 v3, 0x20

    ushr-long v3, v1, v3

    xor-long/2addr v1, v3

    long-to-int v2, v1

    xor-int/2addr v0, v2

    return v0
.end method

.method public toBuilder()Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;
    .locals 2

    .line 73
    new-instance v0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$Builder;-><init>(Lcom/ibotta/android/state/user/auth/ApiAuth;Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth$1;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ApiAuth{authToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", authRefreshToken="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authRefreshToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", authTokenExpiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/state/user/auth/AutoValue_ApiAuth;->authTokenExpiration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
