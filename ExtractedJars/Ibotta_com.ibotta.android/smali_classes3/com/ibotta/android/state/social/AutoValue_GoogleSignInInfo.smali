.class final Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;
.super Lcom/ibotta/android/state/social/GoogleSignInInfo;
.source "AutoValue_GoogleSignInInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$Builder;
    }
.end annotation


# instance fields
.field private final authCode:Ljava/lang/String;

.field private final email:Ljava/lang/String;

.field private final expiration:J

.field private final firstName:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field private final lastName:Ljava/lang/String;

.field private final profilePicUrl:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/state/social/GoogleSignInInfo;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->id:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->authCode:Ljava/lang/String;

    .line 26
    iput-wide p3, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->expiration:J

    .line 27
    iput-object p5, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->firstName:Ljava/lang/String;

    .line 28
    iput-object p6, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->lastName:Ljava/lang/String;

    .line 29
    iput-object p7, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->email:Ljava/lang/String;

    .line 30
    iput-object p8, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->profilePicUrl:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo$1;)V
    .locals 0

    .line 6
    invoke-direct/range {p0 .. p8}, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 86
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/state/social/GoogleSignInInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 87
    check-cast p1, Lcom/ibotta/android/state/social/GoogleSignInInfo;

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->id:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->authCode:Ljava/lang/String;

    .line 89
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getAuthCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v3, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->expiration:J

    .line 90
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getExpiration()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->firstName:Ljava/lang/String;

    .line 91
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getFirstName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->lastName:Ljava/lang/String;

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getLastName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->email:Ljava/lang/String;

    .line 93
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->profilePicUrl:Ljava/lang/String;

    .line 94
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getProfilePicUrl()Ljava/lang/String;

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

.method public getAuthCode()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->authCode:Ljava/lang/String;

    return-object v0
.end method

.method public getEmail()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->email:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiration()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->expiration:J

    return-wide v0
.end method

.method public getFirstName()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->firstName:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLastName()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->lastName:Ljava/lang/String;

    return-object v0
.end method

.method public getProfilePicUrl()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->profilePicUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 105
    iget-object v2, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->authCode:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 107
    iget-wide v2, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->expiration:J

    const/16 v4, 0x20

    ushr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v3, v2

    xor-int/2addr v0, v3

    mul-int v0, v0, v1

    .line 109
    iget-object v2, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->firstName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 111
    iget-object v2, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->lastName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 113
    iget-object v2, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->email:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 115
    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->profilePicUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 70
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GoogleSignInInfo{id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->id:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", authCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->authCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", expiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->expiration:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", firstName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->firstName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->lastName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", email="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->email:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", profilePicUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/social/AutoValue_GoogleSignInInfo;->profilePicUrl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
